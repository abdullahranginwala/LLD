package Practice.BookMyShow;
import java.sql.Date;
import java.util.List;

public class BMSService {
    List<CinemaHall> cinemas;

    public List<Movie> getMovies(Date date, String city) {
        return null;
    }
    public List<CinemaHall> getCinemas(String city) {
        return null;
    }

}

class CinemaHall {

    int id;
    String name;
    String city;
    List<Audi> audis;

    public List<Movie> getMovies(Date date) {
        return null;
    }

    public List<Show> getShows(Date date, Movie movie) {
        return null;
    }
}

class Movie {
    int id;
    String name;
    int durationInMins;


}

class Audi {
    int id;
    String audiName;

    int totalSeats;
    List<Show> shows;
}

class Show {
    int id;
    Movie movie;
    Date date;
    int length;

    CinemaHall playedAt;
    List<Seat> seats;

}

class Seat {

    enum SeatType {
        PREMIUM, VIP, NORMAL, ECONOMY
    }

    enum SeatStatus {
        BOOKED, AVAILABLE, RESERVED
    }
    int id;
    SeatType type;
    SeatStatus status;
    Double price;
}