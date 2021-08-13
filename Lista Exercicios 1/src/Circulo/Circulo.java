package Circulo;
/*
Escreva uma classe Circulo para representar círculos. 
Esta classe deverá conter os seguintes atributos e métodos:

a) Uma variável privada do tipo double chamada raio que guardará o valor 
do raio atual do circulo.

b) Métodos get() e set() públicos que permitem definir e acessar o valor 
da variável raio.

c) Um construtor que recebe o valor do raio como argumento.

d) Um método getArea() que calcula e retorna a área do círculo.

e) Um método getCircunferencia() que calcula e retorna a circunferência 
do círculo.

f) Um método aumentarRaio() que recebe um valor double e o usa como 
percentual para aumentar o raio do círculo.

Crie uma classe contendo um método main() para testar a funcionalidade 
da classe Circulo.

Exemplo de entrada e saída:

Informe o raio do círculo: 5
Raio: 5.0
Área: 78.53981633974483 metros quadrados
Circunferência: 31.4159265389793

Informe o percentual de aumento do raio: 30
Raio: 6.5
Área: 132.73228961416876 metros quadrados
Circunferência: 40.840704496667314

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
