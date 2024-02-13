import java.sql.*;

public class Database2{

    public static void main(String args[]) throws Exception
    {



        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement stm = con.createStatement();

         ResultSet st = stm.executeQuery("select * from students");

         int iRoll;
         String City;
         String Name;
         while(st.next())
         {
            System.out.print(st.getInt("roll")+" ");
            System.out.print(st.getString("name")+" ");
            System.out.print(st.getString("city")+" ");
            System.out.println(st.getInt(4)+" ");

         }

         st.close();
         con.close();



    }

}