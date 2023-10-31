package com.kongzue.dialogx.dialogs;

import android.widget.EditText;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1484n;
import com.kongzue.dialogx.dialogs.C8887i;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* renamed from: com.kongzue.dialogx.dialogs.d */
/* loaded from: classes3.dex */
public final class C8881d extends DialogXBaseRelativeLayout.AbstractC8951d {

    /* renamed from: a */
    public final /* synthetic */ C8887i.C8888a f16914a;

    /* renamed from: com.kongzue.dialogx.dialogs.d$a */
    /* loaded from: classes3.dex */
    public class RunnableC8882a implements Runnable {
        public RunnableC8882a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8881d c8881d = C8881d.this;
            EditText editText = c8881d.f16914a.f16938g;
            if (editText == null) {
                return;
            }
            editText.requestFocus();
            c8881d.f16914a.f16938g.setFocusableInTouchMode(true);
            C8887i.C8888a c8888a = c8881d.f16914a;
            C8887i.this.m2865q(c8888a.f16938g, true);
            EditText editText2 = c8881d.f16914a.f16938g;
            editText2.setSelection(editText2.getText().length());
            C8887i.this.getClass();
        }
    }

    public C8881d(C8887i.C8888a c8888a) {
        this.f16914a = c8888a;
    }

    @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.AbstractC8951d
    /* renamed from: a */
    public final void mo2836a() {
        AbstractC1464h.EnumC1468b enumC1468b = AbstractC1464h.EnumC1468b.DESTROYED;
        C8887i.C8888a c8888a = this.f16914a;
        C8887i.this.f17019h = false;
        C8880c c8880c = new C8880c();
        C8887i c8887i = C8887i.this;
        C8887i c8887i2 = c8887i.f16929x;
        try {
            C1484n c1484n = c8880c.f17044a;
            if (c1484n.f3453c != enumC1468b) {
                c1484n.m10532h(enumC1468b);
            }
        } catch (Exception unused) {
        }
        C8887i c8887i3 = c8887i.f16929x;
        c8887i.f16920A = null;
        c8887i.m2884B(enumC1468b);
        System.gc();
    }

    @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.AbstractC8951d
    /* renamed from: b */
    public final void mo2835b() {
        C8887i.C8888a c8888a = this.f16914a;
        C8887i c8887i = C8887i.this;
        c8887i.f17019h = true;
        AbstractC1464h.EnumC1468b enumC1468b = AbstractC1464h.EnumC1468b.CREATED;
        c8887i.m2884B(enumC1468b);
        C8887i c8887i2 = C8887i.this;
        c8887i2.getClass();
        c8887i2.getClass();
        C8880c c8880c = new C8880c();
        C8887i c8887i3 = c8887i2.f16929x;
        try {
            C1484n c1484n = c8880c.f17044a;
            if (c1484n.f3453c != enumC1468b) {
                c1484n.m10532h(enumC1468b);
            }
        } catch (Exception unused) {
        }
        C8887i c8887i4 = c8887i2.f16929x;
        if (c8887i2.f16931z == null) {
            c8887i2.f16931z = new C8894l(c8888a);
        }
        c8887i2.f16931z.m2906b(c8887i4);
        c8887i2.f17020i.getClass();
        if (c8887i2.f17022k) {
            c8888a.f16938g.postDelayed(new RunnableC8882a(), 300L);
        }
    }
}
