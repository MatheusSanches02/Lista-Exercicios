package Lampada;

public class Lampada {
	
	private boolean ligar;
	private boolean desligar;
	
	public boolean isLigar() {
		return ligar;
	}
	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}
	public boolean isDesligar() {
		return desligar;
	}
	public void setDesligar(boolean desligar) {
		this.desligar = desligar;
	}
	
	public void luzAcesa(String acender) 
	{
		System.out.println("Luz acesa!");
	}
	

}
