
package CalmPortal.web;

import CalmPortal.model.Question;
import CalmPortal.model.Shout;
import CalmPortal.services.QuestionRepository;
import CalmPortal.services.ShoutboardRepository;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jinn (Duc Tuan Nguyen)
 */
@Controller
public class ShoutboardController extends BaseController {
    
    
    @RequestMapping(value="/shoutboard/index.htm")
    protected String index(ModelMap model){
        ShoutboardRepository shoutRepo = new ShoutboardRepository();
        List<Shout> shouts = shoutRepo.GetShouts();
        model.addAttribute("shouts", shouts);
        return "Shoutboard/index";
    }
    
    
    
    @RequestMapping(value="/shoutboard/question.htm")
    public String question(ModelMap model){
        QuestionRepository quesRepo = new QuestionRepository();
        List<Question> questions = quesRepo.GetQuestion();
        model.addAttribute("questions", questions);
        return "Shoutboard/index";
    }
    
    
}
