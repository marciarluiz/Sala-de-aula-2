package atividade03; 

public class main {

    public void main(String [] args) {

        carro carro1 = new carro();
        carro1.modelo = "Civic";
        carro1.cor = "Preto";
        carro1.ano = 2020;
    

        carro carro2 = new carro();
        carro2.modelo = "Corolla";
        carro2.cor = "Branco";
        carro2.ano = 2021;

        carro1.exibirinformacoes(); 

        carro2.exibirinformacoes();

        





    }
}