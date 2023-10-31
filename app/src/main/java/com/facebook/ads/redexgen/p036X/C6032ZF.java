package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.ZF */
/* loaded from: assets/audience_network.dex */
public final class C6032ZF extends C43216m {
    public C6032ZF(Context context, C42856C c42856c) {
        super(context, c42856c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC43457A A02(HashMap<String, C6033ZG> hashMap) {
        return new C5962Y7(SystemClock.elapsedRealtime(), A02(), hashMap, EnumC434479.A0C);
    }

    public final InterfaceC43306v A0G() {
        return new C6034ZH(this);
    }
}
