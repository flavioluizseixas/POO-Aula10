package app;

import br.com.despesas.*;

public class App {
    public static void main(String[] args) throws Exception {

        RegistraDespesa r = new RegistraDespesa("123456");

        r.adicionaDespesa(new DespesaMes(4, 10000));
        r.adicionaDespesa(new DespesaDia(10, 4, 500));
        r.adicionaDespesa(new DespesaDia(15, 4, 700));
        r.adicionaDespesa(new DespesaDia(1, 5, 50000));

        System.out.println(r.totalizaDespesaMes(5).getValor());
        
    }
}