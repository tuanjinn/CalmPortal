/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalmPortal.model;

/**
 *
 * @author tuanjinn
 */
public class Fact {
    private int factId;
    private String description;

    public int getFactId() {
        return factId;
    }

    public void setFactId(int factId) {
        this.factId = factId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Fact(int factId, String description) {
        this.factId = factId;
        this.description = description;
    }
    
    
}
