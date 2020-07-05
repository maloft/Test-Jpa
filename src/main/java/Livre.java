import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="LIVRE")
public class Livre {
	
	@ManyToMany
	@JoinTable(name="COMPO",joinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"))
	private Set<Livre> emprunts;
	
	
	@Id
	@Column(name = "ID",length = 10, nullable = false, unique = true)
	private Integer Id;
	
	@Column(name = "TITRE", length = 255, nullable = false)
	private String titre;
	
	@Column(name = "AUTEUR", length = 50, nullable = false)
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
