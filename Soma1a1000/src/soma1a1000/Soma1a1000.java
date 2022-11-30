package soma1a1000;
import java.util.Scanner; 
/*
    4- Imprima a soma de 1 até 1000.
 */
public class Soma1a1000 {

    public static void main(String[] args) {
        int soma = 0;
        Scanner scanf =  new Scanner(System.in);
        
        int finalIntervalo;
        
        System.out.printf("Defina o final do intervalo: ");
        finalIntervalo = scanf.nextInt();
        
        
        for(int i=1; i< finalIntervalo; i++){
            soma = soma + i;
            
        }
        System.out.printf("A soma dos números de 1 a %d é %d ",finalIntervalo,soma);
    }
    
}
