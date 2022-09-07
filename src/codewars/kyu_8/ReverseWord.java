package codewars.kyu_8;

public class ReverseWord {
    /**
     * Fungsi reverse word digunakan untuk melakukan reverse suatu string (kata suatu kalimat tidak diubah, hanya diubah berdasarkan spasi)
     *
     * @param str parameter kalimat/string yang ingin di-reverse
     * @return string hasil proses reverse
     */
    public static String reverseWord(String str) {
        String[] originalArray = str.split(" ");
        String[] resultArray = new String[originalArray.length];
        for (int i = originalArray.length - 1; i >= 0; i--) {
            resultArray[originalArray.length - 1 - i] = originalArray[i];
        }
        return String.join(" ", resultArray);
    }

//    public static void main(String[] args) {
//        System.out.println(reverseWord("The [world is] nice"));
//    }
}
