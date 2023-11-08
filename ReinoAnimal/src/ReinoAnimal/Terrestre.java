package ReinoAnimal;
/*
 * Essa classe representa um animal terrestre
 * 
 * @Author João Claudio
 */
public class Terrestre extends Animal{
	/*
	 * Atributos que armazena as informaçoes
	 */
	private String regiao;
	private boolean pelagem;
	/*
	 * Construtor que dar valores aos atributos
	 */
	public Terrestre(String especie, String sexo, String dataNascimento, String regiao, boolean pelagem) {
		super(especie, sexo, dataNascimento);
		this.regiao = regiao;
		this.pelagem = pelagem;
	}
	/*
	 * Método que imprime se o animal está andando 
	 */
	public void mover() {
		System.out.println("O animal está se movendo...");
	}
	
	/*
	 * Método que informa se o animal está comendo
	 */
	@Override
	public void comer() {
		System.out.println("O Animal terrestre está comendo...");
	}
	
	/*
	 * Método que mosttra todas as informaçoes do animal
	 */
	public void perfil() {
		System.out.println("Região: "+regiao);
		System.out.println("Pelagem: "+pelagem);
		super.perfil();
	}
	/*
	 * Métodos getters e setters
	 */
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public boolean isPelagem() {
		return pelagem;
	}
	public void setPelagem(boolean pelagem) {
		this.pelagem = pelagem;
	}
}
