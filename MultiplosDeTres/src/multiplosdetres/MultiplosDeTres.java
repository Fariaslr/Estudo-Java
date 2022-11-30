package multiplosdetres;

/*
    5- Imprima todos os múltiplos de 3, entre 1 e 100.
 */
public class MultiplosDeTres {
    
    public static void main(String[] args) {
        
        System.out.printf("Múltiplos de 3: ");
        
        for(int i = 0; i < 100; i++){
            
            if(i % 3 == 0){
                
                System.out.printf("%d ", i);
            }
        }
    }
    
}
