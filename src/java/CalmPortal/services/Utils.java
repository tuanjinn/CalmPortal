package CalmPortal.services;

import java.io.File;
import java.util.Random;

/**
 *
 * @author tuanjinn
 */
public class Utils {

    public static String GetRandomFileOfFolder(String path)
    {
        String[] files = LoadFileNamesOfFolder(path);
        if(files != null && files.length > 0)
        {
            Random generator = new Random(files.length);
            int ranIndex = generator.nextInt(files.length-1);
            return files[ranIndex];
        }
        return null;
    }
    
    public static String[] LoadFileNamesOfFolder(String path)
    {
        File dir = new File(path);

        String[] children = dir.list();
        if (children == null) 
            // Either dir does not exist or is not a directory
            return null;
       
        return children; 
    }
}
