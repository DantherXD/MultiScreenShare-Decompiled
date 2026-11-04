package com.homwee.multiscreenshare.view;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.homwee.multiscreenshare.MyApplication;
import com.homwee.multiscreenshare.R;
import com.homwee.multiscreenshare.m;

/* JADX INFO: loaded from: classes.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4692e;
    private TextView g;
    private TextView h;
    private ImageView i;
    private ImageView j;
    private MyApplication l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f4693f = null;
    private boolean k = false;

    public a(int i, int i2, int i3, int i4, int i5) {
        this.f4690c = -1;
        this.f4692e = -1;
        this.f4692e = i3;
        this.f4688a = i;
        this.f4691d = i2;
        this.f4689b = i4;
        this.f4690c = i5;
    }

    private void b(LayoutInflater layoutInflater) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.h_view_pager1, (ViewGroup) null);
        this.f4693f = linearLayout;
        this.g = (TextView) linearLayout.findViewById(R.id.frame_page_title);
        this.j = (ImageView) this.f4693f.findViewById(R.id.frame_icon_image);
        MyApplication myApplication = new MyApplication();
        this.l = myApplication;
        this.k = myApplication.e();
        Log.i("20250324", "ViewHolder1 mIsKAJITO is = " + this.k);
        if (this.f4688a == 0) {
            this.g.setVisibility(4);
        } else {
            this.g.setVisibility(0);
            this.g.setText(this.f4688a);
        }
        if (this.f4689b == 0) {
            this.j.setVisibility(4);
        } else {
            this.j.setBackgroundResource(this.f4690c);
            this.j.setVisibility(0);
        }
        TextView textView = (TextView) this.f4693f.findViewById(R.id.frame_page_info);
        this.h = textView;
        textView.setText(this.f4691d);
        this.i = (ImageView) this.f4693f.findViewById(R.id.frame_page_image);
        if (this.f4692e != -1) {
            m.a(this.f4693f.getContext()).G(Integer.valueOf(this.f4692e)).n0(this.i);
        } else {
            Log.i("help", "initView: img gone");
            this.i.setVisibility(8);
        }
    }

    @Override // com.homwee.multiscreenshare.view.f
    public View a(LayoutInflater layoutInflater) {
        if (this.f4693f == null) {
            b(layoutInflater);
        }
        return this.f4693f;
    }
}
