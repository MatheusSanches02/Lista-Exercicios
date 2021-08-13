package IMC;

import java.util.Scanner;

public class CalculaImc {
	Scanner input = new Scanner(System.in);
	
	public double receberPeso()
	{
		double peso;
		System.out.println("Qual o seu peso: ");
		peso = input.nextDouble();
		return peso;
	}
	
	public double receberAltura()
	{
		double altura;
		System.out.println("Qual a sua altura: ");
		altura = input.nextDouble();
		return altura;
	}
	
	public double calculaImc(double peso, double altura)
	{
		double imc;
		imc = peso / (altura * altura);
		if(imc < 18.5)
		{
			System.out.println("Abaixo do peso");
		}
		else if(imc >= 18.5 && imc <24.9)
		{
			System.out.println("Peso normal");
		}
		else if(imc >= 24.9 && imc < 29.9)
		{
			System.out.println("Sobrepeso");
		}
		else if(imc >= 30 && imc < 34.9)
		{
			System.out.println("Obesidade grau 1");
		}
		else if(imc >= 34.9 && imc < 39.9)
		{
			System.out.println("Obesidade grau 2");
		}
		else
		{
			System.out.println("Obseidade grau 3");
		}
		System.out.println(imc);
		return imc;
	}
	
	
	

}
