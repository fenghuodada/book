package com.kongzue.dialogx.dialogs;

import com.kongzue.dialogx.dialogs.C8887i;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* renamed from: com.kongzue.dialogx.dialogs.e */
/* loaded from: classes3.dex */
public final class C8883e implements DialogXBaseRelativeLayout.InterfaceC8952e {

    /* renamed from: a */
    public final /* synthetic */ C8887i.C8888a f16916a;

    public C8883e(C8887i.C8888a c8888a) {
        this.f16916a = c8888a;
    }

    @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.InterfaceC8952e
    public final void onBackPressed() {
        boolean z;
        C8887i.C8888a c8888a = this.f16916a;
        C8887i.this.getClass();
        C8887i c8887i = C8887i.this;
        int i = c8887i.f16930y;
        if (i != 0) {
            z = true;
            if (i != 1) {
                z = false;
            }
        } else {
            z = c8887i.f17018g;
        }
        if (z) {
            c8887i.getClass();
            BaseDialog.m2856z(new RunnableC8879b(c8887i));
        }
    }
}
