package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.BS */
/* loaded from: assets/audience_network.dex */
public final class C4596BS {
    @Nullable
    public final Handler A00;
    @Nullable
    public final InterfaceC4597BT A01;

    public C4596BS(@Nullable Handler handler, @Nullable InterfaceC4597BT interfaceC4597BT) {
        this.A00 = interfaceC4597BT != null ? (Handler) C4997IK.A01(handler) : null;
        this.A01 = interfaceC4597BT;
    }

    public final void A01(int i) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC4595BR(this, i));
        }
    }

    public final void A02(int i, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC4593BP(this, i, j, j2));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC4592BO(this, format));
        }
    }

    public final void A04(C4626Bw c4626Bw) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC4594BQ(this, c4626Bw));
        }
    }

    public final void A05(C4626Bw c4626Bw) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC4590BM(this, c4626Bw));
        }
    }

    public final void A06(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC4591BN(this, str, j, j2));
        }
    }
}
