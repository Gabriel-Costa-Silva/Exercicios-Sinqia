package br.com.company.CalculaIdade;
import java.util.Scanner;

public class leMaiorMenorMediaPOO {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        Pessoa[] pessoa =new Pessoa[5];
        for(int i=0;i<5;i++){
            String[] entrada = teclado.nextLine().split(" ");
            int idade = Integer.parseInt(entrada[1]);
            pessoa[i]=new Pessoa(entrada[0],idade);
        }
        int idadeMaisVelho=pessoa[0].getIdade();
        int idadeMaisNovo=pessoa[0].getIdade();
        String maisVelho=pessoa[0].getNome();
        String maisNovo=pessoa[0].getNome();
        double soma=0;
        for (int i=0;i<5;i++){
            if (pessoa[i].getIdade()<idadeMaisNovo){
                maisNovo=pessoa[i].getNome();
                idadeMaisNovo=pessoa[i].getIdade();
            }
            if (pessoa[i].getIdade()>idadeMaisVelho){
                maisVelho=pessoa[i].getNome();
                idadeMaisVelho=pessoa[i].getIdade();
            }
            soma+=pessoa[i].getIdade();
        }
        System.out.printf("A pessoa mais velha é %s, com %d anos\n",maisVelho,idadeMaisVelho);
        System.out.printf("A pessoa mais nova é %s, com %d anos\n",maisNovo,idadeMaisNovo);
        System.out.printf("A media de idade é %.2f",soma/5);

    }

}

