package com.google.firebase.installations.r;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f4466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f4467e;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f4469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f4470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f4471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f4472e;

        b() {
        }

        @Override // com.google.firebase.installations.r.d.a
        public d a() {
            return new a(this.f4468a, this.f4469b, this.f4470c, this.f4471d, this.f4472e);
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a b(f fVar) {
            this.f4471d = fVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a c(String str) {
            this.f4469b = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a d(String str) {
            this.f4470c = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a e(d.b bVar) {
            this.f4472e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a f(String str) {
            this.f4468a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f4463a = str;
        this.f4464b = str2;
        this.f4465c = str3;
        this.f4466d = fVar;
        this.f4467e = bVar;
    }

    @Override // com.google.firebase.installations.r.d
    public f b() {
        return this.f4466d;
    }

    @Override // com.google.firebase.installations.r.d
    public String c() {
        return this.f4464b;
    }

    @Override // com.google.firebase.installations.r.d
    public String d() {
        return this.f4465c;
    }

    @Override // com.google.firebase.installations.r.d
    public d.b e() {
        return this.f4467e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f4463a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f4464b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f4465c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f4466d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f4467e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.r.d
    public String f() {
        return this.f4463a;
    }

    public int hashCode() {
        String str = this.f4463a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f4464b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4465c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f4466d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f4467e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f4463a + ", fid=" + this.f4464b + ", refreshToken=" + this.f4465c + ", authToken=" + this.f4466d + ", responseCode=" + this.f4467e + "}";
    }
}
