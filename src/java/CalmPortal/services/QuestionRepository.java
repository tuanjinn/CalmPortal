/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalmPortal.services;

import CalmPortal.model.Question;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jinn
 */
public class QuestionRepository {
    public List<Question> GetQuestion()
    {
        List<Question> questions = new ArrayList<Question>();
        questions.add(new Question(1, "Your boss"));
        questions.add(new Question(2, "Your girl friend"));
        questions.add(new Question(3, "Your work"));
        questions.add(new Question(4, "Family"));
        
        return questions;
    }
}
