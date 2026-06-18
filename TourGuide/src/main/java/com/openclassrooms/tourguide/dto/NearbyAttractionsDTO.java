package com.openclassrooms.tourguide.dto;

public class NearbyAttractionsDTO {

    private String attractionName;

    private double attractionLatitude;
    private double attractionLongitude;

    private double userLatitude;
    private double userLongitude;

    private double distance;

    private int rewardPoints;


    public NearbyAttractionsDTO(String attractionName,
                                double attractionLatitude,
                                double attractionLongitude,
                                double userLatitude,
                                double userLongitude,
                                double distance,
                                int rewardPoints) {
        this.attractionName = attractionName;
        this.attractionLatitude = attractionLatitude;
        this.attractionLongitude = attractionLongitude;
        this.userLatitude = userLatitude;
        this.userLongitude = userLongitude;
        this.distance = distance;
        this.rewardPoints = rewardPoints;
    }

    public double getAttractionLatitude() {
        return attractionLatitude;
    }

    public double getAttractionLongitude() {
        return attractionLongitude;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public double getDistance() {
        return distance;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public double getUserLatitude() {
        return userLatitude;
    }

    public double getUserLongitude() {
        return userLongitude;
    }

    public void setAttractionLatitude(double attractionLatitude) {
        this.attractionLatitude = attractionLatitude;
    }

    public void setAttractionLongitude(double attractionLongitude) {
        this.attractionLongitude = attractionLongitude;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public void setUserLatitude(double userLatitude) {
        this.userLatitude = userLatitude;
    }

    public void setUserLongitude(double userLongitude) {
        this.userLongitude = userLongitude;
    }
}


