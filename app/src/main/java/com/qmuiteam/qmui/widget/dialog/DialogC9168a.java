package com.qmuiteam.qmui.widget.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.appcompat.app.DialogC0147v;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.skin.LayoutInflater$Factory2C9107g;

/* renamed from: com.qmuiteam.qmui.widget.dialog.a */
/* loaded from: classes3.dex */
public class DialogC9168a extends DialogC0147v {

    /* renamed from: f */
    public boolean f17700f;

    /* renamed from: g */
    public boolean f17701g;

    /* renamed from: h */
    public boolean f17702h;

    /* renamed from: i */
    public C9108h f17703i;

    public DialogC9168a(@NonNull Context context, int i) {
        super(context, i);
        this.f17700f = true;
        this.f17701g = true;
        this.f17703i = null;
        m12931c().mo12961x(1);
    }

    @Override // androidx.appcompat.app.DialogC0147v, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Context context = getContext();
        if (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!(context instanceof Activity)) {
            try {
                super.dismiss();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        Activity activity = (Activity) context;
        if (activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        super.dismiss();
    }

    /* renamed from: e */
    public void mo2591e(boolean z) {
    }

    @Override // android.app.Dialog
    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = super.getLayoutInflater();
        LayoutInflater.Factory2 factory2 = layoutInflater.getFactory2();
        if (factory2 instanceof LayoutInflater$Factory2C9107g) {
            LayoutInflater$Factory2C9107g layoutInflater$Factory2C9107g = (LayoutInflater$Factory2C9107g) factory2;
            if (layoutInflater$Factory2C9107g.f17542c.getContext() != layoutInflater.getContext()) {
                layoutInflater$Factory2C9107g = new LayoutInflater$Factory2C9107g(layoutInflater$Factory2C9107g.f17541b.get(), layoutInflater);
            }
            layoutInflater.setFactory2(layoutInflater$Factory2C9107g);
        }
        return layoutInflater;
    }

    @Override // androidx.activity.DialogC0048j, android.app.Dialog
    public void onStart() {
        super.onStart();
        C9108h c9108h = this.f17703i;
        if (c9108h != null) {
            c9108h.m2665k(this);
        }
    }

    @Override // androidx.appcompat.app.DialogC0147v, androidx.activity.DialogC0048j, android.app.Dialog
    public final void onStop() {
        super.onStop();
        C9108h c9108h = this.f17703i;
        if (c9108h != null) {
            c9108h.m2664l(this);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f17700f != z) {
            this.f17700f = z;
            mo2591e(z);
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f17700f) {
            this.f17700f = true;
        }
        this.f17701g = z;
        this.f17702h = true;
    }
}
