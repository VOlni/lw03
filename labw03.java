public class labw03 implements var04 {
	
	public double logika(double d1, double d2, double d3) {
		// Даны три числа. Найти количество положительных чисел в исходном наборе.

		int countPositive = 0;
		
		if (d1 > 0) {
			countPositive++;
		}
		if (d2 > 0) {
			countPositive++;
		}
		if (d3 > 0) {
			countPositive++;
		}
		
		System.out.println("Количество положительных чисел в исходном наборе: " + countPositive);
		return 0;
	}
  
	public void poka(int N) {
		// Дано целое число N (> 0). Ncпользуя операции деления нацело и
		// взятия остатка от деления, вывести все его цифры, начиная с
		// самой правой (разряда единиц).
		do {
			System.out.println(N % 10);
			N = N / 10;
		} while (N > 0);
	
	}
 
	public void massivy(double[] A, double D) {
		// Найти элемент массива A, модуль разницы которого с D минимален
		int sizeA =A.length;
		double[] B = new double[sizeA];
		for (int i = 0; i < sizeA ; i++){
			B[i] = Math.abs(A[i] - D);
		}
		
		double min = A[0];
		int sizeB =B.length;
		for(int i = 0; i < sizeB; i++){
			 if(min > B[i])
				min = B[i];
			 }
		System.out.println("Элемент массива: " + min);
		
	}
  	
}