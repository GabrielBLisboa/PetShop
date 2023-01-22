package Endereco;

public class Endereco {
    public Endereco(String rua, String bairro, String complemento, int numero, String cep, String cidade, String estado) {
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    String rua;
    String bairro;
    String complemento;
    int numero;
    String cep;
    String cidade;
    String estado;

    public static Endereco retornaEndereco(int codCliente){
        Endereco enderecoTemporario = null;
        Endereco endereco1 = new Endereco("Rua Xablablau", "Diomedes", "apto 101",
                54, "0777-088", "Campininha", "São Paulo");
        Endereco endereco2 = new Endereco("Rua Geninho", "Diomedes", "",
                76, "0888-099", "Campininha", "São Paulo");
        switch (codCliente){
            case 101 -> enderecoTemporario = endereco1;
            case 102 -> enderecoTemporario = endereco2;
        }
        return enderecoTemporario;
    }
    public static Endereco retornaEndPetShop(){
        Endereco enderecoTemporario = new Endereco("Rua Xablablau", "Diomedes", "",
                32, "0777-088", "Campininha", "São Paulo");
        return enderecoTemporario;
    }
}
