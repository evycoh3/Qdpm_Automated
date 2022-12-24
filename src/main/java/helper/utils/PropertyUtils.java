package helper.utils;

import helper.constants.FrameworkConstants;
import helper.enums.ConfigProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class PropertyUtils {
    private static Map<String,String> CONFIGMAP=new HashMap<>();
    private PropertyUtils(){

    }
    static{
        try {
            FileInputStream fis=new FileInputStream(FrameworkConstants.getPropertyFilePath());
            Properties pro=new Properties();
            pro.load(fis);
            for(Object key:pro.keySet()){
                CONFIGMAP.put(String.valueOf(key),String.valueOf(pro.get(key)));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String get(ConfigProperties key){
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))){
            throw new RuntimeException("Property name "+key+" Is not found");
        }
        return CONFIGMAP.get(key.name().toLowerCase());
    }

}
