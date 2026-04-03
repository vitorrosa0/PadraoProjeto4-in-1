package org.example;

public class InvestimentoBase extends Investimento {

    public InvestimentoBase(double investimentoBase, NivelConta nivelConta) {
        super(investimentoBase, nivelConta);
    }

    public double calcularRendimentoTotal() {
        return getInvestimentoBase();
    }
}
