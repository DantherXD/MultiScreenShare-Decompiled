package com.google.firebase.p;

import java.util.Objects;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4530b;

    c(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f4529a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f4530b = str2;
    }

    @Override // com.google.firebase.p.g
    @Nonnull
    public String b() {
        return this.f4529a;
    }

    @Override // com.google.firebase.p.g
    @Nonnull
    public String c() {
        return this.f4530b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f4529a.equals(gVar.b()) && this.f4530b.equals(gVar.c());
    }

    public int hashCode() {
        return this.f4530b.hashCode() ^ ((this.f4529a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f4529a + ", version=" + this.f4530b + "}";
    }
}
