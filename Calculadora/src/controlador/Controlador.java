package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import vista.Interfaz;
import modelo.Operaciones;

/**
 *
 * @author Fabregas
 */
public class Controlador extends Interfaz implements ActionListener {

	public float operandoA;
	public float operandoB;
	public float res;
	public String str;
	public byte operacion;

	public Controlador() {

		// Añadir Listeners
		uno.addActionListener(this);
		dos.addActionListener(this);
		tres.addActionListener(this);
		cuatro.addActionListener(this);
		cinco.addActionListener(this);
		seis.addActionListener(this);
		siete.addActionListener(this);
		ocho.addActionListener(this);
		nueve.addActionListener(this);
		cero.addActionListener(this);
		punto.addActionListener(this);
		suma.addActionListener(this);
		resta.addActionListener(this);
		multi.addActionListener(this);
		divi.addActionListener(this);
		igual.addActionListener(this);
		ce.addActionListener(this);
		
		try{
			FileReader fr = new FileReader("history.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while(br.readLine()!=null){
				lista.add(br.readLine());
			}
			
			}catch(FileNotFoundException fnfe){
				System.out.println("No encontrado");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	
	

	@Override
	// Establecer acciones de cada listener
	public void actionPerformed(ActionEvent e) {
		try {
			boolean nuevaOperacion = true;

			HistoryWriter hw = new HistoryWriter();
			FileReader fr = new FileReader("history.txt");
			BufferedReader br = new BufferedReader(fr);
			

			String comando = e.getActionCommand();
			switch (comando) {
			case "1":
				str = tf.getText();
				tf.setText(str + "1");
				hw.write(str + "1");				
				nuevaOperacion = false;
				break;
			case "2":
				str = tf.getText();
				tf.setText(str + "2");
				hw.write(str + "2");
				nuevaOperacion = false;
				break;
			case "3":
				str = tf.getText();
				tf.setText(str + "3");
				hw.write(str + "3");
				nuevaOperacion = false;
				break;
			case "4":
				str = tf.getText();
				tf.setText(str + "4");
				hw.write(str + "4");
				nuevaOperacion = false;
				break;
			case "5":
				str = tf.getText();
				tf.setText(str + "5");
				hw.write(str + "5");
				nuevaOperacion = false;
				break;
			case "6":
				str = tf.getText();
				tf.setText(str + "6");
				hw.write(str + "6");
				nuevaOperacion = false;
				break;
			case "7":
				str = tf.getText();
				tf.setText(str + "7");
				hw.write(str + "7");
				nuevaOperacion = false;
				break;
			case "8":
				str = tf.getText();
				tf.setText(str + "8");
				hw.write(str + "8");
				nuevaOperacion = false;
				break;
			case "9":
				str = tf.getText();
				tf.setText(str + "9");
				hw.write(str + "9");
				nuevaOperacion = false;
				break;
			case "0":
				str = tf.getText();
				tf.setText(str + "0");
				hw.write(str + "0");
				nuevaOperacion = false;
				break;
			case ".":
				str = tf.getText();
				tf.setText(str + ".");
				hw.write(str + ".");
				nuevaOperacion = false;
				break;
			case "+":
				operandoA = Float.parseFloat(tf.getText());
				tf.setText("");
				hw.write(str + "+");
				operacion = 1;
				break;
			case "-":
				operandoA = Float.parseFloat(tf.getText());
				tf.setText("");
				hw.write(str + "-");
				operacion = 2;
				break;
			case "x":
				operandoA = Float.parseFloat(tf.getText());
				tf.setText("");
				hw.write(str + "x");
				operacion = 3;
				break;
			case "÷":
				operandoA = Float.parseFloat(tf.getText());
				tf.setText("");
				hw.write(str + "÷");
				operacion = 4;
				break;
			case "CE":
				tf.setText("");
				res = 0;
				nuevaOperacion = true;
			case "=":
				Operaciones op = new Operaciones();
				switch (operacion) {
				case 1:
					operandoB = Float.parseFloat(tf.getText());
					res = op.suma(operandoA, operandoB);
					hw.writeln("=" + String.valueOf(res));
					tf.setText(String.valueOf(res));
					lista.add(String.valueOf(operandoA) + " + " + String.valueOf(operandoB) + " = " + res);
					break;
				case 2:
					operandoB = Float.parseFloat(tf.getText());
					res = op.resta(operandoA, operandoB);
					hw.writeln(String.valueOf(res));
					tf.setText(String.valueOf(res));
					lista.add(String.valueOf(operandoA) + " - " + String.valueOf(operandoB) + " = " + res);
					lista.add(br.readLine());
					break;
				case 3:
					operandoB = Float.parseFloat(tf.getText());
					res = op.multiplicacion(operandoA, operandoB);
					hw.writeln(String.valueOf(res));
					tf.setText(String.valueOf(res));
					lista.add(String.valueOf(operandoA) + " x " + String.valueOf(operandoB) + " = " + res);
					lista.add(br.readLine());
					break;
				case 4:
					operandoB = Float.parseFloat(tf.getText());
					res = op.division(operandoA, operandoB);
					hw.writeln(String.valueOf(res));
					tf.setText(String.valueOf(res));
					lista.add(String.valueOf(operandoA) + " ÷ " + String.valueOf(operandoB) + " = " + res);
					lista.add(br.readLine());

				}
			}
		} catch (Exception ex) {

		}
	}

}
