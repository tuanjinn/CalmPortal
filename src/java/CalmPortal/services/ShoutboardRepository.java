
package CalmPortal.services;

import CalmPortal.model.Shout;
import CalmPortal.model.User;
import CalmPortal.model.UserType;
import java.util.ArrayList;
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
           shouts.add(new Shout(i,"blah blah", user, null));
           
        }
        return shouts; 
    }
    
}
