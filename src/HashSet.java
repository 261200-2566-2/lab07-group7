import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashSet<E> implements Set<E> {

    private static final Object DUMMY = new Object();
    private HashMap<E, Object> map ;
    HashSet(){
        map = new HashMap<>();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object element) {
        return map.containsKey(element);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<?> iterator = c.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean add(E element) {
        if (!contains(element)) {
            map.put(element, DUMMY);
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        Iterator<? extends E> iterator = (Iterator<? extends E>) c.iterator();
        while (iterator.hasNext()) {
            E element = iterator.next();
            /* If add(element) returns true, แปลว่า the set was modified,
            then modified will be set to true. */
            modified |= this.add(element);
        }
        return modified;
    }

    @Override
    public boolean remove(Object element) {
        if (contains(element)) {
            map.remove(element);
            return true;
        }
        return false;
    }



    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        Iterator<?> iterator = c.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            modified |= remove(element);
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        Iterator<HashMap.Entry<E, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<E, Object> entry = iterator.next();
            if (!c.contains(entry.getKey())) {
                iterator.remove();
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        map.clear();
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
}
