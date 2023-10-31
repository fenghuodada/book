package com.kongzue.dialogx.dialogs;

import android.view.View;
import android.widget.EditText;
import com.kongzue.dialogx.dialogs.C8887i;

/* renamed from: com.kongzue.dialogx.dialogs.g */
/* loaded from: classes3.dex */
public final class View$OnClickListenerC8885g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C8887i.C8888a f16918a;

    public View$OnClickListenerC8885g(C8887i.C8888a c8888a) {
        this.f16918a = c8888a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C8887i.C8888a c8888a = this.f16918a;
        C8887i.this.getClass();
        EditText editText = c8888a.f16938g;
        if (editText != null) {
            C8887i.this.m2865q(editText, false);
        }
        C8887i.this.getClass();
        c8888a.m2910a(view);
    }
}
