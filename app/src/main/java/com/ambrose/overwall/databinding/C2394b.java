package com.ambrose.overwall.databinding;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.InterfaceC1805a;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;

/* renamed from: com.ambrose.overwall.databinding.b */
/* loaded from: classes.dex */
public final class C2394b implements InterfaceC1805a {
    @NonNull

    /* renamed from: a */
    public final QMUIWindowInsetLayout f5749a;
    @NonNull

    /* renamed from: b */
    public final EditText f5750b;
    @NonNull

    /* renamed from: c */
    public final LinearLayout f5751c;
    @NonNull

    /* renamed from: d */
    public final QMUITopBarLayout f5752d;
    @NonNull

    /* renamed from: e */
    public final ProgressBar f5753e;
    @NonNull

    /* renamed from: f */
    public final RecyclerView f5754f;

    public C2394b(@NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout, @NonNull EditText editText, @NonNull LinearLayout linearLayout, @NonNull QMUITopBarLayout qMUITopBarLayout, @NonNull ProgressBar progressBar, @NonNull RecyclerView recyclerView) {
        this.f5749a = qMUIWindowInsetLayout;
        this.f5750b = editText;
        this.f5751c = linearLayout;
        this.f5752d = qMUITopBarLayout;
        this.f5753e = progressBar;
        this.f5754f = recyclerView;
    }

    @Override // androidx.viewbinding.InterfaceC1805a
    @NonNull
    public final View getRoot() {
        return this.f5749a;
    }
}
