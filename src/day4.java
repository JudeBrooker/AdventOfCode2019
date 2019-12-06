public class day4 {
    public static void main(String args){
        boolean fact1 = false;
        boolean fact2 = true;
        int num = 0;
        int[] range = {147981,691423};
        for(int i = range[0];i<range[1];i++){
            String password = String.valueOf(i);
            String[] password2 = password.split("(?!^)");
            for(int x = 0; x<6; x++){
                if (password.substring(x, x + 1).equals(password.substring(x + 1, x + 2))) {
                    fact1 = true;
                    break;
                }
            }
            for(int y = 0;y<password2.length;y++){
                if(Integer.parseInt(password2[y])>Integer.parseInt(password2[y+1])){
                    fact2 = false;
                }
            }
            if(fact1&&fact2){
                num++;
            }
        }
    }
}
