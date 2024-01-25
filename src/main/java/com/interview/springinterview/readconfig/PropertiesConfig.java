package com.interview.springinterview.readconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class PropertiesConfig {
	@Value( "${prop11}" )
	private String prop1;
	@Value( "${prop22}" )
	private String prop2;
	public String getProp1() {
		return prop1;
	}
	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}
	public String getProp2() {
		return prop2;
	}
	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}
	@Override
	public String toString() {
		return "PropertiesConfig [prop1=" + prop1 + ", prop2=" + prop2 + "]";
	}
	
	
	
}
