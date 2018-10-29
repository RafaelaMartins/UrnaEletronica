/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central.org.com;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hera
 */
public class Json {
    JSONObject jsonObject;
	//Cria o parse de tratamento
	JSONParser parser = new JSONParser();
	//Variaveis que irao armazenar os dados do arquivo JSON

	public PartidoPolitico getJsonPartido(String entrada, PartidoPolitico partido){

		try {
			//Salva no objeto JSONObject o que o parse tratou do arquivo
			jsonObject = (JSONObject) parser.parse(new FileReader(
					entrada));

			//Salva nas variaveis os dados retirados do arquivo
			partido.setNome((String) jsonObject.get("nome"));
			partido.setNumero(Integer.parseInt((String) jsonObject.get("numero")));
			
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException ex) {
            Logger.getLogger(Json.class.getName()).log(Level.SEVERE, null, ex);
        }
		//Trata as exceptions que podem ser lançadas no decorrer do processo
		
		
		return partido;
	}

}
