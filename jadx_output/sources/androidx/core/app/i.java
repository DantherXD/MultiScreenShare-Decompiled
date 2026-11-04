package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CharSequence f1734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IconCompat f1735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f1736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f1737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f1738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f1739f;

    public IconCompat a() {
        return this.f1735b;
    }

    public String b() {
        return this.f1737d;
    }

    public CharSequence c() {
        return this.f1734a;
    }

    public String d() {
        return this.f1736c;
    }

    public boolean e() {
        return this.f1738e;
    }

    public boolean f() {
        return this.f1739f;
    }

    public String g() {
        String str = this.f1736c;
        if (str != null) {
            return str;
        }
        if (this.f1734a == null) {
            return "";
        }
        return "name:" + ((Object) this.f1734a);
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().l() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}
