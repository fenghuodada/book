package com.android.tool.adapter.question;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ambrose.overwall.R;
import mva2.adapter.AbstractC11175b;
import mva2.adapter.C11177d;

/* renamed from: com.android.tool.adapter.question.a */
/* loaded from: classes.dex */
public final class C2539a extends AbstractC11175b<C2545e, C2540a> {

    /* renamed from: com.android.tool.adapter.question.a$a */
    /* loaded from: classes.dex */
    public static class C2540a extends C11177d<C2545e> {
        public C2540a(View view) {
            super(view);
        }
    }

    @Override // mva2.adapter.AbstractC11175b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo93a(C2540a c2540a, C2545e c2545e) {
    }

    @Override // mva2.adapter.AbstractC11175b
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo92b(C11177d c11177d, Object obj) {
        C2540a c2540a = (C2540a) c11177d;
        C2545e c2545e = (C2545e) obj;
    }

    @Override // mva2.adapter.AbstractC11175b
    /* renamed from: c */
    public final boolean mo91c(Object obj) {
        return obj instanceof C2545e;
    }

    @Override // mva2.adapter.AbstractC11175b
    /* renamed from: d */
    public final C2540a mo90d(ViewGroup viewGroup) {
        return new C2540a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_expandable_header, viewGroup, false));
    }
}
