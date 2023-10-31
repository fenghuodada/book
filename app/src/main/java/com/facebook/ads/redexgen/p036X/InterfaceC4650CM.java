package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.p036X.InterfaceC4651CN;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.CM */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC4650CM<T extends InterfaceC4651CN> {
    InterfaceC4649CL<T> A2P(Looper looper, DrmInitData drmInitData);

    boolean A3x(DrmInitData drmInitData);

    void ADs(InterfaceC4649CL<T> interfaceC4649CL);
}
