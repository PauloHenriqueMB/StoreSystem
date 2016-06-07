package pacote;

import java.util.List;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Principal {
	public static void main(String[] args) throws Exception {

//		URLReader reader = new URLReader();
//		List<String> lista = reader.lerUrl();

		/*As funções abaixo são funções lambda
		 *Declara se um parametro "e" para cada item da lista e passe
		 *para um determinado trecho de código
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
			System.out.println("Descrição: "+e.getDescricao());
			System.out.println("Preço: R$"+e.getPreco());
		});

	}
}
