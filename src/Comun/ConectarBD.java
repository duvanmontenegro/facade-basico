/**
 *
 * @author Antonella C
 */
package Comun;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConectarBD 
{
    public String url = "jdbc:mysql://localhost/Tarjeta";
    public String user = "root";
    public String pass = "1234";

    public Connection Conectar() 
    {
        Connection link = null;
        
        try 
        {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
            
        }
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return link;
    }

}
