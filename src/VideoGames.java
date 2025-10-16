import java.time.LocalDate;

public class VideoGames {

    int rank;
    String title;
    LocalDate releaseDate;
    boolean multiPlatform;

    public VideoGames(int rank, String title, LocalDate releaseDate, boolean multiPlatform) {
        this.rank = rank;
        this.title = title;
        this.releaseDate = releaseDate;
        this.multiPlatform = multiPlatform;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isMultiPlatform() {
        return multiPlatform;
    }

    public void setMultiPlatform(boolean multiPlatform) {
        this.multiPlatform = multiPlatform;
    }

    public String toString() {

    }

    public int toRank() {

    }
    public LocalDate toReleaseDate() {

    }
    public boolean toMultiPlatform() {

    }
    public boolean isMultiPlatform() {
        return true
    }
    public boolean notMultiPlatform() {
        return false
    }



}
