package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author JJ
 */
public class Conector {

    private String driver = "com.mysql.jdbc.Driver";
    private String servidor = "127.1.1.0";
    private String usuario = "root";
    private String contraseña = "";
    private String bd = "db_juego";
    private String cadena;

    Connection con;
    Statement st;

    public void conectar() {
        this.cadena = "jdbc:mysql://" + this.servidor + this.bd;
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(cadena, usuario, contraseña);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public int consulta_multiples(String Consulta) {
        int resultado;
        try {
            this.conectar();
            this.st = this.con.createStatement();
            resultado = this.st.executeUpdate(Consulta);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return 0;
        }
        return resultado;
    }

    public ResultSet consulta_obtener(String consulta) {
        try {
            this.conectar();
            ResultSet respuesta = null;
            this.st = this.con.createStatement();
            respuesta = st.executeQuery(consulta);
            return respuesta;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;

    }

    public void desconecatar() {
        try {
            con.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
