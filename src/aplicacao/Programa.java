package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Carlos Silva", "carlos.silva@gmail.com");
		Pessoa p2 = new Pessoa(1, "Feliciano Augosto", "feliciano.augosto@gmail.com");
		Pessoa p3 = new Pessoa(1, "Joana Lim", "joana.lim@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
