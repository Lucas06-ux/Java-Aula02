import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Criar um objeto tenis com os valores digitados pelo usuário
        //Exibir os valores que estão dentro do objeto

        Tenis nike = new Tenis();
        nike.cor = "Branco e preto ";
        nike.modelo = "Air Force";
        nike.preco = 750 ;
        nike.tamanho = 42;
        nike.disponivel = true;

        System.out.println(nike.cor);

        Tenis puma = new Tenis();
        puma.cor = "Preto";
        puma.modelo = "Puma Smash V2";
        puma.preco = 270;
        puma.tamanho = 40;
        puma.disponivel = true;

        System.out.println("Os tênis " + nike.modelo + " e o " + puma.modelo + " são os que temos disponíveis na loja!");



    }

}
