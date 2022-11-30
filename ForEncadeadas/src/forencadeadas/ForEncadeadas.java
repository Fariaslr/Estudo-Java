package forencadeadas;
import java.util.Scanner;

public class ForEncadeadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for( int i = 1; i <= 10 ; i++){
            System.out.print(i);
            
            
            for( int j = 2; j <= i;j++){
                int z = i * j;
                
                System.out.printf("\t%d",z);
                
            }
            System.out.printf("\n");
        }
    }
    
}
