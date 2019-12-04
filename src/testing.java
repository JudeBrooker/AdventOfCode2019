import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class testing {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day3input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        String[] wire1 = line.split(",");
        line = br.readLine();
        String[] wire2 = line.split(",");
        System.out.println(wire1.length);
        System.out.println(wire2.length);
    }
}
