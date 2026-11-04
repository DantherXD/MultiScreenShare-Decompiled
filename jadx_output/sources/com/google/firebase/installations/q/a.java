package com.google.firebase.installations.q;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f4442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f4445f;
    private final long g;
    private final String h;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f4447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f4448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f4449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f4450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f4451f;
        private String g;

        b() {
        }

        private b(d dVar) {
            this.f4446a = dVar.d();
            this.f4447b = dVar.g();
            this.f4448c = dVar.b();
            this.f4449d = dVar.f();
            this.f4450e = Long.valueOf(dVar.c());
            this.f4451f = Long.valueOf(dVar.h());
            this.g = dVar.e();
        }

        @Override // com.google.firebase.installations.q.d.a
        public d a() {
            String str = "";
            if (this.f4447b == null) {
                str = " registrationStatus";
            }
            if (this.f4450e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f4451f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f4446a, this.f4447b, this.f4448c, this.f4449d, this.f4450e.longValue(), this.f4451f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a b(String str) {
            this.f4448c = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a c(long j) {
            this.f4450e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a d(String str) {
            this.f4446a = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a e(String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a f(String str) {
            this.f4449d = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f4447b = aVar;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a h(long j) {
            this.f4451f = Long.valueOf(j);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f4441b = str;
        this.f4442c = aVar;
        this.f4443d = str2;
        this.f4444e = str3;
        this.f4445f = j;
        this.g = j2;
        this.h = str4;
    }

    @Override // com.google.firebase.installations.q.d
    public String b() {
        return this.f4443d;
    }

    @Override // com.google.firebase.installations.q.d
    public long c() {
        return this.f4445f;
    }

    @Override // com.google.firebase.installations.q.d
    public String d() {
        return this.f4441b;
    }

    @Override // com.google.firebase.installations.q.d
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f4441b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f4442c.equals(dVar.g()) && ((str = this.f4443d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f4444e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f4445f == dVar.c() && this.g == dVar.h()) {
                String str4 = this.h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.q.d
    public String f() {
        return this.f4444e;
    }

    @Override // com.google.firebase.installations.q.d
    public c.a g() {
        return this.f4442c;
    }

    @Override // com.google.firebase.installations.q.d
    public long h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.f4441b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f4442c.hashCode()) * 1000003;
        String str2 = this.f4443d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4444e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f4445f;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.q.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f4441b + ", registrationStatus=" + this.f4442c + ", authToken=" + this.f4443d + ", refreshToken=" + this.f4444e + ", expiresInSecs=" + this.f4445f + ", tokenCreationEpochInSecs=" + this.g + ", fisError=" + this.h + "}";
    }
}
