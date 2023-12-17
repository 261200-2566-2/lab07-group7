import java.util.Iterator;

public interface Set<E> extends Collection<E>{
    int size();
    boolean isEmpty();

    boolean contains(Object element);
    boolean containsAll(Collection<?> c);

    boolean add(E element);
    boolean addAll(Collection<? extends E> c);

    boolean remove(Object element);
    boolean removeAll(Collection<?> c);

    boolean retainAll(Collection<?> c);

    void clear();

    Iterator<E> iterator();
}
