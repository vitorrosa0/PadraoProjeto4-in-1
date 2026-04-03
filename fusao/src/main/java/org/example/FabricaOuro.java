package org.example;

public class FabricaOuro implements FabricaAbstrata {

    public Investimento createInvestimento(double valorBase) {
        return new InvestimentoCdb(valorBase, createNivelConta());
    }

    public NivelConta createNivelConta() {
        return ContaFactory.getInstancia().obterConta("Ouro");
    }
}
