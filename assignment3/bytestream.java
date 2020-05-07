package assignment3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream {
	public static void main(String[] args)throws IOException{
		FileInputStream i = NULL;
		FileInputStream o = NULL;
		
		try {
			i = new FileInputStream("input.txt");
			o = new FileInputStream("output_byte.txt");
			int ch;
			while((ch=read.i())!=-1)
			{
				o.write(ch);
			}
			o.close();
			i.close(;)
		}
		catch(Exception e){
			System.out.println("operation not possible");
		}
	}
}
