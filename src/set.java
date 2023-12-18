import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
public class set<E> implements Set<E> {
    private static final Object DUMMY = new Object();
    private HashMap<E, Object> map ;

    public set(){
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
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
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

    @Override
    public boolean add(E e) {
        if(!map.containsKey(e)) {
            map.put(e, DUMMY);
            return true;
        }else return false;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            map.remove(o);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }

        return true;
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
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object element : c) {
            modified |= remove(element);
        }
        return modified;
    }

    @Override
    public void clear() {
        map.clear();
    }

}
