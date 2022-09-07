package codewars.kyu_8;

public class BeginnerReduceButGrow {
    /**
     * Fungsi grow untuk menentukan hasil perkalian semua komponen array secara berurutan
     *
     * @param x parameter untuk sebuah array integer
     * @return hasil perkalian semua komponen array
     */
    public static int grow(int[] x) {
        int result = 1;
        for (int j : x) {
            result *= j;
        }
        return result;
    }

//    public static void main(String[] args) {
//        int [] a = {1, 3, 5, 2};
//        System.out.println(grow(a));
//    }
}
