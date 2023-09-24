package testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config implements Props {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream input = new FileInputStream("src/main/resources/test.properties");
            properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String URL() {
        return properties.getProperty("url");
    }
}
