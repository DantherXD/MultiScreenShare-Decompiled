package com.homwee.multiscreenshare.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.homwee.multiscreenshare.R;
import com.homwee.multiscreenshare.m;

/* JADX INFO: loaded from: classes.dex */
public class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f4697d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f4698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4699f;
    private a g;

    public interface a {
        void a(ImageView imageView);
    }

    public b(int i, int i2, int i3, a aVar) {
        this.f4696c = -1;
        this.f4696c = i2;
        this.f4694a = i;
        this.f4695b = i3;
        this.g = aVar;
    }

    private void b(LayoutInflater layoutInflater) {
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.h_view_pager2, (ViewGroup) null);
        this.f4697d = viewGroup;
        this.f4698e = (ImageView) viewGroup.findViewById(R.id.iv_qr);
        ImageView imageView = (ImageView) this.f4697d.findViewById(R.id.imageView);
        imageView.setImageResource(this.f4696c);
        ((TextView) this.f4697d.findViewById(R.id.textView)).setText(this.f4694a);
        ((TextView) this.f4697d.findViewById(R.id.tv_qr)).setText(this.f4695b);
        m.a(this.f4697d.getContext()).G(Integer.valueOf(this.f4696c)).n0(imageView);
        a aVar = this.g;
        if (aVar != null) {
            this.f4699f = true;
            aVar.a(this.f4698e);
        }
    }

    @Override // com.homwee.multiscreenshare.view.f
    public View a(LayoutInflater layoutInflater) {
        if (this.f4697d == null) {
            b(layoutInflater);
        }
        return this.f4697d;
    }

    public void c() {
        ImageView imageView;
        a aVar = this.g;
        if (aVar == null || (imageView = this.f4698e) == null || !this.f4699f) {
            return;
        }
        aVar.a(imageView);
    }
}
