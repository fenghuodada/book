package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Yl */
/* loaded from: assets/audience_network.dex */
public final class C6002Yl extends C43216m {
    public final Context A00;

    public C6002Yl(Context context, C42856C c42856c) {
        super(context, c42856c);
        this.A00 = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC43457A A03(HashMap<String, C6003Ym> hashMap) {
        return new C5962Y7(SystemClock.elapsedRealtime(), A02(), hashMap, EnumC434479.A0C);
    }

    public final InterfaceC43306v A0G(List<C43296u> list, EnumC43266r enumC43266r) {
        return new C6004Yn(this, list, enumC43266r);
    }
}
