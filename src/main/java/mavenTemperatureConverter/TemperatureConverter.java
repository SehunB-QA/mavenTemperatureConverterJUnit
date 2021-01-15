package mavenTemperatureConverter;

public class TemperatureConverter {
	
	 public float convertFahrenheitToCelsius(int fahrenheit) {
	        return (5 / 9) * (fahrenheit - 32);
	    }

	    //Changed to floats
	    public float convertCelsiusToFahrenheit(int celsius) {
	        return (float)  (9f / 5f) * (celsius) + 32f;
	    }

	    public float convertKelvinToCelsius(int kelvin) {
	        return (kelvin - 273);
	    }

	    public float convertCelsiusToKelvin(int celsius) {
	        return (celsius + 273);
	    }

	    //Changed to floats
	    public float convertKelvinToFahrenheit(int kelvin) {
	        return (float) (9f / 5f) * (kelvin - 273) + 32;
	    }

	    //Changed to floats
	    public float convertFahrenheitToKelvin(int fahrenheit) {
	        return (float) (5f / 9f) * (fahrenheit - 32f) + 273f;
	    }


}
