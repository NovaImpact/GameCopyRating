import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate game1Date = LocalDate.of(1998, 11, 23);
        GameRating game1 = new GameRating(1, "The Legend of Zelda: Ocarina of Time", game1Date, false);
        LocalDate game2Date = LocalDate.of(1999, 9, 8);
        GameRating game2 = new GameRating(2,"SoulCalibur", game2Date,true);
System.out.println(game1);
    }
}