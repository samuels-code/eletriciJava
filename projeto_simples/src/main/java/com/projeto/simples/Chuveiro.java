package com.projeto.simples;

public class Chuveiro extends Eletros implements IEletros{
    private int potencia;

    
    public Chuveiro(String nome, String cor, String marca, String modelo, String disjuntor, int tensao, double preco,
            double fio, int potencia) {
        super(nome, cor, marca, modelo, disjuntor, tensao, preco, fio);
        this.potencia = potencia;
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getPotencia() {
        return potencia;
    }
    @Override
    public void verInfo() {
        System.out.println("As informacoes do modelo indicado e: ");
        System.out.println("Nome: "+ getNome() + ", cor: " + getCor() + ", marca: " 
                            + getMarca() +"\n"+ "modelo: " + getModelo() + ", Disjuntor " + getDisjuntor()
                            + ", tensao: " +getTensao() +"\n"+  "preco: " + getPreco() +  ", fio " + getFio() 
                            + ", potencia: " + getPotencia());
        
    }

    
}
