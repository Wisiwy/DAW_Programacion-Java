import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import java.util.List;
import java.util.TreeMap;


public class JuegosOlimpicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Atleta> atletismo = new ArrayList<>();
		rellena(atletismo);
		atletismo.forEach(System.out::println);
		///////////////////////////////////////
		// .......contin�a a partir de aqu�
		///////////////////////////////////////
		
		
		//Crear participante por cada atleta y guardarlo en una lista.
		List<Participante> participantes = new ArrayList();
		for (Atleta atleta : atletismo) {
			for (int i = 0; i < atleta.getPruebas().size(); i++) {
				Participante auxP;
				auxP= new Participante(atleta,atleta.getPruebas().get(i),atleta.getTiempos().get(i));
				participantes.add(auxP);
			} 
			 
		}
		TreeMap<String,List<Participante>> pruebasMap = new TreeMap();
		System.out.println(participantes);
		
		//Crear treeMap con clave prueba de participante y lista de atleta
		for (Participante participante : participantes) {
			String keyaux = participante.getPrueba();
			List<Participante> listAux; 
			
			if (pruebasMap.containsKey(keyaux)) {
				pruebasMap.get(keyaux).add(participante);
				
			}else {
				listAux = new ArrayList();
				listAux.add(participante);
				pruebasMap.put(keyaux, listAux);
			}
		}
		
		//Recorrer el map
		Iterator<String> it = pruebasMap.keySet().iterator();
		while (it.hasNext()) {
			List<Participante> listAux2= new ArrayList();
			listAux2 = pruebasMap.get(it.hasNext());
			
			for (Participante participante : listAux2) {
				System.out.println(participante);
			}
				
		}
		//Ordenar las listas del tree map
		
		//Imprimir la key y la lista ordenada. 
		
		
	}

	public static void rellena(List<Atleta> a) {
		String[] pruebas = { "100 m femeninos", "100 m masculinos", "200 m femeninos", "200 m masculinos",
				"400 m femeninos", "400 m masculinos" };
		String[] nombresm = { "Bruno Hortelano", "Usain Bolt", "Carl Lewis", "Armin Hary", "Valeri Borzov",
				"Linford Christie", "Michael Johnson", "Wayde van Niekerk", "Su Bingtian", "Christophe Lemaitre" };
		String[] nombresf = { "Salma Pallaruelo", "Merlene Ottey", "Marion Jones", "Heike Drechsler", "Irina Privalova",
				"Dina Asher-Smith", "Sanya Richards-Ross", "Caster Semenya", "Li Xuemei", "Marie-Josee Perec" };
		String[] paises = { "Espa�a", "Jamaica", "USA", "Alemania", "Rusia", "Gran Breta�a", "USA", "Sud-Africa",
				"China", "Francia" };
		double[] tiempos = { 10.5, 9.5, 21.3, 19.1, 47.5, 43. };
		Atleta at = null;
		for (int i = 0; i < pruebas.length; i++) {
			int j = 0;
			int dif = (i % 2 == 0 ? (i + 1) : i);
			while (j < 6) {
				int pos = (int) (Math.random() * 10);
				if (i % 2 == 0) {
					at = new Atleta(nombresf[pos], paises[pos]);
				} else {
					at = new Atleta(nombresm[pos], paises[pos]);
				}
				if (!a.contains(at)) {
					a.add(at);
				} else {
					at = a.get(a.indexOf(at));
				}
				if (at.anadeMarca(pruebas[i], (tiempos[i] + dif * Math.random())))
					j++;
			}
		}
	}

}
