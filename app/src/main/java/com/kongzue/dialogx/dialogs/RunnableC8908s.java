package com.kongzue.dialogx.dialogs;

import com.kongzue.dialogx.dialogs.C8897o;
import com.kongzue.dialogx.interfaces.BaseDialog;

/* renamed from: com.kongzue.dialogx.dialogs.s */
/* loaded from: classes3.dex */
public final class RunnableC8908s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8897o.C8899b f16988a;

    public RunnableC8908s(C8897o.C8899b c8899b) {
        this.f16988a = c8899b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8897o.C8899b c8899b = this.f16988a;
        BaseDialog.m2856z(new RunnableC8913x(c8899b, C8897o.this.f16964I));
    }
}
