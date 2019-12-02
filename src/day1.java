import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day1 {
    public static void main(String[] args) throws IOException{
        int total = 0;
        int fuel;
        int mass;
        FileReader fr = new FileReader("day1input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        do{
            mass = Integer.parseInt(line);
            fuel = (mass/3) - 2;
            total += fuel;
            while((fuel=(fuel/3)-2)>0){
                total += fuel;
            }
        }while((line = br.readLine()) != null);
        System.out.println(total);
    }
}
