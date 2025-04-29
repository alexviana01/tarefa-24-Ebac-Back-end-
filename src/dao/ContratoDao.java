package dao;



public class ContratoDao implements IContratoDao {
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }
    @Override
    public String buscar(Long id) {
        throw new UnsupportedOperationException("Busca não implementada");
    }
    @Override
    public boolean excluir(Long id) {
        throw new UnsupportedOperationException("Exclusão não implementada");
    }
    @Override
    public boolean atualizar(Long id, String novoValor) {
        throw new UnsupportedOperationException("Atualização não implementada");
    }
}