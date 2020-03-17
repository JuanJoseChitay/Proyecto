package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Intermedio;
import vista.ventanaIntermedio;

/**
 *
 * @author Juan José
 */
public class IntermedioCon implements ActionListener {

    Intermedio interc = new Intermedio();
    ventanaIntermedio venin = new ventanaIntermedio();

    public IntermedioCon(Intermedio in, ventanaIntermedio ve) {
        this.interc = in;
        this.venin = ve;

        

        venin.cBoxPregunta1.addItem("Hermano de Jesus de Alvarado");
        venin.cBoxPregunta1.addItem("Hermano de Pedro de Alvarado");
        venin.cBoxPregunta1.addItem("Hermano de Luis de Alvarado");
        venin.cBoxPregunta2.addItem("Roma");
        venin.cBoxPregunta2.addItem("Aqui me quedo");
        venin.cBoxPregunta2.addItem("atraccion peligrosa");
        venin.cBoxPregunta3.addItem("por la espalda");
        venin.cBoxPregunta3.addItem("traición");
        venin.cBoxPregunta3.addItem("le atravezaron el pecho con una lanza");
        venin.botonEnviarIntermedio.addActionListener(this);

    }
    
    
    
    public void comparar() {
     //  System.out.println(venin.cBoxPregunta1.getItemAt(1)); //jalar el item dependiendo de la posicion que mandamos ->string
       
    //   System.out.println(venin.cBoxPregunta2.getSelectedItem());//jalar el item que  el usuario selecciona
    
        if (venin.cBoxPregunta1.getItemAt(1).equals(venin.cBoxPregunta1.getSelectedItem())) {
            System.out.println("son iguales");
        }else  {
            System.out.println("son diferentes");
        }
        
      
          if (venin.cBoxPregunta2.getItemAt(1).equals(venin.cBoxPregunta2.getSelectedItem())) {
            System.out.println("son iguales1");
        }else  {
            System.out.println("son diferentes1");
        }
        
            if (venin.cBoxPregunta3.getItemAt(2).equals(venin.cBoxPregunta3.getSelectedItem())) {
            System.out.println("son iguales2");
        }else  {
            System.out.println("son diferentes2");
        }
        
        
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.venin.botonEnviarIntermedio) {
            
            comparar();
        }
        
        
    }

}
