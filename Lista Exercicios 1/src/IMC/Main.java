package IMC;

public class Main {

	public static void main(String[] args) {
		
		CalculaImc calc = new CalculaImc();
		
		calc.calculaImc(calc.receberPeso(), calc.receberAltura());

	}

}
