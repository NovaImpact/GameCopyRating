import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        GameRating.readGameRatingData();

    System.out.println("Game Ratings Only: ");
    for (VideoGames eachCopy : VideoGames.getAllVideoGames()) {
        LocalDate game1Date = LocalDate.of(1998, 11, 23);
        new GameRating(1, "The Legend of Zelda: Ocarina of Time", game1Date, false);

        GameCopiesSold.readGameCopiesData();

        for (VideoGames eachCopy : VideoGames.getAllVideoGames()) {
            System.out.println(eachCopy);

        }
    }
    }

}