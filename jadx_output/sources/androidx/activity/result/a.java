package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0038a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Intent f1023c;

    /* JADX INFO: renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    class C0038a implements Parcelable.Creator<a> {
        C0038a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(int i, Intent intent) {
        this.f1022b = i;
        this.f1023c = intent;
    }

    a(Parcel parcel) {
        this.f1022b = parcel.readInt();
        this.f1023c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String l(int i) {
        if (i != -1) {
            return i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Intent j() {
        return this.f1023c;
    }

    public int k() {
        return this.f1022b;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + l(this.f1022b) + ", data=" + this.f1023c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1022b);
        parcel.writeInt(this.f1023c == null ? 0 : 1);
        Intent intent = this.f1023c;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
