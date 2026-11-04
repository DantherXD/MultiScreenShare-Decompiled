package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f1975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f1976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f1977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f1978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f1979f;
    final String g;
    final boolean h;
    final boolean i;
    final boolean j;
    final Bundle k;
    final boolean l;
    final int m;
    Bundle n;

    class a implements Parcelable.Creator<t> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t[] newArray(int i) {
            return new t[i];
        }
    }

    t(Parcel parcel) {
        this.f1975b = parcel.readString();
        this.f1976c = parcel.readString();
        this.f1977d = parcel.readInt() != 0;
        this.f1978e = parcel.readInt();
        this.f1979f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readBundle();
        this.l = parcel.readInt() != 0;
        this.n = parcel.readBundle();
        this.m = parcel.readInt();
    }

    t(Fragment fragment) {
        this.f1975b = fragment.getClass().getName();
        this.f1976c = fragment.h;
        this.f1977d = fragment.p;
        this.f1978e = fragment.y;
        this.f1979f = fragment.z;
        this.g = fragment.A;
        this.h = fragment.D;
        this.i = fragment.o;
        this.j = fragment.C;
        this.k = fragment.i;
        this.l = fragment.B;
        this.m = fragment.T.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1975b);
        sb.append(" (");
        sb.append(this.f1976c);
        sb.append(")}:");
        if (this.f1977d) {
            sb.append(" fromLayout");
        }
        if (this.f1979f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1979f));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.g);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1975b);
        parcel.writeString(this.f1976c);
        parcel.writeInt(this.f1977d ? 1 : 0);
        parcel.writeInt(this.f1978e);
        parcel.writeInt(this.f1979f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.m);
    }
}
