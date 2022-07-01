public class Main{
	public static void main(String[] args){
		//Crea ahora un objeto de la clase Cliente 
		//que debe tener como propiedades 
		//la edad, el telefono, el nombre y el credito, 
		//tienes que darles valor y mostrarlas por pantalla.
		Cliente cliente = new Cliente();
		cliente.setNombre("Julio");
		System.out.println(cliente.getNombre());
		cliente.setEdad(23);
		System.out.println("edad: " + cliente.getEdad());
		cliente.setTelefono("555-4589");
		System.out.println(cliente.getTelefono());
		cliente.setCredito(true);
		System.out.println("credito: " + cliente.isCredito());
	}
}
/*
Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono
*/

class Persona{
	int edad;
	String nombre;
	String telefono;
}
//crea una nueva clase Cliente que herede de Persona, 
//esta nueva clase tendrá la variable credito solo para esa clase.
class Cliente extends Persona{
	boolean credito;
	public int getEdad(){
		return this.edad;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}

	public String getNombre(){
		return "nombre: " + this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getTelefono(){
		return "telefono: " + this.telefono;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public boolean isCredito(){
		return this.credito;
	}

	public void setCredito(boolean credito){
		this.credito = credito;
	}
}