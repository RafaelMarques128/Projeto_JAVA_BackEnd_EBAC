package tarefa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando uma ArrayList genérica para carros de várias marcas
        ArrayList<Carro<?>> listaDeCarros = new ArrayList<>();

        // Adicionando um carro da marca Ford
        Ford fordMustang = new Ford("Mustang");
        Carro<Ford> carroFord = new Carro<>(fordMustang);
        listaDeCarros.add(carroFord);

        // Adicionando um carro da marca Toyota
        Toyota toyotaCorolla = new Toyota("Corolla");
        Carro<Toyota> carroToyota = new Carro<>(toyotaCorolla);
        listaDeCarros.add(carroToyota);

        // Exibindo os carros na lista
        for (Carro<?> carro : listaDeCarros) {
            System.out.println(carro);
        }
    }
}