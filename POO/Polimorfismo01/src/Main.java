public class Main {

	public static void main(String[] args) {
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Tartaruga t = new Tartaruga();
		
		System.out.println("=-=-=-=-=-=-=-=-");
		System.out.println("Canguru");
		System.out.println("=-=-=-=-=-=-=-=-");
		c.alimentar();
		c.emitirSom();
		c.locomover();
		
		System.out.println("=-=-=-=-=-=-=-=-");
		System.out.println("Cachorro");
		System.out.println("=-=-=-=-=-=-=-=-");
		k.alimentar();
		k.emitirSom();
		k.locomover();
		
		System.out.println("=-=-=-=-=-=-=-=-");
		System.out.println("Tartaruga");
		System.out.println("=-=-=-=-=-=-=-=-");
		t.alimentar();
		t.emitirSom();
		t.locomover();
	}

}
