import java.time.LocalDate;
import java.util.ArrayList;


import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        LocalDate game1Date = LocalDate.of(1998, 11, 23);
        new GameRating(1, "The Legend of Zelda: Ocarina of Time", game1Date, false);

        LocalDate game2Date = LocalDate.of(1999, 9, 8);
        new GameRating(2,"SoulCalibur", game2Date,true);
       // GameRating game2 = new GameRating(2,"SoulCalibur", game2Date,true);


        LocalDate game1LocalDate = LocalDate.of(2011, 11, 18);
        new GameCopiesSold(1, "Minecraft", game1Date,true,350,000,000);
        game2Date = LocalDate.of(2013, 9, 17);
        new GameCopiesSold(2, "Grand Theft Auto V", game2Date,true,215,000,000);


       // System.out.println(VideoGames.getAllVideoGames());

    for (VideoGames eachCopy : VideoGames.getAllVideoGames()) {
            System.out.println(eachCopy);
        }

    }
}