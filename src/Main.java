public class Main {
    public static void main(String[] args){
        int i;
        int resto;
        for(i = 1 ; i <= 100 ; i++){
            resto = i % 2;
            if(resto == 0){
                System.out.println(i);
            }

        }
    }
}