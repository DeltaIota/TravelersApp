package rodriguezgarcia.antoniojesus.travelersapp.model;

import java.io.Serializable;

public class Country implements Serializable {

    private String name;
    private String capital;
    private String language;
    private String currency;
    private double longitude;
    private double latitude;
    private String state;

    public Country (String name, String capital, String language, String currency, double longitude, double latitude) {
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.currency = currency;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Country (String name, String capital, String language, String currency, double longitude, double latitude, String state) {
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.currency = currency;
        this.longitude = longitude;
        this.latitude = latitude;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}