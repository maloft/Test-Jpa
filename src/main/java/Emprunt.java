import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="EMPRUNT")
public class Emprunt {
	
	@Id
	@Column (name = "ID")
	private Integer Id;
	
	@Column(name = "DATE_DEBUT")
	private Date date_debut;
	
	@Column(name = "DATE_FIN")
	private Date date_fin;
	
	@Column(name = "ID_CLIENT")
	private Integer Id_client;
	
	


	public Integer getId() {
		return Id;
	}




	public void setId(Integer id) {
		Id = id;
	}




	public Date getDate_debut() {
		return date_debut;
	}




	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}




	public Date getDate_fin() {
		return date_fin;
	}




	public void setDate_fin(Date date_fin) {
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
