package com.sanjay.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class BookMyShow {
	MovieController movieController;
	TheatreController theatreController;

	public BookMyShow() {
		movieController = new MovieController();
		theatreController = new TheatreController();
	}

	public static void main(String[] args) {
		BookMyShow bookMyShow = new BookMyShow();
		bookMyShow.initialize();

	}

	private void initialize() {
		createMovies();
		createTheatre();

	}

	private void createMovies() {
		// create Movies1
		Movie avengers = new Movie();
		avengers.setId(1);
		avengers.setName("AVENGERS");
		avengers.setDuration(128);

		// create Movies2
		Movie baahubali = new Movie();
		baahubali.setId(2);
		baahubali.setName("BAAHUBALI");
		baahubali.setDuration(180);

		// add movies against the cities
		movieController.addMovie(avengers, City.Bangalore);
		movieController.addMovie(avengers, City.Delhi);
		movieController.addMovie(baahubali, City.Bangalore);
		movieController.addMovie(baahubali, City.Delhi);

	}

	private void createTheatre() {

		Movie avengerMovie = movieController.getMovieByName("AVENGERS");
		Movie baahubali = movieController.getMovieByName("BAAHUBALI");

		Theatre inoxTheatre = new Theatre();
		inoxTheatre.setTheatreId(1);
		inoxTheatre.setScreen(createScreen());
		inoxTheatre.setCity(City.Bangalore);
		List<Show> inoxShows = new ArrayList<>();
		Show inoxMorningShow = createShows(1, inoxTheatre.getScreen().get(0), avengerMovie, 8);
		Show inoxEveningShow = createShows(2, inoxTheatre.getScreen().get(0), baahubali, 16);
		inoxShows.add(inoxMorningShow);
		inoxShows.add(inoxEveningShow);
		inoxTheatre.setShows(inoxShows);

		Theatre pvrTheatre = new Theatre();
		pvrTheatre.setTheatreId(2);
		pvrTheatre.setScreen(createScreen());
		pvrTheatre.setCity(City.Delhi);
		List<Show> pvrShows = new ArrayList<>();
		Show pvrMorningShow = createShows(3, pvrTheatre.getScreen().get(0), avengerMovie, 13);
		Show pvrEveningShow = createShows(4, pvrTheatre.getScreen().get(0), baahubali, 20);
		pvrShows.add(pvrMorningShow);
		pvrShows.add(pvrEveningShow);
		pvrTheatre.setShows(pvrShows);

		theatreController.addTheatre(inoxTheatre, City.Bangalore);
		theatreController.addTheatre(pvrTheatre, City.Delhi);
	}

	private List<Screen> createScreen() {

		List<Screen> screens = new ArrayList<>();
		Screen screen1 = new Screen();
		screen1.setScreenId(1);
		screen1.setSeats(createSeats());
		screens.add(screen1);

		return screens;
	}
	
	private Show createShows(int showId, Screen screen, Movie movie, int showStartTime) {

        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStartTime); //24 hrs time ex: 14 means 2pm and 8 means 8AM
        return show;
    }
	private List<Seat> createSeats() {

        //creating 100 seats for testing purpose, this can be generalised
        List<Seat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        //1 to 40 : SILVER
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }



}
