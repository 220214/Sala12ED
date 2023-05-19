package model;
//
public class Carros {
	private int napart;
	private String Nome;
	private String cor;
	private String placa;
	private int andar;
	public Carros() {
		super();
	}
	@Override
	
	public String toString() {
		return " Apartamento:" + napart + "nome: "+ Nome; 
	}
 	
	public void setNapart(int napart) {
		this.napart= napart;
	}
	public int getNpart() {
		return napart;
		
	}
	public void setNome(String Nome) {
		this.Nome= Nome;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setCor(String cor) {
		this.cor= cor;
	}
	public String getCor() {
		return cor;
	}
	public void setPlaca(String placa) {
		this.placa= placa;
	}
	public String getPlaca() {
		return placa;
		
	}
	public void setAndar(int andar) {
		this.andar= andar;
	}
	public int getAndar() {
		return andar;
	}
	public int hashCode() {
		int andar = napart/100;
		return andar;
	}
	
}
