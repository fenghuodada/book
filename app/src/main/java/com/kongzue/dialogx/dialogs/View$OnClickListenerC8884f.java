package com.kongzue.dialogx.dialogs;

import android.view.View;
import android.widget.EditText;
import com.kongzue.dialogx.dialogs.C8887i;
import com.kongzue.dialogx.interfaces.InterfaceC8938j;
import com.kongzue.dialogx.interfaces.InterfaceC8939k;

/* renamed from: com.kongzue.dialogx.dialogs.f */
/* loaded from: classes3.dex */
public final class View$OnClickListenerC8884f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C8887i.C8888a f16917a;

    public View$OnClickListenerC8884f(C8887i.C8888a c8888a) {
        this.f16917a = c8888a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C8887i.C8888a c8888a = this.f16917a;
        C8887i.this.getClass();
        C8887i c8887i = C8887i.this;
        EditText editText = c8888a.f16938g;
        if (editText != null) {
            c8887i.m2865q(editText, false);
        }
        InterfaceC8938j interfaceC8938j = c8887i.f16926G;
        if (interfaceC8938j != null) {
            if (interfaceC8938j instanceof InterfaceC8939k) {
                if (editText != null) {
                    editText.getText().toString();
                }
                if (((InterfaceC8939k) c8887i.f16926G).m2851a()) {
                    return;
                }
            } else {
                interfaceC8938j.mo2852a(c8887i.f16929x);
            }
        }
        c8888a.m2910a(view);
    }
}
