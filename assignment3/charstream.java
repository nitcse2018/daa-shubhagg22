package assignment3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
public class charstream {
	public static void main(String[] args)throws IOException{
		FileReader fi = NULL;
		try {
			i = new Filereader("input.txt");
			FileReader o = new Filereader("output_char.txt");
			int ch;
			while((ch=i.read())!=-1)
			{
			      o.write(ch);
			}
			o.close();
			i.close();
		}
		catch(Exception e){
			System.out.println("operation not possible");
		}
	}

}
