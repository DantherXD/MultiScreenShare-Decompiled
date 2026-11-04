package a.h.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, a.h.a.b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Cursor f718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Context f719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f720f;
    protected C0025a g;
    protected DataSetObserver h;
    protected a.h.a.b i;

    /* JADX INFO: renamed from: a.h.a.a$a, reason: collision with other inner class name */
    private class C0025a extends ContentObserver {
        C0025a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f716b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f716b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    @Override // a.h.a.b.a
    public abstract CharSequence a(Cursor cursor);

    @Override // a.h.a.b.a
    public void b(Cursor cursor) {
        Cursor cursorJ = j(cursor);
        if (cursorJ != null) {
            cursorJ.close();
        }
    }

    @Override // a.h.a.b.a
    public Cursor c() {
        return this.f718d;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i) {
        b bVar;
        if ((i & 1) == 1) {
            i |= 2;
            this.f717c = true;
        } else {
            this.f717c = false;
        }
        boolean z = cursor != null;
        this.f718d = cursor;
        this.f716b = z;
        this.f719e = context;
        this.f720f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.g = new C0025a();
            bVar = new b();
        } else {
            bVar = null;
            this.g = null;
        }
        this.h = bVar;
        if (z) {
            C0025a c0025a = this.g;
            if (c0025a != null) {
                cursor.registerContentObserver(c0025a);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f716b || (cursor = this.f718d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f716b) {
            return null;
        }
        this.f718d.moveToPosition(i);
        if (view == null) {
            view = g(this.f719e, this.f718d, viewGroup);
        }
        e(view, this.f719e, this.f718d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.i == null) {
            this.i = new a.h.a.b(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f716b || (cursor = this.f718d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f718d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f716b && (cursor = this.f718d) != null && cursor.moveToPosition(i)) {
            return this.f718d.getLong(this.f720f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f716b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f718d.moveToPosition(i)) {
            if (view == null) {
                view = h(this.f719e, this.f718d, viewGroup);
            }
            e(view, this.f719e, this.f718d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f717c || (cursor = this.f718d) == null || cursor.isClosed()) {
            return;
        }
        this.f716b = this.f718d.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f718d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0025a c0025a = this.g;
            if (c0025a != null) {
                cursor2.unregisterContentObserver(c0025a);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f718d = cursor;
        if (cursor != null) {
            C0025a c0025a2 = this.g;
            if (c0025a2 != null) {
                cursor.registerContentObserver(c0025a2);
            }
            DataSetObserver dataSetObserver2 = this.h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f720f = cursor.getColumnIndexOrThrow("_id");
            this.f716b = true;
            notifyDataSetChanged();
        } else {
            this.f720f = -1;
            this.f716b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
