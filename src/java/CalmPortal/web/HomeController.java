/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CalmPortal.web;
import java.io.File;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author Jinn
 */

@Controller
public class HomeController extends BaseController {

    private final String defaultBgThumbPath = "C:\\Program Files\\Apache Software Foundation\\Tomcat 6.0\\webapps\\CalmPortal\\images\\bg\\thumbs";
    private final String defaultBgPath = "C:\\Program Files\\Apache Software Foundation\\Tomcat 6.0\\webapps\\CalmPortal\\images\\bg";
    
    @RequestMapping(value="/home/index.htm")
    public String index(ModelMap model, HttpServletRequest request)
    {
        String[] thumbs = LoadThumbnailImages();
        model.addAttribute("thumbs", thumbs);
        
        String bgImg = GetRandomFileOfFolder(defaultBgPath);
        model.addAttribute("bgImg", bgImg);
        return "Home/index";
    }
    
    @RequestMapping(value="/home/login.htm")
    public String login(ModelMap model, HttpServletRequest request)
    {
        return "Home/login";
    }
    
    @RequestMapping(value="/home/agent.htm", method=RequestMethod.GET)
    public String agent(ModelMap model, HttpServletRequest request)
    {
        return "Home/agent";
    }
    
    @RequestMapping(value="/home/_getrandombgimg.htm", method=RequestMethod.GET)
    public @ResponseBody String GetRandomBgImage() //@RequestParam String prefImg)
    {
        return GetRandomFileOfFolder(defaultBgPath);
    }
    
    public String[] LoadThumbnailImages()
    {
        return LoadFileNamesOfFolder(defaultBgThumbPath); 
    }
    
    public String GetRandomFileOfFolder(String path)
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
    
    public String[] LoadFileNamesOfFolder(String path)
    {
        File dir = new File(path);

        String[] children = dir.list();
        if (children == null) 
            // Either dir does not exist or is not a directory
            return null;
       
        return children; 
    }
    


}
