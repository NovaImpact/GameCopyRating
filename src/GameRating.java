import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class GameRating extends VideoGames {
    int MetaScore;
    boolean RatedE;

    public GameRating(int rank, String title, LocalDate releaseDate, boolean multiPlatform) {
        super(rank, title, releaseDate, multiPlatform);
    }

    public String toString() {
        //String
        return super.toString();
    }
}

