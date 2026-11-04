package com.blankj.utilcode.util;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class UtilsTransActivity extends androidx.appcompat.app.c {
    private static final Map<UtilsTransActivity, a> s = new HashMap();

    public static abstract class a implements Serializable {
        public boolean a(UtilsTransActivity utilsTransActivity, MotionEvent motionEvent) {
            return false;
        }

        public void b(UtilsTransActivity utilsTransActivity, int i, int i2, Intent intent) {
        }

        public void c(UtilsTransActivity utilsTransActivity, Bundle bundle) {
        }

        public void d(UtilsTransActivity utilsTransActivity, Bundle bundle) {
        }

        public void e(UtilsTransActivity utilsTransActivity) {
        }

        public void f(UtilsTransActivity utilsTransActivity) {
        }

        public void g(UtilsTransActivity utilsTransActivity, int i, String[] strArr, int[] iArr) {
        }

        public void h(UtilsTransActivity utilsTransActivity) {
        }

        public void i(UtilsTransActivity utilsTransActivity, Bundle bundle) {
        }

        public void j(UtilsTransActivity utilsTransActivity) {
        }

        public void k(UtilsTransActivity utilsTransActivity) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar = s.get(this);
        if (aVar != null && aVar.a(this, motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        a aVar = s.get(this);
        if (aVar == null) {
            return;
        }
        aVar.b(this, i, i2, intent);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        Serializable serializableExtra = getIntent().getSerializableExtra("extra_delegate");
        if (!(serializableExtra instanceof a)) {
            super.onCreate(bundle);
            finish();
            return;
        }
        a aVar = (a) serializableExtra;
        s.put(this, aVar);
        aVar.c(this, bundle);
        super.onCreate(bundle);
        aVar.d(this, bundle);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Map<UtilsTransActivity, a> map = s;
        a aVar = map.get(this);
        if (aVar == null) {
            return;
        }
        aVar.e(this);
        map.remove(this);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
        a aVar = s.get(this);
        if (aVar == null) {
            return;
        }
        aVar.f(this);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        a aVar = s.get(this);
        if (aVar == null) {
            return;
        }
        aVar.g(this, i, strArr, iArr);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onResume() {
        super.onResume();
        a aVar = s.get(this);
        if (aVar == null) {
            return;
        }
        aVar.h(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        a aVar = s.get(this);
        if (aVar == null) {
            return;
        }
        aVar.i(this, bundle);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    protected void onStart() {
        super.onStart();
        a aVar = s.get(this);
        if (aVar == null) {
            return;
        }
        aVar.j(this);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    protected void onStop() {
        super.onStop();
        a aVar = s.get(this);
        if (aVar == null) {
            return;
        }
        aVar.k(this);
    }
}
