package service;


public interface IContratoService {
    String salvar();
    String buscar(Long id);
    boolean excluir(Long id);
    boolean atualizar(Long id, String novoValor);
}