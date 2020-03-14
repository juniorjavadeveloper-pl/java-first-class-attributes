public class Notebook {
    int pages;
    int pagesWritten;
    int currentPage;

    void goToPage(int page) {
        currentPage = page;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "pages=" + pages +
                ", pagesWritten=" + pagesWritten +
                ", currentPage=" + currentPage +
                '}';
    }
}
