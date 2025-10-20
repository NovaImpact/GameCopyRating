import java.time.LocalDate;

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

    private int toRank() {

    }
    private LocalDate toReleaseDate() {

    }
    private boolean toMultiPlatform() {

    }
    private boolean isMultiPlatform() {
        return true
    }
    private boolean notMultiPlatform() {
        return false
    }



}
