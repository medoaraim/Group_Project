public class Movie {
    private Title title;
    private Genre genre;
    private Year year;

    public Movie(Title title, Genre genre, Year year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
    public String wright(Title title, Genre genre, Year year ) {
    	this.title = title;
    	this.genre = genre;
    	this.year = year;
    	return title + genre + year;
    }

    @Override
    public String toString() {
        return "Movie has a " +
                "title = " + title +
                ", a genre = " + genre +
                "and, a year = " + year;
    }
}
class MovieTester {
    public static void main(String[] args) {
        Movie m1 = new Movie(new Title ("Nacho Libre"),new Genre("Comedy"), new Year(2006));
        m1.wright;
    }
}