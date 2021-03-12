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
    public void insert(Key k, E e) {

    }

    @Override
    public E remove(Key k) {
        return null;
    }

    @Override
    public E removeAny() {
        return null;
    }

    @Override
    public E find(Key k) {
        return null;
    }

    @Override
    public Iterable<E> findAll(Key k) {
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
    }
}