import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        double[] list1 = new double[n];

        for (int s = 0; s < n; s++) {
            System.out.print("Enter the Percentage of student: ");
            double x = scanner.nextDouble();
            list1[s] = x;
        }
        System.out.println("Unsorted Array:");
        for (double value : list1) {
            System.out.print(value + " , ");
        }
        System.out.println();

        shellSort(list1, n);

        System.out.println("Sorted Array in Ascending Order:");
        for (double value : list1) {
            System.out.print(value + " , ");
        }
    }
    public static void shellSort(double[] array, int n) {
        int interval = n / 2;
        while (interval > 0) {
            for (int i = interval; i < n; i++) {
                double temp = array[i];
                int j = i;
                while (j >= interval && array[j - interval] > temp) {
                    array[j] = array[j - interval];
                    j -= interval;
                }
                array[j] = temp;
            }
            interval /= 2;
            for (double value : array) {
                System.out.print(value + " , ");

            }
            System.out.println(" ");
        }
    }
}
