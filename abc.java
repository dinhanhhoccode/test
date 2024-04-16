public class ComplexProgram {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Tính tổng của tất cả các số trong mảng
        int sum = calculateSum(numbers);
        System.out.println("Tổng của các số là: " + sum);
        
        // Tìm số lớn nhất trong mảng
        int max = findMax(numbers);
        System.out.println("Số lớn nhất trong mảng là: " + max);
        
        // In ra các số chẵn trong mảng
        System.out.print("Các số chẵn trong mảng là: ");
        printEvenNumbers(numbers);
    }
    
    // Phương thức tính tổng của các số trong mảng
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    // Phương thức tìm số lớn nhất trong mảng
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    // Phương thức in ra các số chẵn trong mảng
    public static void printEvenNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
