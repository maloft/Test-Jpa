import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENT")
public class Client {
	
	@Id
	@Column (name = "ID")
	private Integer Id;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "PRENOM")
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
