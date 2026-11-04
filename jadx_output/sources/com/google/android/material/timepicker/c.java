package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f4267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f4268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f4269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f4270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f4271f;
    int g;
    int h;

    static class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    public c() {
        this(0);
    }

    public c(int i) {
        this(0, 0, 10, i);
    }

    public c(int i, int i2, int i3, int i4) {
        this.f4270e = i;
        this.f4271f = i2;
        this.g = i3;
        this.f4269d = i4;
        this.h = l(i);
        this.f4267b = new com.google.android.material.timepicker.a(59);
        this.f4268c = new com.google.android.material.timepicker.a(i4 == 1 ? 24 : 12);
    }

    protected c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static String j(Resources resources, CharSequence charSequence) {
        return k(resources, charSequence, "%02d");
    }

    public static String k(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int l(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4270e == cVar.f4270e && this.f4271f == cVar.f4271f && this.f4269d == cVar.f4269d && this.g == cVar.g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4269d), Integer.valueOf(this.f4270e), Integer.valueOf(this.f4271f), Integer.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4270e);
        parcel.writeInt(this.f4271f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.f4269d);
    }
}
