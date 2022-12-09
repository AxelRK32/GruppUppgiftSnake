package org.example;

public class Container {
    private int startingLength = 6; //starting length that can be changed in settings
    private int highScore; //variable to store current score during a game
    private String profileName; //variable to store the name of the person who is playing
    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }


    public int getHighScore() {

        return highScore;
    }

    public void setHighScore(int highScore) {

        this.highScore = highScore;
    }

    public int getStartingLength() {

        return startingLength;
    }

    public void setStartingLength(int startingLength) {

        this.startingLength = startingLength;
    }


}
