package fatorial1a10;

/*
    6- Imprima os fatoriais de 1 a 10.
    O fatorial de um número n é n * n-1 * n-2 ... até n=1. Lembre-se de utilizar os parênteses.
    O fatorial de 0 é 1. O fatorial de 1 é (0!) * 1 = 1. O fatorial de2 é (1!) * 2 = 2. O fatorial de 3
    é (2!) * 3 = 6. Faça um for que inicie uma variável n (número) como 1 e fatorial (resultado)
    como 1 e varia n de 1 até 10:
    for (int n=1, fatorial=1; n <= 10; n++)
 */
public class Fatorial1a10 {

    public static void main(String[] args) {
        int fatorial = 1;
        
        for(int i=1;i<=10;i++){
            
            if(i > 1){
                
                fatorial = i * fatorial;
                System.out.println("O fatorial de "+ i +" é "+ fatorial); 
                
            }else if(i == 1) System.out.println("O Fatorial de 1 é 1");
            
        }
    
    }
}
