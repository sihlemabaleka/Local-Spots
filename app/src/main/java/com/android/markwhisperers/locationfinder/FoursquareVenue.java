package com.android.markwhisperers.locationfinder;


public class FoursquareVenue {
    private String name;
    private String city;

    private String category;
    private double latitude;
    private double longitude;

    public FoursquareVenue() {
        this.name = "";
        this.city = "";
        this.setCategory("");
    }

    public String getCity() {
        if (city.length() > 0) {
            return city;
        }
        return city;
    }

    public void setCity(String city) {
        if (city != null) {
            this.city = city.replaceAll("\\(", "").replaceAll("\\)", "");
            ;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getLatitude() {
        return  latitude;
    }
    public double getLongitude() {
        return  longitude;
    }


}

