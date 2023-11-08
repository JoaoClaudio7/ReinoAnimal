package ReinoAnimal;
/*
 * Essa classe é a classe de teste
 * 
 * @Author João Claudio
 */
public class Principal {

	public static void main(String[] args) {
		/*
		 * Representaççoes de Animais aquaticos
		 */
		Aquatico aquatico1 = new Aquatico("Carcharias taurus", "fêmea", "7", "âgua salgada", false);

		aquatico1.comer();
		aquatico1.nadar();
		aquatico1.perfil();

		Aquatico aquatico2 = new Aquatico("Pygocentrus nattereri", "macho", "3", "âgua doce", true);

		aquatico2.comer();
		aquatico2.nadar();
		aquatico2.perfil();
		
		/*
		 * Representaççoes de Animais terrestre
		 */
		Terrestre terrestre1 = new Terrestre("Felis catus", "fêmea", "2", "ásia", true);

		terrestre1.comer();
		terrestre1.mover();
		terrestre1.perfil();

		Terrestre terrestre2 = new Terrestre("Hydrochoerus Hydrochaeris", "macho", "8", "América do Sul", true);

		terrestre2.comer();
		terrestre2.mover();
		terrestre2.perfil();
		
		/*
		 * Representaççoes de Animais aereo
		 */
		Aereo aerio1 = new Aereo("Coragyps atratus", "macho", "3", "54.5", false);

		aerio1.comer();
		aerio1.voar();
		aerio1.perfil();

		Aereo aerio2 = new Aereo("Amazona aestiva", "fêmea", "10", "37.9", true);

		aerio2.comer();
		aerio2.voar();
		aerio2.perfil();

		System.out.println("Total Animais: " + Animal.retornar());
	}

}
