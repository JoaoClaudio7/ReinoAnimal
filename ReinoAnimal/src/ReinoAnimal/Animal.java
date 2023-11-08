package ReinoAnimal;
/*
 * Essa classe representa um animal
 * 
 * @Author João Claudio
 */
public class Animal {
	/*
	 * Atributos que armazena a especie, sexo, data de nascimento e quantidade de
	 * animais
	 */
	private String especie;
	private String sexo;
	private String dataNascimento;
	private static int contador;

	/*
	 * Construtor para dar valores para as variaveis e incrementar o contador
	 */
	public Animal(String especie, String sexo, String dataNascimento) {
		contador = 0;
		this.especie = especie;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		contador();
	}

	/*
	 * Metódo que imprime que o animal está comendo
	 */
	public void comer() {
		System.out.println("O Animal está comendo...");
	}

	/*
	 * Metódo que imprime o status do animal
	 */
	public void perfil() {
		System.out.println("Espécie: " + especie);
		System.out.println("Sexo: " + sexo);
		System.out.println("Data de nascimento: " + dataNascimento);
	}

	/*
	 * Metódo que conta os animais foi adicionado
	 */
	private static void contador() {
		contador++;
	}

	/*
	 * Metódo que retorma a quantiadade de animais
	 */
	public static int retornar() {

		return contador;
	}

	/*
	 * Metódos getters e settrs para adicionar e retornar valotes nas variaveis
	 */
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
