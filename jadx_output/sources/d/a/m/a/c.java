package d.a.m.a;

/* JADX INFO: loaded from: classes.dex */
public enum c implements d.a.m.c.a<Object> {
    INSTANCE,
    NEVER;

    @Override // d.a.j.b
    public void c() {
    }

    @Override // d.a.m.c.c
    public void clear() {
    }

    @Override // d.a.m.c.b
    public int f(int i) {
        return i & 2;
    }

    @Override // d.a.m.c.c
    public boolean isEmpty() {
        return true;
    }

    @Override // d.a.m.c.c
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // d.a.m.c.c
    public Object poll() {
        return null;
    }
}
