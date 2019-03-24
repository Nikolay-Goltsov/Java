/**
 * 
 */

/**
 * @author Hakers
 *
 */
public class Box {

	/**
	 * @param args
	 */
	int color;
	int hit;
	int len;
	public int getVolume() {
		
		return color*hit*len;
	}
	
	 void setDim(int c,int h, int l) {
		color=c;
		hit=h;
		len=l;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.setDim(10, 10, 10);
		int vol = box.getVolume();
		System.out.println(vol);

	}

}
