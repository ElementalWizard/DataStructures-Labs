import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class GenInput {
    public static void main(String[] args){
        //change 4 for the number of files you want to create
        for(int r=0; r<4; r++){
            //picks a random number of custumers to generate from 1 to 20
            int numOfCustomers= new Random(new Random().nextInt(999999999)).nextInt(20)+1;
            outPutFile(numOfCustomers,"D:/Code/Java/GenInput/src/outputi.csv".replace("i",String.valueOf(r)));

        }
    }

    public static void outPutFile(int times,String path) {
        String outPath = path;

        System.out.println(outPath);

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(outPath, "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= times; i++) {
            Random random =new Random(System.currentTimeMillis());
            writer.println(i +
                    ","+
                    String.valueOf(new Random(new Random().nextInt(999999)).nextInt(9999999)+1000000)+
                    ","+
                    String.valueOf(new Random(new Random().nextInt(999999)).nextInt(25)+1)+
                    ",$"+
                    String.valueOf(new Random(new Random().nextInt(999999)).nextInt(98)+1) +
                    "."+
                    String.valueOf(new Random(new Random().nextInt(999999)).nextInt(98)+1) +
                    ","+
                    String.valueOf(new Random(new Random().nextInt(999999)).nextInt(times))+3);
        }
        writer.close();

    }
}
