
public class SumOfZero {

	public static void main(String []args) {
		int[] arr = {1,2,3,4,5,6, -99, 222, -4, 50, 72};
		System.out.println(sumZero(arr, 0, arr.length - 1));
	}

	public static boolean sumZero(int[] arr, int i, int j) {
		if (i < j) {
			if (arr[i] + arr[j] == 0) {
				return true;
			}
			else if (arr[i] + arr[j] != 0) {
				return sumZero(arr, i + 1, j);
			}
		}
		else if (i == j) {
			i = 0;
			return sumZero(arr, i, j-1);
		}
		return false;
	}

}
