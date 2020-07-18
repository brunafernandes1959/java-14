package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		int soma = 0, media, cont = 0;


		for (int num : elements) {

			soma += num;

			cont++;

		}

		media = soma / cont;

		return media;
	}

	public static int mode(int[] elements) {
		int moda = 0, numVezes, comparaValor = 0;


		for (int i = 0; i < elements.length; i++) {

			numVezes = 1;


			for (int j = i + 1; j < elements.length; j++) {

				if (elements[i] == elements[j]) {

					numVezes++;

				}

			}

			if (numVezes > comparaValor) {

				moda = elements[i];

				comparaValor = numVezes;

			}

		}

		return moda;
	}

	public static int median(int[] elements) {
		int mediana;

		Arrays.sort(elements);


		if (elements.length % 2 == 0) {

			int index_1 = (elements.length / 2) - 1;

			int index_2 = elements.length / 2;

			mediana = ((elements[index_1]) + (elements[index_2])) / 2;

		} else {

			int index = elements.length / 2;

			mediana = elements[index];

		}

		return mediana;
	}
}