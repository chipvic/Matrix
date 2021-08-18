import java.util.Scanner;

public class App {
public static void main(String[] args){

   // int [][] matrix = BaiTH7.inputMatrix();
    int[][] a = BaiTH7.generateMatrix(2,3,1,3);
    BaiTH7.printMatrix(a);
    int sum = BaiTH7.sumElements(a);
    System.out.println("Sum là: "+sum);

    // Bài 1:
    System.out.println("Nhập số cần tìm trong Matrix: ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(BaiTH7.findX(a,x)){
        System.out.format("Có giá trị %d trong mảng",x);
    } else {
        System.out.format("Không có giá trị %d trong mảng",x);
    }
    System.out.println();

    // Bài 2:
    if(BaiTH7.isPrimeMatrix(a)){
        System.out.println("Mảng toàn số nguyên tố");
    } else {
        System.out.println("Mảng có phần tử không phải số nguyên tố");
    }

    // Bài 3:
    int max = BaiTH7.findMax(a);
    System.out.format("Phần tử %d là phần tử lớn nhất của mảng", max);


}
}
