package com.kongzue.dialogx.dialogs;

import com.ambrose.overwall.fragment.C2470n;
import com.ambrose.overwall.p005mv.main.C2507n;
import com.kongzue.dialogx.C8877a;
import com.kongzue.dialogx.dialogs.C8897o;
import com.kongzue.dialogx.interfaces.InterfaceC8937i;
import com.kongzue.dialogx.style.C8941a;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* renamed from: com.kongzue.dialogx.dialogs.t */
/* loaded from: classes3.dex */
public final class C8909t implements DialogXBaseRelativeLayout.InterfaceC8952e {

    /* renamed from: a */
    public final /* synthetic */ C8897o.C8899b f16989a;

    public C8909t(C8897o.C8899b c8899b) {
        this.f16989a = c8899b;
    }

    @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.InterfaceC8952e
    public final void onBackPressed() {
        C8897o c8897o = C8897o.this;
        InterfaceC8937i<C8897o> interfaceC8937i = c8897o.f16968z;
        if (interfaceC8937i != null) {
            C2470n.this.f5906H.getClass();
            C2507n.m9402f();
            C8897o.m2905E();
            return;
        }
        int i = c8897o.f16961F;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                z = true;
            }
        } else {
            C8941a c8941a = C8877a.f16910a;
        }
        if (z) {
            C8897o.m2905E();
        }
    }
}
