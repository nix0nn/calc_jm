import java.io.*;

public class inputtest {
    public static void main(String args[])
        throws IOException {
            byte data[] = new byte[10];
            
        System.in.read(data);
        System.out.println(data.length);
        for (int i=0; i < data.length; i++)
            System.out.print((char) data[i]);
    }

}
