import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class day5 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int index = 0;
        int num1; int num2; int num3; int total; String opcode; String twoDigitOpcode; int firstMode; int secondMode;
        FileReader fr = new FileReader("day5input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        String[] input = line.split(",");
        input[1] = String.valueOf(12);
        input[2] = String.valueOf(2);
        while(!input[index].equals("99")){
            opcode = input[index];
            twoDigitOpcode = opcode.substring(2);
            firstMode = Integer.parseInt(opcode.substring(2,3));
            num1 = Integer.parseInt(input[index+1]);
            num2 = Integer.parseInt(input[index+2]);
            num3 = Integer.parseInt(input[index+3]);
            if(twoDigitOpcode.equals("01")){
                total = Integer.parseInt(input[num1]) + Integer.parseInt(input[num2]);
                input[num3] = String.valueOf(total);
            }
            else if(twoDigitOpcode.equals("02")){
                total = Integer.parseInt(input[num1]) * Integer.parseInt(input[num2]);
                input[num3] = String.valueOf(total);
            }
            else if(twoDigitOpcode.equals("03")){
                System.out.println("Input:");
                input[num1] = in.next();
            }
            else if(twoDigitOpcode.equals("04")){
                System.out.println("Output:");
                System.out.println(input[num1]);
            }
            index += 4;
        }
        System.out.println(Arrays.toString(input));
        br.close();
    }
}