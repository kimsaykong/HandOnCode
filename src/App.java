import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] data = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            data[i]=i+1;
        }
        BinarySearch bs = new BinarySearch();
        System.out.println("Locate value in sorted array of million records using binary search");
        System.out.print("Please Enter Target Value From Zero to Million: ");
        Scanner reader = new Scanner(System.in);
        System.out.println("Target values is located at index : " + bs.searchIndexSortedArray(data,reader.nextInt(),0,data.length-1));
    }
}
