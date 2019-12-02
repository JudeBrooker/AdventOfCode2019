public class testing {
    public static void main(String[] args){
        int mass;
        int fuel;
        int total = 0;

        mass = 1969;
        fuel = (mass/3) - 2;
        total += fuel;
        while((fuel=(fuel/3)-2)>0){
            System.out.println(fuel);
            total += fuel;
        }
        System.out.println(total);
    }
}
