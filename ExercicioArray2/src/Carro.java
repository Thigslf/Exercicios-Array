/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Carro {

    String modelo;
    String ano;
    double[] preco;

    public Carro(String modelo, String ano, double[] preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double[] getPreco() {
        return preco;
    }

    public void setPreco(double[] preco) {
        this.preco = preco;
    }
    
    public double retornaMaiorPreco(){
        double maior = getPreco()[0];
        for (int i = 0; i < 5; i++) {
            if(maior > getPreco()[i]){
                maior = getPreco()[i];
            }
        }
        return maior;
    }
    
    public double retornaMenorPreco(){
        double menor = getPreco()[0];
        for (int i = 0; i < 5; i++) {
            if(menor < getPreco()[i]){
                menor = getPreco()[i];
            }
        }
        return menor;
    }
    public double retornaMediaPreco(){       
        double soma = 0;
        for (int i = 0; i < 5; i++) {
           soma = soma + getPreco()[i];
        }
        return soma/5;
    }
}
