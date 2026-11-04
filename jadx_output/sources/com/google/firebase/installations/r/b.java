package com.google.firebase.installations.r;

/* JADX INFO: loaded from: classes.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f4475c;

    /* JADX INFO: renamed from: com.google.firebase.installations.r.b$b, reason: collision with other inner class name */
    static final class C0107b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f4477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f4478c;

        C0107b() {
        }

        @Override // com.google.firebase.installations.r.f.a
        public f a() {
            String str = "";
            if (this.f4477b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f4476a, this.f4477b.longValue(), this.f4478c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.r.f.a
        public f.a b(f.b bVar) {
            this.f4478c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.f.a
        public f.a c(String str) {
            this.f4476a = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.f.a
        public f.a d(long j) {
            this.f4477b = Long.valueOf(j);
            return this;
        }
    }

    private b(String str, long j, f.b bVar) {
        this.f4473a = str;
        this.f4474b = j;
        this.f4475c = bVar;
    }

    @Override // com.google.firebase.installations.r.f
    public f.b b() {
        return this.f4475c;
    }

    @Override // com.google.firebase.installations.r.f
    public String c() {
        return this.f4473a;
    }

    @Override // com.google.firebase.installations.r.f
    public long d() {
        return this.f4474b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f4473a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f4474b == fVar.d()) {
                f.b bVar = this.f4475c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4473a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f4474b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        f.b bVar = this.f4475c;
        return i ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f4473a + ", tokenExpirationTimestamp=" + this.f4474b + ", responseCode=" + this.f4475c + "}";
    }
}
