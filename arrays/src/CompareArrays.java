import java.util.Scanner;

public class CompareArrays {

	/**
	 * read elements from Line and than compare
	 */
	public void readNumbersFromLineAndCompare(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int c = sc.nextInt();
		findCountOfElements(arr, c);
	}

	/**
	 * Find numbers of same elements
	 * @param arrayValues
	 * @param c
	 */
	private void findCountOfElements(int [] arrayValues, int c){
		int count = 0;
		for(int i=0; i<arrayValues.length-1; i++){
			if(arrayValues[i]==c){
				count+=1;
			}
		}
		System.out.println(count);

	}

	/**
	 * Add elements to array
	 * @param a
	 * @param e
	 * @return
	 */
	private int[] addElement(int[] a, int e) {
		a  = java.util.Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = e;
		return a;
	}
}
