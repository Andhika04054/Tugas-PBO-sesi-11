// Nama : Andhika Oktasandira
// Nim : 20210040054
// TI 21 A
package percobaan7;

/**
 *
 * @author Axioo
 */
        public class ThrowSeven {

	    public static void main(String[] args) {
	        try {
	            throw new Exception("Here's my Exception");
	        } catch (Exception e) {
	            System.out.println("Caught Exception");
	            System.out.println("e.getMassage(): "+e.getMessage());
	            System.out.println("e.toString(): "+e.toString());
	            System.out.println("e.printStackTrace():");
	            e.printStackTrace();
	        }
	    }
	}
