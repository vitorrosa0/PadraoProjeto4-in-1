package org.example;

public class ContaFactory {

    private ContaFactory(){}

    private static class Holder {
        private static final ContaFactory INSTANCIA = new ContaFactory();
    }

    public static ContaFactory getInstancia() {
        return Holder.INSTANCIA;
    }

    public NivelConta obterConta(String conta) {

        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("org.example.Conta" + conta);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Conta inexistente");
        }

        if (!(objeto instanceof NivelConta)) {
            throw new IllegalArgumentException("Conta inválida");
        }

        return (NivelConta) objeto;
    }
}
