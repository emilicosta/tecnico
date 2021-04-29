package sample model;

import sample.controller.Tabuleiro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> nomes =
                new ArrayList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Pedro");
        nomes.add("Rafael");
        nomes.add("Marcia");
        nomes.add("Laura");
        nomes.add("Jhow");

        Tabuleiro tabuleiro =
                new Tabuleiro(nomes);

        tabuleiro.jogar();
        System.out.println(tabuleiro);

    }
}
