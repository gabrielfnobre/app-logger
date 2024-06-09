package br.com.nobrecoder.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Esta classe possuí um método que captura a data atual e retorna uma string com data e hora!
 * */

public class Info {

	public static String showInfo() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date currentDate = new Date();
		String infoDate = dateFormat.format(currentDate); 
		return infoDate;
	}
	
}
