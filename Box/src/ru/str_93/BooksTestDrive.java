package ru.str_93;

class Books {
	String title;
	String author;
}

public class BooksTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books[] myB = new Books[3];

		int x = 0;
		
		myB[0]=new Books();
		myB[1]=new Books();
		myB[2]=new Books();
				

		myB[0].title = "Плоды JAVA";
		myB[1].title = "JAVA Гэсби";
		myB[2].title = "Сборник рецептов по JAVA";

		myB[0].author = "Боб";
		myB[1].author = "Сью";
		myB[2].author = "Ян";

		while (x <3) {
			
			System.out.print(myB[x].title);
			System.out.print(", автор ");
			System.out.println(myB[x].author);
			x =x+1;
		}

		
	}

}
