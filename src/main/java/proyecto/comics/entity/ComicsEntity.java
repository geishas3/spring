package proyecto.comics.entity;

import javax.persistence.*;

@Entity
@Table(name="comics")
public class ComicsEntity {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;//columna id de la base de datos
	
	@Column(name="nombre")
	private String nombre;//columna nombre de la base de datos
	
	@Column(name="precio")
	private double precio;//columna precio de la base de datos
	
	
	public ComicsEntity() {
		
	}
	
	/**
	 * constructor para los parametros de la base de datos
	 * @param id parametro id de la base de datos
	 * @param nombre parametro nombre de la base de datos
	 * @param precio parametro precio de la base de datos
	 */
	public ComicsEntity(int id, String nombre, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "ComicsEntity [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
	
	

	
}
