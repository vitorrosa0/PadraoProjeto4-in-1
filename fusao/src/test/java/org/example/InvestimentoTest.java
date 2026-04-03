package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestimentoTest {

    @Test
    void deveCalcularRendimentoComFabricaOuro() {
        FabricaAbstrata fabricaAbstrata = new FabricaOuro();
        Investimento investimento = fabricaAbstrata.createInvestimento(100.0);
        assertEquals(180.0, investimento.calcularRendimentoTotal());
    }
    @Test
    void deveCalcularRendimentoComFabricaPrata() {
        FabricaAbstrata fabricaAbstrata = new FabricaPrata();
        Investimento investimento = fabricaAbstrata.createInvestimento(100.0);
        assertEquals(100.0, investimento.calcularRendimentoTotal());
    }
    @Test
    void deveCalcularRendimentoComFabricaPlatinum() {
        FabricaAbstrata fabricaAbstrata = new FabricaPlatinum();
        Investimento investimento = fabricaAbstrata.createInvestimento(100.0);
        assertEquals(253.0, investimento.calcularRendimentoTotal());
    }
}