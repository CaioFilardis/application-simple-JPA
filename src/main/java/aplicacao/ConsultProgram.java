package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class ConsultProgram {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		// buscar uma pessoa no banco de dados com a funcao 'find(Classe.class, id)'
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		
		System.out.println("Pronto");
		emf.close();
		em.close();
	}

}
