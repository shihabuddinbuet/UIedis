package com.ipv.su.uedis.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class KeyInfo implements Serializable{
	private static final long serialVersionUID = -3208825444205626486L;
	
	private String key;
	private String type;
	private String value;
	
	public KeyInfo() {
	}
	
	public KeyInfo(String key, String type, String value) {
		super();
		this.key = key;
		this.type = type;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
