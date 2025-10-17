import java.time.LocalDate;

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

}
