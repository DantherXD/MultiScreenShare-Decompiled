package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface d<S> extends Parcelable {
    S a();

    String b(Context context);

    int c(Context context);

    Collection<a.g.k.d<Long, Long>> d();

    boolean f();

    void g(long j);

    View h(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, o<S> oVar);

    Collection<Long> i();
}
