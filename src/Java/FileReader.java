package Java;

import java.io.File;
import java.net.URL;

/**
 * Reads in files
 */
public class FileReader {

    public File getFile(){
        URL url = getClass().getResource("data.txt");
        File file = new File(url.getPath());
        return file;
    }
}
