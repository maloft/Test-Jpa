import javax.persistence.*;

public class TestJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
		/*Réalisez un find simple permettant d’extraire un livre en fonction de son identifiant et 
		 * affichez son titre et son auteur.*/
		Livre livre = em.find(Livre.class, 1);
		
		System.out.println(livre.getTitre() + " by " + livre.getAuteur());
		
		
		//Insérez un nouveau Livre de votre choix en base de données
		Livre nouv = new Livre();
		nouv.setId(8);
		nouv.setAuteur("Avicenna");
		nouv.setTitre("The Canon of Medicine");
		em.persist(nouv);
		
		// Constrainte JPA => la modification doit se faire dans le cadre d'une transaction.
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(nouv); // insérer une nouvelle ligne
        tx.commit(); // flush automatique
		
		
		
		/*Modifiez le titre du livre d’identifiant 5 qui possède une erreur : le nouveau titre doit être
		 * « Du plaisir dans la cuisine » au lieu de « 1001 recettes de Cuisine ». */
		em.find(Livre.class, 5).setTitre("Du plaisir dans la cuisine");
		
		
		
		//Faites une requête JPQL pour extraire de la base un livre en fonction de son titre.
		TypedQuery<Livre> query2 = em.createQuery("select l from Livre l where l.titre='Guerre et paix'", 
				Livre.class);
		
		Livre l2 = query2.getResultList().get(0);
		
		System.out.println(l2.getId());	
		
		//Faites une requête JPQL pour extraire de la base un livre en fonction de son auteur.
		TypedQuery<Livre> query3 = em.createQuery("select l from Livre l where l.auteur='Saint Exupéry'", 
				Livre.class);
		
		Livre l3 = query3.getResultList().get(0);
		
		System.out.println(l3.getId());
		
		em.close();

	}

}
