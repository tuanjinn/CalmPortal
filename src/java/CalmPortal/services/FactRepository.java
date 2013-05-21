
package CalmPortal.services;

import CalmPortal.model.Fact;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuanjinn
 */
public class FactRepository {
    public List<Fact> getProgrammes()
    {
        List<Fact> facts = new ArrayList<Fact>();
        facts.add(new Fact(0, "While it is a myth that stress can turn hair gray, stress can cause hair loss. In fact, telogen effluvium (hair loss) can begin up to three months after a stressful event."));
        facts.add(new Fact(1, "Stress has been called the silent killer and can lead to heart disease, high blood pressure, chest pain, and an irregular heartbeat."));
        facts.add(new Fact(1, "In 2009, the top most stressful jobs were a surgeon, commercial airline pilot, photojournalist, advertising account executive, and real estate agent. The least stressful jobs were actuary, dietitian, astronomer, systems analyst, and software engineer."));
        facts.add(new Fact(1, "The top three stressful cities in America are Chicago, Ilinois; Los Angeles, California; and New York, New York."));
        facts.add(new Fact(1, "Stress alters the neurochemical makeup of the body, which can affect the maturation and release of the human egg. Stress can also cause the fallopian tubes and uterus to spasm, which can affect implantation. Stress in men can affect sperm count and motility and can cause erectile dysfunction. In fact, stress may account for 30% of all infertility problems."));
        facts.add(new Fact(1, "Stress can make acne worse. Researchers say stress-related inflammation rather than a rise is sebum (the oily substance in skin) is to blame."));
        facts.add(new Fact(1, "Laughing lowers stress hormones (like cortisol, epinephrine, and adrenaline) and strengthens the immune system by releasing health-enhancing hormones."));
        
        return facts;
    }
    
    public Fact getRandomFact()
    {
        List<Fact> facts = getProgrammes();
        int index = Utils.GetRandomNr(facts.size() - 1);
        return facts.get(index);
    }
}
