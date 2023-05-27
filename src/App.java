import java.sql.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setSalario(1000.0f);
        v.setCpf("23548796505");
        v.setDataNascimento(new Date(0));
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O salário do vendedor é:" + v.calcularSalario());

    }
}
