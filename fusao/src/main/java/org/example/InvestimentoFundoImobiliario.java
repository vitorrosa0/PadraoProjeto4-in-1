package org.example;

public class InvestimentoFundoImobiliario extends Investimento {

    private double taxaBonus;

    public InvestimentoFundoImobiliario(double investimentoBase, NivelConta nivelConta, double taxaBonus) {
        super(investimentoBase, nivelConta);
        this.taxaBonus = taxaBonus;
    }

    public void setTaxaBonus(double taxaBonus) {
        this.taxaBonus = taxaBonus;
    }

    public double calcularRendimentoTotal() {
        return getInvestimentoBase() * (1 + this.taxaBonus) * (1 + getNivelConta().taxaRendimento());
    }
}
