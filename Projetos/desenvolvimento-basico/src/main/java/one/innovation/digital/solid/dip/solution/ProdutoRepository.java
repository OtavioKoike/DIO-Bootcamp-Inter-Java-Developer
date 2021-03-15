package one.innovation.digital.solid.dip.solution;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private DbConnection dbConnection;

    public ProdutoRepository(DbConnection dbConnection){
        this.dbConnection = dbConnection;
    }

    public List<Produto> buscarProdutos(){
        //Retorn lista de produtos da base de dados
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto){
        //Salvar lista de produtos na base de dados
    }
}
