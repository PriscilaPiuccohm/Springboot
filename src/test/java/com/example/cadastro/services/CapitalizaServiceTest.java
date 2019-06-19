package com.example.cadastro.services;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CapitalizaServiceTest {

    @Before
    public void setup(){
        CapitalizaService capitalizaService = new CapitalizaService();
    }
    @Test
    public void capitalizarStringSimples() {

        String resultado = CapitalizaService.capitalizar("qualquer");

        assertEquals("Qualquer",resultado);
    }
    @Test
    public void capitalizarStringSimplesTudoMaiusculo(){
        String resultado = CapitalizaService.capitalizar("QUALQUER");
        assertEquals("Qualquer", resultado);
    }

    @Test
    public void capitalizarStringComposta() {

        String resultado = CapitalizaService.capitalizar("rick sanches");

        assertEquals("Rick Sanches",resultado);
    }
}