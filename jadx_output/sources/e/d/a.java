package e.d;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Iterator<Character> {
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Character next() {
        return Character.valueOf(b());
    }

    public abstract char b();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
