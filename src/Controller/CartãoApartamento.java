package Controller;

import br.edu.fateczl.lista.listaObj.Lista;
import model.Carros;

public class CartãoApartamento {
	Lista[] morador ;
	public CartãoApartamento() {
		morador=new Lista[10];
		Inmoradorhash();
	}
	private void Inmoradorhash() {
		int tam =morador.length;
		for (int i=0; i< tam; i++) {
			morador[i]= new Lista();
		}
		
	}
	public void Adicionar(Carros napart) {
		int posi = napart.hashCode();
		morador[posi].addFirst(napart);
	}
	public Carros Buscar(Carros npart) throws Exception{
		int pos = npart.hashCode();
		Lista l = morador [pos];
		int tam = l.size();
		for ( int i =0; i<tam;i++) {
			Carros c =(Carros)l.get(i);
			if(c.getNpart().equals(npart.getNpart()))){
				return c;
				}
		}
		return null;
		}
	
	public Carros remove (Carros npart) {
		int pos = npart.hashCode();
		Lista l = morador [pos];
		int tam = l.size();
		for ( int i =0; i<tam;i++) {
			Carros c =(Carros)l.get(i);
		//if(c.getNpart().equals(npart.getNpart())) {
			l.remove(i);
			break;
			
		}
}

//}
	public void lista(int napart) throws Exception {
		int pos = hashCode();
		Lista l = morador[pos];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			System.out.println(l.get(i).toString());
		}
}
}



