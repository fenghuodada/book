package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.view.menu.InterfaceC0228n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0228n {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228n
    /* renamed from: b */
    public final void mo4532b(C0210g c0210g) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
