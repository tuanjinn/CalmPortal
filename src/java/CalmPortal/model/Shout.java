
package CalmPortal.model;

import java.util.Date;

/**
 * CalmPortal - 
 * @author tuanjinn (Duc Tuan Nguyen)
 */
public class Shout {
    private int shoutId;
    private String msg;
    private User user;
    private Date dateTime;

    public Shout(int shoutId, String msg, User user, Date dateTime) {
        this.shoutId = shoutId;
        this.msg = msg;
        this.user = user;
        this.dateTime = dateTime;
    }
    
    
    
    public int getShoutId() {
        return shoutId;
    }

    public void setShoutId(int shoutId) {
        this.shoutId = shoutId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    
    
}
