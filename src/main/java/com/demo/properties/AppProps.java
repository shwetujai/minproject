package com.demo.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="app1")
public class AppProps {
	private Map<String,String>massages=new HashMap<String,String>();
	public Map<String,String>getMessages(){
		return massages;
	}
	public void setMessages(Map<String,String>messages) {
		this.massages=messages;
		
	}
	

}
