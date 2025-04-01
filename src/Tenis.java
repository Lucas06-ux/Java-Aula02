public class Tenis {
    String cor;
    String modelo;
    int tamanho;
    double valor;
    boolean disponivel;

    //Atributo de referencia (outra classse que iremos criar)

    Marca marca;


    //Métodos
    //Metodo para aumentar preço do tenis em porcentagem (10,20)
    void aumentarPreco(float porcentagem){
        valor += valor * porcentagem/100;

    }

    double aplicarDesconto(float porcentagem){

        double  valorComDesconto;
        valorComDesconto = valor - valor*porcentagem/100;
        return valorComDesconto;

    }

}
