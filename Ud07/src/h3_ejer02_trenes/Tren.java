package h3_ejer02_trenes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tren {

	private static Integer cont = 1;
	private Integer numTren;
	private String horaSal;
	private String estaSal, estaLleg;
	private ArrayList<Vagon> vagones;

	public Tren(String horaSal, String estaSal, String estaLleg) {

		this.numTren = cont;
		cont++;
		this.horaSal = horaSal;
		this.estaSal = estaSal;
		this.estaLleg = estaLleg;
		this.vagones = new ArrayList();

	}

	

	public Integer getNumTren() {
		return numTren;
	}



	public void setNumTren(Integer numTren) {
		this.numTren = numTren;
	}



	public String getHoraSal() {
		return horaSal;
	}



	public void setHoraSal(String horaSal) {
		this.horaSal = horaSal;
	}



	public String getEstaSal() {
		return estaSal;
	}



	public void setEstaSal(String estaSal) {
		this.estaSal = estaSal;
	}



	public String getEstaLleg() {
		return estaLleg;
	}



	public void setEstaLleg(String estaLleg) {
		this.estaLleg = estaLleg;
	}



	public ArrayList<Vagon> getVagones() {
		return vagones;
	}



	public void setVagones(ArrayList<Vagon> vagones) {
		this.vagones = vagones;
	}



	@Override
	public String toString() {
		return String.format("Tren Nº%3d // %5s // %-15s // %-15s //", numTren, horaSal, estaSal, estaLleg);
	}

}
