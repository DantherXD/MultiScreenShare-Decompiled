package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import c.b.a.b.f;
import c.b.a.b.h;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.i;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Chip f4245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextInputLayout f4246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EditText f4247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextWatcher f4248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f4249f;

    private class b extends i {
        private b() {
        }

        @Override // com.google.android.material.internal.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f4245b.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f4245b.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(h.g, (ViewGroup) this, false);
        this.f4245b = chip;
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(h.h, (ViewGroup) this, false);
        this.f4246c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f4247d = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f4248e = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f4249f = (TextView) findViewById(f.l);
        editText.setSaveEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return c.j(getResources(), charSequence);
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4247d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4245b.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f4245b.setChecked(z);
        this.f4247d.setVisibility(z ? 0 : 4);
        this.f4245b.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            this.f4247d.requestFocus();
            if (TextUtils.isEmpty(this.f4247d.getText())) {
                return;
            }
            EditText editText = this.f4247d;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f4245b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f4245b.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f4245b.toggle();
    }
}
