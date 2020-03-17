
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import modelo.Avanzado;
import vista.ventanaAvanzado;

/**
 *
 * @author Juan José
 */
public class AvanzadoCon implements ActionListener{
    
    ventanaAvanzado venA =new ventanaAvanzado();
    Avanzado avac = new Avanzado();
     Random ra = new Random();
    int numeroAleatorio= ra.nextInt(11);
    
    
    public AvanzadoCon(ventanaAvanzado va, Avanzado ca) {
        this.venA=va;
        this.avac=ca;
        
        venA.botonEnviarAvanzado.addActionListener(this);
        venA.labelNumeroAleatorio.setText("?");
    }
    
    public void comparar(){
     
        int perro= Integer.parseInt(venA.txtRespuestaAvanzado.getText());
        
        if (numeroAleatorio==perro) {
            System.out.println("son iguales");
        }
        
        
    
    
    
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.venA.botonEnviarAvanzado) {
            comparar();
        }
        
        
    }
    
    
    
    
    
}
