package com.sanjay.BookMyShow;

import java.util.List;
public class Theatre {
	int id;
	String address;
	City city;
	List<Screen>screens;
	List<Show>shows;
	
	public int getTheatreId() {
        return id;
    }

    public void setTheatreId(int theatreId) {
        this.id = theatreId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Screen> getScreen() {
        return screens;
    }

    public void setScreen(List<Screen> screen) {
        this.screens = screen;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

}
