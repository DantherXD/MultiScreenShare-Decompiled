package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0097a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f3983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f3984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f3985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f3986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3987f;
    private final int g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    static class C0097a implements Parcelable.Creator<a> {
        C0097a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final long f3988a = s.a(l.k(1900, 0).g);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f3989b = s.a(l.k(2100, 11).g);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f3990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f3991d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f3992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f3993f;

        b(a aVar) {
            this.f3990c = f3988a;
            this.f3991d = f3989b;
            this.f3993f = f.j(Long.MIN_VALUE);
            this.f3990c = aVar.f3983b.g;
            this.f3991d = aVar.f3984c.g;
            this.f3992e = Long.valueOf(aVar.f3986e.g);
            this.f3993f = aVar.f3985d;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f3993f);
            l lVarL = l.l(this.f3990c);
            l lVarL2 = l.l(this.f3991d);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f3992e;
            return new a(lVarL, lVarL2, cVar, l == null ? null : l.l(l.longValue()), null);
        }

        public b b(long j) {
            this.f3992e = Long.valueOf(j);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean e(long j);
    }

    private a(l lVar, l lVar2, c cVar, l lVar3) {
        this.f3983b = lVar;
        this.f3984c = lVar2;
        this.f3986e = lVar3;
        this.f3985d = cVar;
        if (lVar3 != null && lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (lVar3 != null && lVar3.compareTo(lVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.g = lVar.t(lVar2) + 1;
        this.f3987f = (lVar2.f4037d - lVar.f4037d) + 1;
    }

    /* synthetic */ a(l lVar, l lVar2, c cVar, l lVar3, C0097a c0097a) {
        this(lVar, lVar2, cVar, lVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3983b.equals(aVar.f3983b) && this.f3984c.equals(aVar.f3984c) && a.g.k.c.a(this.f3986e, aVar.f3986e) && this.f3985d.equals(aVar.f3985d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3983b, this.f3984c, this.f3986e, this.f3985d});
    }

    l n(l lVar) {
        if (lVar.compareTo(this.f3983b) < 0) {
            return this.f3983b;
        }
        return lVar.compareTo(this.f3984c) > 0 ? this.f3984c : lVar;
    }

    public c o() {
        return this.f3985d;
    }

    l p() {
        return this.f3984c;
    }

    int q() {
        return this.g;
    }

    l r() {
        return this.f3986e;
    }

    l s() {
        return this.f3983b;
    }

    int t() {
        return this.f3987f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3983b, 0);
        parcel.writeParcelable(this.f3984c, 0);
        parcel.writeParcelable(this.f3986e, 0);
        parcel.writeParcelable(this.f3985d, 0);
    }
}
