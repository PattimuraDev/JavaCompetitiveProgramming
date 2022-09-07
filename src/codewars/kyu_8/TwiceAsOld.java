package codewars.kyu_8;

public class TwiceAsOld {
    /**
     * Fungsi twiceAsOld dipakai untuk menentukan pada saat kapan umur anak akan sama dengan umur ayah
     *
     * @param dadYears paramater untuk umur sang ayah
     * @param sonYears parameter untuk umur sang anak
     * @return berapa waktu yang dibutuhkan agar umur anak sama dengan umur ayah (satuan tahun), baik di masa mendatang atau masa lalu
     */
    public static int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - (2 * sonYears));
    }

//    public static void main(String[] args) {
//        System.out.println(twiceAsOld(48, 23));
//    }
}
