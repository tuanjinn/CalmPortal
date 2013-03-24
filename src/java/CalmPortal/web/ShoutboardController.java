/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalmPortal.web;

import CalmPortal.model.Question;
import CalmPortal.services.QuestionRepository;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jinn
 */
@Controller
public class ShoutboardController extends BaseController {
    
    
    @RequestMapping(value="/shoutboard/index.htm")
    protected String index(ModelMap model){
        QuestionRepository quesRepo = new QuestionRepository();
        List<Question> questions = quesRepo.GetQuestion();
        model.addAttribute("questions", questions);
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
