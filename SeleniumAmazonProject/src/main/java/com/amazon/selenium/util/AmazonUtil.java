package com.amazon.selenium.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AmazonUtil {
	
	public static String getUniqueValue() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateFormat.format(Calendar.getInstance().getTime());
	}

}
