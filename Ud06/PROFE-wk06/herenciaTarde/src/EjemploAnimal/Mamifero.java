package EjemploAnimal;

public class Mamifero extends Animal  {

	private int huesos;
	private int extremidades;
	public Mamifero(int crias, int huesos, int extremidades) {
		super(crias);
		this.huesos = huesos;
		this.extremidades = extremidades;
	}
	public int getHuesos() {
		return huesos;
	}
	public void setHuesos(int huesos) {
		this.huesos = huesos;
	}
	public int getExtremidades() {
		return extremidades;
	}
	public void setExtremidades(int extremidades) {
		this.extremidades = extremidades;
	}
	
	public void mostrarHuesos() {
		this.visualizarCrias();
		System.out.printf("Tiene %2d \n",huesos);
	}
	public void mostrarExt() {
		this.visualizarCrias();
		System.out.printf("Tiene %2d extremidades\n",extremidades);
	}
}
