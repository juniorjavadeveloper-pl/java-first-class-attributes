package pl.juniorjavadeveloper.java.first.clazz.attributes;

public class Notebook {
    int pages;
    int pagesWritten;
    int currentPage;

    void goToPage(int page) {
        currentPage = page;
    }

    @Override
    public String toString() {
        return "pl.juniorjavadeveloper.java.first.clazz.attributes.Notebook{" +
                "pages=" + pages +
                ", pagesWritten=" + pagesWritten +
                ", currentPage=" + currentPage +
                '}';
    }
}
