import javax.swing.JOptionPane;

public class Aplicacion {
	JOptionPane.showInputDialog("Seleccione una opción de conversión:","conversor de monedas");
	int moneda= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir:"));
	if (moneda >0) {
		Object[] opciones = { "Pesos a Dólar", "Pesos a Libras"};
		String m =(String)JOptionPane.showInputDialog( "Elija una opción:\n", JOptionPane.PLAIN_MESSAGE, opciones,"pesos a dolar");
		
	}
}
