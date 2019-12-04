import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class day3 {
    public static void main(String[] args) throws IOException{
        int minDistance = 1000000;
        FileReader fr = new FileReader("day3input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        String[] wire1 = line.split(",");
        line = br.readLine();
        String[] wire2 = line.split(",");
        int[][] Coordinates1 = FindCoordinates(wire1);
        int[][] Coordinates2 = FindCoordinates(wire2);
        for(int i=0;i<Coordinates1.length-1;i++){
            if(Coordinates1[i][0] == Coordinates2[i][0] && Coordinates1[i][1] == Coordinates2[i][1]){
                int Distance=0;
                if(Coordinates1[i][0]>0){
                    Distance += Coordinates1[i][0];
                }
                else if(Coordinates1[i][0]<0){
                    Distance -= Coordinates1[i][0];
                }
                if(Coordinates1[i][1]>0){
                    Distance += Coordinates1[i][0];
                }
                else if(Coordinates1[i][1]<0){
                    Distance -= Coordinates1[i][0];
                }
                if(Distance < minDistance){
                    minDistance = Distance;
                }
            }
        }
        System.out.println(minDistance);
    }
    private static int[][] FindCoordinates(String[] wire){
        String direction;
        int length;
        int[][] Coordinates = new int[9][2];
        int[] coordinate = {0,0};
        for (int i = 0;i<wire.length;i++) {
            direction = wire[i].substring(0,1);
            length = Integer.parseInt(wire[i].substring(1));
            switch(direction){
                case "R":
                    coordinate[0] += length;
                    break;
                case "L":
                    coordinate[0] -= length;
                    break;
                case "U":
                    coordinate[1] += length;
                    break;
                case "D":
                    coordinate[1] -= length;
                    break;
            }
            Coordinates[i][0] = coordinate[0];
            Coordinates[i][1] = coordinate[1];
        }
        return Coordinates;
    }
}
