/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

/**
 *
 * @author fernando.fernandes
 */
public class Carro {
    private static String fabricante;
    
    private String rodas;
    private String cor;
    private String modelo;
    private String velocidadeAtual;
    private int gasolina;
    private int max_gasolina;
    
    public Carro(){
    this.max_gasolina = 40;
    this.gasolina = 20;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Carro.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRodas() {
        return rodas;
    }

    public void setRodas(String rodas) {
        this.rodas = rodas;
    }

    public String getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(String velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public int getMax_gasolina() {
        return max_gasolina;
    }

    public void setMax_gasolina(int max_gasolina) {
        this.max_gasolina = max_gasolina;
    }
    
    
    public String descreve(){
        if (this.modelo == null)
            return "Um carro";
        if (this.cor == null)
            return "Um "+this.modelo;
        else
            return "Um "+this.modelo+" Na cor "+this.cor;
    }
    public void abastecer(int quanto){
        this.gasolina = this.gasolina + quanto;
        if(this.gasolina >= this.max_gasolina)
            this.gasolina = this.max_gasolina;
    }
    
}

    

