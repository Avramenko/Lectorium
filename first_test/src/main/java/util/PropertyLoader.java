package util;

import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

    private static final String GENERAL_PROP_FILE = "/general.properties";
    private static final String NO_GUI_RUN = "/no_gui.properties";

    public static String loadProperty(String name){
        Properties props = new Properties();
        try{
            props.load(PropertyLoader.class.getResourceAsStream(GENERAL_PROP_FILE));
            props.load(PropertyLoader.class.getResourceAsStream(NO_GUI_RUN));

        } catch (IOException e){
            e.printStackTrace();
        }

        String httpLoginPage = props.getProperty("environment.login");
        String turnOnHeadlessMode = props.getProperty("headless.value");

        if (name != null) {
            httpLoginPage = props.getProperty(name);
            turnOnHeadlessMode = props.getProperty(name);
        }
        return httpLoginPage;



    }
}
