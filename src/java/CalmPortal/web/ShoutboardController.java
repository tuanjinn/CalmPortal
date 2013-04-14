
package CalmPortal.web;

import CalmPortal.model.Location;
import CalmPortal.model.Question;
import CalmPortal.model.Shout;
import CalmPortal.services.QuestionRepository;
import CalmPortal.services.ShoutboardRepository;
import CalmPortal.services.Utils;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Jinn (Duc Tuan Nguyen)
 */
@Controller
public class ShoutboardController extends BaseController {
    private String avaPath;
    
        
    @RequestMapping(value="/shoutboard/index.htm")
    protected String index(ModelMap model){
        ShoutboardRepository shoutRepo = new ShoutboardRepository();
        List<Shout> shouts = shoutRepo.GetShouts();
        model.addAttribute("shouts", shouts);
        return "Shoutboard/index";
    }
    
    @RequestMapping(value="/shoutboard/_shout.htm")
    protected String shout(ModelMap model, HttpServletRequest request, @RequestParam("msg") String msg, @RequestParam("shoutName") String shoutName)
    {
        RequestInit(request);
        Location loc = new Location(0, request.getParameter("countryName"), request.getParameter("countryCode"), 
                                    request.getParameter("cityName"), null, request.getParameter("ip"));
        
        ShoutboardRepository shoutRepo = new ShoutboardRepository();
        
        Shout shout = shoutRepo.CreateShout(shoutName, msg, getRandomAvatar(), loc);
        model.addAttribute(shout);
        return "Shoutboard/_shout";
    }
    
    
    public String getRandomAvatar()
    {
        return Utils.GetRandomFileOfFolder(this.avaPhyPath);
    }
}
