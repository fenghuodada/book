package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.widget.ImageView;
import java.util.Arrays;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.Pg */
/* loaded from: assets/audience_network.dex */
public final class C5443Pg extends ImageView {
    public static byte[] A03;
    public static final int A04;
    public final Paint A00;
    public final EnumC5441Pe A01;
    public final InterfaceC5442Pf A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{11, 47, 33, 40, 29, -40, 36, 29, 30, 44, 14, 50, 36, 43, 32, -37, 45, 36, 34, 35, 47};
    }

    static {
        A03();
        A04 = (int) (C5208Lr.A00 * 4.0f);
    }

    public C5443Pg(C5953Xy c5953Xy, EnumC5441Pe enumC5441Pe, InterfaceC5442Pf interfaceC5442Pf) {
        super(c5953Xy);
        this.A01 = enumC5441Pe;
        this.A02 = interfaceC5442Pf;
        this.A00 = new Paint();
        this.A00.setColor(-1728053248);
        setColorFilter(-1);
        int i = A04;
        setPadding(i, i, i, i);
        boolean z = this.A01 == EnumC5441Pe.A03;
        setContentDescription(z ? A02(0, 10, 106) : A02(10, 11, 109));
        Bitmap A01 = C5254Mb.A01(EnumC5253Ma.TO_RIGHT_ARROW);
        if (z) {
            Matrix matrix = new Matrix();
            matrix.postRotate(180.0f);
            A01 = Bitmap.createBitmap(A01, 0, 0, A01.getWidth(), A01.getHeight(), matrix, true);
        }
        setImageBitmap(A01);
        setOnClickListener(new View$OnClickListenerC5440Pd(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle(width, height, Math.min(width, height), this.A00);
        super.onDraw(canvas);
    }
}
