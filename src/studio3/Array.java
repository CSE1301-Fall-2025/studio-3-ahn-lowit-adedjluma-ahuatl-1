import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How long is your list?");
        int number = scan.nextInt();
        boolean[] array = new boolean[number+1];

        for(int i=2; i<number; i++){
            array[i] = true;
        }
        for(int z=2; z<number+1; z++){
            for(int j=z+1; j<number+1; j++){
                if(j%z==0){
                    array[j] = false;
                }
            }
            
        }
        for(int l=1; l <number; l++){
            if(array[l]==true){
                System.out.println(l);
            }
        }

        
    }

    
}
