
public class ArraySum {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, -1, 5 };
		int sum =12;
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j<arr.length;j++) {
				if(arr[i]+arr[j] == sum && i!=j) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}

	}

}
