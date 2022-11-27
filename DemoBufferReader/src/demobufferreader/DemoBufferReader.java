package demobufferreader;
import java.io.BufferedReader; //gagamitin si bufferd reader
import java.io.IOException;//input output exception
import java.io.InputStreamReader;//for accepting and displaying 
public class DemoBufferReader {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter your name");
        String name = input.readLine();
        System.out.println("your name is "+ name);
    }
    
}
