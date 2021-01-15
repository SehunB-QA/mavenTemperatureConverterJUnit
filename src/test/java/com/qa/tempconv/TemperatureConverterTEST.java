package com.qa.tempconv;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import mavenTemperatureConverter.TemperatureConverter;

public class TemperatureConverterTEST {
	
private TemperatureConverter tc;
	
	@Test
	public void testConvertFahrenheitToCelsius()
	{
	     tc = new TemperatureConverter();
		
		  
		    assertEquals(0, tc.convertFahrenheitToCelsius(32));
	}
	

	@Test
	public void testConvertCelsiusToFahrenheit()
	{
	     tc = new TemperatureConverter();
		
		  
		    assertEquals(86, tc.convertCelsiusToFahrenheit(30));
	}
	
	
	@Test
	public void testConvertKelvinToFahrenheit()
	{
	     tc = new TemperatureConverter();
		
		  
		    assertEquals(80.6f, tc.convertKelvinToFahrenheit(300));
	}
	
	@Test
	public void testConvertFahrenheitToKelvin()
	{
	     tc = new TemperatureConverter();
		
		  
		    assertEquals(268, tc.convertFahrenheitToKelvin(23));
	}
	
	
	
	
	
}
