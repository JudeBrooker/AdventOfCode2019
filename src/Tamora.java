class Main {
    public static void main(String[] args) {
        int[] array = {1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,13,1,19,1,6,19,23,2,23,6,27,1,5,27,31,1,10,31,35,2,6,35,39,1,39,13,43,1,43,9,47,2,47,10,51,1,5,51,55,1,55,10,59,2,59,6,63,2,6,63,67,1,5,67,71,2,9,71,75,1,75,6,79,1,6,79,83,2,83,9,87,2,87,13,91,1,10,91,95,1,95,13,99,2,13,99,103,1,103,10,107,2,107,10,111,1,111,9,115,1,115,2,119,1,9,119,0,99,2,0,14,0};
        int i = 0;
        int opcode = 0;
        boolean stop = false;
        do{
            opcode = array[i];
            int nextX = array[i+1];
            int nextY = array[i+2];
            switch (opcode){
                case 1:
                    array[array[i+3]] = nextX + nextY;
                    break;
                case 2:
                    array[array[i+3]] = nextX * nextY;
                    break;
                case 99:
                    stop = true;
                    break;
            }
            i = i + 4;
        }while (i < (array.length-1) && stop == false);
        System.out.println(array[0]);
    }
}