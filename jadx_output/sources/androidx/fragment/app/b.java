package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f1817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<String> f1818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f1819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int[] f1820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f1821f;
    final String g;
    final int h;
    final int i;
    final CharSequence j;
    final int k;
    final CharSequence l;
    final ArrayList<String> m;
    final ArrayList<String> n;
    final boolean o;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(Parcel parcel) {
        this.f1817b = parcel.createIntArray();
        this.f1818c = parcel.createStringArrayList();
        this.f1819d = parcel.createIntArray();
        this.f1820e = parcel.createIntArray();
        this.f1821f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f1993c.size();
        this.f1817b = new int[size * 5];
        if (!aVar.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1818c = new ArrayList<>(size);
        this.f1819d = new int[size];
        this.f1820e = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            w.a aVar2 = aVar.f1993c.get(i);
            int i3 = i2 + 1;
            this.f1817b[i2] = aVar2.f1997a;
            ArrayList<String> arrayList = this.f1818c;
            Fragment fragment = aVar2.f1998b;
            arrayList.add(fragment != null ? fragment.h : null);
            int[] iArr = this.f1817b;
            int i4 = i3 + 1;
            iArr[i3] = aVar2.f1999c;
            int i5 = i4 + 1;
            iArr[i4] = aVar2.f2000d;
            int i6 = i5 + 1;
            iArr[i5] = aVar2.f2001e;
            iArr[i6] = aVar2.f2002f;
            this.f1819d[i] = aVar2.g.ordinal();
            this.f1820e[i] = aVar2.h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f1821f = aVar.h;
        this.g = aVar.k;
        this.h = aVar.v;
        this.i = aVar.l;
        this.j = aVar.m;
        this.k = aVar.n;
        this.l = aVar.o;
        this.m = aVar.p;
        this.n = aVar.q;
        this.o = aVar.r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public androidx.fragment.app.a j(n nVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(nVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f1817b.length) {
            w.a aVar2 = new w.a();
            int i3 = i + 1;
            aVar2.f1997a = this.f1817b[i];
            if (n.E0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f1817b[i3]);
            }
            String str = this.f1818c.get(i2);
            aVar2.f1998b = str != null ? nVar.f0(str) : null;
            aVar2.g = androidx.lifecycle.d.c.values()[this.f1819d[i2]];
            aVar2.h = androidx.lifecycle.d.c.values()[this.f1820e[i2]];
            int[] iArr = this.f1817b;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f1999c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f2000d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f2001e = i9;
            int i10 = iArr[i8];
            aVar2.f2002f = i10;
            aVar.f1994d = i5;
            aVar.f1995e = i7;
            aVar.f1996f = i9;
            aVar.g = i10;
            aVar.e(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.h = this.f1821f;
        aVar.k = this.g;
        aVar.v = this.h;
        aVar.i = true;
        aVar.l = this.i;
        aVar.m = this.j;
        aVar.n = this.k;
        aVar.o = this.l;
        aVar.p = this.m;
        aVar.q = this.n;
        aVar.r = this.o;
        aVar.p(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1817b);
        parcel.writeStringList(this.f1818c);
        parcel.writeIntArray(this.f1819d);
        parcel.writeIntArray(this.f1820e);
        parcel.writeInt(this.f1821f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
