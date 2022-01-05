package com.clinic.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
	
	public String ConvertDateToString(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = dateFormat.format(date);
		return strDate;
	}

	public void showTheDate(){
		System.out.println("ngay gio");
	}
}
