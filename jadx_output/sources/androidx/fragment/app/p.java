package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<t> f1966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<String> f1967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    b[] f1968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f1969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f1970f;
    ArrayList<String> g;
    ArrayList<Bundle> h;
    ArrayList<n.m> i;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i) {
            return new p[i];
        }
    }

    public p() {
        this.f1970f = null;
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
    }

    public p(Parcel parcel) {
        this.f1970f = null;
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.f1966b = parcel.createTypedArrayList(t.CREATOR);
        this.f1967c = parcel.createStringArrayList();
        this.f1968d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1969e = parcel.readInt();
        this.f1970f = parcel.readString();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.i = parcel.createTypedArrayList(n.m.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1966b);
        parcel.writeStringList(this.f1967c);
        parcel.writeTypedArray(this.f1968d, i);
        parcel.writeInt(this.f1969e);
        parcel.writeString(this.f1970f);
        parcel.writeStringList(this.g);
        parcel.writeTypedList(this.h);
        parcel.writeTypedList(this.i);
    }
}
