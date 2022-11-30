package fatorialate40;
import java.util.Scanner;
/*
    7- Aumente a quantidade de números que terão os fatoriais impressos até 20, 30, 40. Em um
    determinado momento, além desse cálculo demorar, vai começar a mostrar respostas
    completamente erradas. Por quê? Mude int para long, e você poderá ver alguma
    mudança.
 */
public class FatorialAte40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         long fatorial = 1;
         int limiteFatorial;
         
         Scanner scanf = new Scanner(System.in);
         
         System.out.println("Insira o limite do Fatorial: ");
         limiteFatorial = scanf.nextInt();
         
        
        for(int i = 1 ; i <= limiteFatorial ; i++){
            
            if(i > 1){
                
                fatorial = i * fatorial;
                System.out.println("O fatorial de "+ i +" é "+ fatorial); 
                
            }else if(i == 1) System.out.println("O Fatorial de 1 é 1");
            
        }
    }
    
}
