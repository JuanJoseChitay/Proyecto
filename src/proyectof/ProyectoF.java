
package proyectof;

import controlador.AvanzadoCon;
import controlador.IntermedioCon;
import modelo.Avanzado;
import modelo.Intermedio;
import vista.ventanaAvanzado;
import vista.ventanaIntermedio;
import vista.ventanaPrincipiante;

public class ProyectoF {

    
    public static void main(String[] args) {
        
        
        /////PARA ABIR LA VENTAN DE PRINCIPIANTE
        //ventanaPrincipiante n = new ventanaPrincipiante();
       // n.setVisible(true);
        
       
       
       /// PARA ABRIR LA VENTANA DE INTERMEDIO
       
       
//        ventanaIntermedio ve =new ventanaIntermedio();
//        Intermedio in = new Intermedio();
//        IntermedioCon incon =new IntermedioCon(in, ve);
//        
//        ve.setVisible(true);

/// PARA ABRIR LA VENTANA AVANZADO

            ventanaAvanzado vac = new ventanaAvanzado();
            Avanzado ac = new Avanzado();
            AvanzadoCon cr= new AvanzadoCon(vac, ac);

            vac.setVisible(true);
    }
    
}
