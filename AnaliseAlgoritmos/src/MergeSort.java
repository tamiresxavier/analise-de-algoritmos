import java.util.List;

public class MergeSort extends AlgoritmoDeOrdenacao {
	private static void merge(List<Integer> arr, int beg, int mid, int end) {

		int l = mid - beg + 1;
		int r = end - mid;

		int leftArray[] = new int[l];
		int rightArray[] = new int[r];

		for (int i = 0; i < l; ++i) {
			leftArray[i] = arr.get(beg + i);
		}
		for (int j = 0; j < r; ++j) {
			rightArray[j] = arr.get(mid + 1 + j);
		}

		int i = 0, j = 0;
		int k = beg;
		while (i < l && j < r) {
			testeDeChaves ++;
			if (leftArray[i] <= rightArray[j]) {
				arr.set(k, leftArray[i]);
				trocaDeChaves++;
				i++;
			} else {
				arr.set(k, rightArray[j]);
				j++;
				trocaDeChaves++;
			}
			k++;
		}
		while (i < l) {
			arr.set(k, leftArray[i]);
			trocaDeChaves++;
			i++;
			k++;
		}
		while (j < r) {
			arr.set(k, rightArray[j]);
			trocaDeChaves++;
			j++;
			k++;
		}
	}

	static void execute(List<Integer> arr, int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			execute(arr, beg, mid);
			execute(arr, mid + 1, end);
			merge(arr, beg, mid, end);
		}
	}

	public void sort(List<Integer> arr) {
		testeDeChaves = 0;
		iniciar();
		trocaDeChaves = 0;
		execute(arr, 0, arr.size() - 1);
		finalizar();
	}
}
