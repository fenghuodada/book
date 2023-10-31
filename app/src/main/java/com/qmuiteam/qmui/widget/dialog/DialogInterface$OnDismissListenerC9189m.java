package com.qmuiteam.qmui.widget.dialog;

import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import com.qmuiteam.qmui.widget.dialog.DialogC9181l;

/* renamed from: com.qmuiteam.qmui.widget.dialog.m */
/* loaded from: classes3.dex */
public final class DialogInterface$OnDismissListenerC9189m implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ InputMethodManager f17739a;

    /* renamed from: b */
    public final /* synthetic */ DialogC9181l.C9183b f17740b;

    public DialogInterface$OnDismissListenerC9189m(DialogC9181l.C9183b c9183b, InputMethodManager inputMethodManager) {
        this.f17740b = c9183b;
        this.f17739a = inputMethodManager;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f17739a.hideSoftInputFromWindow(this.f17740b.f17732m.getWindowToken(), 0);
    }
}
