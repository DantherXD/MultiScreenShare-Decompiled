package a.q;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f920b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f919a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<m> f921c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public s(View view) {
        this.f920b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f920b == sVar.f920b && this.f919a.equals(sVar.f919a);
    }

    public int hashCode() {
        return (this.f920b.hashCode() * 31) + this.f919a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f920b + "\n") + "    values:";
        for (String str2 : this.f919a.keySet()) {
            str = str + "    " + str2 + ": " + this.f919a.get(str2) + "\n";
        }
        return str;
    }
}
