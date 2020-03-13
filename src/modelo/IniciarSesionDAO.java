
package modelo;

import java.util.ArrayList;
import vista.ventanaIniciarSesion;

public class IniciarSesionDAO implements CDAO{
    
     public void usuario(String Usuario, String Contraseña) {
        IniciarSesionVO i = new IniciarSesionVO();
         ventanaIniciarSesion vin = new ventanaIniciarSesion();
        
        
        try {
            Conector c = new Conector();
            c.conectar();
            c.consulta_multiples("SELECT nombre_usuario, id_tipo_usuario FROM	tbl_usuario WHERE nombre_usuario ='"+i.getUsuario()+"' AND contrasena_usuario='"+i.getContrasena()+"'");
           
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public ArrayList<IniciarSesionVO> Sesion() {
        ArrayList<IniciarSesionVO> info = new ArrayList();
        Conector c = new Conector();
        try {
            c.conectar();
            
        } catch (Exception e) {
        }
        
        
        
        
    return info;
}
   























}
    
    
