package com.qmuiteam.qmui.widget.dialog;

import android.view.inputmethod.InputMethodManager;
import com.qmuiteam.qmui.widget.dialog.DialogC9181l;

/* renamed from: com.qmuiteam.qmui.widget.dialog.n */
/* loaded from: classes3.dex */
public final class RunnableC9190n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InputMethodManager f17741a;

    /* renamed from: b */
    public final /* synthetic */ DialogC9181l.C9183b f17742b;

    public RunnableC9190n(DialogC9181l.C9183b c9183b, InputMethodManager inputMethodManager) {
        this.f17742b = c9183b;
        this.f17741a = inputMethodManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogC9181l.C9183b c9183b = this.f17742b;
        c9183b.f17732m.requestFocus();
        this.f17741a.showSoftInput(c9183b.f17732m, 0);
    }
}
