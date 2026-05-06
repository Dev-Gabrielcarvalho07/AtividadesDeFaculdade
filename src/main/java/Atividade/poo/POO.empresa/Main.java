public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel", 9000, 1000);
        Engenheiro engenheiro = new Engenheiro("Lucas", 4000, 300);
        Estagiario estagiario = new Estagiario("Joao", 1510, 125);

        gerente.exibirInformacoes();
        engenheiro.exibirInformacoes();
        estagiario.exibirInformacoes();
    }
}
