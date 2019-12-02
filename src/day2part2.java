import java.io.*;
import java.util.Arrays;

public class day2part2 {
    public static void main(String[] args) throws IOException {
        int index = 0;
        int num1; int num2; int num3; int total;
        FileReader fr = new FileReader("day2inputCopy.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        String[] input = line.split(",");
        while(!input[index].equals("99")){
            num1 = Integer.parseInt(input[index+1]);
            num2 = Integer.parseInt(input[index+2]);
            num3 = Integer.parseInt(input[index+3]);
            if(input[index].equals("1")){
                total = Integer.parseInt(input[num1]) + Integer.parseInt(input[num2]);
                input[num3] = String.valueOf(total);
            }
            else if(input[index].equals("2")){
                total = Integer.parseInt(input[num1]) * Integer.parseInt(input[num2]);
                input[num3] = String.valueOf(total);
            }
            index += 4;
        }
        System.out.println(Arrays.toString(input));
        br.close();
    }

    public static void ResetFile() throws IOException{
        FileReader fr = new FileReader("day2input");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("day2inputCopy");
        BufferedWriter bw = new BufferedWriter(fw);
        String line = br.readLine();

    }
}
