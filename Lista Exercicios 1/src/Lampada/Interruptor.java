package Lampada;

import java.util.Scanner;

public class Interruptor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lampada interruptor = new Lampada();
		
		
		interruptor.setDesligar(true);
		System.out.println("Lampada desligada, deseja ligar? S/N: ");
		char ligaDesliga = input.next().charAt(0);
		
		if(ligaDesliga == 'S') 
		{
			interruptor.setDesligar(false);
			interruptor.setLigar(true);
			System.out.println(interruptor.isLigar() + " Lampada acesa");
		}
		else 
		{	
			interruptor.setDesligar(true);
			interruptor.setLigar(false);
			System.out.println(interruptor.isDesligar() +" Lampada apagada!");
		}
		

	}

}
