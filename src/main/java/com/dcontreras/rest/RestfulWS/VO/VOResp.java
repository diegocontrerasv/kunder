package com.dcontreras.rest.RestfulWS.VO;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class VOResp {
	private String code;
	private String description;
	private String data;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	

}
