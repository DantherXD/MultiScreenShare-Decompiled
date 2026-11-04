package com.homwee.multiscreenshare.view;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.homwee.multiscreenshare.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<f> f4719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f4720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LayoutInflater f4721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4722f;
    private int g;
    private int h;
    private int i;
    private int j;
    private ViewPager k;
    private String l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4717a = R.layout.v_view_pager1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f4718b = null;
    private Handler m = new Handler();
    private int n = 0;
    private boolean o = false;
    private Runnable p = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar;
            int i;
            if (g.this.o) {
                int size = g.this.f4719c.size();
                if (size > 1) {
                    if (g.this.f4722f) {
                        gVar = g.this;
                        i = (gVar.n - 1) + size;
                    } else {
                        gVar = g.this;
                        i = gVar.n + 1;
                    }
                    gVar.n = i % size;
                    g.this.k.K(g.this.n, true);
                }
                g.this.m.postDelayed(this, 8000L);
            }
        }
    }

    class b implements com.homwee.multiscreenshare.q.b.a {
        b() {
        }

        @Override // com.homwee.multiscreenshare.q.b.a
        public View a(int i) {
            return ((f) g.this.f4719c.get(i)).a(g.this.f4721e);
        }

        @Override // com.homwee.multiscreenshare.q.b.a
        public int b() {
            return g.this.f4719c.size();
        }
    }

    public class c implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f4726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4727c;

        public c(int i, LinearLayout linearLayout, boolean z) {
            this.f4725a = i;
            this.f4726b = linearLayout;
            this.f4727c = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f2, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            View childAt;
            View childAt2;
            g.this.n = i;
            g.this.m.removeCallbacks(g.this.p);
            g.this.m.postDelayed(g.this.p, 8000L);
            int i2 = 0;
            while (true) {
                int i3 = this.f4725a;
                if (i2 >= i3) {
                    return;
                }
                if (this.f4727c) {
                    LinearLayout linearLayout = this.f4726b;
                    int i4 = i3 - 1;
                    if (i2 == i) {
                        childAt2 = linearLayout.getChildAt(i4 - i);
                        childAt2.setEnabled(true);
                    } else {
                        childAt = linearLayout.getChildAt(i4 - i2);
                        childAt.setEnabled(false);
                    }
                } else {
                    LinearLayout linearLayout2 = this.f4726b;
                    if (i2 == i) {
                        childAt2 = linearLayout2.getChildAt(i);
                        childAt2.setEnabled(true);
                    } else {
                        childAt = linearLayout2.getChildAt(i2);
                        childAt.setEnabled(false);
                    }
                }
                i2++;
            }
        }
    }

    public g(ArrayList<f> arrayList, Context context, String str) {
        this.f4720d = context;
        this.f4721e = LayoutInflater.from(context);
        this.f4719c = arrayList;
        this.l = str;
        this.f4722f = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) > 0;
        this.g = com.homwee.multiscreenshare.r.a.a(this.f4720d, 6.0f);
        this.h = com.homwee.multiscreenshare.r.a.a(this.f4720d, 6.0f);
        this.i = com.homwee.multiscreenshare.r.a.a(this.f4720d, 15.0f);
        this.j = 200;
    }

    private void j(ViewPager viewPager) {
        com.homwee.multiscreenshare.r.b bVar = new com.homwee.multiscreenshare.r.b(viewPager.getContext(), new AccelerateDecelerateInterpolator());
        bVar.b(this.j);
        bVar.a(viewPager);
    }

    private void n() {
        View viewInflate = this.f4721e.inflate(this.f4717a, (ViewGroup) null);
        this.f4718b = viewInflate;
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.antenna_dot);
        linearLayout.removeAllViews();
        if (this.f4722f) {
            Collections.reverse(this.f4719c);
        }
        this.k = (ViewPager) this.f4718b.findViewById(R.id.antenna_viewPager);
        this.k.setAdapter(new com.homwee.multiscreenshare.q.b(new b()));
        j(this.k);
        for (int i = 0; i < this.f4719c.size(); i++) {
            View view = new View(this.f4720d);
            view.setBackgroundResource(R.drawable.background_dot);
            view.setEnabled(false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.g, this.h);
            int i2 = this.i;
            layoutParams.leftMargin = i2;
            layoutParams.bottomMargin = i2;
            linearLayout.addView(view, layoutParams);
        }
        if (this.f4722f) {
            this.k.setCurrentItem(this.f4719c.size() - 1);
        } else {
            this.k.setCurrentItem(0);
        }
        linearLayout.getChildAt(0).setEnabled(true);
        this.k.b(new c(this.f4719c.size(), linearLayout, this.f4722f));
    }

    public ArrayList<f> k() {
        return this.f4719c;
    }

    public View l() {
        if (this.f4718b == null) {
            n();
        }
        return this.f4718b;
    }

    public String m() {
        return this.l;
    }

    public void o(boolean z) {
        this.o = z;
        if (z) {
            this.m.postDelayed(this.p, 8000L);
        } else {
            this.m.removeCallbacks(this.p);
        }
    }
}
