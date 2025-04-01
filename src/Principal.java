import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Criar um objeto tenis com os valores digitados pelo usuário
        //Exibir os valores que estão dentro do objeto

        Scanner leitor = new Scanner(System.in);

        //Criar um objeto tenis com os valores digitados pelo usuário
        System.out.println("Digite o modelo do tenis");
        String modelo = leitor.next() + leitor.nextLine(); //Le a string com mais de 1 palavra

        System.out.println("Digite a cor");
        String cor = leitor.next() + leitor.nextLine();

        System.out.println("Digite o tamanho do tenis");
        int tamanho = leitor.nextInt();

        System.out.println("Digite o valor");
        double valor = leitor.nextDouble();

        System.out.println("Está disponível? true/false");
        boolean disponivel = leitor.nextBoolean();

        //Ler as informações da marca
        //Criar o objeto marca
        //Atribuir os valores ao objeto

        System.out.println("Digite o nome da marca");
        String nome = leitor.next() + leitor.nextLine();


        System.out.println("Escreva a logo");
        String logo = leitor.next();


        Marca marca1 = new Marca();
        marca1.nome = nome;
        marca1.logo = logo;

        Tenis tenis1 = new Tenis();
        tenis1.cor = cor;
        tenis1.modelo = modelo;
        tenis1.valor = valor ;
        tenis1.tamanho = tamanho;
        tenis1.disponivel = disponivel;
        tenis1.marca = marca1;


        System.out.println("Modelo: " + tenis1.modelo);
        System.out.println("Cor: " + tenis1.cor);
        System.out.println("Disponível: " + tenis1.disponivel);
        System.out.println("Tamanho: " + tenis1.tamanho);
        System.out.println("Preço: " + tenis1.valor);
        //Exibir dados da marca (através do objeto tenis)
        System.out.println("Marca: " + tenis1.marca.nome);
        System.out.println("Logo: " + tenis1.marca.logo);

        //Chamar (invocar) o método para aumentar o valor do tenis em 15

        tenis1.aumentarPreco(15);

        //Exibir o valor atualizado do tenis

        System.out.println("Valor atualizado: " + tenis1.valor);

        //Chamar o método para calcular o preço com desconto

        double desconto = tenis1.aplicarDesconto(50);
        System.out.println("Tenis com desconto: " + desconto);

    }

}
