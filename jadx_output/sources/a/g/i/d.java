package a.g.i;

import a.g.k.h;
import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f523e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f524f;

    public d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f519a = (String) h.e(str);
        this.f520b = (String) h.e(str2);
        this.f521c = (String) h.e(str3);
        this.f522d = (List) h.e(list);
        this.f524f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f522d;
    }

    public int c() {
        return this.f523e;
    }

    String d() {
        return this.f524f;
    }

    public String e() {
        return this.f519a;
    }

    public String f() {
        return this.f520b;
    }

    public String g() {
        return this.f521c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f519a + ", mProviderPackage: " + this.f520b + ", mQuery: " + this.f521c + ", mCertificates:");
        for (int i = 0; i < this.f522d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f522d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f523e);
        return sb.toString();
    }
}
