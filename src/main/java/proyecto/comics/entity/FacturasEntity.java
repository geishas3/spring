package proyecto.comics.entity;

import javax.persistence.*;

@Entity
@Table(name="facturas")
public class FacturasEntity {
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column (name="precio")
	double precio;
	
	@OneToMany(fetch= FetchType.EAGER)
	@JoinColumn(name="dni", nullable=false, unique=true)
	private ClientesEntity cliente;
	
	public FacturasEntity() {
		
	}

	public FacturasEntity(int id, double precio, ClientesEntity cliente) {
		super();
		this.id = id;
		this.precio = precio;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ClientesEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClientesEntity cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "FacturasEntity [id=" + id + ", precio=" + precio + ", cliente=" + cliente + "]";
	}
	
	

}
