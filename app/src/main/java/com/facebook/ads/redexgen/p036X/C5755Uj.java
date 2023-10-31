package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Uj */
/* loaded from: assets/audience_network.dex */
public final class C5755Uj implements InterfaceC5000IN {
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5000IN
    public final InterfaceC5010IX A4J(Looper looper, @Nullable Handler.Callback callback) {
        return new C5754Ui(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5000IN
    public final long A58() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5000IN
    public final long AFM() {
        return SystemClock.uptimeMillis();
    }
}
