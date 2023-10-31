package com.facebook.ads.redexgen.p036X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.KS */
/* loaded from: assets/audience_network.dex */
public final class C5125KS extends ImageView implements InterfaceC5470Q7 {
    public static byte[] A05;
    public static String[] A06 = {"CZ6R6baQKTb1E5sAmpDqVkfMXF7zVnG4", "nQZGX73N3q5NRRZlZyP90gUTrDeeLYBu", "LfCM6PYFJNbwOvLH4thVDQon3h1Zk2zk", "bpUakkTElIOqaP65ISNG9oh", "gJtMODfbj2e7z8MJG7ZRKfD", "8rYwk9o7IGDDsMQbyUTj4ra1LUt9E6qX", "3WiLQHXTUUJ8WctEatoRQ", "Xo7nIXQ5hsw2R0tzDjIU8fyfjH4jtFIR"};
    public static final int A07;
    @Nullable
    public C5483QK A00;
    public final Paint A01;
    public final C5953Xy A02;
    public final C5088Jp A03;
    public final AbstractC5135Kc A04;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{101, 93, 92, 77, 8, 105, 76};
    }

    static {
        A06();
        A07 = (int) (C5208Lr.A00 * 4.0f);
    }

    public C5125KS(C5953Xy c5953Xy, C5088Jp c5088Jp) {
        super(c5953Xy);
        this.A04 = new AbstractC5135Kc() { // from class: com.facebook.ads.redexgen.X.7n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5136Kd c5136Kd) {
                C5125KS.this.A09();
            }
        };
        this.A03 = c5088Jp;
        this.A02 = c5953Xy;
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        int i = A07;
        setPadding(i, i, i, i);
        setContentDescription(A03(0, 7, 59));
        A05();
        setOnClickListener(new View$OnClickListenerC5484QL(this));
    }

    private void A04() {
        setImageBitmap(C5254Mb.A01(EnumC5253Ma.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(C5254Mb.A01(EnumC5253Ma.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        C5483QK c5483qk = this.A00;
        if (c5483qk != null) {
            float volume = c5483qk.getVolume();
            String[] strArr = A06;
            if (strArr[5].charAt(12) == strArr[1].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "7LwdJMyLjSlNEKSwxkcw7Q3";
            strArr2[6] = "d5nTRpYYugpReKnwSxkEX";
            if (volume == 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5470Q7
    public final void A8o(C5483QK c5483qk) {
        this.A00 = c5483qk;
        C5483QK c5483qk2 = this.A00;
        if (c5483qk2 != null) {
            c5483qk2.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5470Q7
    public final void AFG(C5483QK c5483qk) {
        C5483QK c5483qk2 = this.A00;
        if (c5483qk2 != null) {
            c5483qk2.getEventBus().A06(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle(width, height, Math.min(width, height), this.A01);
        super.onDraw(canvas);
    }
}
