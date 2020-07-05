import javax.persistence.*;

public class TestBibliotheque {

	public static void main(String[] args) {
		
		
		EntityManagerFactory eMf = Persistence.createEntityManagerFactory("pu_bibli");
		EntityManager em = eMf.createEntityManager();
		
		
		Emprunt emprunt = em.find(Emprunt.class, 1);
		
		System.out.println(emprunt);
		
		
		em.close();
		eMf.close();

	}

}
