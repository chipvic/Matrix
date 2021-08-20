import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Nhập số dòng của ma trận: ");
        int row = BaiTH7.nhapSoInt();
        System.out.println("Nhập số cột của ma trận: ");
        int colunm = BaiTH7.nhapSoInt();
        int[][] a = BaiTH7.inputMatrix(row, colunm);

        //int[][] a = BaiTH7.generateMatrix(2,3,1,99);

        BaiTH7.printMatrix(a);
        int sum = BaiTH7.sumElements(a);
        System.out.println("Sum là: " + sum);

        // Bài 1:
        System.out.println("Nhập số cần tìm trong Matrix: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (BaiTH7.findX(a, x)) {
            System.out.format("Có giá trị %d trong mảng", x);
        } else {
            System.out.format("Không có giá trị %d trong mảng", x);
        }
        System.out.println();

        // Bài 2:
        if (BaiTH7.isPrimeMatrix(a)) {
            System.out.println("Mảng toàn số nguyên tố");
        } else {
            System.out.println("Mảng có phần tử không phải số nguyên tố");
        }

        // Bài 3:
        int max = BaiTH7.findMax(a);
        System.out.format("Phần tử %d là phần tử lớn nhất của mảng", max);

        // Bài 4:
        // Câu a:
        System.out.println("Nhập dòng cần tính tổng: ");
        int r = BaiTH7.nhapSoInt();
        System.out.println("Nhập cột cần tính tổng: ");
        int c = BaiTH7.nhapSoInt();
        if ((r > a.length) || (c > a[0].length) || (r <= 0) || (c <= 0)) {
            System.out.println("Mảng không tồn tại cột/ dòng bạn đã nhập");
        } else {
            int sumRC = BaiTH7.sumRC(a, r, c);
            System.out.format("Tổng của dòng %d và cột %d là: %d", r, c, sumRC);
        }

        // Câu b:
        System.out.println("Nhập ma trận vuông với số dòng = cột là: ");
        int x = BaiTH7.nhapSoInt();
        int[][] b = BaiTH7.inputMatrix(x, x);
        BaiTH7.printMatrix(b);
        int sumMain = BaiTH7.sumMainDiagonal(b);
        System.out.println("Tổng đường chéo chính là: " + sumMain);
        int sumSub = BaiTH7.sumSubDiagonal(b);
        System.out.println("Tổng đường chéo phụ là: " + sumSub);

        // Câu c:
        int sumUpperMain = BaiTH7.sumUpperMainDiag(b);
        System.out.println("Tổng các phần tử phía trên đường chéo chính là: " + sumUpperMain);
        int sumLowerMain = BaiTH7.sumLowerMainDiag(b);
        System.out.println("Tổng các phân tử phía dưới đường chéo chính là: " + sumLowerMain);

//        // Câu d:
//        int sumUpperSub = BaiTH7.sumUpperSubDiag(b);
//        System.out.println("Tổng các phần tử phía trên đường chéo phụ là: "+sumUpperSub);
//        int sumLowerSub = BaiTH7.sumLowerSubDiag(b);
//        System.out.println("Tổng các phần tử phía trên đường chéo phụ là: "+sumLowerSub);
//


    }
}
