package learning.javadoc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class a_ByteStreams {
    public static void main(String[] args) throws IOException {
        // 
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream("src\\test\\java\\resources\\byteInStream.txt");
            fout = new FileOutputStream("src\\test\\java\\resources\\byteOutStream.txt");
            int c;

            while ((c=fin.read())!=-1) {
                System.out.println(c);
                fout.write(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            if(fin != null){
                fin.close();
            }
            if(fout!=null){
                fout.close();
            }
        }
    }
}
