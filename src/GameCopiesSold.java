import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GameCopiesSold extends VideoGames {

    private int copiesSold;
    private static ArrayList<GameCopiesSold> allGameCopies = new ArrayList<GameCopiesSold>();

    // Constructor
    public GameCopiesSold(int rank, String title, LocalDate releaseDate, boolean multiPlatform, int copiesSold) {
        super(rank, title, releaseDate, multiPlatform);
        this.copiesSold = copiesSold;
        allGameCopies.add(this); // track all objects
    }

    // Getter and setter for copiesSold
    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    // Getter and setter for all objects
    public static ArrayList<GameCopiesSold> getAllGameCopies() {
        return allGameCopies;
    }

    public static void setAllGameCopies(ArrayList<GameCopiesSold> allGameCopies) {
        GameCopiesSold.allGameCopies = allGameCopies;
    }


    public String toString() {
        String superString = super.toString();
        return superString + ", Copies Sold: " + copiesSold + "M";
    }

    // Read data from file
    public static void readGameCopiesData() throws Exception {
        File myData = new File("GameCopiesData");
        Scanner myReader = new Scanner(myData);
        String firstLine = myReader.nextLine();

        while (myReader.hasNextLine()) {
            String dataLine = myReader.nextLine();
            System.out.println(dataLine);

            Scanner lineScanner = new Scanner(dataLine);
            lineScanner.useDelimiter("\t");


                int rank = lineScanner.nextInt();
                String title = lineScanner.next();


                String copiesChunk = lineScanner.next().replaceAll("[^0-9]", "");
                int copiesSold = copiesChunk.isEmpty() ? 0 : Integer.parseInt(copiesChunk);


                boolean multiPlatform = dataLine.toLowerCase().contains("multi-platform");

                int year = 2000;
                if (lineScanner.hasNext()) {
                    String yearChunk = lineScanner.next().replaceAll("[^0-9]", "");
                }

                LocalDate gameDate = LocalDate.of(year, 1, 1);

                // create object
                new GameCopiesSold(rank, title, gameDate, multiPlatform, copiesSold);


        }


    }
}
