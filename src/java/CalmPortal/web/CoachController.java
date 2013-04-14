package CalmPortal.web;

import CalmPortal.model.Programme;
import CalmPortal.model.Question;
import CalmPortal.services.CoachRepository;
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
        CoachRepository coachRepo = new CoachRepository();
        List<Programme> programmes = coachRepo.getProgrammes();
        model.addAttribute("programmes", programmes);
        return "Coach/index";
    }
    
    @RequestMapping(value="/coach/questions.htm")
    public String questions(ModelMap model){
        QuestionRepository quesRepo = new QuestionRepository();
        List<Question> questions = quesRepo.GetQuestions();
        model.addAttribute("questions", questions);
        return "Coach/questions";
    }
}
