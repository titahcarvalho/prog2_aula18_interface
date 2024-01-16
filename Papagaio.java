package prog2_aula18;

public class Papagaio extends Ave {
	public Papagaio(String nome) {	
		super(nome);
		}
	
	@Override
	public void voar() {
		System.out.println("Levantar voo!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Piupiu...");
	}

}
