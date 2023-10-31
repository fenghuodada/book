package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.V8 */
/* loaded from: assets/audience_network.dex */
public final class C5780V8 implements InterfaceC4950HZ, InterfaceC4977I0<Object> {
    public static String[] A0A = {"8v43OWLt8X4Ft8FSsUnUJEljk6O9jZtl", "gqJU9rJqtCXP9nVsCJhzhjWr3OTUONn5", "evi8lnvhIGFpGwxvrEQ2HxpF9HfAYNb4", "XM9iQGBoaLQIRrKYvs1BFwTGSVuWakLP", "oYKHkHYzGvwdV8VAJO5FvOndhShHo3uL", "GsOQXWL80Wqi8CBj4PFxcrgidstVbv5Z", "TfEJwESWFeUjyASkqvscuoRhiyKsiSGj", "R3GeLkF45fmp7DtCtFYf0NMS1ko1sZ3Y"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    @Nullable
    public final Handler A06;
    @Nullable
    public final InterfaceC4949HY A07;
    public final InterfaceC5000IN A08;
    public final C5033Iu A09;

    public C5780V8() {
        this(null, null, 1000000L, AdError.SERVER_ERROR_CODE, InterfaceC5000IN.A00);
    }

    public C5780V8(@Nullable Handler handler, @Nullable InterfaceC4949HY interfaceC4949HY, long j, int i, InterfaceC5000IN interfaceC5000IN) {
        this.A06 = handler;
        this.A07 = interfaceC4949HY;
        this.A09 = new C5033Iu(i);
        this.A08 = interfaceC5000IN;
        this.A01 = j;
    }

    private void A01(int i, long j, long j2) {
        Handler handler = this.A06;
        if (handler != null) {
            InterfaceC4949HY interfaceC4949HY = this.A07;
            String[] strArr = A0A;
            if (strArr[3].charAt(14) == strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[3] = "mcMhHiKL1Hs40ZODL70g4thjgDTU4mJQ";
            strArr2[2] = "gdrxxP25NVrEqdTm0xFGwMteDAr0ERpE";
            if (interfaceC4949HY != null) {
                handler.post(new RunnableC4960Hj(this, i, j, j2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4950HZ
    public final synchronized long A5n() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4977I0
    public final synchronized void AAG(Object obj, int i) {
        this.A02 += i;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4977I0
    public final synchronized void ACa(Object obj) {
        C4997IK.A04(this.A00 > 0);
        long A58 = this.A08.A58();
        long nowMs = A58 - this.A03;
        int i = (int) nowMs;
        long nowMs2 = i;
        this.A05 += nowMs2;
        long j = this.A04;
        long nowMs3 = this.A02;
        this.A04 = j + nowMs3;
        if (i > 0) {
            long nowMs4 = i;
            this.A09.A03((int) Math.sqrt(this.A02), (float) ((this.A02 * 8000) / nowMs4));
            if (this.A05 >= 2000 || this.A04 >= 524288) {
                float bitsPerSecond = this.A09.A02(0.5f);
                this.A01 = bitsPerSecond;
            }
        }
        A01(i, this.A02, this.A01);
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (i2 > 0) {
            this.A03 = A58;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4977I0
    public final synchronized void ACb(Object obj, C4959Hi c4959Hi) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A58();
        }
        this.A00++;
    }
}
