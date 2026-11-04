package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.a$a, reason: collision with other inner class name */
    public static final class C0094a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f3828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f3829b;

        private C0094a(Object obj) {
            this.f3829b = b.d(obj);
            this.f3828a = new ArrayList();
        }

        public final C0094a a(String str, Object obj) {
            List<String> list = this.f3828a;
            String str2 = (String) b.d(str);
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + strValueOf.length());
            sb.append(str2);
            sb.append("=");
            sb.append(strValueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f3829b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f3828a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f3828a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static C0094a c(Object obj) {
        return new C0094a(obj);
    }
}
