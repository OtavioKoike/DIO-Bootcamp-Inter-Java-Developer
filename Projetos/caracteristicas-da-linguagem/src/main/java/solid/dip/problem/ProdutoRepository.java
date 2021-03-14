package solid.dip.problem;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private MySqlConnection mySqlConnection;

    public ProdutoRepository(){
        this.mySqlConnection = new MySqlConnection(); //RUIM Dependendo de classe, nao de interface
    }

    public List<Produto> buscarProdutos(){
        //Retorn lista de produtos da base de dados
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto){
        //Salvar lista de produtos na base de dados
    }
}
