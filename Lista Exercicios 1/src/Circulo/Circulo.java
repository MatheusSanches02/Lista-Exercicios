package Circulo;
/*
Escreva uma classe Circulo para representar c�rculos. 
Esta classe dever� conter os seguintes atributos e m�todos:

a) Uma vari�vel privada do tipo double chamada raio que guardar� o valor 
do raio atual do circulo.

b) M�todos get() e set() p�blicos que permitem definir e acessar o valor 
da vari�vel raio.

c) Um construtor que recebe o valor do raio como argumento.

d) Um m�todo getArea() que calcula e retorna a �rea do c�rculo.

e) Um m�todo getCircunferencia() que calcula e retorna a circunfer�ncia 
do c�rculo.

f) Um m�todo aumentarRaio() que recebe um valor double e o usa como 
percentual para aumentar o raio do c�rculo.

Crie uma classe contendo um m�todo main() para testar a funcionalidade 
da classe Circulo.

Exemplo de entrada e sa�da:

Informe o raio do c�rculo: 5
Raio: 5.0
�rea: 78.53981633974483 metros quadrados
Circunfer�ncia: 31.4159265389793

Informe o percentual de aumento do raio: 30
Raio: 6.5
�rea: 132.73228961416876 metros quadrados
Circunfer�ncia: 40.840704496667314

* */
public class Circulo {
	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getArea() {
		double area = Math.PI * Math.pow(this.raio, 2); //Raio elevado a 2 por causa do Math.pow
		return area;
	}
	
	public double getCircunferencia() {
		double circunferencia = (2 * Math.PI) * this.raio;
		return circunferencia;
	}
	
	public void aumentarRaio(double percentual) {
		this.raio = this.raio + (percentual / 100) * this.raio;
	}

}
