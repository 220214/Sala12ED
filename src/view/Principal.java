package view;

import Controller.CartãoApartamento;
import model.Carros;

public class Principal {

	public static void main(String[] args) {
		Carros c = new Carros();
		c.setNapart(102);
		c.setCor("preto");
		c.setNome("May");
		c.setPlaca("AJJ123");
		
		Carros c1 = new Carros();
		c1.setNapart(112);
		c1.setCor("prata");
		c1.setNome("Mays");
		c1.setPlaca("AJk2123");
		Carros c2 = new Carros();
		c2.setNapart(202);
		c2.setCor("verde");
		c2.setNome("Mary");
		c2.setPlaca("MaJ123");
		Carros c3 = new Carros();
		c3.setNapart(452);
		c3.setCor("Azul");
		c3.setNome("Marty");
		c3.setPlaca("Kda123");
		Carros c4 = new Carros();
		c4.setNapart(342);
		c4.setCor("preto");
		c4.setNome("Mayff");
		c4.setPlaca("AJJ678");
		CartãoApartamento car = new CartãoApartamento();
		car.Adicionar(c);
		car.Adicionar(c1);
		car.Adicionar(c2);
		car.Adicionar(c3);
		car.Adicionar(c4);
		Carros cc= new Carros();
		cc.setAndar(342);
		//
		try {
			cc =car.Buscar(cc);
			System.out.println(cc.toString());
			System.out.println("Removido");
			System.out.println(cc.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
