package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
class l implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n f1930b;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f1931b;

        a(u uVar) {
            this.f1931b = uVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f1931b.k();
            this.f1931b.m();
            c0.n((ViewGroup) fragmentK.J.getParent(), l.this.f1930b).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    l(n nVar) {
        this.f1930b = nVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        u uVarV;
        StringBuilder sb;
        String str2;
        if (h.class.getName().equals(str)) {
            return new h(context, attributeSet, this.f1930b);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k.c.f773d);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(a.k.c.f774e);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(a.k.c.f775f, -1);
        String string = typedArrayObtainStyledAttributes.getString(a.k.c.g);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !j.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentG0 = resourceId != -1 ? this.f1930b.g0(resourceId) : null;
        if (fragmentG0 == null && string != null) {
            fragmentG0 = this.f1930b.h0(string);
        }
        if (fragmentG0 == null && id != -1) {
            fragmentG0 = this.f1930b.g0(id);
        }
        if (fragmentG0 == null) {
            fragmentG0 = this.f1930b.p0().a(context.getClassLoader(), attributeValue);
            fragmentG0.p = true;
            fragmentG0.y = resourceId != 0 ? resourceId : id;
            fragmentG0.z = id;
            fragmentG0.A = string;
            fragmentG0.q = true;
            n nVar = this.f1930b;
            fragmentG0.u = nVar;
            fragmentG0.v = nVar.s0();
            fragmentG0.x0(this.f1930b.s0().k(), attributeSet, fragmentG0.f1794d);
            uVarV = this.f1930b.g(fragmentG0);
            if (n.E0(2)) {
                sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragmentG0);
                str2 = " has been inflated via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
        } else {
            if (fragmentG0.q) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentG0.q = true;
            n nVar2 = this.f1930b;
            fragmentG0.u = nVar2;
            fragmentG0.v = nVar2.s0();
            fragmentG0.x0(this.f1930b.s0().k(), attributeSet, fragmentG0.f1794d);
            uVarV = this.f1930b.v(fragmentG0);
            if (n.E0(2)) {
                sb = new StringBuilder();
                sb.append("Retained Fragment ");
                sb.append(fragmentG0);
                str2 = " has been re-attached via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
        }
        fragmentG0.I = (ViewGroup) view;
        uVarV.m();
        uVarV.j();
        View view2 = fragmentG0.J;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentG0.J.getTag() == null) {
            fragmentG0.J.setTag(string);
        }
        fragmentG0.J.addOnAttachStateChangeListener(new a(uVarV));
        return fragmentG0.J;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
