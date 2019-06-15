/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class CursoTeste {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do curso");
        
        String nomecurso = Scanner.nextline();
        
        System.out.println("Digite as notas");
        double[] notas = new double[10];
        for(int i = 0; i < notas[i];i++){
            System.out.println("Digite a" (i+1)+"°nota");
            notas[i] = Scanner.nextdouble();
        }
        
             double retornaMedia;
        System.out.println("Media é;"+retornaMedia());
        System.out.println("Maior é;"+retornaMaior());
                
}    
}