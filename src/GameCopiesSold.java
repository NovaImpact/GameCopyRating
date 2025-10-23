import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

public class GameCopiesSold extends VideoGames {

    int copiesSold;

    GameCopiesSold(int rank, String title, LocalDate releaseDate, boolean multiPlatform, int sold, int i, int copiesSold) {
        super(rank, title, releaseDate, multiPlatform);
        this.copiesSold = copiesSold;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;

    }


    public static void readGameCopiesData() throws Exception {
        GameCopiesSold.readGameCopiesData();

        File myData = new File("GameCopiesData");
        Scanner myReader = new Scanner(myData);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            Scanner lineScanner = new Scanner(data);
            lineScanner.useDelimiter( "\t");
           // System.out.println(data);

            String copyChunk = lineScanner.next();
            copyChunk = copyChunk.replace("M" , "");

            LocalDate game1LocalDate = LocalDate.of(2011, 11, 18);

            int rank = Integer.parseInt(copyChunk);

            String title = lineScanner.next();
            int copiesSold = lineScanner.nextInt();
            boolean multiPlatform = lineScanner.nextBoolean();



        }




        for (int i = 0; i < 0; i = i + 1) {
            int rank = 1;
            String title = "Minecraft";
            int copiesSoldMillions = 300;
            int year = 2011;
            LocalDate film1LocalDate = LocalDate.of(year, 11, 18);
            boolean multiPlatform = true;

        }
    }
}
