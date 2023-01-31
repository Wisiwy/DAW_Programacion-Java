package EjemploAnimal;

public class Persona extends Mamifero {
 
	private String nombre;
	private String Profesion;
	public Persona(int crias, int huesos, int extremidades, String nombre, String profesion) {
		super(crias, huesos, extremidades);
		this.nombre = nombre;
		Profesion = profesion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProfesion() {
		return Profesion;
	}
	public void setProfesion(String profesion) {
		Profesion = profesion;
	}
	public void verTodo() {
		
		System.out.printf("  nommbre: %-20s    Profesion: %-12s \n",nombre,Profesion);
	}
}
