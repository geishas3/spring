package proyecto.comics.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table (name="clientes")
public class ClientesEntity {
	
	@Id
	@Column(name="dni", nullable=false, unique=true)
	private String dni;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="clientes")
	private Set<ClientesEntity> clientes = new HashSet<ClientesEntity>();
	
	public ClientesEntity() {
		
	}

	public ClientesEntity(String dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "ClientesEntity [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
}
