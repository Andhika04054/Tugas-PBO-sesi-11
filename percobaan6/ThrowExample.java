// Nama : Andhika Oktasandira
// Nim : 20210040054
// TI 21 A
package percobaan6;

/**
 *
 * @author Axioo
 */
        public class ThrowExample {

	    static void demo()
	    {
	        NullPointerException t;
	        t=new NullPointerException("Coba Throw");
	        throw t;
	    }
	

	    public static void main(String[] args) {
	        try {
	            demo();
	            System.out.println("Selesai");
	        } catch (NullPointerException e) {
	            System.out.println("Ada pesan error: "+e);
	        }
	    }
	}
