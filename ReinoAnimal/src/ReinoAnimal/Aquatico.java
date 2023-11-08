package ReinoAnimal;
/*
 * Essa classe representa um animal Aquatico
 * 
 * @Author João Claudio
 */
public class Aquatico extends Animal{
	/*
	 * Atributos para armazenar as informaçoes
	 */
	private String tipoAgua;
	private boolean escamas;
	
	/*
	 * construtor para inicializar as variaveis 
	 */
	public Aquatico(String especie, String sexo, String dataNascimento, String tipoAgua, boolean escamas) {
		super(especie, sexo, dataNascimento);
		this.tipoAgua = tipoAgua;
		this.escamas = escamas;
	}
	/*
	 * Método que imprime se o animal está nadando
	 */
	public void nadar() {
		System.out.println("O animal está nadando...");
	}
	
	/*
	 * Metodo que fala se está comendo
	 */
	@Override
	public void comer() {
		System.out.println("O animal aquático está comendo...");
	}
	
	/*
	 * Método que imprime 
	 */
	@Override
	public void perfil() {
		super.perfil();
		System.out.println("Tipo água: "+tipoAgua);
		System.out.println("Tem escamas: "+escamas);
		System.out.println("");
	}
	/*
	 * Métodos getters e setters
	 */
	public String getTipoAgua() {
		return tipoAgua;
	}
	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}
	public boolean isEscamas() {
		return escamas;
	}
	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}
}
