package service;






import dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Salvo com sucesso!";
    }

    @Override
    public String buscar(Long id) {
        return contratoDao.buscar(id);
    }

    @Override
    public boolean excluir(Long id) {
        return contratoDao.excluir(id);
    }

    @Override
    public boolean atualizar(Long id, String novoValor) {
        return contratoDao.atualizar(id, novoValor);
    }
}