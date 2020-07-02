import javax.persistence.*;

@Entity
@Table(name="LIVRE")
public class Livre {
	
	@Id
	@Column (name = "ID")
	private Integer Id;
	
	@Column(name = "TITRE")
	private String titre;
	
	@Column(name = "AUTEUR")
	private String auteur;
	
	
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + "]";
	}


	//Constructeur sans argument 
	public Livre() {}
	
	
	//Getters & Setters
	public Integer getId() {
		return Id;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public void setId(Integer Id) {
		this.Id = Id;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	
	
}
