package mediaaritmetetica;
import java.util.Scanner;

/*
    2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
    números 4, 5 e 6. A soma das duas médias. A média das médias.
 */
public class MediaAritmetetica {

    public static void main(String[] args) {
        
        Scanner scanf = new Scanner(System.in);
        
        int primeiroNmr = 8, segundoNmr = 9, terceiroNmr = 7;
        int quartoNmr = 4, quintoNmr = 5, sextoNmr = 6;
        float segundaMedia, primeiraMedia, mediaDaMedia; 
        
        primeiraMedia = (primeiroNmr + segundoNmr + terceiroNmr)/3;
        segundaMedia = (quartoNmr + quintoNmr + sextoNmr)/3;
        
        mediaDaMedia = primeiraMedia + segundaMedia;
        
        System.out.printf("%.2f \n",mediaDaMedia);
        
    }
    
}
