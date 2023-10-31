package com.ambrose.overwall.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.InterfaceC1805a;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;
import com.qmuiteam.qmui.widget.textview.QMUILinkTextView;

/* renamed from: com.ambrose.overwall.databinding.g */
/* loaded from: classes.dex */
public final class C2399g implements InterfaceC1805a {
    @NonNull

    /* renamed from: a */
    public final QMUIWindowInsetLayout f5775a;
    @NonNull

    /* renamed from: b */
    public final QMUIGroupListView f5776b;
    @NonNull

    /* renamed from: c */
    public final TextView f5777c;
    @NonNull

    /* renamed from: d */
    public final QMUITopBarLayout f5778d;
    @NonNull

    /* renamed from: e */
    public final QMUILinkTextView f5779e;
    @NonNull

    /* renamed from: f */
    public final QMUIWindowInsetLayout f5780f;

    public C2399g(@NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout, @NonNull QMUIGroupListView qMUIGroupListView, @NonNull TextView textView, @NonNull QMUITopBarLayout qMUITopBarLayout, @NonNull QMUILinkTextView qMUILinkTextView, @NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout2) {
        this.f5775a = qMUIWindowInsetLayout;
        this.f5776b = qMUIGroupListView;
        this.f5777c = textView;
        this.f5778d = qMUITopBarLayout;
        this.f5779e = qMUILinkTextView;
        this.f5780f = qMUIWindowInsetLayout2;
    }

    @Override // androidx.viewbinding.InterfaceC1805a
    @NonNull
    public final View getRoot() {
        return this.f5775a;
    }
}
