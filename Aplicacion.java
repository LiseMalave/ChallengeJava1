import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Aplicacion extends JFrame implements ActionListener{
	private JComboBox<String>combo;
	private JLabel label1,label2,label3;
	private JTextField texto1;
	private JButton boton1;
	private JMenuBar menuP;
	private JMenu menuO;
	private JMenuItem item1,item2;
	
	
	
	public Aplicacion() {
		setLayout(null);
        Color color=new Color(174, 214, 241);
        Container c =getContentPane();
        c.setBackground(color); 
                
        setVisible(true);

		label2 = new JLabel("Elije la moneda a la que deseas convertir tu dinero: ");
		label2.setBounds(130, 120, 350, 20);
		add(label2);
		combo = new JComboBox<String>();
		combo.setBounds(150, 150, 200, 20);
		combo.addItem("De Peso a Dólar");
		combo.addItem("De Pesos a Euro");
		combo.addItem("De Peso a Libra Esterlina");
		combo.addItem("De Peso a Yen Japonés");
		combo.addItem("De Dólar a Pesos");
		combo.addItem("De Euro a Pesos");
		combo.addItem("De Libra Esterlina a Pesos");
		combo.addItem("De Yen Japonés a Pesos");
		add(combo);
		label1 = new JLabel("Cantidad de dinero que deseas convertir: ");
		label1.setBounds(130, 200, 350, 20);
		add(label1);
		
		label3 = new JLabel();
		label3.setIcon(new ImageIcon("C:\\Users\\lissm\\Documents\\ChallengeOracle\\Diseño sin título.png"));
		label3.setBounds(170, 10, 200, 80);
		setContentPane(c);
		c.setLayout(null);
		c.add(label3);
		texto1 = new JTextField();
		texto1.setBounds(150, 240, 200, 20);
		add(texto1);
		
		boton1 = new JButton("Convertir");
		boton1.setBounds(380, 235, 100, 25);
		add(boton1);
		boton1.addActionListener(this);
		
		/*menuP = new JMenuBar();
		setJMenuBar(menuP);
		menuO = new JMenu("Opciones");
		menuP.add(menuO);
		
		item1 = new JMenuItem("Calculadora");
		menuO.add(item1);
		
		item2 = new JMenuItem("Salir");
		menuO.add(item2);*/
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1) {
			
			String s2= texto1.getText();
											
				
			
			String s1 = combo.getSelectedItem().toString();
			String dolar = "De Peso a Dólar";
			String euro = "De Pesos a Euro";
			String libra = "De Peso a Libra Esterlina";
			String yen= "De Peso a Yen Japonés";
			String PesoDolar= "De Dólar a Pesos";
			String PesoEuro= "De Euro a Pesos";
			String PesoLibra= "De Libra Esterlina a Pesos";
			String PesoYen= "De Yen Japonés a Pesos";
			if(dolar.equals(s1)) {
				String monto = texto1.getText();
				double monto1= Double.parseDouble(monto);
				double Cambio = monto1/ 450;
				String resultado = String.valueOf(Cambio);
				JOptionPane.showMessageDialog(boton1, "tienes: " + resultado +  " dólares");
			}if(euro.equals(s1)) {
				String monto = texto1.getText();
				double monto1= Double.parseDouble(monto);
				double Cambio = monto1/ 490.31;
				String resultado = String.valueOf(Cambio);
				JOptionPane.showMessageDialog(boton1, "tienes: " + resultado +  " euros");
			}if(libra.equals(s1)) {
				String monto = texto1.getText();
				double monto1= Double.parseDouble(monto);
				double Cambio = monto1/ 545.47;
				String resultado = String.valueOf(Cambio);
				JOptionPane.showMessageDialog(boton1, "tienes: " + resultado +  " libras esterlinas");
			}if(yen.equals(s1)) {
				String monto = texto1.getText();
				double monto1= Double.parseDouble(monto);
				double Cambio = monto1/296.43;
				String resultado = String.valueOf(Cambio);
				JOptionPane.showMessageDialog(boton1, "tienes: " + resultado +  " yenes");
			}if(PesoDolar.equals(s1)) {
				String monto = texto1.getText();
				double monto1= Double.parseDouble(monto);
				double Cambio = monto1 * 425.7;
				String resultado = String.valueOf(Cambio);
				JOptionPane.showMessageDialog(boton1, "tienes: " + resultado +  " pesos");
			}if(PesoEuro.equals(s1)) {
				String monto = texto1.getText();
				double monto1= Double.parseDouble(monto);
				double Cambio = monto1 * 458.51;
				String resultado = String.valueOf(Cambio);
				JOptionPane.showMessageDialog(boton1, "tienes: " + resultado +  " pesos");
				
				}if(PesoLibra.equals(s1)) {
					String monto = texto1.getText();
					double monto1= Double.parseDouble(monto);
					double Cambio = monto1 * 543.34;
					String resultado = String.valueOf(Cambio);
					JOptionPane.showMessageDialog(boton1, "tienes: " + resultado +  " pesos");
					
				}if(PesoYen.equals(s1)) {
						String monto = texto1.getText();
						double monto1= Double.parseDouble(monto);
						double Cambio = monto1 * 295.49;
						String resultado = String.valueOf(Cambio);
						JOptionPane.showMessageDialog(boton1, "tienes: " + resultado +  " pesos");
			
				}
				
			}
			
		}
		
	
}
