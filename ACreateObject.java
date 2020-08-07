import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import model.ListScrnid_tmt220;

public class ACreateObject {
	public void createObject() throws SQLException, ClassNotFoundException {
		DTP dtp = new DTP();
		dtp.setFullDTP();

		Path path = Paths.get(AMain.link + "DTP1.java");
		String question = "import java.sql.*;\r\n" + 
		"import java.util.ArrayList;\r\n" + 
		"import java.util.List;\n";
		for (int i = 0; i < dtp.tableSize(); i++) {
			question += "import model." + dtp.table(i).substring(0, 1).toUpperCase() + dtp.table(i).substring(1) + ";\n";
		}
		question +="public class DTP1 {\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    public DTP1() throws SQLException, ClassNotFoundException {\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    Connection connection = AMySQLConnUtils.getSqlConnection();";
		question +=" private void printSQLException(SQLException ex) {\r\n" + 
				"        for (Throwable e : ex) {\r\n" + 
				"            if (e instanceof SQLException) {\r\n" + 
				"                e.printStackTrace(System.err);\r\n" + 
				"                System.err.println(\"SQLState: \" + ((SQLException) e).getSQLState());\r\n" + 
				"                System.err.println(\"Error Code: \" + ((SQLException) e).getErrorCode());\r\n" + 
				"                System.err.println(\"Message: \" + e.getMessage());\r\n" + 
				"                Throwable t = ex.getCause();\r\n" + 
				"                while (t != null) {\r\n" + 
				"                    System.out.println(\"Cause: \" + t);\r\n" + 
				"                    t = t.getCause();\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    }\n";
		for (int j = 0; j < dtp.tableSize(); j++) {
			question += " public  ArrayList<"+dtp.table(j).substring(0, 1).toUpperCase() + dtp.table(j).substring(1)+"> get"+dtp.table(j).substring(0, 1).toUpperCase() + dtp.table(j).substring(1)+"() throws ClassNotFoundException, SQLException {\r\n" + 
				
					"    	Statement statement = connection.createStatement();\r\n" + 
					"        String sql = \"Select * From "+dtp.table(j)+" \";\r\n" + 
					"        ResultSet rs = statement.executeQuery(sql);\r\n" + 
					"        ArrayList<"+dtp.table(j).substring(0, 1).toUpperCase()+ dtp.table(j).substring(1)+"> "+dtp.table(j)+" = new ArrayList<>();\r\n" + 
					"        while (rs.next()) {\r\n" + 
					"        	"+dtp.table(j).substring(0, 1).toUpperCase() + dtp.table(j).substring(1)+" temp = new "+dtp.table(j).substring(0, 1).toUpperCase() + dtp.table(j).substring(1);
			//(        	ListScrnid_tmt220 scrnid = new ListScrnid_tmt220(rs.getString("FUNCID"), rs.getString("LANG"), rs.getString("SCRNID"));
			question +=        	"("  +dtp.typess(j,0) + "(\"" +dtp.column(j, 0)  + "\")"   ;
			for(int k=1;k<dtp.columnSize(j);k++) {
				question +=        	", "  +dtp.typess(j,k) + "(\"" +dtp.column(j, k)  + "\")"   ;
			}
			question +=");\n";
			
			question +=        	dtp.table(j)+".add(temp);\r\n" + 
					"        }\r\n" + 
					"        return "+dtp.table(j)+";\r\n" + 
					"    }\n";
		}
		question += "}";
		System.out.println("Creating model:" +  "DTP1.java");
		Charset charset = Charset.forName("ISO-8859-1");
		try {
			Files.write(path, question.getBytes());

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}