
public class Start_2 {

	public static int convertToSeconds(int hour) {

		int sec = hour * 3600;

		return sec;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] twoD = new int[12][12]; // объявили двухмерный массив
		int i, j, k = 0;

		for (i = 0; i < twoD.length; i++)
			for (j = 0; j <twoD.length; j++) {
				twoD[i][j] = k;
				k=i*j;
				
				
			}

		for (i = 1; i <=10; i++) {
			for (j = 2; j <=11; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.print("\n");
		}
				
		//	System.out.println(arr[i][j]+" ");
		
		
	

		// String s1 ="Мама";
//		String s2 ="Мыла";
//		String s3= "Раму";
//		
//		System.out.println(s1+s2+s3);
//		System.out.println(s1+s3+s2);
//		System.out.println(s2+s1+s3);
//		System.out.println(s2+s3+s2);
//		System.out.println(s3+s1+s2);
//		System.out.println(s3+s2+s1);

//		System.out.println(convertToSeconds(23));
//		System.out.println(convertToSeconds(35));
	}

}
