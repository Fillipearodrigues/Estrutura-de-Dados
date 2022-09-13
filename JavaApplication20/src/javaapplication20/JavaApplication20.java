/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;


import java.util.Scanner;
import javax.xml.transform.OutputKeys;



/**
 *
 * @author Aluno
 */
public class JavaApplication20 {

    
      static void menu () {
    
      System.out.println("Digite qual operacao deseja");
      System.out.println("1 - Soma ");
      System.out.println("2 - Multiplicar");
      System.out.println("3 - Subtracao");
      System.out.println("4 - Divisao");
      System.out.println("5 - Sair");
    
}
    
    
    static int soma(int a, int b){
       int soma = 0;
       soma = a + b;
       return soma;
   }
    
    
    static int multiplicar(int a, int b){
        int multi = 0;
        multi = a * b;
        
        return multi;
    }
    
     static int Subtracao(int a, int b){
        int sub = 0;
        sub = a - b;
        
        return sub;
    }
     
      static int Divisao(int a, int b){
        int div = 0;
        div = a / b;
        
        return div;
    }
     
     
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 
       int a = 0;
       int b = 0;
       int soma = a+b;
       int opcao = 0;
       
       Scanner in = new Scanner(System.in);
     
      menu();
      opcao = in.nextInt();
      
      
      
       while(opcao <= 4) {
           
      System.out.println("Digite qual operacao deseja");
      System.out.println("1 - Soma ");
      System.out.println("2 - Multiplicar");
      System.out.println("3 - Subtracao");
      System.out.println("4 - Divisao");
      System.out.println("5 - Sair");
      opcao = in.nextInt();
           
           
      switch (opcao) {
          
          
        case 1: System.out.println("Digite o número: a ");
        a = in.nextInt();
       
       System.out.println("Digite o número: b ");
        b = in.nextInt();
       
       System.out.println("A Soma e " + soma(a,b));

                  break;

      case 2: 
      System.out.println("Digite o número: a ");
        a = in.nextInt();
       
       System.out.println("Digite o número: b ");
        b = in.nextInt();
      System.out.println("A Multiplicacao e " + multiplicar(a,b));
      break;
      
       case 3: 
      System.out.println("Digite o número: a ");
        a = in.nextInt();
       
       System.out.println("Digite o número: b ");
        b = in.nextInt();
      System.out.println("A Multiplicacao e " + Subtracao(a,b));
      break;
      
       case 4: 
      System.out.println("Digite o número: a ");
        a = in.nextInt();
       
       System.out.println("Digite o número: b ");
        b = in.nextInt();
      System.out.println("A Multiplicacao e " + Divisao(a,b));
      break;
   
     default: System.out.print("Obrigado Por Utilizar");
     in.close();
      

      }
       }
      
     
      
      
      
    }
    
    

        
    }
    

