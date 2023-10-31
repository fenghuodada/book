package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import com.applovin.mediation.MaxErrorCode;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ve */
/* loaded from: assets/audience_network.dex */
public final class C5812Ve implements InterfaceC4799F4 {
    public static String[] A06 = {"0vmpU1QtAhI6qjIdcVId", "klBv", "qKjW3ego541fEYihs", "NuBFx4EY8fIgWeMvZ", "vAKBh2R", "FoB4J1nu", "9b5WU1uKCw6g3SYcMdOb", "twQXN8Z"};
    public final C4959Hi A00;
    public final InterfaceC4981I4 A01;
    public final C5762Uq A02;
    public final C5026In A04;
    public final C4986I9 A03 = new C4986I9();
    public final AtomicBoolean A05 = new AtomicBoolean();

    public C5812Ve(Uri uri, String str, C4800F5 c4800f5) {
        this.A00 = new C4959Hi(uri, 0L, -1L, str, 0);
        this.A01 = c4800f5.A00();
        this.A02 = c4800f5.A01(false);
        this.A04 = c4800f5.A02();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4799F4
    public final void A4t() throws InterruptedException, IOException {
        this.A04.A00(MaxErrorCode.NETWORK_ERROR);
        try {
            C4987IA.A03(this.A00, this.A01, this.A02, new byte[131072], this.A04, MaxErrorCode.NETWORK_ERROR, this.A03, this.A05, true);
            C5026In c5026In = this.A04;
            String[] strArr = A06;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "qX3fQQGAY3dTsBjdyBPn";
            strArr2[6] = "Z0TFAaYyqvVnxMY9deNw";
            c5026In.A03(MaxErrorCode.NETWORK_ERROR);
        } catch (Throwable th) {
            this.A04.A03(MaxErrorCode.NETWORK_ERROR);
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4799F4
    public final float A6P() {
        long j = this.A03.A01;
        if (j == -1) {
            return -1.0f;
        }
        return (((float) this.A03.A00()) * 100.0f) / ((float) j);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4799F4
    public final long A6Q() {
        return this.A03.A00();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4799F4
    public final void cancel() {
        this.A05.set(true);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4799F4
    public final void remove() {
        C4987IA.A05(this.A01, C4987IA.A02(this.A00));
    }
}
