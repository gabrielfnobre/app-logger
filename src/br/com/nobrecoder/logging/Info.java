package br.com.nobrecoder.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Info {

	public static String showInfo() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date currentDate = new Date();
		String infoDate = dateFormat.format(currentDate); 
		return infoDate;
	}
	
}
