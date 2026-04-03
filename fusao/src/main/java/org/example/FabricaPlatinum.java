package org.example;

public class FabricaPlatinum implements FabricaAbstrata {

    private static final double TAXA_BONUS_PADRAO = 0.15;

    public Investimento createInvestimento(double valorBase) {
        return new InvestimentoFundoImobiliario(valorBase, createNivelConta(), TAXA_BONUS_PADRAO);
    }

    public NivelConta createNivelConta() {
        return ContaFactory.getInstancia().obterConta("Platinum");
    }
}
