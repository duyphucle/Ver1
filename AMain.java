import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class AMain {
    static String hostName = "localhost";
    static String link = "192.168.23.1";
    
    static String dbName = "sakila";
   // static String dbName = "case_study_version1";
    static String userName = "root";
    static String password = "123456";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
 
    	
    	 



        DTP dtp = new DTP();
        dtp.setFullDTP();
    
       for(int i=0;i<dtp.getTmt220().size();i++) {
        System.out.println(dtp.getTmt220().get(i).getFuncid()+ ":"+ dtp.getTmt220().get(i).getLang());
       }
       for(int i=0;i<dtp.tableSize();i++) {
           System.out.println(dtp.table(i)+ "_"+ dtp.column(i) + "_" +  dtp.type(i));
          }

      
        
//        ACreateModel aCreateModel = new ACreateModel();
//        ACreateJDBC aCreateJDBC = new ACreateJDBC();
//        AView aViewCreate = new AView();
//        AServlet aServlet = new AServlet();
//        AUtils aUtils = new AUtils();

//        createDirec("src/controller");
//        createDirec("src/model");
//        createDirec("src/service");
//        createDirec("src/utils");
//
//        createFile("src/controller/HomeServlet.java");
//        createDirec("web/WEB-INF/layout");
//        createFile("web/WEB-INF/layout/sidebarmini.jsp");
//        createFile("web/WEB-INF/home.jsp");
//
//        for (int i = 0; i < dtp.getFull().size(); i++) {
//            //  createFile("model/" + dtp.table(i).substring(0, 1).toUpperCase() + dtp.table(i).substring(1) + ".java");
//            createFile("src/controller/" + dtp.table(i).substring(0, 1).toUpperCase() + dtp.table(i).substring(1) + "Servlet.java");
//            createDirec("src/service/" + dtp.table(i).toLowerCase());
//            createDirec("web/WEB-INF/" + dtp.table(i).toLowerCase());
//        }
//        for (int i = 0; i < dtp.getFull().size(); i++) {
//            createFile("web/WEB-INF/" + dtp.table(i).toLowerCase() + "/create.jsp");
//            createFile("web/WEB-INF/" + dtp.table(i).toLowerCase() + "/edit.jsp");
//            createFile("web/WEB-INF/" + dtp.table(i).toLowerCase() + "/view.jsp");
//            createFile("web/WEB-INF/" + dtp.table(i).toLowerCase() + "/delete.jsp");
//            createFile("web/WEB-INF/" + dtp.table(i).toLowerCase() + "/list.jsp");
//        }
//        for (int i = 0; i < dtp.getFull().size(); i++) {
//            createFile("src/service/" + dtp.table(i).toLowerCase() + "/" + dtp.table(i).substring(0, 1).toUpperCase() + dtp.table(i).substring(1) + "Service.java");
//            createFile("src/service/" + dtp.table(i).toLowerCase() + "/" + dtp.table(i).substring(0, 1).toUpperCase() + dtp.table(i).substring(1) + "JDBCServiceImpl.java");
//
//        }
//
//
//
//
////        deleteCRUD();
//        aCreateModel.createTable();
//        aCreateJDBC.createInterFace();
//        aCreateJDBC.createService();
//        aViewCreate.showcreate();
//        aViewCreate.showDelete();
//        aViewCreate.showEdit();
//        aViewCreate.showList();
//        aViewCreate.showViews();
//        aServlet.createSerlet();
//        aServlet.homeServlet();
//        inserCRUD();
//        aUtils.createUtils();
//        aViewCreate.sidebarmini();
//        aViewCreate.home();


    }

    public static void inserCRUD() throws ClassNotFoundException, SQLException {
        DTP dtp = new DTP();
        dtp.setFullDTP();
        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/case_study_version1",
//                "root", "Phuc@123z2");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + AMain.dbName + "",
                "" + AMain.userName + "", "" + AMain.password + "");

        Statement st = con.createStatement();
        for (int i = 0; i < dtp.tableSize(); i++) {
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " ADD COLUMN isDeleted TINYINT NULL DEFAULT 0");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " ADD COLUMN deleted_at DATE ");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " ADD COLUMN deleted_by VARCHAR(45)");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " ADD COLUMN updated_at DATE ");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " ADD COLUMN updated_by VARCHAR(45) ");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " ADD COLUMN created_at DATE ");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " ADD COLUMN created_by VARCHAR(45) ");
            System.out.println("Insert BackLog By Tran Huu Phuc");
        }

    }

    public static void deleteCRUD() throws ClassNotFoundException, SQLException {
        DTP dtp = new DTP();
        dtp.setFullDTP();
        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/case_study_version1",
//                "root", "Phuc@123z2");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + AMain.dbName + "",
                "" + AMain.userName + "", "" + AMain.password + "");

        Statement st = con.createStatement();
        for (int i = 0; i < dtp.tableSize(); i++) {
//            st.executeUpdate("ALTER TABLE "+dtp.table(i)+" DROP COLUMN IsDeleted");
//            st.executeUpdate("ALTER TABLE "+dtp.table(i)+" DROP COLUMN DeletedAt");
//            st.executeUpdate("ALTER TABLE "+dtp.table(i)+" DROP COLUMN DeletedBy");
//            st.executeUpdate("ALTER TABLE "+dtp.table(i)+" DROP COLUMN UpdatedAt");
//            st.executeUpdate("ALTER TABLE "+dtp.table(i)+" DROP COLUMN UpdatedBy");
//            st.executeUpdate("ALTER TABLE "+dtp.table(i)+" DROP COLUMN CreatedAt");
//            st.executeUpdate("ALTER TABLE "+dtp.table(i)+" DROP COLUMN CreatedBy");

            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " DROP COLUMN isDeleted");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " DROP COLUMN deleted_at");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " DROP COLUMN deleted_by");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " DROP COLUMN updated_at");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " DROP COLUMN updated_by");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " DROP COLUMN created_at");
            st.executeUpdate("ALTER TABLE " + dtp.table(i) + " DROP COLUMN created_by");
            System.out.println("Deleted BackLog By Nguyen Ngoc Linh Dan");
        }

    }

    public static void createDirec(String direction) {

        Path path = Paths.get(link + direction);

        try {
            Path createDirectories = Files.createDirectories(path);

            System.out.println("Created a Directories at : " + createDirectories);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFile(String file) {

        Path path = Paths.get(link + file);

        try {
            Path createdFilePath = Files.createFile(path);
            System.out.println("Created a file at : " + createdFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


