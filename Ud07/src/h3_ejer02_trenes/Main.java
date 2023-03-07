package h3_ejer02_trenes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class Main {
	public static void main(String[] args) {

		Tren t1 = new Tren("10:30", "Atocha", "Delicias");
		Tren t2 = new Tren("11:15", "Sans", "Giralda");
		Tren t3 = new Tren("12:45", "Canvalache", "Miraflores");

		// Listado de trenes.
		ArrayList<Tren> trenes = new ArrayList();
		trenes.add(t1);
		trenes.add(t2);
		trenes.add(t3);

		String[] menu = { "Venta billetes", "Anulacion Billetes", "Listado trenes" };
		int opc;
		do {
			
			Dibujo.titulo("MEJOR QUE RENFE");
			opc = Dibujo.menu(menu);
			switch (opc) {
			case 1: {
				Billete aux2 = ventaBillete(trenes);
				System.out.println();
				System.out.print("|************************|");
				System.out.println(aux2);
				System.out.println("|************************|");
				
				//Añadir billete a coleccion de billetes  para ordenar.
				
			}
			case 2: {
				anularBillete();
				
			}
			case 3: {
//				consultarTrenes();
//				consultarBilletes();
//					//ordnar billetes por ...
				
			}
			case 0: {
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opc);

			}
			System.out.println();
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println();
		} while (opc != 0);

	}

	private static void consultaTrenes() {
		// TODO Auto-generated method stub

	}

	private static void anularBillete() {
		
TA
	}

	private static Billete ventaBillete(ArrayList<Tren> trenes) {
		//Crear billete
		Billete auxBill = new Billete();
		// Elegir tren con fecha.
		Tren auxTren= listarTrenes(trenes);
		System.out.println("num tren elegido: " + auxTren.getNumTren());
		
		
		// Sumar asiento en vagon.
			//Coger vagon
		Vagon vagBill = auxTren.getVagon();
			//Asigno asiento y recogo billete.  
			//Mirar si comprueba si los asientos de los vagones estan vacios. 
		Integer numAsi = vagBill.sumarAsiento();
		// Poner elegir asiento, vagon y tren.
			//Set numtren y hora
		auxBill.setNumTrenBill(auxTren.getNumTren());
		auxBill.setHoraSal(auxTren.getHoraSal());
		auxBill.setNumVagonBill(vagBill.getNumVag());
		auxBill.setAsiento(numAsi);
		
		return auxBill;
		
	}

	/**
	 * Lista los trenes y devuelve el tren elegido <b>Return</b> Tren elegido
	 */
	private static Tren listarTrenes(ArrayList<Tren> trenes) {
		Integer opc1;
		for (int i = 0; i < trenes.size(); i++) {
			System.out.println(i + " - " + trenes.get(i));
		}
		opc1 = Leer.leerIntRango("Elige tren: ", 0, trenes.size());

		return trenes.get(opc1);

	}

}
