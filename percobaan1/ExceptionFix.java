// Nama : Andhika Oktasandira 
// Nim  : 20210040054
// TI 21 A
package percobaan.pkg1;
/**
 *
 * @author Axioo
 */
public class ExceptionFix {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5]=100;
        } catch (Exception e) {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}