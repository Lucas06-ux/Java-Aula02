import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Criar um objeto tenis com os valores digitados pelo usuário
        //Exibir os valores que estão dentro do objeto

        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo! Por favor, escreva o modelo do tênis que você deseja ");
        String modelo = leitor.next();

        System.out.println("Qual a cor que você deseja?");
        String cor= leitor.next();

        System.out.println("Que tamanho você precisa?");
        int tamanho = leitor.nextInt();

        System.out.println("Diga o valor do tênis");
        double preco = leitor.nextDouble();
        System.out.println("Ele ainda está disponível?");
        boolean disponivel= leitor.nextBoolean();

        System.out.println("O tênis " + modelo + " da cor " +cor+ " com o tamanho " + tamanho + " está cadastrado, no valor de R$" + preco + " e " +disponivel );
        

    }

}
