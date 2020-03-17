
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;
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
        
        
        venA.labelPalabraAvanzado1.setText("Car");
        venA.labelPalabraAvanzado2.setText("Sleep ");
        venA.labelPalabraAvanzado3.setText("Shape");
        
        
    }
    
    public void comparar(){
     
       
      
        
       
        try {
            
             int numeroA= Integer.parseInt(venA.txtRespuestaAvanzado.getText());
             if (numeroAleatorio==numeroA) {
            venA.labelMensaje.setText("¡¡Felicitaciones!!");
        }else{
        venA.labelMensaje.setText("Intentalo de nuevo :( ");
        
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"llena todo los campos");
        }
        
        
        
        
       
        
        
        if (venA.txtPalabraAvanzado1.getText().equals("Carro")) {
            
            venA.labelpalabra1.setText("correcto");
            
        }else{
        venA.labelpalabra1.setText("Incorrecto");
        }
    
//    
        
        
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.venA.botonEnviarAvanzado) {
            comparar();
            
        }
        
        
    }
    
    
    
    
    
}
