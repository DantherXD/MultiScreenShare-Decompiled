package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class u extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<m<?>> f4368b;

    public u(List<m<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f4368b = list;
    }
}
