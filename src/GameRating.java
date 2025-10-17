import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class GameRating extends VideoGames {
    int MetaScore;
    boolean RatedE;

    public GameRating(int rank, String title, LocalDate releaseDate, boolean multiPlatform) {
        super(rank, title, releaseDate, multiPlatform);
    }
    void setMetaScore(int newMetaScore) {
        ArrayList<Integer> MetaScore = new ArrayList<>(10);
        MetaScore.add(99);
        MetaScore.add(98);
        MetaScore.add(97);
    }
}
