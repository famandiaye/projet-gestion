import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJavaMysql {

    public static void  main(String[]args){
        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");

            System.out.println("Pilote charger");

             Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/gestion ","root" ,"famaguiro");
             System.out.println("Connexion ok");

             Statement st = con.createStatement();
             st.executeUpdate("insert into Etudiant values('fama','ndiaye',7712345,'fama29@gmail.com');");
             ResultSet rs = st.executeQuery("select * from Etudiant ");
             while(rs.next()){
                System.out.println(rs.getString("prenom"));
                System.out.println(rs.getString("nom"));
                System.out.println(rs.getString("email"));
             }   

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
};