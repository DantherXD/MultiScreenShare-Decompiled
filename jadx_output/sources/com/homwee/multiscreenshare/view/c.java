package com.homwee.multiscreenshare.view;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.homwee.multiscreenshare.MyApplication;
import com.homwee.multiscreenshare.R;
import com.homwee.multiscreenshare.m;

/* JADX INFO: loaded from: classes.dex */
public class c implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f4701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f4702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4705f;
    private int g;
    private int h;
    private boolean i;
    private MyApplication k;
    private a l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f4700a = null;
    private boolean j = false;

    public interface a {
        void a(ImageView imageView);
    }

    public c(int i, int i2, int i3, int i4, int i5, a aVar) {
        this.f4703d = -1;
        this.h = -1;
        this.f4704e = i;
        this.f4703d = i3;
        this.f4705f = i2;
        this.g = i4;
        this.h = i5;
        this.l = aVar;
    }

    private void b(LayoutInflater layoutInflater) {
        int i;
        this.f4700a = (ViewGroup) layoutInflater.inflate(R.layout.h_view_pager3, (ViewGroup) null);
        MyApplication myApplication = new MyApplication();
        this.k = myApplication;
        this.j = myApplication.e();
        Log.i("20250324", "ViewHolder3 mIsKAJITO is = " + this.j);
        ImageView imageView = (ImageView) this.f4700a.findViewById(R.id.iv_icon);
        this.f4702c = imageView;
        if (this.g == 0) {
            i = 4;
        } else {
            imageView.setBackgroundResource(this.h);
            imageView = this.f4702c;
            i = 0;
        }
        imageView.setVisibility(i);
        this.f4701b = (ImageView) this.f4700a.findViewById(R.id.iv_qr);
        ImageView imageView2 = (ImageView) this.f4700a.findViewById(R.id.imageView);
        imageView2.setImageResource(this.f4703d);
        ((TextView) this.f4700a.findViewById(R.id.frame_page_title)).setText(this.f4704e);
        ((TextView) this.f4700a.findViewById(R.id.textView)).setText(this.f4705f);
        m.a(this.f4700a.getContext()).G(Integer.valueOf(this.f4703d)).n0(imageView2);
        a aVar = this.l;
        if (aVar != null) {
            this.i = true;
            aVar.a(this.f4701b);
        }
    }

    @Override // com.homwee.multiscreenshare.view.f
    public View a(LayoutInflater layoutInflater) {
        if (this.f4700a == null) {
            b(layoutInflater);
        }
        return this.f4700a;
    }

    public void c() {
        ImageView imageView;
        a aVar = this.l;
        if (aVar == null || (imageView = this.f4701b) == null || !this.i) {
            return;
        }
        aVar.a(imageView);
    }
}
