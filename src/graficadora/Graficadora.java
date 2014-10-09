package graficadora;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author jorge
 */
public class Graficadora {

    //Importante, plano debe ser publico y estatico
    public static Plano plano;

    public static void main(String[] args) {

        //Creando la ventana y el plano de dibujo
        Ventana frame = new Ventana();
        frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 510, 600);
        frame.setLayout(new BorderLayout());
        plano = new Plano();
        JTextField Cinicial = new  JTextField("Condicion Inicial");
        JTextField Cintermedia = new  JTextField("Condicion Intermedia");
        JTextField Cduda = new  JTextField("?");
        //Configuración del Boton
        JButton jBtnCrecimiento = new JButton("Iniciar");
        jBtnCrecimiento.addActionListener(frame);
        jBtnCrecimiento.setText("Iniciar");

        //Bordes al panel
        
        frame.add(Cinicial);
        frame.add(Cintermedia);
        frame.add(Cduda);
        frame.add(jBtnCrecimiento);
        frame.add( plano);
        
        
        frame.setVisible( true );

    }
}