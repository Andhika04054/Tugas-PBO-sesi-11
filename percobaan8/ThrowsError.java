// Nama : Andhika Oktasandira
// Nim : 20210040054
// TI 21 A
package percobaan8;

/**
 *
 * @author Axioo
 */
        import java.io.IOException;

        public class ThrowsError {

	    public void methodA(){
	        System.out.println("Method A");
	    }
	    public void methodB() throws IOException {
	        System.out.println(20/0);
	        System.out.println("Method B");
	    }
	}
	class Utama
	{
	    public static void main(String[] args) throws IOException {
	        ThrowsError c=new ThrowsError();
	        c.methodA();
	        c.methodB();
	    }
	}
