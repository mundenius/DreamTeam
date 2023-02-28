package practicaAnimales;

import java.util.ArrayList;

public class ListadoAnimales {
	ArrayList<Domesticos>listaAnimales = new ArrayList<Domesticos>();
	
	
	public void agregarAnimal(Domesticos domestico) {
		listaAnimales.add(domestico);
	}
	
	public void mostrarLista() {
		for(Domesticos domestico: listaAnimales) {
			domestico.mostrarDatos();
			domestico.esDomestico();
		}
	}
}
