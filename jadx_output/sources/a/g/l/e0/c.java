package a.g.l.e0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AccessibilityNodeInfo f647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f648c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f649d = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f650a = new a(1, null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f651b = new a(2, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f652c = new a(4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f653d = new a(8, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f654e = new a(16, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f655f = new a(32, null);
        public static final a g = new a(64, null);
        public static final a h = new a(128, null);
        public static final a i = new a(256, (CharSequence) null, (Class<? extends f.a>) f.b.class);
        public static final a j = new a(512, (CharSequence) null, (Class<? extends f.a>) f.b.class);
        public static final a k = new a(1024, (CharSequence) null, (Class<? extends f.a>) f.c.class);
        public static final a l = new a(2048, (CharSequence) null, (Class<? extends f.a>) f.c.class);
        public static final a m = new a(4096, null);
        public static final a n = new a(8192, null);
        public static final a o = new a(16384, null);
        public static final a p = new a(32768, null);
        public static final a q = new a(65536, null);
        public static final a r = new a(131072, (CharSequence) null, (Class<? extends f.a>) f.g.class);
        public static final a s = new a(262144, null);
        public static final a t = new a(524288, null);
        public static final a u = new a(1048576, null);
        public static final a v = new a(2097152, (CharSequence) null, (Class<? extends f.a>) f.h.class);
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        final Object N;
        private final int O;
        private final Class<? extends f.a> P;
        protected final f Q;

        static {
            int i2 = Build.VERSION.SDK_INT;
            w = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            x = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, f.e.class);
            y = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            z = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            A = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            B = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            C = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            D = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            E = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            F = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            G = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            H = new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, f.C0021f.class);
            I = new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, f.d.class);
            J = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            K = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            L = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            M = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a(int i2, CharSequence charSequence, f fVar) {
            this(null, i2, charSequence, fVar, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.O = i2;
            this.Q = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.N = obj;
            this.P = cls;
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.O, charSequence, fVar, this.P);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.N).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.N).getLabel();
            }
            return null;
        }

        public boolean d(View view, Bundle bundle) {
            if (this.Q == null) {
                return false;
            }
            f.a aVar = null;
            Class<? extends f.a> cls = this.P;
            if (cls != null) {
                try {
                    f.a aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e2) {
                        e = e2;
                        aVar = aVarNewInstance;
                        Class<? extends f.a> cls2 = this.P;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            return this.Q.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.N;
            if (obj2 == null) {
                return aVar.N == null;
            }
            return obj2.equals(aVar.N);
        }

        public int hashCode() {
            Object obj = this.N;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f656a;

        b(Object obj) {
            this.f656a = obj;
        }

        public static b a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            return i4 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b(null);
        }
    }

    /* JADX INFO: renamed from: a.g.l.e0.c$c, reason: collision with other inner class name */
    public static class C0020c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f657a;

        C0020c(Object obj) {
            this.f657a = obj;
        }

        public static C0020c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C0020c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            return i5 >= 19 ? new C0020c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0020c(null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f647b = accessibilityNodeInfo;
    }

    public static c K() {
        return v0(AccessibilityNodeInfo.obtain());
    }

    public static c L(View view) {
        return v0(AccessibilityNodeInfo.obtain(view));
    }

    public static c M(c cVar) {
        return v0(AccessibilityNodeInfo.obtain(cVar.f647b));
    }

    private void P(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayU = u(view);
        if (sparseArrayU != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < sparseArrayU.size(); i++) {
                if (sparseArrayU.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sparseArrayU.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    private void R(int i, boolean z) {
        Bundle bundleR = r();
        if (bundleR != null) {
            int i2 = bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleR.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f647b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f647b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f647b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f647b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f647b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f647b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String i(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    private boolean k(int i) {
        Bundle bundleR = r();
        return bundleR != null && (bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> s(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayU = u(view);
        if (sparseArrayU != null) {
            return sparseArrayU;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(a.g.b.I, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> u(View view) {
        return (SparseArray) view.getTag(a.g.b.I);
    }

    public static c v0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private boolean x() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int y(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f646a;
        f646a = i2 + 1;
        return i2;
    }

    public boolean A() {
        return this.f647b.isChecked();
    }

    public boolean B() {
        return this.f647b.isClickable();
    }

    public boolean C() {
        return this.f647b.isEnabled();
    }

    public boolean D() {
        return this.f647b.isFocusable();
    }

    public boolean E() {
        return this.f647b.isFocused();
    }

    public boolean F() {
        return this.f647b.isLongClickable();
    }

    public boolean G() {
        return this.f647b.isPassword();
    }

    public boolean H() {
        return this.f647b.isScrollable();
    }

    public boolean I() {
        return this.f647b.isSelected();
    }

    public boolean J() {
        return Build.VERSION.SDK_INT >= 26 ? this.f647b.isShowingHintText() : k(4);
    }

    public boolean N(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f647b.performAction(i, bundle);
        }
        return false;
    }

    public void O() {
        this.f647b.recycle();
    }

    public void Q(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f647b.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    public void S(Rect rect) {
        this.f647b.setBoundsInParent(rect);
    }

    public void T(Rect rect) {
        this.f647b.setBoundsInScreen(rect);
    }

    public void U(boolean z) {
        this.f647b.setCheckable(z);
    }

    public void V(boolean z) {
        this.f647b.setChecked(z);
    }

    public void W(CharSequence charSequence) {
        this.f647b.setClassName(charSequence);
    }

    public void X(boolean z) {
        this.f647b.setClickable(z);
    }

    public void Y(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f647b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f656a);
        }
    }

    public void Z(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f647b.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0020c) obj).f657a);
        }
    }

    public void a(int i) {
        this.f647b.addAction(i);
    }

    public void a0(CharSequence charSequence) {
        this.f647b.setContentDescription(charSequence);
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f647b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.N);
        }
    }

    public void b0(boolean z) {
        this.f647b.setEnabled(z);
    }

    public void c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f647b.addChild(view, i);
        }
    }

    public void c0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f647b.setError(charSequence);
        }
    }

    public void d0(boolean z) {
        this.f647b.setFocusable(z);
    }

    public void e(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i < 19 || i >= 26) {
            return;
        }
        f();
        P(view);
        ClickableSpan[] clickableSpanArrP = p(charSequence);
        if (clickableSpanArrP == null || clickableSpanArrP.length <= 0) {
            return;
        }
        r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a.g.b.f433a);
        SparseArray<WeakReference<ClickableSpan>> sparseArrayS = s(view);
        for (int i2 = 0; i2 < clickableSpanArrP.length; i2++) {
            int iY = y(clickableSpanArrP[i2], sparseArrayS);
            sparseArrayS.put(iY, new WeakReference<>(clickableSpanArrP[i2]));
            d(clickableSpanArrP[i2], (Spanned) charSequence, iY);
        }
    }

    public void e0(boolean z) {
        this.f647b.setFocused(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f647b;
        if (accessibilityNodeInfo == null) {
            if (cVar.f647b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f647b)) {
            return false;
        }
        return this.f649d == cVar.f649d && this.f648c == cVar.f648c;
    }

    public void f0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f647b.setHeading(z);
        } else {
            R(2, z);
        }
    }

    public void g0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f647b.setHintText(charSequence);
        } else if (i >= 19) {
            this.f647b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public List<a> h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f647b.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(actionList.get(i)));
        }
        return arrayList;
    }

    public void h0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f647b.setMaxTextLength(i);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f647b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(CharSequence charSequence) {
        this.f647b.setPackageName(charSequence);
    }

    public int j() {
        return this.f647b.getActions();
    }

    public void j0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f647b.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f647b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void k0(View view) {
        this.f648c = -1;
        this.f647b.setParent(view);
    }

    @Deprecated
    public void l(Rect rect) {
        this.f647b.getBoundsInParent(rect);
    }

    public void l0(View view, int i) {
        this.f648c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f647b.setParent(view, i);
        }
    }

    public void m(Rect rect) {
        this.f647b.getBoundsInScreen(rect);
    }

    public void m0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f647b.setScreenReaderFocusable(z);
        } else {
            R(1, z);
        }
    }

    public int n() {
        return this.f647b.getChildCount();
    }

    public void n0(boolean z) {
        this.f647b.setScrollable(z);
    }

    public CharSequence o() {
        return this.f647b.getClassName();
    }

    public void o0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f647b.setShowingHintText(z);
        } else {
            R(4, z);
        }
    }

    public void p0(View view, int i) {
        this.f649d = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f647b.setSource(view, i);
        }
    }

    public CharSequence q() {
        return this.f647b.getContentDescription();
    }

    public void q0(CharSequence charSequence) {
        if (a.g.h.a.a()) {
            this.f647b.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f647b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public Bundle r() {
        return Build.VERSION.SDK_INT >= 19 ? this.f647b.getExtras() : new Bundle();
    }

    public void r0(CharSequence charSequence) {
        this.f647b.setText(charSequence);
    }

    public void s0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f647b.setTraversalAfter(view);
        }
    }

    public CharSequence t() {
        return this.f647b.getPackageName();
    }

    public void t0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f647b.setVisibleToUser(z);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(t());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(v());
        sb.append("; contentDescription: ");
        sb.append(q());
        sb.append("; viewId: ");
        sb.append(w());
        sb.append("; checkable: ");
        sb.append(z());
        sb.append("; checked: ");
        sb.append(A());
        sb.append("; focusable: ");
        sb.append(D());
        sb.append("; focused: ");
        sb.append(E());
        sb.append("; selected: ");
        sb.append(I());
        sb.append("; clickable: ");
        sb.append(B());
        sb.append("; longClickable: ");
        sb.append(F());
        sb.append("; enabled: ");
        sb.append(C());
        sb.append("; password: ");
        sb.append(G());
        sb.append("; scrollable: " + H());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> listH = h();
            for (int i = 0; i < listH.size(); i++) {
                a aVar = listH.get(i);
                String strI = i(aVar.b());
                if (strI.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    strI = aVar.c().toString();
                }
                sb.append(strI);
                if (i != listH.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int iJ = j();
            while (iJ != 0) {
                int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iJ);
                iJ &= ~iNumberOfTrailingZeros;
                sb.append(i(iNumberOfTrailingZeros));
                if (iJ != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public AccessibilityNodeInfo u0() {
        return this.f647b;
    }

    public CharSequence v() {
        if (!x()) {
            return this.f647b.getText();
        }
        List<Integer> listG = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listG2 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listG3 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listG4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f647b.getText(), 0, this.f647b.getText().length()));
        for (int i = 0; i < listG.size(); i++) {
            spannableString.setSpan(new a.g.l.e0.a(listG4.get(i).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listG.get(i).intValue(), listG2.get(i).intValue(), listG3.get(i).intValue());
        }
        return spannableString;
    }

    public String w() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f647b.getViewIdResourceName();
        }
        return null;
    }

    public boolean z() {
        return this.f647b.isCheckable();
    }
}
