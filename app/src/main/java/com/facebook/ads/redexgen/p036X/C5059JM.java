package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.JM */
/* loaded from: assets/audience_network.dex */
public final class C5059JM {
    @Nullable
    public final Handler A00;
    @Nullable
    public final InterfaceC5060JN A01;

    public C5059JM(@Nullable Handler handler, @Nullable InterfaceC5060JN interfaceC5060JN) {
        this.A00 = interfaceC5060JN != null ? (Handler) C4997IK.A01(handler) : null;
        this.A01 = interfaceC5060JN;
    }

    public final void A01(int i, int i2, int i3, float f) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC5056JJ(this, i, i2, i3, f));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC5055JI(this, i, j));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC5057JK(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC5054JH(this, format));
        }
    }

    public final void A05(C4626Bw c4626Bw) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC5058JL(this, c4626Bw));
        }
    }

    public final void A06(C4626Bw c4626Bw) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC5052JF(this, c4626Bw));
        }
    }

    public final void A07(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC5053JG(this, str, j, j2));
        }
    }
}
