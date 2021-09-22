package br.com.company.CalculaImc;
import java.util.Scanner;
public class CalculaImc{
        public static void main(String[]args){
            Scanner teclado=new Scanner(System.in);
            Pessoa[] pessoa =new Pessoa[5];
            for(int i=0;i<5;i++){
                System.out.println("Digite o nome, peso e altura da "+i+1+"ª pessoa de quem deseja saber se o imc está correto");
                String[] entrada = teclado.nextLine().split(" ");
                double peso = Double.parseDouble(entrada[1]);
                double altura = Double.parseDouble(entrada[2]);
                pessoa[i]=new Pessoa(entrada[0],peso,altura);
            }
            StringBuilder pessoasNaoSaudaveis= new StringBuilder(" ");
            for (int i=0;i<5;i++){
                double imc = pessoa[i].getPeso()/(pessoa[i].getAltura()*pessoa[i].getAltura());
                if (imc<18.5 || imc>25){
                    pessoasNaoSaudaveis.append(pessoa[i].getNome()).append(" ");
                }
            }
            System.out.println("A lista de pessoas fora dos padrões do IMC é "+ pessoasNaoSaudaveis);
    }


}
