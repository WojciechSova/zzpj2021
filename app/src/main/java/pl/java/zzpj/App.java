package pl.java.zzpj;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person();
        person.setName(getClientNameProperty());
        person.hello();
    }

    public static String getClientNameProperty() {
        Properties prop = new Properties();
        try (InputStream resourceAsStream = App.class.getClassLoader().getResourceAsStream("config.properties")) {
            prop.load(resourceAsStream);
        } catch (IOException e) {
            System.err.println("Unable to load properties file\n");
            e.printStackTrace();
        }
        return prop.getProperty("personName");
    }
}
