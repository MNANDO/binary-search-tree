public class BST<K extends Comparable<K>, E> implements Dictionary<K, E> {
    private BSTNode<K, E> root;
    private int nodecount;

    public BST() {
        root = null;
        nodecount = 0;
    }

    @Override
    public void clear() {
        root = null;
        nodecount = 0;
    }

    @Override
    public void insert(K k, E e) {
        root = inserthelp(root, k, e);
        nodecount++;
    }

    @Override
    public E remove(K k) {
        return null;
    }

    @Override
    public E removeAny() {
        return null;
    }

    @Override
    public E find(K k) {
        return null;
    }

    @Override
    public Iterable<E> findAll(K k) {
        return null;
    }

    @Override
    public Iterable<E> values() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    private BSTNode<K, E> inserthelp(BSTNode<K, E> rt, K k, E e) {
        if (rt == null)
            return new BSTNode<K, E>(k, e);
        if (rt.key().compareTo(k) > 0)
            rt.setLeft(inserthelp(rt.left(),k,e));
        else
            rt.setRight(inserthelp(rt.right(), k, e));
        return rt;
    }
}