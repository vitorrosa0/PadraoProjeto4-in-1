package org.example;

public class InvestimentoCdb extends Investimento {

    public InvestimentoCdb(double investimenBase, NivelConta nivelConta) {
        super(investimenBase, nivelConta);
    }

    public double calcularRendimentoTotal() {
        return getInvestimentoBase() * (1 + getNivelConta().taxaRendimento());
    }
}
