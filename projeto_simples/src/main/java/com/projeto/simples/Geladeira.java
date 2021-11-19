package com.projeto.simples;

public class Geladeira extends Eletros implements IEletros{

    
    public Geladeira(String nome, String cor, String marca, String modelo, String disjuntor, int tensao, double preco,
            double fio) {
        super(nome, cor, marca, modelo, disjuntor, tensao, preco, fio );
    }

    @Override
    public void verInfo() {
        System.out.println("As informacoes do modelo indicado e: ");
        System.out.println("Nome: "+ getNome() + ", cor: " + getCor() + ", marca: " 
                            + getMarca() +"\n"+ "modelo: " + getModelo() + ", Disjuntor " + getDisjuntor()
                            + ", tensao: " +getTensao() +"\n"+  "preco: " + getPreco() +  ", fio " + getFio());
        
    }

    
    
}
