package com.homwee.multiscreenshare.q;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.homwee.multiscreenshare.R;
import com.homwee.multiscreenshare.view.e;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends RecyclerView.h<C0109a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<e> f4665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f4666e;

    /* JADX INFO: renamed from: com.homwee.multiscreenshare.q.a$a, reason: collision with other inner class name */
    static class C0109a extends RecyclerView.e0 {
        private TextView u;
        private ImageView v;
        private LinearLayout w;

        C0109a(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.item_tv);
            this.v = (ImageView) view.findViewById(R.id.item_iv);
            this.w = (LinearLayout) view.findViewById(R.id.bg);
        }
    }

    public a(List<e> list, Context context) {
        this.f4665d = list;
        this.f4666e = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int d() {
        return this.f4665d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void l(C0109a c0109a, int i) {
        ImageView imageView;
        Integer numD;
        e eVar = this.f4665d.get(i);
        c0109a.u.setText(eVar.a());
        if (eVar.e()) {
            c0109a.u.setTextColor(this.f4666e.getColor(R.color.main_list_text_press));
            c0109a.w.setBackgroundResource(R.drawable.bg_item_selected);
            imageView = c0109a.v;
            numD = eVar.b();
        } else {
            c0109a.u.setTextColor(this.f4666e.getResources().getColor(R.color.white));
            c0109a.w.setBackgroundResource(R.drawable.bg_item_unselect);
            imageView = c0109a.v;
            numD = eVar.d();
        }
        imageView.setImageResource(numD.intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public C0109a n(ViewGroup viewGroup, int i) {
        return new C0109a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lv_item, viewGroup, false));
    }
}
