package dao;


public interface IContratoDao {
    void salvar();
    String buscar(Long id);
    boolean excluir(Long id);
    boolean atualizar(Long id, String novoValor);
}