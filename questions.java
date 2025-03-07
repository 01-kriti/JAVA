class temperature {
    public double convert(double celsius) 
    {
        return (celsius * 9/5) + 32;
    }

    public double convertCelsiusToKelvin(double celsius) 
    {
        return celsius + 273.15;
    }

    public double convertFahrenheitToCelsius(double fahrenheit, boolean isFahrenheit) 
    {
        if (isFahrenheit) 
        {
            return (fahrenheit - 32) * 5/9;
        } 
        else 
        {
            return fahrenheit;
        }
    }

    public double convertFahrenheitToKelvin(double fahrenheit) 
    {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public double convertKelvinToCelsius(double kelvin) 
    {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public double convertKelvinToFahrenheit(double kelvin) 
    {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        temperature converter = new temperature();

        System.out.println("Celsius to Fahrenheit: " + converter.convert(25));
        System.out.println("Celsius to Kelvin: " + converter.convertCelsiusToKelvin(25));
        System.out.println("Fahrenheit to Celsius: " + converter.convertFahrenheitToCelsius(77, true));
        System.out.println("Fahrenheit to Kelvin: " + converter.convertFahrenheitToKelvin(77));
        System.out.println("Kelvin to Celsius: " + converter.convert(300));
        System.out.println("Kelvin to Fahrenheit: " + converter.convertKelvinToFahrenheit(300));
    }
}