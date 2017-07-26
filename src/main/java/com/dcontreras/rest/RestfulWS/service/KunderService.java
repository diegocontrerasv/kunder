package com.dcontreras.rest.RestfulWS.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.dcontreras.rest.RestfulWS.VO.VOResp;

public class KunderService {
	
	public VOResp checkWord(String data){
		VOResp respWord = new VOResp();
		if(data.length() == 4 && data.matches("[a-z]+")){
			respWord.setCode("00");
			respWord.setDescription("OK");	
			respWord.setData(data.toUpperCase());
		}

		return respWord;
	}
	
	public VOResp checkDate(String hora) throws ParseException{
		VOResp rsp = new VOResp();
			DateTime dt = new DateTime(DateTimeZone.UTC);
			String[] time = hora.split(":");
			String hour = time[0];
			String min = time[1];
			String sec = time[2];
			dt = dt.hourOfDay().setCopy(hour);
			dt = dt.minuteOfHour().setCopy(min);
			dt = dt.secondOfMinute().setCopy(sec);
			rsp.setCode("00");
			rsp.setDescription("OK");
			rsp.setData(dt.toString());

		return rsp;
		
	}

}
