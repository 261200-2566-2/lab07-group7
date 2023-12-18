public class Lab07 {
    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!! constuct HashSet<Integer> mhai ; !!!!!!!!!!!!!");
        HashSet<Integer> mhai ;
        mhai = new HashSet<Integer>();
        System.out.println("---------demonstrate add()---------");
        System.out.println("mhai.add(12) ---> result : "+ mhai.add(12));
        System.out.println("mhai.add(12) ---> result : "+ mhai.add(12));
        System.out.println("mhai.add(89) ---> result : "+ mhai.add(89));
        System.out.println("mhai.size() =  "+ mhai.size());
        System.out.println("---------demonstrate contains()---------");
        System.out.println("mhai.contains(12) : "+mhai.contains(12));
        System.out.println("mhai.contains(120) : "+mhai.contains(120));
        System.out.println();

        System.out.println("!!!!!!!!!!! constuct HashSet<Integer> mhoo ; !!!!!!!!!!!!!");
        HashSet<Integer> mhoo ;
        mhoo = new HashSet<Integer>();
        System.out.println("mhoo.add(12) ---> result : "+ mhoo.add(12));
        System.out.println("mhoo.add(120) ---> result : "+ mhoo.add(120));
        System.out.println("mhoo.add(89) ---> result : "+ mhoo.add(89));
        System.out.println("mhoo.add(134) ---> result : "+ mhoo.add(134));
        System.out.println("mhoo.size() =  "+ mhoo.size());

        System.out.println("---------demonstrate containsAll()---------");
        System.out.println("mhoo.containsAll(mhai) : "+mhoo.containsAll(mhai));
        System.out.println("mhai.containsAll(mhoo) : "+mhai.containsAll(mhoo));

        System.out.println("---------demonstrate addAll()---------");
        System.out.println("mhai.addAll(mhoo) ---> result :" + mhai.addAll(mhoo));
        System.out.println("mhai.size() =  "+mhai.size());
        System.out.println("mhai.containsAll(mhoo) : "+mhai.containsAll(mhoo));

        System.out.println("---------demonstrate remove()---------");
        System.out.println("mhai.remove(89) ---> result : "+ mhai.remove(89));
        System.out.println("mhai.remove(89) ---> result : "+ mhai.remove(89));
        System.out.println("mhai.size() =  "+mhai.size());
        System.out.println("---------demonstrate removeAll()---------");
        System.out.println("mhai.removeAll(mhoo) ---> result : " + mhai.removeAll(mhoo));
        System.out.println("mhai.size() =  "+mhai.size());
        System.out.println();
        System.out.println("!!!!!!!!!!! constuct HashSet<Integer> mhao ; !!!!!!!!!!!!!");
        HashSet<Integer> mhao ;
        mhao = new HashSet<Integer>();
        System.out.println("mhao.add(134) ---> result : "+ mhao.add(134));
        System.out.println("---------demonstrate retainAll()---------");
        System.out.println("mhoo.retainAll(mhao) ---> result : " + mhoo.retainAll(mhao));
        System.out.println("mhoo.size() =  "+ mhoo.size());
        System.out.println("---------demonstrate clear()---------");
        System.out.println("mhoo.clear()" );
        mhoo.clear();
        System.out.println("mhoo.size() =  "+ mhoo.size());

    }
}
