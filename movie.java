//Name: Michael Antigua
//cmsc 203
//descripion: the is the movie part

public class Movie {
    private String title;
    private String rating;
    private int soldTickets;

    public Movie() {
        title = "";
        rating = "";
        soldTickets = 0;
    }

    public Movie(String title, String rating, int soldTickets) {
        this.title = title;
        this.rating = rating;
        this.soldTickets = soldTickets;
    }

    public String getTitle() {
        return title;
    }
    public String getRating() {
        return rating;
    }
    public int getSoldTickets() {
        return soldTickets;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public void setSoldTickets(int soldTickets) {
        this.soldTickets = soldTickets;
    }

    public String toString() {
        return title + " (" + rating + "): Tickets Sold: " + soldTickets;
    }
}
