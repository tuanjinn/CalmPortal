package CalmPortal.services;

import CalmPortal.model.Programme;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tuanjinn
 */
public class CoachRepository {
    public List<Programme> getProgrammes()
    {
        List<Programme> programmes = new ArrayList<Programme>();
        programmes.add(new Programme(1, "Sleeping problem?", "Cant sleep at night?", null));
        programmes.add(new Programme(2, "Stress problem?", "Looking for way to reduce stress", null));
        programmes.add(new Programme(3, "Food for stress", "Food and recepie that reduce stress", null));
        programmes.add(new Programme(4, "Meditation", "Simple medidation programme", null));
        programmes.add(new Programme(3, "Exercises at work", "Simple exercise you can do wat work", null));
        programmes.add(new Programme(3, "Concentration training", "Train to regain your concentration", null));
        programmes.add(new Programme(3, "3 tiny habits", "Programmes to help you work on your habit", null));
        programmes.add(new Programme(5, "Surpirse", "Surprise yourself with our unique programme", null));
        
        return programmes;
    }
}
