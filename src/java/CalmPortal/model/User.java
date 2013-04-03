
package CalmPortal.model;

/**
 *
 * @author tuanjinn
 */



public class User {
    private String username;
    private String fullName;
    private String displayName;
    private UserType userType;

    public User(String username, String fullName, String displayName, UserType userType) {
        this.username = username;
        this.fullName = fullName;
        this.displayName = displayName;
        this.userType = userType;
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
    
    @Override public String toString()
    {
        if(this.userType == UserType.anonymous)
            return "Someone";
        
        return this.displayName;
    }
    
    
}
