public class Reptil extends Animal{
	private String corEscama;
	
	@Override
	public void alimentar() {
		System.out.println("Pequenos bichos");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("ssssSSSssssSSSS");
	}
	
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
}
