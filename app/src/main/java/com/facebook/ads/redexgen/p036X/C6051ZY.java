package com.facebook.ads.redexgen.p036X;

import android.content.ContentResolver;
import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: com.facebook.ads.redexgen.X.ZY */
/* loaded from: assets/audience_network.dex */
public final class C6051ZY extends C43216m {
    public ContentResolver A00;
    public DisplayMetrics A01;

    public C6051ZY(Context context, C42856C c42856c) {
        super(context, c42856c);
        this.A01 = context.getResources().getDisplayMetrics();
        this.A00 = context.getContentResolver();
    }

    public final InterfaceC43306v A0G() {
        return new C6052ZZ(this);
    }

    public final InterfaceC43306v A0H() {
        return new C6055Zc(this);
    }

    public final InterfaceC43306v A0I() {
        return new C6054Zb(this);
    }

    public final InterfaceC43306v A0J() {
        return new C6056Zd(this);
    }

    public final InterfaceC43306v A0K() {
        return new C6053Za(this);
    }
}
