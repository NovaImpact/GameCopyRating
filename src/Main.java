import java.time.LocalDate;
import java.util.ArrayList;


import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate game1Date = LocalDate.of(1998, 11, 23);
        GameRating game1 = new GameRating(1, "The Legend of Zelda: Ocarina of Time", game1Date, false);

        LocalDate game2Date = LocalDate.of(1999, 9, 8);
        GameRating game2 = new GameRating(2,"SoulCalibur", game2Date,true);
        System.out.println(game1);
        System.out.println(game2);

        ArrayList<VideoGames> allVideoGames = new ArrayList<VideoGames>();

        game1Date = LocalDate.of(2011, 11, 18);
        GameCopiesSold Game1 = new GameCopiesSold(1, "Minecraft", game1Date,true,350,000,000);
        game2Date = LocalDate.of(2013, 9, 17);
        GameCopiesSold Game2 = new GameCopiesSold(2, "Grand Theft Auto V", game2Date,true,215,000,000);

        allVideoGames.add(Game1);
        allVideoGames.add(Game2);

        System.out.println(allVideoGames);


    }
}