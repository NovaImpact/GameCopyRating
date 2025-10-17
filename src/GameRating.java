import java.time.LocalDate;

private class GameRating extends VideoGames {
    int metaScore;
    boolean RatedE;

    public GameRating(int rank, String title, LocalDate releaseDate, boolean multiPlatform) {
        super(rank, title, releaseDate, multiPlatform);
    }
}
