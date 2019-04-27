package br.com.despesas;

/**
 * DespesaMes
 */
public class DespesaMes implements Despesa {

    private int mes;
    private double valor;

    public DespesaMes(int mes, double valor) {
        this.mes = mes;
        this.valor = valor;
    }

    public int getMes() {
        return this.mes;
    }

    public double getValor() {
        return this.valor;
    }
}
