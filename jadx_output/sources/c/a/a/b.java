package c.a.a;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class b extends a implements List<Object>, Cloneable, RandomAccess, Serializable {
    private final List<Object> g;
    protected transient Object h;
    protected transient Type i;

    public b() {
        this.g = new ArrayList(10);
    }

    public b(int i) {
        this.g = new ArrayList(i);
    }

    public b(List<Object> list) {
        this.g = list;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        this.g.add(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.g.add(obj);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Object> collection) {
        return this.g.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Object> collection) {
        return this.g.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.g.clear();
    }

    public Object clone() {
        return new b(new ArrayList(this.g));
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.g.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.g.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.g.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i) {
        return this.g.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.g.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.g.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.g.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.g.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.g.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return this.g.listIterator();
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i) {
        return this.g.listIterator(i);
    }

    public Type n() {
        return this.i;
    }

    public Object o() {
        return this.h;
    }

    public void p(Type type) {
        this.i = type;
    }

    public void q(Object obj) {
        this.h = obj;
    }

    @Override // java.util.List
    public Object remove(int i) {
        return this.g.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.g.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.g.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.g.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        return this.g.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.g.size();
    }

    @Override // java.util.List
    public List<Object> subList(int i, int i2) {
        return this.g.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.g.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.g.toArray(tArr);
    }
}
