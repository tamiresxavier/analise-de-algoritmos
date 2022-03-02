import java.util.List;

public class BubbleSort extends AlgoritmoDeOrdenacao {

	public void sort(List<Integer> arr) {
		iniciar();
		trocaDeChaves=0;
		testeDeChaves=0;
		int n = arr.size();
		int temp = 0;
		boolean entrou=true;
		for (int i = 0; i < n && entrou; i++) {
			entrou=false;
			for (int j = 1; j < (n - i); j++) {	
				testeDeChaves+=1;
				if (arr.get(j - 1) > arr.get(j)) {
					temp = arr.get(j - 1);
					arr.set(j-1, arr.get(j));
					arr.set(j, temp);
					entrou=true;
					trocaDeChaves+=3;
				}
			}
		}
		finalizar();
	}
}
