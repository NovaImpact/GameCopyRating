import java.time.LocalDate;

private class VideoGames {

    int rank;
    String title;
    LocalDate releaseDate;
    boolean multiPlatform;

    private VideoGames(int rank, String title, LocalDate releaseDate, boolean multiPlatform) {
        this.rank = rank;
        this.title = title;
        this.releaseDate = releaseDate;
        this.multiPlatform = multiPlatform;
    }

    private int getRank() {
        return rank;
    }

    private void setRank(int rank) {
        this.rank = rank;
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private LocalDate getReleaseDate() {
        return releaseDate;
    }

    private void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    private boolean isMultiPlatform() {
        return multiPlatform;
    }

    private void setMultiPlatform(boolean multiPlatform) {
        this.multiPlatform = multiPlatform;
    }

    private String toString() {

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
