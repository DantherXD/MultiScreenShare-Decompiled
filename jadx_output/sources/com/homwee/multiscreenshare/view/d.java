package com.homwee.multiscreenshare.view;

import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.homwee.multiscreenshare.R;
import com.homwee.multiscreenshare.m;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearLayout f4710e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f4711f;
    private TextView g;
    private TextView h;
    private ImageView i;

    public d(String str, int i, int i2, int i3) {
        this.f4709d = -1;
        this.f4706a = str;
        this.f4709d = i3;
        this.f4707b = i;
        this.f4708c = i2;
    }

    private void b(LayoutInflater layoutInflater) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.h_view_pager_miracast, (ViewGroup) null);
        this.f4710e = linearLayout;
        TextView textView = (TextView) linearLayout.findViewById(R.id.frame_page_devicename_text);
        this.f4711f = textView;
        textView.setText(this.f4706a);
        if (c()) {
            int iApplyDimension = (int) TypedValue.applyDimension(1, 440.0f, layoutInflater.getContext().getResources().getDisplayMetrics());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4711f.getLayoutParams();
            if (marginLayoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            }
            marginLayoutParams.setMarginStart(iApplyDimension);
            this.f4711f.setLayoutParams(marginLayoutParams);
        }
        TextView textView2 = (TextView) this.f4710e.findViewById(R.id.frame_page_title);
        this.g = textView2;
        if (this.f4707b == 0) {
            textView2.setVisibility(4);
        } else {
            textView2.setVisibility(0);
            this.g.setText(this.f4707b);
        }
        TextView textView3 = (TextView) this.f4710e.findViewById(R.id.frame_page_info);
        this.h = textView3;
        textView3.setText(this.f4708c);
        this.i = (ImageView) this.f4710e.findViewById(R.id.frame_page_image);
        if (this.f4709d != -1) {
            m.a(this.f4710e.getContext()).G(Integer.valueOf(this.f4709d)).n0(this.i);
        } else {
            Log.i("help", "initView: img gone");
            this.i.setVisibility(8);
        }
    }

    @Override // com.homwee.multiscreenshare.view.f
    public View a(LayoutInflater layoutInflater) {
        if (this.f4710e == null) {
            b(layoutInflater);
        }
        return this.f4710e;
    }

    public boolean c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) > 0;
    }
}
