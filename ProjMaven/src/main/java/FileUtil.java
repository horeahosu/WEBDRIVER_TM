import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;


public class FileUtil {

        Properties props;

        public void loadProps(String filePath) {

                try {
                        if (props == null) {
                                props = new Properties();
                        }
                        FileInputStream fis = new FileInputStream(filePath);
                        props.load(new InputStreamReader(fis, "ISO-8859-1"));
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        public String getProps(String key) {

                return props.getProperty(key);
        }

        public void storeProps(String key, String value, String filePath) {

                props.put(key, value);
                try {
                        props.store(new FileOutputStream(filePath), null);
                } catch (IOException e) {
                        e.printStackTrace();
                }

        }
}