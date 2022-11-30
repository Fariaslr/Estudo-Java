package primeira.questão;
import java.util.Scanner; 

/*
    1- Na empresa onde trabalhamos, há tabelas com quanto foi gasto em cada mês. Para fechar
    o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em
    Janeiro, foram gastos 15000 reais, em Fevereiro, 23000 reais e em Março, 17000 reais,
    faça um programa que calcule e imprima o gasto total no trimestre.
*/

public class PrimeiraQuestão {
    
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int gastoJaneiro, gastoFevereiro, gastoMarco, gastoTrimestre;
        
        System.out.printf("Informe o gasto de Janeiro: R$ ");
        gastoJaneiro = scanf.nextInt();
        
        System.out.printf("Informe o gasto de Fevereiro: R$ ");
        gastoFevereiro = scanf.nextInt();
        
        System.out.printf("Informe o gasto de Março: R$ ");
        gastoMarco = scanf.nextInt();
        
        gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
        
        System.out.printf("\nO gasto do trimestre foi de R$ %d \n", gastoTrimestre);
    }
    
}
