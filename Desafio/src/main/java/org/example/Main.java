package org.example;

import org.example.domain.IPhone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        IPhone iPhone = new IPhone();
        iPhone.adicionarNovaAba();
        iPhone.atender();
        iPhone.atualizarPagina();
        iPhone.ligar("81xxxx-xxxx");
    }
}