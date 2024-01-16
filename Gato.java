package prog2_aula18;

public class Gato extends Mamifero implements AnimalEstimacao{
	private String raca;
	
	public Gato(String nome, String raca) {
		super(nome);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	@Override
	public void Amamentar() {
		System.out.println("Leite!");
		
		
	}
	@Override
	public void emitirSom() {
		System.out.println("Miaw!");
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
