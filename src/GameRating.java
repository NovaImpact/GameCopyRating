import java.io.File;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

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

    public static void readGameRatingData() throws Exception {
        GameRating.readGameRatingData();

        File myData = new File("GameRating");
        Scanner myReader = new Scanner(myData);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            Scanner lineScanner = new Scanner(data);
            lineScanner.useDelimiter("\t");
            // System.out.println(data);

            String copyChunk = lineScanner.next();
            copyChunk = copyChunk.replace("M", "");

            LocalDate game1LocalDate = LocalDate.of(2011, 11, 18);

            int rank = Integer.parseInt(copyChunk);

            String title = lineScanner.next();
            int copiesSold = lineScanner.nextInt();
            boolean multiPlatform = lineScanner.nextBoolean();


        }

        //must-play
        //1. The Legend of Zelda: Ocarina of Time
        //Nov 23, 1998  •  Rated E
        //As a young boy, Link is tricked by Ganondorf, the King of the Gerudo Thieves. The evil human uses Link to gain access to the Sacred Realm, where he places his tainted hands on Triforce and transforms the beautiful Hyrulean landscape into a barren wasteland. Link is determined to fix the problems he helped to create, so with the help of Rauru he travels through time gathering the powers of the Seven Sages.
        //99
        //Metascore

        for (int i = 0; i < 0; i = i + 1) {
            int rank = 1;
            String title = "The Legend of Zelda: Ocarina of Time";
            int year = 1998;
            LocalDate film1LocalDate = LocalDate.of(year, 11, 23);
            boolean multiPlatform = false;

        }
    }
}


