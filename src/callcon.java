import java.sql.*;
import javax.swing.JOptionPane;

public class callcon extends sqluser {

//Method callcon() - To established connection with JDBC
    Connection callcon()
    {
        try{  
          String url="jdbc:mysql://localhost:3306/xiia_gp1";
          Class.forName("java.sql.Driver");
          Connection con=DriverManager.getConnection(url,getuid(),getpwd());
          return con;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        //return null;   
    }
}
