package com.google.android.material.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.google.android.material.internal.n */
/* loaded from: classes3.dex */
public final class RunnableC7761n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f15123a;

    public RunnableC7761n(EditText editText) {
        this.f15123a = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f15123a;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
