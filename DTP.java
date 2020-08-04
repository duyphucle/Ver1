import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.ListScrnid_tmt220;

public class DTP {


    public DTP() throws SQLException, ClassNotFoundException {
    }

    Connection connection = AMySQLConnUtils.getSqlConnection();

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    public  ArrayList<Actor> getAllCustomer() throws ClassNotFoundException, SQLException {
      
    	Statement statement = connection.createStatement();
        String sql = "Select * From Actor ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Actor> actorList = new ArrayList<>();
        while (rs.next()) {
        	  Actor actor =new Actor(rs.getString("actor_id"), rs.getString("first_name"), rs.getString("last_name"));
        	actorList.add(actor);
        }
        return actorList;
    }
    public  ArrayList<ListScrnid_tmt220> getTmt220() throws ClassNotFoundException, SQLException {
    	//Lay toan bo Scrnid va Funcid
    	//System.out.println(dtp.getTmt220().get(i).getFuncid());
    	
    	Statement statement = connection.createStatement();
        String sql = "Select * From tmt220_func ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<ListScrnid_tmt220> scrnidList = new ArrayList<>();
        while (rs.next()) {
        	ListScrnid_tmt220 scrnid = new ListScrnid_tmt220(rs.getString("FUNCID"), rs.getString("LANG"), rs.getString("SCRNID"));
        	scrnidList.add(scrnid);
        }
        return scrnidList;
    }
    public List<ATable> fullDTP = new ArrayList<>();

    public List<String> getTables() throws SQLException {

        List<String> tables = new ArrayList<>();
        Statement statement = connection.createStatement();
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet rs = metaData.getTables(connection.getCatalog(), null, "%", new String[]{"TABLE"});
        //TIm cot table ben MySQL
        while (rs.next()) {
            String tableName = rs.getString("TABLE_NAME");
            tables.add(tableName);
        }
        // statement.close();

        return tables;
    }


    public List<String> getColumns(String tableName) throws SQLException {

        List<String> comlumn = new ArrayList<>();
        Statement statement = connection.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY, 
                java.sql.ResultSet.CONCUR_READ_ONLY);
        statement.setFetchSize(Integer.MIN_VALUE);
        String selectAll = "SELECT * FROM" + "`" + tableName + "`";
        ResultSet rs = statement.executeQuery(selectAll);
        //Thuc hien cau lenh SQL
        ResultSetMetaData resultSetMetaData = rs.getMetaData();
        //Lay tat ca su lieu trong bang
        int numColm = resultSetMetaData.getColumnCount();
        // lay so cot trong bang

        for (int i = 1; i <= numColm; i++) {
            if (tableName.equals(resultSetMetaData.getTableName(i))) {
                String columnName = resultSetMetaData.getColumnName(i);
                comlumn.add(columnName);
            }
        }
        statement.close();

        return comlumn;
    }

    public List<String> getTypes(String tableName) throws SQLException {

        List<String> types = new ArrayList<>();
        Statement statement = connection.createStatement();
        String selectAll = "SELECT * FROM" + "`" + tableName + "`";
        ResultSet rs = statement.executeQuery(selectAll);
        //Thuc hien cau lenh SQL
        ResultSetMetaData resultSetMetaData = rs.getMetaData();
        //Lay tat ca su lieu trong bang
        int numColm = resultSetMetaData.getColumnCount();
        // lay so cot trong bang

        for (int i = 1; i <= numColm; i++) {
            if (tableName.equals(resultSetMetaData.getTableName(i))) {
                String typeName = resultSetMetaData.getColumnTypeName(i);

                switch (typeName) {
                    case "INT":
                    case "TINYINT":
                        typeName = "int";
                        break;
                    case "NVARCHAR":
                    case "VARCHAR":
                    case "LONGTEXT":
                        typeName = "String";
                        break;
                    case "DATE":
                        typeName = "LocalDate";
                        break;
                    case "DOUBLE":
                        typeName = "double";
                        break;
                }
                types.add(typeName);
            }
        }
        //  statement.close();

        return types;
    }

    public List<String> getForeignTable(String tableName) throws SQLException {

        List<String> pkTable = new ArrayList<>();
        Statement statement = connection.createStatement();
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet foreignKeys = metaData.getImportedKeys(connection.getCatalog(), null, tableName);
        while (foreignKeys.next()) {
            String pkTableName = foreignKeys.getString("PKTABLE_NAME");
            pkTable.add(pkTableName);
        }
        //statement.close();

        return pkTable;
    }
 public List<String> getForeignColumn(String tableName) throws SQLException {

        List<String> fkColumn = new ArrayList<>();
      //  Statement statement = connection.createStatement();
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet foreignKeys = metaData.getImportedKeys(connection.getCatalog(), null, tableName);
        while (foreignKeys.next()) {
            String fkcolumn_name = foreignKeys.getString("FKCOLUMN_NAME");
            fkColumn.add(fkcolumn_name);
        }
        //statement.close();

        return fkColumn;
    }
public List<String> getPKColumn(String tableName) throws SQLException {

        List<String> fkColumn = new ArrayList<>();
      //  Statement statement = connection.createStatement();
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet foreignKeys = metaData.getImportedKeys(connection.getCatalog(), null, tableName);
        while (foreignKeys.next()) {
            String fkcolumn_name = foreignKeys.getString("PKCOLUMN_NAME");
            fkColumn.add(fkcolumn_name);
        }
        //statement.close();

        return fkColumn;
    }

    public List<ATable> getFull() throws SQLException {
        List<String> tables = getTables();
        List<ATable> fullList = new ArrayList<>();
        for (int i = 0; i < tables.size(); i++) {
            fullList.add(new ATable());
            // Them 1 Doi tuong rong vao danh sach cac doi tuong -Khung
            fullList.get(i).setName(tables.get(i));
            fullList.get(i).setColumn(getColumns(tables.get(i)));
            fullList.get(i).setType(getTypes(tables.get(i)));
            fullList.get(i).setPktable(getForeignTable(tables.get(i)));
            fullList.get(i).setFkName(getForeignColumn(tables.get(i)));
            fullList.get(i).setPkName(getPKColumn(tables.get(i)));

        }
        return fullList;
    }

    public List<ATable> getFullDTP() {
        return fullDTP;
    }

    public void setFullDTP() throws SQLException {
        this.fullDTP = getFull();
    }

    public String table(int i) throws SQLException {

        return getFullDTP().get(i).getName();
    }

    public List<String> column(int i) throws SQLException {
        return getFullDTP().get(i).getColumn();
    }

    public String column(int i, int j) throws SQLException {

        return getFullDTP().get(i).getColumn().get(j);
    }

    public List<String> type(int i) throws SQLException {

        return getFullDTP().get(i).getType();
    }

    public String type(int i, int j) throws SQLException {

        return getFullDTP().get(i).getType().get(j);
    }

    public List<String> pk(int i) throws SQLException {

        return getFullDTP().get(i).getPktable();
    }

    public String pk(int i, int j) throws SQLException {

        return getFullDTP().get(i).getPktable().get(j);
    }

    public List<String> fk(int i) throws SQLException {

        return getFullDTP().get(i).getFkName();
    }


    public String fkName(int i, int j) throws SQLException {

        return getFullDTP().get(i).getFkName().get(j);
    }
    public String pkName(int i, int j) throws SQLException {

        return getFullDTP().get(i).getPkName().get(j);
    }

    public int tableSize() throws SQLException {
        return getTables().size();
    }

    public int columnSize(int i) throws SQLException {
        String tableName = table(i);
        return getColumns(tableName).size();
    }

    public int typeSize(int i) throws SQLException {
        String tableName = table(i);
        return getTypes(tableName).size();
    }

    public int pkSize(int i) throws SQLException {
        String tableName = table(i);
        return getForeignTable(tableName).size();
    }


}