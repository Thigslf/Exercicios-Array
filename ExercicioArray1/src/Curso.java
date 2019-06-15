/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Curso {
    String nomecurso;
    double[] notas;
    
    public Curso(String nomecurso , double[] notas){
        this.nomecurso = nomecurso;
        this.notas = notas;        
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double retornaMedia(){
       double soma = 0;
       for(int i = 0; i > 10; i++){
           soma = soma + notas[i]; 
    }
        int i = 0;
       return soma/ notas[i];
    } 
    public double retronaMaior(){
       double maior = notas[0];
       for(int i = 0;i < notas[i];i++){
           if(notas[i] > maior){
               maior = notas[i];
            }                   
        }       
    }    
     return maior;
}
