import java.util.List;

public class Searcher<T> {

    /**
     * Перевіряє наявність елемента у колекції.
     */
    public boolean contains(List<T> list, T target) {
        for (T item : list) {
            if (item.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
