import java.util.List;

public abstract class AlgoritmoDeOrdenacao {

	protected static long trocaDeChaves;
	protected static long testeDeChaves;
	protected static long inicioDoTeste;
	protected static long finalDoTeste;

	public abstract void sort(List<Integer> arr);

	public static long getTrocaDeChaves() {
		return trocaDeChaves;
	}

	public static long getTesteDeChaves() {
		return testeDeChaves;
	}
	
	public void iniciar() {
		inicioDoTeste=0;
		inicioDoTeste=System.currentTimeMillis();
	}
	
	public void finalizar() {
		finalDoTeste=0;
		finalDoTeste=System.currentTimeMillis();
	}
	
	public static long getInicioDoTeste() {
		return inicioDoTeste;
	}
	
	public static long getFinalDoTeste() {
		finalDoTeste=System.currentTimeMillis();
		return finalDoTeste;
	}
	
}