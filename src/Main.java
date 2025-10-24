import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        GameRating.readGameRatingData();

    System.out.println("Game Ratings Only: ");
    for (VideoGames eachCopy : VideoGames.getAllVideoGames()) {
            System.out.println(eachCopy);
        }
    }
}