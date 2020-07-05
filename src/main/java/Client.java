import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="CLIENT")
public class Client {
	
	@OneToMany(mappedBy="client")
	private Set<Emprunt> emprunt;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", length = 10, nullable = false, unique = true)
	private Integer Id;
	
	@Column(name = "NOM", length = 50, nullable = false)
	private String nom;
	
	@Column(name = "PRENOM", length = 50, nullable = false)
	private String prenom;
	
	


	//Constructeur sans argument 
	public Client() {}




	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	}



	// Getters & Setters
	public Integer getId() {
		return Id;
	}




	public void setId(Integer id) {
		Id = id;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

}
