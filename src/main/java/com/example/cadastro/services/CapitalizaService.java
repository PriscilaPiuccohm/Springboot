package com.example.cadastro.services;

import org.springframework.stereotype.Service;

@Service
public class CapitalizaService {

    public static String capitalizar(String nome) {

        String[] partes = nome.split(" ");

        for (int i = 0; i < partes.length; i++) {

            String primeiraLetra = partes[i].substring(0, 1).toUpperCase();
            String restanteDaString = partes[i].substring(1).toLowerCase();

            partes[i] = primeiraLetra + restanteDaString;
        }

        return String.join(" ", partes);
    }


}


