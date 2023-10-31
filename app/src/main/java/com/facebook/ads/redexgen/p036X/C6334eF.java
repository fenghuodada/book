package com.facebook.ads.redexgen.p036X;

import android.graphics.Rect;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.eF */
/* loaded from: assets/audience_network.dex */
public final class C6334eF {
    public final InterfaceC6338eJ A00;
    public final String A01;
    public final Collection<C6349eU> A02;
    public final Collection<C6349eU> A03;
    public final List<Rect> A04;

    public C6334eF(String str, InterfaceC6338eJ interfaceC6338eJ, List<Rect> list, Collection<C6349eU> collection, Collection<C6349eU> collection2) {
        this.A01 = str;
        this.A00 = interfaceC6338eJ;
        this.A04 = new ArrayList(list);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
