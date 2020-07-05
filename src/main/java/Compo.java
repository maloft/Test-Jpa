import javax.persistence.*;



@Entity
@Table(name="COMPO")
public class Compo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "ID_LIV", length = 10, nullable = false, unique = true)
	private Integer Id_liv;
	
	@Column(name = "ID_EMP", length = 10, nullable = false, unique = true)
	private Integer Id_emp;
	
	
	//Getters & Setters :
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getId_liv() {
		return Id_liv;
	}

	public void setId_liv(Integer id_liv) {
		Id_liv = id_liv;
	}

	public Integer getId_emp() {
		return Id_emp;
	}

	public void setId_emp(Integer id_emp) {
		Id_emp = id_emp;
	}


}
