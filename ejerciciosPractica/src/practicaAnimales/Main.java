package practicaAnimales;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListadoAnimales lista1 = new ListadoAnimales();
		
		Viviparo leon = new Viviparo();
		Viviparo delfin = new Viviparo(3, "Cetaceo", "Omnivoro", true, "piel");
		Viviparo mono = new Viviparo(5,"Primate", "Omnivoro", true, "piel y pelos");
		
		Oviparo cocodrilo = new Oviparo();
		Oviparo halcon = new Oviparo(4, "Ave" , "Omnivoro" , true , "Vuela");
		Oviparo salmon = new Oviparo(3, "Pez", "Omnivoro", true, "Nada");
		
		leon.setNumExtremidades(4);
		leon.setEspecie("Felino");
		leon.setTipoAlimentacion("Carnivoro");
		leon.setPelaje("Pelitos");
		leon.setEsMamifero(true);
		
		cocodrilo.setNumExtremidades(5);
		cocodrilo.setEspecie("Reptil");
		cocodrilo.setTipoAlimentacion("Carnivoro");
		cocodrilo.setEsVertebrado(true);
		cocodrilo.setMedioTransporte("Nada y arrasta");
		
		
		
		lista1.agregarAnimal(leon);
		lista1.agregarAnimal(delfin);
		lista1.agregarAnimal(mono);
		lista1.agregarAnimal(cocodrilo);
		lista1.agregarAnimal(halcon);
		lista1.agregarAnimal(salmon);
		
		
		lista1.mostrarLista();
	}

}
