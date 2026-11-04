package a.g.l.e0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f645d;

    public a(int i, c cVar, int i2) {
        this.f643b = i;
        this.f644c = cVar;
        this.f645d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f643b);
        this.f644c.N(this.f645d, bundle);
    }
}
