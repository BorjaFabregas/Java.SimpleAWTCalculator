package vista;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Fabregas
 */
public class Interfaz extends Frame {
    
    //Botones
      public Button uno = new Button("1");
      public Button dos = new Button("2");
      public Button tres = new Button("3");
      public Button cuatro = new Button("4");
      public Button cinco = new Button("5");
      public Button seis = new Button("6");
      public Button siete = new Button("7");
      public Button ocho = new Button("8");
      public  Button nueve = new Button("9");
      public Button cero = new Button("0");
      public Button suma = new Button("+");
      public Button resta = new Button("-");
      public Button multi = new Button("x");
      public Button divi = new Button("÷");
      public Button igual = new Button("=");
      public Button punto = new Button(".");
      public Button ce = new Button("CE");

        //Pantallas
      public  TextField tf = new TextField();
      
      public List lista = new List();

    public Interfaz() {

        super("CALCULADORA");

        //Cierre 
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        this.setLocation(400, 200);
        this.setSize(320, 328);
        
       Panel panel = new Panel();
       panel.setLayout(new GridLayout(2,1));
       panel.setSize(300, 300);
       
       //panel.setBackground(Color.MAGENTA);
       
       Panel pantalla = new Panel();
       pantalla.setLayout(new GridLayout(2, 1));
       Panel botones = new Panel();
       botones.setLayout(new GridLayout(5, 4));
       
       tf.setFont(new Font("Monospaced",1 , 14));
       
        pantalla.add(lista);
       pantalla.add(tf);
       botones.add(siete);
       botones.add(ocho);
       botones.add(nueve);
       botones.add(divi);
       botones.add(cuatro);
        botones.add(cinco);
        botones.add(seis);
        botones.add(multi);
        botones.add(uno);
        botones.add(dos);
        botones.add(tres);
        botones.add(resta);
        botones.add(igual);
        botones.add(cero);
        botones.add(punto);
        botones.add(suma);
        botones.add(ce);
        
        
        this.add(panel, BorderLayout.CENTER);
        panel.add(pantalla, BorderLayout.NORTH);
        panel.add(botones, BorderLayout.SOUTH);
        
        this.setResizable(false);
        this.setVisible(true);

    }



}
