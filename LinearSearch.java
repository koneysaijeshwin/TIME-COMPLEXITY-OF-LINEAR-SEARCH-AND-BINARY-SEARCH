public class LinearSearch{
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers = {24, 10, 45, 8, 19};
        int target = 8;

        int result = linearSearch(numbers, target);
        System.out.println("Linear Search Index: " + result); 
    }
}
