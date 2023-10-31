package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.cA */
/* loaded from: assets/audience_network.dex */
public class C6212cA extends AbstractC41924g {
    public static byte[] A06;
    public static String[] A07 = {"vpHxNEEeQqkPH9sKp8BAFlo", "ddQd8aXmX57TCv5syYSnMf6Vla22KopM", "0YXj", "UC9R5IJXbgu82zo5LhenPlKKwn23Fltm", "uFeOec4n0AGL9Kfrmk6ECW0KKbKvD", "RgZAHFrUyN4TqtmKiyvyL8Y", "g7LT7F9fn5p79lPzLzvRECTowfucfQY3", "UaBPk1errz52kF5dIu80Mei9ciV9Nkpb"};
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 35);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{41, 12, 11, 0, 4, 23, 54, 8, 10, 10, 17, 13, 54, 6, 23, 10, 9, 9, 0, 23, 21, 35, 57, 108, Utf8.REPLACEMENT_BYTE, 36, 35, 57, 32, 40, 108, 35, 58, 41, 62, 62, 37, 40, 41, 108, 47, 35, 33, 60, 57, 56, 41, 31, 47, 62, 35, 32, 32, 26, 41, 47, 56, 35, 62, 10, 35, 62, 28, 35, Utf8.REPLACEMENT_BYTE, 37, 56, 37, 35, 34, 108, 59, 36, 41, 34, 108, 56, 36, 41, 108, 0, 45, 53, 35, 57, 56, 1, 45, 34, 45, 43, 41, 62, 108, 40, 35, 41, Utf8.REPLACEMENT_BYTE, 108, 34, 35, 56, 108, 37, 33, 60, 32, 41, 33, 41, 34, 56, 108, 42, 55, 56, 41, 121, 41, 43, 60, Utf8.REPLACEMENT_BYTE, 60, 43, 60, 55, 58, 60, 121, 42, 49, 54, 44, 53, 61, 121, 59, 60, 121, 54, 55, 60, 121, 54, Utf8.REPLACEMENT_BYTE, 121, 45, 49, 60, 121, 58, 54, 55, 42, 45, 56, 55, 45, 42, 121, 61, 60, Utf8.REPLACEMENT_BYTE, 48, 55, 60, 61, 121, 48, 55, 121, 10, 52, 54, 54, 45, 49, 10, 58, 43, 54, 53, 53, 60, 43, 117, 121, 42, 45, 56, 43, 45, 48, 55, 62, 121, 46, 48, 45, 49, 121, 10, 23, 24, 9, 6};
    }

    static {
        A06();
    }

    public C6212cA(Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    private final int A03(View view, int top) {
        AbstractC41794T A08 = A08();
        if (A08 == null || !A08.A25()) {
            return 0;
        }
        C41804U c41804u = (C41804U) view.getLayoutParams();
        int start = A08.A0o(view) - c41804u.topMargin;
        int end = A08.A0j(view) + c41804u.bottomMargin;
        return A0N(start, end, A08.A0g(), A08.A0X() - A08.A0d(), top);
    }

    private final void A07(C41904e c41904e) {
        PointF A0P = A0P(A07());
        if (A0P == null || (A0P.x == 0.0f && A0P.y == 0.0f)) {
            c41904e.A03(A07());
            A09();
            return;
        }
        A0B(A0P);
        this.A02 = A0P;
        this.A00 = (int) (A0P.x * 10000.0f);
        this.A01 = (int) (A0P.y * 10000.0f);
        c41904e.A04((int) (this.A00 * 1.2f), (int) (this.A01 * 1.2f), (int) (A0L(10000) * 1.2f), this.A05);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41924g
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41924g
    public final void A0H(int i, int i2, C41944i c41944i, C41904e c41904e) {
        if (A06() == 0) {
            A09();
            return;
        }
        this.A00 = A01(this.A00, i);
        this.A01 = A01(this.A01, i2);
        if (this.A00 == 0 && this.A01 == 0) {
            A07(c41904e);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41924g
    public void A0I(View view, C41944i c41944i, C41904e c41904e) {
        int A0O = A0O(view, A0K());
        int A03 = A03(view, A00());
        int A0M = A0M((int) Math.sqrt((A0O * A0O) + (A03 * A03)));
        if (A0M > 0) {
            c41904e.A04(-A0O, -A03, A0M, this.A04);
        }
    }

    public float A0J(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0L(int i) {
        return (int) Math.ceil(Math.abs(i) * this.A03);
    }

    public final int A0M(int i) {
        return (int) Math.ceil(A0L(i) / 0.3356d);
    }

    public final int A0N(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException(A04(113, 93, 122));
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            String[] strArr = A07;
            if (strArr[3].charAt(24) != strArr[6].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "99CH8cQKDxQi0SdQwcjuhFHBueIBqbiA";
            strArr2[4] = "Y2Wuw9nWVBLC0K9LHKlenTQ1gtNyD";
            return 0;
        }
        return i3 - i;
    }

    public int A0O(View view, int left) {
        AbstractC41794T A08 = A08();
        if (A08 == null || !A08.A24()) {
            return 0;
        }
        C41804U c41804u = (C41804U) view.getLayoutParams();
        int start = A08.A0k(view) - c41804u.leftMargin;
        int end = A08.A0n(view) + c41804u.rightMargin;
        return A0N(start, end, A08.A0e(), A08.A0h() - A08.A0f(), left);
    }

    @Nullable
    public PointF A0P(int i) {
        AbstractC41794T A08 = A08();
        if (A08 instanceof InterfaceC41914f) {
            return ((InterfaceC41914f) A08).A45(i);
        }
        Log.w(A04(0, 20, 70), A04(20, 93, 111) + InterfaceC41914f.class.getCanonicalName());
        return null;
    }
}
