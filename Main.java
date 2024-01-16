package prog2_aula18;

public class Main {

	public static void main(String[] args) {
		Papagaio meuPapagaio = new Papagaio ("Rex");
		
		//chamando os métodos
		System.out.println("Nome do papagaio:" + meuPapagaio.getNome());
		meuPapagaio.emitirSom();
		meuPapagaio.voar();
		
		System.out.println("---------------------------------");
		
		Gato meuGato = new Gato ("Celeste", "Siamês");
		System.out.println("Nome do gato:" + meuGato.getNome());
		meuGato.Amamentar();
		meuGato.emitirSom();
		meuGato.brincar();
		meuGato.levarPassear();
		
		System.out.println("---------------------------------");
		
		Cachorro meuCachorro = new Cachorro ("Chico", "Siamês", 4);
		System.out.println("Nome do cachorro:" + meuCachorro.getNome());
		System.out.println("Raça do cachorro:" + meuCachorro.getRaca());
		System.out.println("Tamanho do cachorro:" + meuCachorro.getTamanho());
		meuCachorro.Amamentar();
		meuCachorro.emitirSom();
		meuCachorro.levarVeterinario();
		meuCachorro.alimentar();
		meuCachorro.brincar();
		meuCachorro.levarPassear();
		

	}

}
