package EjemploAnimal;

public class Animal {

	private int crias;

	public Animal(int crias) {
		super();
		this.crias = crias;
	}

	public int getCrias() {
		return crias;
	}

	public void setCrias(int crias) {
		this.crias = crias;
	}
	public void Alimentar() {
		System.out.println("Alimentando \n");
	}
	public void visualizarCrias() {
		System.out.printf("Hay %2d crias\n",crias);
	}
	
}
