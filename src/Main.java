import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate game1Date = LocalDate.of(2011, 11, 18);
        GameCopiesSold Game1 = new GameCopiesSold(1, "Minecraft", game1Date,true,350,000,000);
        LocalDate game2Date = LocalDate.of(2013, 9, 17);
        GameCopiesSold Game2 = new GameCopiesSold(2, "Grand Theft Auto V", game2Date,true,215,000,000);

        System.out.println(Game1);
        System.out.println(Game2);


    }

}