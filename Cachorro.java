package prog2_aula18;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado{
	private String raca;
	private int tamanho;

	public Cachorro(String nome, String raca, int tamanho) {
		super(nome);
		this.raca = raca;
		this.tamanho = tamanho;
		}
	
	
	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


	@Override
	public void Amamentar() {
		System.out.println("Leite!");
		
	}
	@Override
	public void emitirSom() {
		System.out.println("Auuuuuu!");	
		
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo...");		
	}
	@Override
	public void levarVeterinario() {
		System.out.println("Consulta...");
	}
	@Override
	public void brincar() {
		System.out.println("Brincando...");
	}
	@Override
	public void levarPassear() {
		System.out.println("Passeando...");
	}
	
}
