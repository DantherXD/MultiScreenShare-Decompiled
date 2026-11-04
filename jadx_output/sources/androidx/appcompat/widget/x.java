package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class x extends Spinner implements a.g.l.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1512b = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.appcompat.widget.e f1513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f1514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i0 f1515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SpinnerAdapter f1516f;
    private final boolean g;
    private g h;
    int i;
    final Rect j;

    class a extends i0 {
        final /* synthetic */ e k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.k = eVar;
        }

        @Override // androidx.appcompat.widget.i0
        public androidx.appcompat.view.menu.p b() {
            return this.k;
        }

        @Override // androidx.appcompat.widget.i0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (x.this.getInternalPopup().b()) {
                return true;
            }
            x.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!x.this.getInternalPopup().b()) {
                x.this.b();
            }
            ViewTreeObserver viewTreeObserver = x.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    class c implements g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.app.b f1518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ListAdapter f1519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f1520d;

        c() {
        }

        @Override // androidx.appcompat.widget.x.g
        public boolean b() {
            androidx.appcompat.app.b bVar = this.f1518b;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.x.g
        public void c(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.g
        public void d(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.g
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f1518b;
            if (bVar != null) {
                bVar.dismiss();
                this.f1518b = null;
            }
        }

        @Override // androidx.appcompat.widget.x.g
        public int e() {
            return 0;
        }

        @Override // androidx.appcompat.widget.x.g
        public void f(int i, int i2) {
            if (this.f1519c == null) {
                return;
            }
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(x.this.getPopupContext());
            CharSequence charSequence = this.f1520d;
            if (charSequence != null) {
                aVar.h(charSequence);
            }
            androidx.appcompat.app.b bVarA = aVar.g(this.f1519c, x.this.getSelectedItemPosition(), this).a();
            this.f1518b = bVarA;
            ListView listViewE = bVarA.e();
            if (Build.VERSION.SDK_INT >= 17) {
                listViewE.setTextDirection(i);
                listViewE.setTextAlignment(i2);
            }
            this.f1518b.show();
        }

        @Override // androidx.appcompat.widget.x.g
        public int h() {
            return 0;
        }

        @Override // androidx.appcompat.widget.x.g
        public Drawable j() {
            return null;
        }

        @Override // androidx.appcompat.widget.x.g
        public CharSequence k() {
            return this.f1520d;
        }

        @Override // androidx.appcompat.widget.x.g
        public void m(CharSequence charSequence) {
            this.f1520d = charSequence;
        }

        @Override // androidx.appcompat.widget.x.g
        public void n(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.g
        public void o(ListAdapter listAdapter) {
            this.f1519c = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            x.this.setSelection(i);
            if (x.this.getOnItemClickListener() != null) {
                x.this.performItemClick(null, i, this.f1519c.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.x.g
        public void p(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    private static class d implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SpinnerAdapter f1522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ListAdapter f1523c;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1522b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1523c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof t0) {
                    t0 t0Var = (t0) spinnerAdapter;
                    if (t0Var.getDropDownViewTheme() == null) {
                        t0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1523c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1522b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1522b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1522b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1522b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1522b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1523c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1522b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1522b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class e extends k0 implements g {
        private CharSequence K;
        ListAdapter L;
        private final Rect M;
        private int N;

        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f1524b;

            a(x xVar) {
                this.f1524b = xVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                x.this.setSelection(i);
                if (x.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    x.this.performItemClick(view, i, eVar.L.getItemId(i));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.U(x.this)) {
                    e.this.dismiss();
                } else {
                    e.this.S();
                    e.super.g();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1527b;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1527b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = x.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1527b);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.M = new Rect();
            D(x.this);
            J(true);
            O(0);
            L(new a(x.this));
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Code duplicated, block: B:24:0x009a  */
        void S() {
            int iMax;
            int iT;
            Drawable drawableJ = j();
            int i = 0;
            if (drawableJ != null) {
                drawableJ.getPadding(x.this.j);
                i = d1.b(x.this) ? x.this.j.right : -x.this.j.left;
            } else {
                Rect rect = x.this.j;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = x.this.getPaddingLeft();
            int paddingRight = x.this.getPaddingRight();
            int width = x.this.getWidth();
            x xVar = x.this;
            int i2 = xVar.i;
            if (i2 != -2) {
                if (i2 == -1) {
                    iMax = (width - paddingLeft) - paddingRight;
                } else {
                    F(i2);
                }
                if (d1.b(x.this)) {
                    iT = i + (((width - paddingRight) - z()) - T());
                } else {
                    iT = i + paddingLeft + T();
                }
                d(iT);
            }
            int iA = xVar.a((SpinnerAdapter) this.L, j());
            int i3 = x.this.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = x.this.j;
            int i4 = (i3 - rect2.left) - rect2.right;
            if (iA > i4) {
                iA = i4;
            }
            iMax = Math.max(iA, (width - paddingLeft) - paddingRight);
            F(iMax);
            if (d1.b(x.this)) {
                iT = i + (((width - paddingRight) - z()) - T());
            } else {
                iT = i + paddingLeft + T();
            }
            d(iT);
        }

        public int T() {
            return this.N;
        }

        boolean U(View view) {
            return a.g.l.v.S(view) && view.getGlobalVisibleRect(this.M);
        }

        @Override // androidx.appcompat.widget.x.g
        public void f(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zB = b();
            S();
            I(2);
            super.g();
            ListView listViewL = l();
            listViewL.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                listViewL.setTextDirection(i);
                listViewL.setTextAlignment(i2);
            }
            P(x.this.getSelectedItemPosition());
            if (zB || (viewTreeObserver = x.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.x.g
        public CharSequence k() {
            return this.K;
        }

        @Override // androidx.appcompat.widget.x.g
        public void m(CharSequence charSequence) {
            this.K = charSequence;
        }

        @Override // androidx.appcompat.widget.k0, androidx.appcompat.widget.x.g
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.L = listAdapter;
        }

        @Override // androidx.appcompat.widget.x.g
        public void p(int i) {
            this.N = i;
        }
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f1529b;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f1529b = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1529b ? (byte) 1 : (byte) 0);
        }
    }

    interface g {
        boolean b();

        void c(Drawable drawable);

        void d(int i);

        void dismiss();

        int e();

        void f(int i, int i2);

        int h();

        Drawable j();

        CharSequence k();

        void m(CharSequence charSequence);

        void n(int i);

        void o(ListAdapter listAdapter);

        void p(int i);
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.J);
    }

    public x(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public x(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049 A[Catch: Exception -> 0x0051, all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:13:0x0043, B:15:0x0049, B:23:0x0057), top: B:45:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.widget.Spinner, androidx.appcompat.widget.x] */
    public x(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) throws Throwable {
        a.a.n.d dVar;
        ?? r11;
        ?? r2;
        TypedArray typedArrayObtainStyledAttributes;
        boolean zHasValue;
        CharSequence[] charSequenceArrQ;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.j = new Rect();
        s0.a(this, getContext());
        x0 x0VarV = x0.v(context, attributeSet, a.a.j.A2, i, 0);
        this.f1513c = new androidx.appcompat.widget.e(this);
        try {
            if (theme == null) {
                int iN = x0VarV.n(a.a.j.F2, 0);
                if (iN != 0) {
                    dVar = new a.a.n.d(context, iN);
                } else {
                    this.f1514d = context;
                }
                r11 = -1;
                r2 = 0;
                if (i2 == -1) {
                    try {
                        typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1512b, i, 0);
                        try {
                            zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                            r11 = typedArrayObtainStyledAttributes;
                            if (zHasValue) {
                                i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                                r11 = typedArrayObtainStyledAttributes;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                            r11 = typedArrayObtainStyledAttributes;
                            if (typedArrayObtainStyledAttributes != null) {
                            }
                            if (i2 == 0) {
                                c cVar = new c();
                                this.h = cVar;
                                cVar.m(x0VarV.o(a.a.j.D2));
                            } else if (i2 == 1) {
                                e eVar = new e(this.f1514d, attributeSet, i);
                                x0 x0VarV2 = x0.v(this.f1514d, attributeSet, a.a.j.A2, i, 0);
                                this.i = x0VarV2.m(a.a.j.E2, -2);
                                eVar.c(x0VarV2.g(a.a.j.C2));
                                eVar.m(x0VarV.o(a.a.j.D2));
                                x0VarV2.w();
                                this.h = eVar;
                                this.f1515e = new a(this, eVar);
                            }
                            charSequenceArrQ = x0VarV.q(a.a.j.B2);
                            if (charSequenceArrQ != null) {
                                ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                                arrayAdapter.setDropDownViewResource(a.a.g.t);
                                setAdapter(arrayAdapter);
                            }
                            x0VarV.w();
                            this.g = true;
                            spinnerAdapter = this.f1516f;
                            if (spinnerAdapter != null) {
                                setAdapter(spinnerAdapter);
                                this.f1516f = null;
                            }
                            this.f1513c.e(attributeSet, i);
                            return;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        typedArrayObtainStyledAttributes = null;
                    } catch (Throwable th) {
                        th = th;
                        if (r2 != 0) {
                            r2.recycle();
                        }
                        throw th;
                    }
                    r11.recycle();
                }
                if (i2 == 0) {
                    c cVar2 = new c();
                    this.h = cVar2;
                    cVar2.m(x0VarV.o(a.a.j.D2));
                } else if (i2 == 1) {
                    e eVar2 = new e(this.f1514d, attributeSet, i);
                    x0 x0VarV3 = x0.v(this.f1514d, attributeSet, a.a.j.A2, i, 0);
                    this.i = x0VarV3.m(a.a.j.E2, -2);
                    eVar2.c(x0VarV3.g(a.a.j.C2));
                    eVar2.m(x0VarV.o(a.a.j.D2));
                    x0VarV3.w();
                    this.h = eVar2;
                    this.f1515e = new a(this, eVar2);
                }
                charSequenceArrQ = x0VarV.q(a.a.j.B2);
                if (charSequenceArrQ != null) {
                    ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                    arrayAdapter2.setDropDownViewResource(a.a.g.t);
                    setAdapter(arrayAdapter2);
                }
                x0VarV.w();
                this.g = true;
                spinnerAdapter = this.f1516f;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f1516f = null;
                }
                this.f1513c.e(attributeSet, i);
                return;
            }
            dVar = new a.a.n.d(context, theme);
            if (i2 == -1) {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1512b, i, 0);
                zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                r11 = typedArrayObtainStyledAttributes;
                if (zHasValue) {
                    i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    r11 = typedArrayObtainStyledAttributes;
                }
                r11.recycle();
            }
            if (i2 == 0) {
                c cVar3 = new c();
                this.h = cVar3;
                cVar3.m(x0VarV.o(a.a.j.D2));
            } else if (i2 == 1) {
                e eVar3 = new e(this.f1514d, attributeSet, i);
                x0 x0VarV4 = x0.v(this.f1514d, attributeSet, a.a.j.A2, i, 0);
                this.i = x0VarV4.m(a.a.j.E2, -2);
                eVar3.c(x0VarV4.g(a.a.j.C2));
                eVar3.m(x0VarV.o(a.a.j.D2));
                x0VarV4.w();
                this.h = eVar3;
                this.f1515e = new a(this, eVar3);
            }
            charSequenceArrQ = x0VarV.q(a.a.j.B2);
            if (charSequenceArrQ != null) {
                ArrayAdapter arrayAdapter3 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                arrayAdapter3.setDropDownViewResource(a.a.g.t);
                setAdapter(arrayAdapter3);
            }
            x0VarV.w();
            this.g = true;
            spinnerAdapter = this.f1516f;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f1516f = null;
            }
            this.f1513c.e(attributeSet, i);
            return;
        } catch (Throwable th2) {
            th = th2;
            r2 = r11;
        }
        this.f1514d = dVar;
        r11 = -1;
        r2 = 0;
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.j);
        Rect rect = this.j;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.h.f(getTextDirection(), getTextAlignment());
        } else {
            this.h.f(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1513c;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.h;
        if (gVar != null) {
            return gVar.e();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.h;
        if (gVar != null) {
            return gVar.h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.h != null) {
            return this.i;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    final g getInternalPopup() {
        return this.h;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.h;
        if (gVar != null) {
            return gVar.j();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1514d;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.h;
        return gVar != null ? gVar.k() : super.getPrompt();
    }

    @Override // a.g.l.u
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1513c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.g.l.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1513c;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.h;
        if (gVar == null || !gVar.b()) {
            return;
        }
        this.h.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.h == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f1529b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.h;
        fVar.f1529b = gVar != null && gVar.b();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.f1515e;
        if (i0Var == null || !i0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.h;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.g) {
            this.f1516f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.h != null) {
            Context context = this.f1514d;
            if (context == null) {
                context = getContext();
            }
            this.h.o(new d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1513c;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.e eVar = this.f1513c;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        g gVar = this.h;
        if (gVar != null) {
            gVar.p(i);
            this.h.d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        g gVar = this.h;
        if (gVar != null) {
            gVar.n(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.h != null) {
            this.i = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.h;
        if (gVar != null) {
            gVar.c(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(a.a.k.a.a.d(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.h;
        if (gVar != null) {
            gVar.m(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // a.g.l.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1513c;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.g.l.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1513c;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
