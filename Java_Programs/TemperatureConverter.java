
    import java.util.Scanner;

    public class TemperatureConverter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
    
            double fahrenheit = celsiusToFahrenheit(celsius);
    
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
    
        public static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
    }
       

