/** version 21/02/2023*/
package ejercicio10;

/** se crea la clase */
public class Trabajadores {
	/** se definen los atributos de la clase*/
		private String nombres; 
		private String apellidos; 
		private String run;
		private int telefono; 
		private int edad; 
		
		/**  metodo constructor vacio */
	public Trabajadores() {
		
	}
	/** metodo constructor con los atributos*/
	public Trabajadores(String nombres, String apellidos, String run, int telefono, int edad) {
		this.nombres = nombres;
		this.apellidos = apellidos; 
		this.run = run ;
		this.telefono = telefono; 
		this.edad = edad;
		
	}
/** se definen los setters  */
	/** @param nombre*/
	public void setNombre(String nombres) {
		this.nombres = nombres;
	}
	/** @param apellidos*/
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos; 
	}
	/** @param run*/
	public void setRun(String run) {
		this.run = run;
	}
	/** @param telefono*/
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/** @param edad*/
	public void setEdad(int edad) {
		this.edad = edad; 	
	}
	
	/** se definen los getters */
	public String getNombre() {
		return this.nombres;
	}
	public String getApellido() {
		return this.apellidos;
	}
	public String getRun() {
		return this.run;
	}
	public int getTelefono() {
		return this.telefono; 
	}
	public int getEdad() {
		return this.edad;
	}

	public String nombreCompleto() {
		return nombres + " " +  apellidos;
	}
	
	public int descomponerRun() {
		String[] partes = run.split("-");
		String parte1 = partes[0]; //antes del digito verificador
		String parte2 = partes[1]; //dps del digito verificador
		return Integer.parseInt(parte1);
	}
	
@Override
public String toString() {
	return "\n Nombre Trabajador: " + nombreCompleto() + "\n RUT: " + run + "\n RUT descompuesto: " + descomponerRun()+ "\n Telefono: " + telefono + "\n Edad: " + edad;
}
}