package pacote;

import java.util.List;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Principal {
	public static void main(String[] args) throws Exception {

//		URLReader reader = new URLReader();
//		List<String> lista = reader.lerUrl();

		/*As fun��es abaixo s�o fun��es lambda
		 *Declara se um parametro "e" para cada item da lista e passe
		 *para um determinado trecho de c�digo
		 *Tal coisa era feita anteriormente feita com classe anonima
		 */

		ArquivoReader reader = new ArquivoReader();
		List<String> lista = reader.lerArquivo();

		//lista.forEach(e -> System.out.println(e));
		//System.out.println(getProduto(lista));

//		lista.forEach(e -> {
//			System.out.println(e);
//		});
//
//		lista.forEach(System.out::println);

		ProdutoParser parser = new ProdutoParser();
		List<Produto> listaPrd = parser.getProduto(lista);

		listaPrd.forEach(e -> {
			System.out.println("ID: "+e.getId());
			System.out.println("Descri��o: "+e.getDescricao());
			System.out.println("Pre�o: R$"+e.getPreco());
		});

	}
}
