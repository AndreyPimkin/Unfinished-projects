package copying2;

import java.io.*;

public class copy2 {
    public static void main(String[] args) throws IOException {
        File fileOne = new File("copy1.txt");
        File fileTwo = new File("copy2.txt");
        File fileThree = new File("copy3.txt");
        File fileFour = new File("copy4.txt");
        copyFileUsingStream(fileOne, fileTwo ,fileThree, fileFour);
    }
    private static void copyFileUsingStream(File fileOne, File fileTwo, File fileThree, File fileFour) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        long start = System.currentTimeMillis();
        try {
            is = new FileInputStream(fileOne);
            os = new FileOutputStream(fileTwo);
            is1 = new FileInputStream(fileThree);
            os1 = new FileOutputStream(fileFour);
            byte[] buffer = new byte[1024];
            int length;
            while (((length = is.read(buffer)) > 0) || ((length = is1.read(buffer)) > 0) ) {
                if(((length = is.read(buffer)) > 0)){
                    os.write(buffer, 0, length);
                }
                os.write(buffer, 0, length);
                if(((length = is1.read(buffer)) > 0)){

                }
            }
        }
        finally {
            is.close();
            os.close();
            is1.close();
            os1.close();
        }
        InputStream is1 = null;
        OutputStream os1 = null;

        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }

}