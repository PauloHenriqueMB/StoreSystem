/*
 *
 * http://pt.stackoverflow.com/questions/269/quais-as-vantagens-das-express%C3%B5es-lambda-presentes-no-java-8
 *
 *
 */

package pacote;

import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class URLReader {

	public static final String URL = "http://www.master10.com.py/lista-txt";

	public List<String> lerUrl(){

		List<String> lista = new ArrayList<String>();

		try {

			URL oracle = new URL(URL);

			try(BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()))){
				String inputLine;
				while ((inputLine = in.readLine()) != null){
					lista.add(inputLine);
				}
			}

		} catch (IOException e) {
			throw new RuntimeException("Deu errado sa porra ",e);//Retorna uma runtimeexception
			//caso dê algum erro/exessão na execução do código
		}
		return lista;
	}

}
