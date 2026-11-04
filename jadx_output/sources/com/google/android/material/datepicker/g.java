package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class g extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f4007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Calendar f4008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4010e;

    static {
        f4007b = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar calendarK = s.k();
        this.f4008c = calendarK;
        this.f4009d = calendarK.getMaximum(7);
        this.f4010e = calendarK.getFirstDayOfWeek();
    }

    private int b(int i) {
        int i2 = i + this.f4010e;
        int i3 = this.f4009d;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.f4009d) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4009d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c.b.a.b.h.k, viewGroup, false);
        }
        this.f4008c.set(7, b(i));
        textView.setText(this.f4008c.getDisplayName(7, f4007b, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(c.b.a.b.i.j), this.f4008c.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
