public class NotebookStore {
    public static void main(String[] args) {
        Notebook blankNotebook = new Notebook();
        Notebook personalNotebook = new Notebook();

        // wypisanie wartości jednej zmiennej z klasy Notebook
        System.out.println("Liczba stron zapisanych w Notatniku:");
        System.out.println(blankNotebook.pagesWritten);

        // wypisanie wartości wielu zmiennych z tej samej klasy,
        // bez użycia metody toString()
        System.out.println("Wartości wszystkich zmiennych zapisanych w Notatniku:");
        System.out.println(blankNotebook.pages);
        System.out.println(blankNotebook.pagesWritten);
        System.out.println(blankNotebook.currentPage);

        // wypisanie wartości wszystkich zmiennych z tej samej klasy
        // z użyciem metody toString()
        System.out.println("Notatnik zawiera poniższe wartości dla zmiennych:");
        System.out.println(blankNotebook);
    }
}
