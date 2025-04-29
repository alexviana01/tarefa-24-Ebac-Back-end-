



import dao.ContratoDaoMock;
import service.ContratoService;

public class Main {
    public static void main(String[] args) {
        ContratoService contratoService = new ContratoService(new ContratoDaoMock());

        // Teste rápido no main
        System.out.println(contratoService.salvar());
        System.out.println(contratoService.buscar(1L));
        System.out.println(contratoService.atualizar(1L, "Atualização Exemplo"));
        System.out.println(contratoService.excluir(1L));
    }
}