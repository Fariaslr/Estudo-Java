package NotaAluno;

import javax.swing.JOptionPane;

public class Nota {
    public static void main (String[] args)
    {
        String nome, n1, n2, n3, nFinal;
        double nota1, nota2, nota3, notaFinal, media, resultado;
        
        nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
        
        JOptionPane.showInputDialog("Insira a nota da primeira avaliação: ");
        nota1 = Double.parseDouble(n1);
        
        n2 = JOptionPane.showInputDialog("Insira a nota da segunda avaliação: ");
        nota2 = Double.parseDouble(n2);
        
        n3 = JOptionPane.showInputDialog("Insira a nota da terceira avaliação: ");
        nota3 = Double.parseDouble(n3);
        
        media = (nota1 + nota2 + nota3)/3;
        
        if (media >= 7)
        {
          JOptionPane.showMessageDialog(null,"Aluno: "+nome+"\n"+"A Média do aluno é: "+media,"\nALUNO APROVADO\n",JOptionPane.INFORMATION_MESSAGE);  
           System.exit(0);
        } else
        {
          JOptionPane.showMessageDialog(null,"Aluno: "+nome+"\n"+"A Média do aluno é: "+media,"\nALUNO REPROVADO\n",JOptionPane.WARNING_MESSAGE);  
        
          nFinal = JOptionPane.showInputDialog("Insira a nota da Avaliação Final: ");
          notaFinal = Double.parseDouble(nFinal);
          
          resultado = ( media + notaFinal)/2;
                  
          if (resultado >= 5)
          {
           JOptionPane.showMessageDialog(null,"Aluno: "+nome+"\n"+"A Média FInal do aluno é: "+resultado,"\nALUNO APROVADO\n",JOptionPane.INFORMATION_MESSAGE);  
            System.exit(0);   
          } else
          {
           JOptionPane.showMessageDialog(null,"Aluno: "+nome+"\n"+"A Média Final do aluno é: "+resultado,"\nALUNO REPROVADO\n",JOptionPane.WARNING_MESSAGE);   
          }    
          System.exit(0);         
        }    
    }  
}
