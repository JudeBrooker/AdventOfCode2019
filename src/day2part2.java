import java.io.*;
import java.util.Arrays;

public class day2part2 {
    public static void main(String[] args) throws IOException {
        int num1; int num2; int num3; int total; int noun=0; int verb=0;
        FileReader fr = new FileReader("day2inputCopy.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        String[] input = line.split(",");
        for(int x = 0; x<100; x++) {
            for(int y = 0; y<100; y++) {
                int index = 0;
                ResetFile();
                input = line.split(",");
                input[1] = String.valueOf(x);
                input[2] = String.valueOf(y);

                while (!input[index].equals("99")) {
                    num1 = Integer.parseInt(input[index + 1]);
                    num2 = Integer.parseInt(input[index + 2]);
                    num3 = Integer.parseInt(input[index + 3]);
                    if (input[index].equals("1")) {
                        total = Integer.parseInt(input[num1]) + Integer.parseInt(input[num2]);
                        input[num3] = String.valueOf(total);
                    } else if (input[index].equals("2")) {
                        total = Integer.parseInt(input[num1]) * Integer.parseInt(input[num2]);
                        input[num3] = String.valueOf(total);
                    }
                    index += 4;
                }
                if(input[0].equals("19690720")){
                    noun = x;
                    verb = y;
                    break;
                }
            }
            if(Integer.parseInt(input[0]) == 19690720){
                break;
            }
        }
        br.close();
        System.out.println((100*noun) + verb);
    }

    private static void ResetFile() throws IOException{
        FileReader fr = new FileReader("day2input.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("day2inputCopy.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String line = br.readLine();
        bw.write(line);
        fr.close();
        bw.close();

    }
}
