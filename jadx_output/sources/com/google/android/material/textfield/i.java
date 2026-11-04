package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
class i extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextWatcher f4234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextInputLayout.f f4235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextInputLayout.g f4236f;

    class a extends com.google.android.material.internal.i {
        a() {
        }

        @Override // com.google.android.material.internal.i, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            i iVar = i.this;
            iVar.f4219c.setChecked(!iVar.g());
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            i iVar = i.this;
            iVar.f4219c.setChecked(!iVar.g());
            editText.removeTextChangedListener(i.this.f4234d);
            editText.addTextChangedListener(i.this.f4234d);
        }
    }

    class c implements TextInputLayout.g {

        class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EditText f4240b;

            a(EditText editText) {
                this.f4240b = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f4240b.removeTextChangedListener(i.this.f4234d);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = i.this.f4217a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(i.this.g() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            i.this.f4217a.V();
        }
    }

    i(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f4234d = new a();
        this.f4235e = new b();
        this.f4236f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText editText = this.f4217a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.f4217a.setEndIconDrawable(a.a.k.a.a.d(this.f4218b, c.b.a.b.e.f2717a));
        TextInputLayout textInputLayout = this.f4217a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(c.b.a.b.i.p));
        this.f4217a.setEndIconOnClickListener(new d());
        this.f4217a.e(this.f4235e);
        this.f4217a.f(this.f4236f);
        EditText editText = this.f4217a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
