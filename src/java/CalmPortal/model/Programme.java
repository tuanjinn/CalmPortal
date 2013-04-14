
package CalmPortal.model;

/**
 *
 * @author tuanjinn
 */
public class Programme {
    private int programmeId;
    private String title;
    private String shortDescription;
    private String description;
    private String fullText;

    public Programme(int programmeId, String title, String shortDescription, String description) {
        this.programmeId = programmeId;
        this.title = title;
        this.shortDescription = shortDescription;
        this.description = "Modern life is full of hassles, deadlines, frustrations, and demands. For many people, stress is so commonplace that it has become a way of life. Stress isn’t always bad. In small doses, it can help you perform under pressure and motivate you to do your best. But when you’re constantly running in emergency mode, your mind and body pay the price. You can protect yourself by recognizing the signs and symptoms of stress and taking steps to reduce its harmful effects";
    }
    
    

    public int getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(int programmeId) {
        this.programmeId = programmeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    
    
   
    
    
}
