public class Main{
	public static void main(String[] args){
		//Crear un objeto persona en el main.
		Persona persona = new Persona(); //objeto
		//Utiliza los gets y sets para darle valores a las propiedades 
		//edad, nombre y telefono, por último muéstralas por consola.
		persona.setEdad(23);
		persona.setNombre("Julio");
		persona.setTelefono("555-4589");

		System.out.println(persona.getEdad());
		System.out.println(persona.getNombre());
		System.out.println(persona.getTelefono());
		}
}
class Persona{ //Crear clase Persona.
	//Crear variables las privadas edad, nombre y telefono
	private int edad;
	private String nombre;
	private String telefono;

	//Crear gets y sets de cada propiedad.
	public void setEdad(int edad){	
			this.edad = edad;	
	}
	public int getEdad(){	
			return this.edad;	
	}

	public void setNombre(String nombre){	
			this.nombre = nombre;	
	}
	public String getNombre(){	
			return this.nombre;	
	
	}

	public void setTelefono(String telefono){	
			this.telefono = telefono;	
	}
	public String getTelefono(){	
			return this.telefono;	
	}


}