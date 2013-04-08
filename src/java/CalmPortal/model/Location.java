/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalmPortal.model;

/**
 *
 * @author tuanjinn
 */
public class Location {
    private int locationId;
    private String countryName;
    private String countryCode;
    private String cityName;
    private String continent;
    private String ip;

    public Location(int locationId, String countryName, String countryCode, String cityName, String continent, String ip) {
        this.locationId = locationId;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.cityName = cityName;
        this.continent = continent;
        this.ip = ip;
    }
    
    

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    
    
    @Override public String toString()
    {
        return this.cityName + " - " + this.countryName;
    }
}
