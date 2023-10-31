package com.android.tool.adapter;

import android.widget.CompoundButton;
import com.android.tool.pref.C2553a;

/* renamed from: com.android.tool.adapter.a */
/* loaded from: classes.dex */
public final class C2535a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C2553a f6026a;

    /* renamed from: b */
    public final /* synthetic */ C2536b f6027b;

    public C2535a(C2536b c2536b, C2553a c2553a) {
        this.f6027b = c2536b;
        this.f6026a = c2553a;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean z2;
        C2536b c2536b = this.f6027b;
        C2553a c2553a = this.f6026a;
        if (z) {
            c2536b.f6030p.m9375a(c2553a.f6048b);
            z2 = true;
        } else {
            c2536b.f6030p.m9374b(c2553a.f6048b);
            z2 = false;
        }
        c2553a.f6050d = z2;
    }
}
