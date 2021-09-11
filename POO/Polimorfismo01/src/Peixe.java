public class Peixe extends Animal{
	private String corEscama;
	
	public void soltarBolha() {
		System.out.println("Blub...Blub...");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Bichinhos da água");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Peixe não emite som");
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
}
