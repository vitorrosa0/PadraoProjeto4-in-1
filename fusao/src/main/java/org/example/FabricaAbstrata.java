package org.example;

public interface FabricaAbstrata {

    Investimento createInvestimento(double valorBase);
    NivelConta createNivelConta();
}
