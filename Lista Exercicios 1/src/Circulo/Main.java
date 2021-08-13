package Circulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double raio, aumento;
		
		System.out.println("Raio: ");
		raio = input.nextDouble();
		Circulo circulo = new Circulo(raio);
		
		System.out.println("Raio: " + circulo.getRaio());
		System.out.println("Area: " + circulo.getArea() + " metros quadrados");
		System.out.println("Circunferencia: " + circulo.getCircunferencia() + " metros");
		
		System.out.println("Percentual de aumento: ");
		aumento = input.nextDouble();
		circulo.aumentarRaio(aumento);
		System.out.println("Aumento: " + aumento + "%");
		System.out.println("Novo Raio: " + circulo.getRaio());
		System.out.println("Nova Area: " + circulo.getArea() + " metros quadrados");
		System.out.println("Nova Circunferencia: " + circulo.getCircunferencia() + " metros");
	
	}

}
