package practicaAnimales;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/** se crea un nuevo objeto de la clase LISTADOANIMALES */
		ListadoAnimales lista1 = new ListadoAnimales();
		
		
		/** se crean objetos de las clases viviparos y oviparos */
		Viviparo leon = new Viviparo();
		Viviparo delfin = new Viviparo(3, "Cetaceo", "Omnivoro", true, "piel");
		Viviparo mono = new Viviparo(5,"Primate", "Omnivoro", true, "piel y pelos");
		
		Oviparo cocodrilo = new Oviparo();
		Oviparo halcon = new Oviparo(4, "Ave" , "Omnivoro" , true , "Vuela");
		Oviparo salmon = new Oviparo(3, "Pez", "Omnivoro", true, "Nada");
		
		
		/** se rellena con constructor vacio */
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
		
		/** POLIMORFISMO */		
		Animal mantisReligiosa = new Oviparo(6, "Insecto", "Omnivoro", false, "camina");
		Animal tigre = new Viviparo(5, "Felino", "Carnivoro", true, "pelos");
		Animal pinguino = new Oviparo(5, "Ave", "Carnivoro", true, "nada y camina");
		Animal lobo = new Viviparo(5, "Canino", "Carnivoro", true, "pelos");
		
		Animal perro = new Viviparo();
		
		perro.setNumExtremidades(5);
		perro.setEspecie("canino");
		perro.setTipoAlimentacion("omnivoro");
		((Viviparo) perro).setPelaje("pelo");
		((Viviparo) perro).setEsMamifero(true);

		
		/** se agregan los animales creados a la lista creada al principio */
		lista1.agregarAnimal(leon);
		lista1.agregarAnimal(delfin);
		lista1.agregarAnimal(mono);
		lista1.agregarAnimal(cocodrilo);
		lista1.agregarAnimal(halcon);
		lista1.agregarAnimal(salmon);
		lista1.agregarAnimal(mantisReligiosa);
		lista1.agregarAnimal(tigre);
		lista1.agregarAnimal(pinguino);
		lista1.agregarAnimal(lobo);
		
		
		lista1.mostrarLista();
	}

}
