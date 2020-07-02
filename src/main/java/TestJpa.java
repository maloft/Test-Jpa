import java.util.List;

import javax.persistence.*;

public class TestJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
		/*Réalisez un find simple permettant d’extraire un livre en fonction de son identifiant et 
		 * affichez son titre et son auteur.*/
		Livre livre = em.find(Livre.class, 1);
		
		System.out.println(livre.getTitre() + " by " + livre.getAuteur());
		
		
		
		/*Modifiez le titre du livre d’identifiant 5 qui possède une erreur : le nouveau titre doit être
		 * « Du plaisir dans la cuisine » au lieu de « 1001 recettes de Cuisine ». */
		Livre ll = em.find(Livre.class, 5);
		if (ll != null) {
			ll.setTitre("Du plaisir dans la cuisine");
		}
		
		
		
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
		
		
		//Supprimez un livre de votre choix en base de données.
		Livre l = em.find(Livre.class, 2);

		if (l != null){
			em.remove(l);
		}
		
		//Affichez la liste de tous les livres présents en base de données (titre et auteur).
		TypedQuery<Livre> query = em.createQuery("select l from Livre l", Livre.class);
        List<Livre> liste = query.getResultList();
        liste.forEach(System.out::println);

		
		em.close();

	}

}
