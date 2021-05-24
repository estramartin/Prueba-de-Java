
public class Persona {

	private String nombre;
	private String direccion;
	private Integer id;
	
	
	public Persona(String nombre,String direccion, Integer id) {
		
		this.nombre =nombre;
		this.id= id;
		this.direccion = direccion;
		
	}


	public String getNombre() {
		return nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public Integer getId() {
		return id;
	}
	
	
	
	
}
