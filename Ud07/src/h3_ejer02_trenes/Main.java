package h3_ejer02_trenes;

import aUtilidad.Dibujo;

public class Main {
	public static void main(String[] args) {

		Tren t1 = new Tren("10:30", "Atocha", "Delicias");
		Tren t2 = new Tren("11:15", "Sans", "Giralda");
		Tren t3 = new Tren("12:45", "Canvalache", "Miraflores");

		String[] menu = { "Venta billetes", "Anulacion Billetes", "Listado trenes" };
		int opc = Dibujo.menu(menu);

		switch (opc) {
		case 1: {
			ventaBillete();
		}
		case 2: {
			anularBillete();
		}
		case 3: {
			consultaTrenes();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opc);
		}
	}

	private static void consultaTrenes() {
		// TODO Auto-generated method stub

	}

	private static void anularBillete() {
		// TODO Auto-generated method stub

	}

	private static void ventaBillete() {
		// TODO Auto-generated method stub

	}

}
