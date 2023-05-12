package rok;

public class Rok {
	public int[] num1(int a, int b) {
		int min = 0, max = 0;
		int[] arr = new int[2];
		if (a > b) {
			min = b;
			max = a;
		} else if (b > a) {
			min = a;
			max = b;
		}
		arr[0] = min;
		arr[1] = max;
		return arr;
	}
	
	public int[] num2(int a, int b, int c) {
		int[] arr = new int[2];
		int min = a > b ? b : c > a ? a : b > c ? c : 0;
		int max = a > b ? a : b > c ? b : c > a ? c : 0;
		arr[0] = min;
		arr[1] = max;
		return arr;
	}
	
	public int[] num3(int a, int b, int c, int d) {
		int[] arr = new int[2];
		int min = Math.min(a, Math.min(b, Math.min(c, d)));
		int max = Math.max(a, Math.max(b, Math.max(c, d)));
		arr[0] = min;
		arr[1] = max;
		return arr;
	}
	
	public int[] num4(int a, int b, int c, int d) {
		int[] arr = new int[2];
		int[] arr2 = { a, b, c, d };
		int min = arr2[0], max = arr2[0];	// 
		for (int i = 0; i < arr2.length; i++) {
			if (max < arr2[i]) {
	            max = arr2[i];
	        } 
			if (min > arr2[i]) {
				min = arr2[i];
			}
		}
		arr[0] = min;
		arr[1] = max;
		return arr;
	}
	
	

}
