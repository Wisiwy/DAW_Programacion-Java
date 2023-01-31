package EjemploAnimal;

public class Principal {

	public static void main(String[] args) {
		
			Animal a = new Animal(2);
			a.visualizarCrias();
			a.Alimentar();
			
			Mamifero m= new Mamifero(10,4,0);
			m.mostrarHuesos();
			m.mostrarExt();
			m.Alimentar();
			
			Persona p= new Persona(0, 0, 0, "Ricardo","Agricultor");
			p.verTodo();
			p.Alimentar();
			
		
	}
}
