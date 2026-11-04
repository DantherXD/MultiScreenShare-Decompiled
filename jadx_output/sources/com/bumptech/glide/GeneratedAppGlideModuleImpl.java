package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.homwee.multiscreenshare.GlideConfigModule;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GlideConfigModule f3042a = new GlideConfigModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.homwee.multiscreenshare.GlideConfigModule");
        }
    }

    @Override // com.bumptech.glide.p.c
    public void a(Context context, c cVar, i iVar) {
        this.f3042a.a(context, cVar, iVar);
    }

    @Override // com.bumptech.glide.p.a
    public void b(Context context, d dVar) {
        this.f3042a.b(context, dVar);
    }

    @Override // com.bumptech.glide.p.a
    public boolean c() {
        return this.f3042a.c();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public Set<Class<?>> d() {
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a e() {
        return new a();
    }
}
