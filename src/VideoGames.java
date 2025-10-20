import java.time.LocalDate;
import java.util.ArrayList;

public class VideoGames {

    int rank;
    String title;
    LocalDate releaseDate;
    boolean multiPlatform;

    VideoGames(int rank, String title, LocalDate releaseDate, boolean multiPlatform) {
    public VideoGames(int rank, String title, LocalDate releaseDate, boolean multiPlatform) {
        this.rank = rank;
        this.title = title;
        this.releaseDate = releaseDate;
        this.multiPlatform = multiPlatform;
    }
        private static ArrayList<VideoGames> allVideoGames = new ArrayList<VideoGames>();

    public int getRank() {
        return rank;
    }

    private void setRank(int rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    private void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isMultiPlatform() {
        return multiPlatform;
    }

    private void setMultiPlatform(boolean multiPlatform) {
        this.multiPlatform = multiPlatform;
    }

    public String toString() {
        return "Rank: " + rank +
                ", Title: " + title +
                ", Release Date: " + releaseDate +
                ", Multi-Platform: " + multiPlatform;
    }



}
