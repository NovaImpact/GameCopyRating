import java.time.LocalDate; import java.util.ArrayList;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Locale;
public class Main { public static void main(String[] args) throws Exception
    { LocalDate game1Date = LocalDate.of(1998, 11, 23); new GameRating(1, "The Legend of Zelda: Ocarina of Time", game1Date, false);
        GameCopiesSold.readGameCopiesData(); for (VideoGames eachCopy : VideoGames.getAllVideoGames())
        { System.out.println(eachCopy);
        }
    }
}