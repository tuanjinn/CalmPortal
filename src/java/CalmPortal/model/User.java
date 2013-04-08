
package CalmPortal.model;

import com.mysql.jdbc.StringUtils;

/**
 *
 * @author tuanjinn
 */



public class User {
    private String username;    
    private String fullName;
    private String displayName;
    private UserType userType;
    private String ava;

    public User(String username, String fullName, String displayName, UserType userType, String ava) {
        this.username = username;
        this.fullName = fullName;
        this.displayName = displayName;
        this.userType = userType;
        this.ava = ava;
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getAva() {
        if(!StringUtils.isNullOrEmpty(this.ava))
            return ava;
        
        return "sad.png";
    }

    public void setAva(String ava) {
        this.ava = ava;
    }
    
    @Override public String toString()
    {
        if(this.userType == UserType.anonymous)
            return "Someone";
        
        return this.displayName;
    }
    
    
}
