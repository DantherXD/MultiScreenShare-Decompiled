package com.google.firebase.installations;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class e extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4412c;

    static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f4414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f4415c;

        b() {
        }

        @Override // com.google.firebase.installations.l.a
        public l a() {
            String str = "";
            if (this.f4413a == null) {
                str = " token";
            }
            if (this.f4414b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f4415c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new e(this.f4413a, this.f4414b.longValue(), this.f4415c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.l.a
        public l.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f4413a = str;
            return this;
        }

        @Override // com.google.firebase.installations.l.a
        public l.a c(long j) {
            this.f4415c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.l.a
        public l.a d(long j) {
            this.f4414b = Long.valueOf(j);
            return this;
        }
    }

    private e(String str, long j, long j2) {
        this.f4410a = str;
        this.f4411b = j;
        this.f4412c = j2;
    }

    @Override // com.google.firebase.installations.l
    public String b() {
        return this.f4410a;
    }

    @Override // com.google.firebase.installations.l
    public long c() {
        return this.f4412c;
    }

    @Override // com.google.firebase.installations.l
    public long d() {
        return this.f4411b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f4410a.equals(lVar.b()) && this.f4411b == lVar.d() && this.f4412c == lVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.f4410a.hashCode() ^ 1000003) * 1000003;
        long j = this.f4411b;
        long j2 = this.f4412c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f4410a + ", tokenExpirationTimestamp=" + this.f4411b + ", tokenCreationTimestamp=" + this.f4412c + "}";
    }
}
