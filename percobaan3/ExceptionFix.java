// Nama : Andhika Oktasandira
// Nim : 20210040054
// TI 21 A
package percobaan3;
/**
 *
 * @author Axioo
 */
        public class ExceptionFix {

	    public static void main(String[] args) {
	        int bil=10;
	        try {
	            System.out.println(bil/0);
	        } catch (Exception e) {
	            System.out.println("Ini menghandle error yang terjadi");
	        }
	    }
	}
