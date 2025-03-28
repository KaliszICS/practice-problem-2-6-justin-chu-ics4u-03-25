public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void bubbleSort(double[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {

					double temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(double[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {

			int minVal = i;

			for (int j = i; j < nums.length; j++) {
				if (nums[j] < nums[minVal]) {

					double temp = nums[minVal];
					nums[minVal] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}

	public static void insertionSort(double[] nums) {

		for (int i = 1; i < nums.length; i++) {

			double k = nums[i];
			int j = i - 1;

			while (j >= 0 && nums[j] > k) {
				nums[j + 1] = nums[j];
				j = j - 1;
			}

			nums[j + 1] = k;
		}
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
