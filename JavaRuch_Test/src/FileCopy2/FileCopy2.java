package FileCopy2;

public class FileCopy2 {


    public static void main(String[] args) throws java.io.IOException
    {
        java.io.FileInputStream fileInputStream =
                        new java.io.FileInputStream("c:\\data.txt");
        java.io.FileOutputStream fileOutputStream =
                        new java.io.FileOutputStream("d:\\result.txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

}
