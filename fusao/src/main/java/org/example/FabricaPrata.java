package org.example;

public class FabricaPrata implements FabricaAbstrata {

    public Investimento createInvestimento(double valorBase) {
        return new InvestimentoBase(valorBase, createNivelConta());
    }

    public NivelConta createNivelConta() {
        return ContaFactory.getInstancia().obterConta("Prata");
    }
}
