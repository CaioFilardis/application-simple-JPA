package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class TransitionPrograma {

	public static void main(String[] args) {
		
		// 3. depois deixar como nulo os ids para serem incrementados
		Pessoa p1 = new Pessoa(null, "Carlos Silva", "carlos.silva@gmail.com");
		Pessoa p2 = new Pessoa(null, "Feliciano Augosto", "feliciano.augosto@gmail.com");
		Pessoa p3 = new Pessoa(null, "Joana Lim", "joana.lim@gmail.com");
		
		
		// 1. instanciar objeto EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		// 2. depois instanciar objeto EntityManager
		EntityManager em = emf.createEntityManager();
		
		// 4. criar um inicio de conexão(transação) com métodos 'getTransition().begin()'
		em.getTransaction().begin();
		
		// 5. pegar um dos objetos criados e salvar no banco de dados com método 'persist()'
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		// 6. confirmar alterações que foram feitas, com 'getTransition().commit()'
		em.getTransaction().commit();
		
		
		System.out.println("Pronto");
		emf.close();
		em.close();
	}

}
