import java.util.Scanner;

public class BaiTH7 {
    public static int[][] inputMatrix (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số dòng: ");
        int r = sc.nextInt();

        System.out.println("Nhập số cột: ");
        int c = sc.nextInt();

        int[][] ret = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("a[%d][%d] ",ret[i][j]);
                ret[i][j] = sc.nextInt();

            }

        }
        return ret;

    }

    public static void printMatrix(int[][] a){
        for (int i = 0, r=a.length; i < r; i++) {
            for (int j = 0, c=a[0].length; j < c; j++) {
                System.out.format("%d ",a[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] generateMatrix(int r, int c, int min, int max){
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j]=(int) Math.floor(Math.random()*(max-min)+min);

            }

        }
        return ret;

    }

    public static int sumElements(int[][] a){
        int sum =0;
        for (int i = 0, r=a.length ; i < r; i++) {
            for (int j = 0, c=a[0].length; j < c; j++) {
                sum+=a[i][j];
            }

        }
        return sum;
    }

    public static boolean findX(int[][] a, int x){
        boolean result = false;
        for (int i = 0, r=a.length ; i < r; i++) {
            for (int j = 0, c=a[0].length; j < c; j++) {
                if (x==a[i][j]){
                    result = true;
                    break;
                }
            }

        }
        return result;
    }

    public static boolean isPrimeNum(int n) {
        boolean ret = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static boolean isPrimeMatrix(int[][] a){
        boolean ret = true;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c =a[0].length; j < c; j++) {

                if(!isPrimeNum(a[i][j])){
                    ret= false;
                    break;
                }

            }

        }

        return ret;
    }

    public static int findMax(int[][] a){
        int max=0;
        for (int i = 0, r=a.length; i < r; i++) {
            for (int j = 0, c=a[0].length; j < c; j++) {
                if(max<a[i][j]){
                    max=a[i][j];
                }

            }

        }

        return max;
    }

}
