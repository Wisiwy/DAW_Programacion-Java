package otros_ejer02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lista {

	public static void main(String[] args) {
//		SET: Es como una bolsa los mete. Los ordena con el hashCode. No tienen una posición determinada.  

		List<String> list1 = new ArrayList();

		list1.add("Lunes");
		list1.add("Martes");
		list1.add("Miercoles");
		list1.add("Jueves");
		list1.add("Viernes");
		list1.add("Sabado");
		list1.add("Domingo");
		for (String string : list1) {
			System.out.println(string);
		}

		System.out.println();
		list1.add(4, "Juernes");

		for (String string : list1) {
			System.out.println(string);
		}

		System.out.println();
		List<String> list2 = new ArrayList<String>(list1);

		for (String string : list2) {
			System.out.println(string);
		}
		list1.addAll(list2);
		for (String string : list2) {
			System.out.println(string);
		}
	}

}
