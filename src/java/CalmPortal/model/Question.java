/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalmPortal.model;

/**
 *
 * @author Jinn
 */
public class Question {
    private int questionId;
    private String title;
    
    public Question(int id, String title)
    {
        this.questionId = id;
        this.title = title;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    

}
