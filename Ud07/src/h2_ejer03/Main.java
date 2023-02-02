package h2_ejer03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

		List<Alumno> listAlum = new ArrayList();

		for (int i = 0; i < 50; i++) {
			Alumno aux = new Alumno();
			int ale = (int) (Math.random() * 100);
			aux.setNota1(ale);
			ale = (int) (Math.random() * 100);
			aux.setNota2(ale);
			ale = (int) (Math.random() * 100);
			aux.setNota3(ale);
			listAlum.add(aux);
		}
		
		for (Alumno alumno : listAlum) {
			System.out.println(alumno);
		}
		
		Map<Integer,List<Alumno>> n1Map = new TreeMap();
		
		for (Alumno alumno : listAlum) {
			List<Alumno> auxList = new ArrayList();
			int notaClave = alumno.getNota1();
			
			for (Alumno alumno2 : listAlum) {
				if (alumno2.getNota1()==notaClave) {
					auxList.add(alumno2);
				}
			
			n1Map.put(notaClave, auxList);
			
		}
		

	}
		System.out.println();
}
}