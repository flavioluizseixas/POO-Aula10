package br.com.despesas;

/**
 * TotalizaDespesa
 */
public class RegistraDespesa {

    private Despesa despesa[] = new Despesa[100];
    private int ultimaPosicao = 0;
    private String cpf;

    public RegistraDespesa(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void adicionaDespesa(Despesa d) {
        this.despesa[ultimaPosicao] = d;
        this.ultimaPosicao++;
    }

    public DespesaMes totalizaDespesaMes(int mes) {
        double total = 0;

        int i = 0;
        while(this.despesa[i] != null) {

            if(this.despesa[i].getMes() == mes) {
                total += this.despesa[i].getValor();
            }

            i++;
        }
        
        return new DespesaMes(mes, total);
    }
}