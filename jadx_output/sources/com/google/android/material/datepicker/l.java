package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
final class l implements Comparable<l>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Calendar f4035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f4036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f4037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f4038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f4039f;
    final long g;
    private String h;

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return l.k(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i) {
            return new l[i];
        }
    }

    private l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = s.d(calendar);
        this.f4035b = calendarD;
        this.f4036c = calendarD.get(2);
        this.f4037d = calendarD.get(1);
        this.f4038e = calendarD.getMaximum(7);
        this.f4039f = calendarD.getActualMaximum(5);
        this.g = calendarD.getTimeInMillis();
    }

    static l k(int i, int i2) {
        Calendar calendarK = s.k();
        calendarK.set(1, i);
        calendarK.set(2, i2);
        return new l(calendarK);
    }

    static l l(long j) {
        Calendar calendarK = s.k();
        calendarK.setTimeInMillis(j);
        return new l(calendarK);
    }

    static l m() {
        return new l(s.i());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f4036c == lVar.f4036c && this.f4037d == lVar.f4037d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4036c), Integer.valueOf(this.f4037d)});
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        return this.f4035b.compareTo(lVar.f4035b);
    }

    int n() {
        int firstDayOfWeek = this.f4035b.get(7) - this.f4035b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f4038e : firstDayOfWeek;
    }

    long o(int i) {
        Calendar calendarD = s.d(this.f4035b);
        calendarD.set(5, i);
        return calendarD.getTimeInMillis();
    }

    int p(long j) {
        Calendar calendarD = s.d(this.f4035b);
        calendarD.setTimeInMillis(j);
        return calendarD.get(5);
    }

    String q(Context context) {
        if (this.h == null) {
            this.h = e.c(context, this.f4035b.getTimeInMillis());
        }
        return this.h;
    }

    long r() {
        return this.f4035b.getTimeInMillis();
    }

    l s(int i) {
        Calendar calendarD = s.d(this.f4035b);
        calendarD.add(2, i);
        return new l(calendarD);
    }

    int t(l lVar) {
        if (this.f4035b instanceof GregorianCalendar) {
            return ((lVar.f4037d - this.f4037d) * 12) + (lVar.f4036c - this.f4036c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4037d);
        parcel.writeInt(this.f4036c);
    }
}
