package com.google.firebase.p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile e f4533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<g> f4534b = new HashSet();

    e() {
    }

    public static e a() {
        e eVar = f4533a;
        if (eVar == null) {
            synchronized (e.class) {
                eVar = f4533a;
                if (eVar == null) {
                    eVar = new e();
                    f4533a = eVar;
                }
            }
        }
        return eVar;
    }

    Set<g> b() {
        Set<g> setUnmodifiableSet;
        synchronized (this.f4534b) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f4534b);
        }
        return setUnmodifiableSet;
    }
}
