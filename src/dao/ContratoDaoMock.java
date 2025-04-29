package dao;




public class ContratoDaoMock implements IContratoDao {
    @Override
    public void salvar() {
        // Simula operação de sucesso sem exceção
    }
    @Override
    public String buscar(Long id) {
        return "Contrato " + id;
    }
    @Override
    public boolean excluir(Long id) {
        return true;
    }
    @Override
    public boolean atualizar(Long id, String novoValor) {
        return true;
    }
}