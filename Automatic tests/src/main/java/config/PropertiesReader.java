package config;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
public static String read(String property) {
    Properties prop = new Properties();
    FileInputStream fis = null;
    try{
        fis = new FileInputStream("src/test/resources/test.resources");
    } catch (FileNotFoundException e){
        e.printStackTrace();
    }
    try{
        prop.load(fis);
    }catch (IIOException e){
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    return prop.getProperty(property);
}
}
