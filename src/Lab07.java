import java.util.Collection;

public class Lab07 {
    public  static void main(String[] args) {
        set<Integer> mhai =new set<Integer>();
        mhai.add(12);
        mhai.add(12);
        mhai.add(89);
        System.out.println(mhai.size());
        System.out.println(mhai.contains(12));
        System.out.println(mhai.contains(120));
        System.out.println();

        set<Integer> c = new set<>();
        c.add(12);
        c.add(120);
        set<Integer> mhoo = new set<Integer>();
        mhoo.add(12);
        mhoo.add(120);
        mhoo.add(134);
        System.out.println(mhoo.size());
        System.out.println(mhoo.containsAll(c));
        System.out.println(mhai.containsAll(mhoo));
        System.out.println();

        mhai.addAll(mhoo);
        System.out.println(mhai.size());

        System.out.println();
        mhai.remove(89);
        mhai.remove(28);
        System.out.println(mhai.size());
        System.out.println();

        mhai.removeAll(mhoo);
        System.out.println(mhai.size());

        set<Integer> mhao = new set<Integer>();
        mhao.add(134);

        mhoo.retainAll(mhao);
        System.out.println(mhoo.size());

        System.out.println();
        System.out.println(mhoo.size());
        mhoo.clear();
        System.out.println(mhoo.size());

    }
}
