/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
        facts.add(new Fact(1, "Stress has been called “the silent killer” and can lead to heart disease, high blood pressure, chest pain, and an irregular heartbeat."));
        return facts;
    }
}
