package week1.day2assignments;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 17, 18, 20, 20};
		/*
		 * Arrays.sort(arr); for (int i = 0; i < arr.length -1; i++) { if (arr[i] ==
		 * arr[i+1]) { System.out.println(arr[i]); continue;
		 */
		int length = arr.length;
		int count;
		for (int i = 0; i < length - 1; i++) {
			count = 1;
			for (int j = i+1; j <= length -1; j++) {
				if (arr[i] == arr[j]) {
					count = count + 1;
				}
				
			}
			if(count > 1 ) {
				System.out.println("The Number " + arr[i] + " has been duplicated " + count + " times");
			}
		}
	}

}
