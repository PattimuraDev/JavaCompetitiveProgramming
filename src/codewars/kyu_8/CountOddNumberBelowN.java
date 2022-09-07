package codewars.kyu_8;

public class CountOddNumberBelowN {
    /**
     * Fungsi oddCount untuk menghitung banyaknya bilangan ganjil positif yang kurang dari n
     * @param n parameter untuk suatu bilangan n sebagai batas
     * @return banyaknya bilangan ganjil n yang kurang dari n
     */
    public static int oddCount(int n){
        return n % 2 == 0 ? n / 2 : (n - 1)/2;
    }

//    public static void main(String[] args) {
//        System.out.println(oddCount(9));
//    }
}
