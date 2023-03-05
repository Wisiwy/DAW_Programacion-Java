package h3_ejer02_trenes;

import java.util.ArrayList;
import java.util.List;

public class Vagon {
	
	private List<Integer> asientos;
	private static Integer numVag = 0;	
	
	public Vagon() {
		this.asientos = new ArrayList();
		this.asientos.add(0, numVag);
		numVag++;
		for (int i = 1; i < asientos.size(); i++) {
			this.asientos.add(i, 0);
		}
	}
	
	
	
	

}
