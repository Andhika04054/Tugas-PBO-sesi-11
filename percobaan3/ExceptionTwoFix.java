// Nama : Andhika Oktasandira
// Nim : 20210040054
// TI 21 A
package percobaan3;

/**
 *
 * @author Axioo
 */
        public class ExceptionTwoFix {

	    public static void main(String[] args) {
	        int bil = 10;
	        try {
	            System.out.println(bil / 0);
	        } catch (ArithmeticException e) {
	            System.out.println("Terjadi aritmatika error");
	        } catch (Exception e) {
	            System.out.println("Ini menghandle error yang terjadi");
	        }
	    }
	}
