class movie {
    private String movieTitle;
    private String genre;
    private int duration;
    private double rating;

    public movie(String movieTitle, String genre, int duration, double rating) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public void displayMovie() {
        System.out.println("Movie Title: " + this.movieTitle);
        System.out.println("Genre: " + this.genre);
        System.out.println("Duration: " + this.duration);
        System.out.println("Rating: " + this.rating);
    }

    public static void main(String[] args) {
        movie movie1 = new movie("The Dark Knight", "Action", 152, 9.0);
        movie movie2 = new movie("Inception", "Sci-Fi", 148, 8.8);
        movie movie3 = new movie("Interstellar", "Sci-Fi", 169, 8.6);

        movie1.displayMovie();
        movie2.displayMovie();
        movie3.displayMovie();
    }
}