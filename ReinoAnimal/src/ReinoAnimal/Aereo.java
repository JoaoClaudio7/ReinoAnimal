package ReinoAnimal;
/*
 * Essa classe representa um animal Aereo
 * 
 * @Author João Claudio
 */
public class Aereo extends Animal{
	/*
	 * Atributos que armazenas 
	 */
	private String altitude;
	private boolean voar;
	
	/*
	 * Construtor que inicializa os atributos
	 */
	public Aereo(String especie, String sexo, String dataNascimento, String altitude, boolean voar) {
		super(especie, sexo, dataNascimento);
		this.altitude = altitude;
		this.voar = voar;
	}
	
	/*
	 * Métoda que imprime se o animal está voando
	 */
	public void voar(){
		System.out.println("O animal está voando...");
	}
	
	@Override
	public void comer() {
		System.out.println("O animal aério está comendo...");
		
	}
	
	@Override
	public void perfil() {
		super.perfil();
		System.out.println("Altitude: "+altitude);
		System.out.println("Voar: "+voar);
	}
	
	/*
	 * Métodos getters e setters 
	 */
	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public boolean isVoar() {
		return voar;
	}

	public void setVoar(boolean voar) {
		this.voar = voar;
	}
}
