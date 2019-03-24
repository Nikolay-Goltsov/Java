/**
 * 
 */

/**
 * @author Hakers
 *
 */
public class Start_3 {

	/**
	 * @param args
	 */
	  int counter = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int count = 0;
	    Start_3[] st = new Start_3[20];
	    int x = 0;

	    while (x < 19) {
	      st[x] = new Start_3();
	      st[x].counter = st[x].counter + 1;
	      count = count + 1;
	      count = count + st[x].mbNew(x);
	      x = x + 1;
	    }
	    System.out.println(count+" "+ st[1].counter);

	  }

	  public int mbNew(int index) {
	    if (index < 1) {
	    	Start_3 m4 = new Start_3();
	      m4.counter = m4.counter + 1;
	      return 1;
	    }
	    return 0;
	  }

	}


