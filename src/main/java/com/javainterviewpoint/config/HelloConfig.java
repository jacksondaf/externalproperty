package com.javainterviewpoint.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:global.properties")
public class HelloConfig
{
	@Value("${property1}")
	private String property1;

	public String getProperty1()
	{
		return property1;
	}

	public void setProperty1(String property1)
	{
		this.property1 = property1;
	}
}
