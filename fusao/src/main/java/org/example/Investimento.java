package org.example;

public abstract class Investimento {

    private NivelConta nivelConta;

    private double investimentoBase;

    public Investimento(double investimentoBase, NivelConta nivelConta) {
        this.investimentoBase = investimentoBase;
        this.nivelConta = nivelConta;
    }

    public NivelConta getNivelConta() {
        return nivelConta;
    }

    public void setNivelConta(NivelConta nivelConta) {
        this.nivelConta = nivelConta;
    }

    public double getInvestimentoBase() {
        return investimentoBase;
    }

    public void setInvestimentoBase(double investimentoBase) {
        this.investimentoBase = investimentoBase;
    }

    public abstract double calcularRendimentoTotal();
}
