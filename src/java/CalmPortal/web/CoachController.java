package CalmPortal.web;

import CalmPortal.model.Question;
import CalmPortal.services.QuestionRepository;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author tuanjinn
 */

@Controller
public class CoachController {
    
    @RequestMapping(value="/coach/index.htm")
    public String index(ModelMap model){
        QuestionRepository quesRepo = new QuestionRepository();
        List<Question> questions = quesRepo.GetQuestion();
        model.addAttribute("questions", questions);
        return "Coach/index";
    }
}
