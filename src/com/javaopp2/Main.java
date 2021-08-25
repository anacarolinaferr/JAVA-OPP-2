package com.javaopp2;

import com.javaopp2.actions.Maratona;
import com.javaopp2.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Declara uma Array de pessoas
        List<Pessoa> pessoas = new ArrayList<>();

        //Cria Objetos do tipo Pessoa
        pessoas.add(new Pessoa("0124568", "Mauri", "Klein", "999888777", "44444444", "AB+",40));
        pessoas.add(new Pessoa("0124568", "Filipe", "Vaz", "999888777", "44444444", "AB+",18));
        pessoas.add(new Pessoa("0124568", "Joice", "Lima", "999888777", "44444444", "AB+",25));
        pessoas.add(new Pessoa("0124568", "Katia", "Pereira", "999888777", "44444444", "AB+",40));
        pessoas.add(new Pessoa("0124568", "Pedro", "Coelho", "999888777", "44444444", "AB+",36));
        pessoas.add(new Pessoa("0124568", "Carol", "Ferreira", "999888777", "44444444", "AB-",34));
        pessoas.add(new Pessoa("0124568", "Cássio", "Oliveira", "999888777", "44444444", "A",40));

        //Declara e Inicializa uma maratona;
        Maratona maratona = new Maratona();

        //adiciona pessoas a maratona.
        maratona.inscreveMaratonista("pequeno", pessoas.get(0));
        maratona.inscreveMaratonista("pequeno", pessoas.get(1));
        maratona.inscreveMaratonista("pequeno", pessoas.get(2));
        maratona.inscreveMaratonista("pequeno", pessoas.get(3));
        maratona.inscreveMaratonista("médio", pessoas.get(4));
        maratona.inscreveMaratonista("grande", pessoas.get(5));
        maratona.inscreveMaratonista("grande", pessoas.get(6));

        //mostra a lista de inscritos
        maratona.mostraListaPorCategoria("pequeno");

        //mostra a lista de inscritos
        maratona.mostraListaPorCategoria("médio");

        //mostra a lista de inscritos
        maratona.mostraListaPorCategoria("grande");

        //remove pessoa de uma determinada categoria
        maratona.cancelaInscricao("pequeno", 1);

        //remove pessoa de uma determinada categoria
        maratona.cancelaInscricao("grande", 6);

        //mostra a lista de inscritos depois da remoção
        maratona.mostraListaPorCategoria("médio");

        //mostra a lista de inscritos depois da remoção
        maratona.mostraListaPorCategoria("grande");

    }
}
