package codewars.kyu_8;

public class GrasshoperCheckForFactor {
    /**
     * Menentukan apakah suatu bilangan (factor) merupakan faktor dari bilangan lainnya (base)
     *
     * @param base   variable untuk bilangan dasar
     * @param factor variable untuk bilangan faktor
     * @return true jika factor adalah faktor dari base, sebaliknya false
     */
    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }

//    public static void main(String[] args) {
//        System.out.println(checkForFactor(7, 2));
//    }
}
