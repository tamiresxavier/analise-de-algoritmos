import java.util.List;

public class QuickSort extends AlgoritmoDeOrdenacao {
	public void sort(List<Integer> arr) {
		//Isto serve para converter o vetor de L para Array,
		//pois com List o algoritmo estoura o a memoria 
		//dando errdo Java.lang.StackOverflowError
		//depois convertendo-o de volta
		Integer[] numeros = new Integer[arr.size()];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=arr.get(i);
		}
		testeDeChaves=0;
		trocaDeChaves=0;
		iniciar();
		quickSort(numeros, 0, numeros.length-1);
		finalizar();
		arr.removeAll(arr);
		for (int i = 0; i < numeros.length; i++) {
			arr.add(numeros[i]);
		}
	}
	public static void quickSort(Integer v[], int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		int pivo = v[(esq + dir) / 2];
		int troca;
		
		while (esq <= dir) {
			while (v[esq] < pivo) {
				esq = esq + 1;
				testeDeChaves++;
			}
			testeDeChaves++;
			while (v[dir] > pivo) {
				dir = dir - 1;
				testeDeChaves++;
			}
			testeDeChaves+=2;
			if (esq <= dir) {
				troca = v[esq];
				v[esq] = v[dir];
				v[dir] = troca;
				esq = esq + 1;
				dir = dir - 1;
				trocaDeChaves+=3;
			}
		}
		if (dir > esquerda) {
			quickSort(v, esquerda, dir);
		}
		if (esq < direita) {
			quickSort(v, esq, direita);
		}
	}
}
