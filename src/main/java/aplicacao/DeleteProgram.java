package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class DeleteProgram {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		// apagar elementos
		Pessoa p = new Pessoa(2, null, null); // ERRO, é um objeto destacado
		
		// 1. consultar o objeto(monitorado)
		Pessoa p1 = em.find(Pessoa.class, 4);
		Pessoa p2 = em.find(Pessoa.class, 5);
		Pessoa p3 = em.find(Pessoa.class, 6);
		
		// 2. criar a transação
		em.getTransaction().begin();
		
		// 3. método para remover o objeto do banco
		em.remove(p1);
		em.remove(p2);
		em.remove(p3);
		
		// 4. confirmar a transação
		em.getTransaction().commit();
		
		
		System.out.println("Pronto");
		emf.close();
		em.close();
	}

}
