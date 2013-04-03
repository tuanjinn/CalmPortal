
package CalmPortal.services;

import CalmPortal.model.Location;
import CalmPortal.model.Shout;
import CalmPortal.model.User;
import CalmPortal.model.UserType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * CalmPortal - 
 * @author tuanjinn (Duc Tuan Nguyen)
 */
public class ShoutboardRepository {
    
    
    public List<Shout> GetShouts()
    {
        return GenerateShouts();
    }
    
    public List<Shout> GenerateShouts()    
    {
        List<Shout> shouts = new ArrayList<Shout>();
        User user = new User("test", "user", "user", UserType.anonymous);
        
        for(int i = 0; i < 10; i++)
        {
           Location loc = new Location(i, "Netherland", "NL", "Eindhoven", "Europe");
           shouts.add(new Shout(i,"blah blah", user, new Date(), loc));
           
        }
        return shouts; 
    }
    
}
