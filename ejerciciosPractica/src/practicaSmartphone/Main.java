package practicaSmartphone;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone celular1 = new Smartphone();
		Smartphone celular2 = new Smartphone("SAMSUNG", "lithium", "3400");
		
		Chip entel = new Chip("Entel", 78652345);
		Chip movistar = new Chip("Movistar", 91238653);
		Chip virginMobile = new Chip("Virgin Mobile", 62767444);
		Chip claro = new Chip("Claro", 43567902);
		
		celular1.setMarcaCel("Huawei");
		celular1.getBateria().setMarca("litio");
		celular1.getBateria().setmAh("5200");
		celular1.agregarChips(entel);
		celular1.agregarChips(movistar);
		
		celular2.agregarChips(virginMobile);
		celular2.agregarChips(claro);
		
		celular1.mostrar();
		celular2.mostrar();
	
	}

}
