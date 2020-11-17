package calculadoraPrincipal;
import javax.swing.JOptionPane;

public class CalculadoraPrincipal {

	public static void main(String[] args) {
		System.out.println ("Sistema Calculadora");
		int x, y;
		String sX, sY;
		
		sX = JOptionPane.showInputDialog(null, "Digite o primeiro número: ", "Primeiro número", JOptionPane.QUESTION_MESSAGE);
		x = Integer.parseInt(sX);
		sY = JOptionPane.showInputDialog(null, "Digite o segundo número: ", "Segundo número", JOptionPane.QUESTION_MESSAGE);
		y = Integer.parseInt(sY);
		
		Calculadora calc = new Calculadora();
		JOptionPane.showMessageDialog(null, "Somar: " + calc.somar(x, y));
		JOptionPane.showMessageDialog(null, "Subtrair: " + calc.subtrair(x, y));
		JOptionPane.showMessageDialog(null, "Multipicar: " + calc.multiplicar(x, y));
		JOptionPane.showMessageDialog(null, "Dividir: " + calc.dividir(x, y));
		

	}

}
