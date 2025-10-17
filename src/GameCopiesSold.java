import java.time.LocalDate;

private class GameCopiesSold extends VideoGames {

    int copiesSold;

    private GameCopiesSold(int rank, String title, LocalDate releaseDate, boolean multiPlatform, int copiesSold) {
        super(rank, title, releaseDate, multiPlatform);
        this.copiesSold = copiesSold;
    }

    private int getCopiesSold() {
        return copiesSold;
    }

    private void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

}
