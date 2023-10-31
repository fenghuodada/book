package com.google.android.material.snackbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.InterfaceC0932i0;
import androidx.core.view.WindowInsetsCompat;

/* renamed from: com.google.android.material.snackbar.h */
/* loaded from: classes3.dex */
public final class C7837h implements InterfaceC0932i0 {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15382a;

    public C7837h(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15382a = baseTransientBottomBar;
    }

    @Override // androidx.core.view.InterfaceC0932i0
    @NonNull
    /* renamed from: a */
    public final WindowInsetsCompat mo2619a(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        int m11642b = windowInsetsCompat.m11642b();
        BaseTransientBottomBar baseTransientBottomBar = this.f15382a;
        baseTransientBottomBar.f15345m = m11642b;
        baseTransientBottomBar.f15346n = windowInsetsCompat.m11641c();
        baseTransientBottomBar.f15347o = windowInsetsCompat.m11640d();
        baseTransientBottomBar.m4421f();
        return windowInsetsCompat;
    }
}
