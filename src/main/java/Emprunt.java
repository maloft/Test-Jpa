import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name="EMPRUNT")
public class Emprunt {
	
	@ManyToMany(mappedBy="emprunts")
	private Set<Livre> livres;
	
	
	
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	@Id
	@Column (name = "ID", length = 10, nullable = false, unique = true)
	private Integer Id;
	
	@Column(name = "DATE_DEBUT")
	private LocalDateTime date_debut;
	
	@Column(name = "DATE_FIN")
	private LocalDateTime date_fin;
	
	@Column(name = "DELAI", length = 10)
	private Integer delai;
	
	@Column(name = "ID_CLIENT", length = 10, nullable = false)
	private Integer Id_client;
	
	


	public Integer getId() {
		return Id;
	}




	public void setId(Integer id) {
		Id = id;
	}




	public LocalDateTime getDate_debut() {
		return date_debut;
	}




	public void setDate_debut(LocalDateTime date_debut) {
		this.date_debut = date_debut;
	}




	public LocalDateTime getDate_fin() {
		return date_fin;
	}




	public void setDate_fin(LocalDateTime date_fin) {
		this.date_fin = date_fin;
	}




	public Integer getId_client() {
		return Id_client;
	}




	public void setId_client(Integer id_client) {
		Id_client = id_client;
	}




	//Constructeur sans argument 
	public Emprunt() {}
	

	
	
}
