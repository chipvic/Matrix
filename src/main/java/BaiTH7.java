import java.util.Scanner;

public class BaiTH7 {
    public static int[][] inputMatrix(int r, int c) {
        Scanner sc = new Scanner(System.in);
        int[][] ret = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("a[%d][%d] = ", i, j);
                ret[i][j] = sc.nextInt();


            }

        }
        return ret;

    }

    public static int nhapSoInt() {
        Scanner myInt = new Scanner(System.in);
        int numInt = myInt.nextInt();
        return numInt;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                System.out.format("%d ", a[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] generateMatrix(int r, int c, int min, int max) {
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = (int) Math.floor(Math.random() * (max - min) + min);

            }

        }
        return ret;

    }

    public static int sumElements(int[][] a) {
        int sum = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                sum += a[i][j];
            }

        }
        return sum;
    }

    public static boolean findX(int[][] a, int x) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (x == a[i][j]) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean isPrimeNum(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {

                if (!isPrimeNum(a[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findMax(int[][] a) {
        int max = a[0][0];
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }

            }

        }

        return max;
    }

    public static int sumRC(int[][] a, int r, int c) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if ((i == r - 1) || (j == c - 1)) {
                    sum += a[i][j];
                }

            }

        }
        return sum;
    }

    public static int sumMainDiagonal(int[][] a) {
        int sum = 0;
        int r = a.length;
        for (int i = 0; i < r; i++) {
            for (int j = i; j < r; j++) {
                sum += a[i][j];
                break;
            }

        }

        return sum;
    }

    public static int sumSubDiagonal(int[][] a) {
        int sum = 0;
        int r = a.length;
        int c = a.length;
        for (int i = 0; i < r; i++) {
            for (int j = c - 1; j >= 0; j--) {
                sum += a[i][j];
                c = c - 1;
                break;
            }

        }


        return sum;
    }

    public static int sumUpperMainDiag(int[][] a) {
        int sum = 0;
        int r = a.length;
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < r; j++) {
                sum += a[i][j];
            }

        }

        return sum;
    }

    public static int sumLowerMainDiag(int[][] a) {
        int sum = 0;
        int r = a.length;
        for (int i = r - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                sum += a[i][j];
            }
        }
        return sum;
    }

//    public  static int sumUpperSubDiag(int[][] a){
//        int sum=0;
//        int r =a.length;
//        for (int i = 0; i < r-1; i++) {
//            for (int j =r-1; j >=i; j--) {
//                sum+=a[i][j];
//
//            }
//
//        }
//
//
//        return sum;
//    }
//
//    public static int sumLowerSubDiag(int[][] a){
//        int sum=0;
//        int r=a.length;
//        for (int i = r-1; i > 0; i--) {
//            for (int j = i; j < r; j++) {
//                sum+=a[i][j];
//
//            }
//
//        }
//
//        return sum;
//    }


}
