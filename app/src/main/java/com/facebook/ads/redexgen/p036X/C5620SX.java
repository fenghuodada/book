package com.facebook.ads.redexgen.p036X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.SX */
/* loaded from: assets/audience_network.dex */
public class C5620SX extends AbstractC5346O6 {
    public static byte[] A01;
    public final /* synthetic */ C5411PA A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{5, 24, 15, 0, 12, 8, 2, 62, 18, 5, 10, 62, 13, 0, 24, 4, 19, 62, 2, 14, 15, 21, 4, 15, 21, 62, 9, 4, 8, 6, 9, 21, 12, 17, 6, 9, 5, 1, 11, 55, 27, 12, 3, 55, 4, 9, 17, 13, 26, 55, 11, 7, 6, 28, 13, 6, 28, 55, 31, 1, 12, 28, 0};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5620SX(C5411PA c5411pa, C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A00 = c5411pa;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int specMode, int specSize, int i) {
        int mode = View.MeasureSpec.getMode(i);
        int specMode2 = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return specMode;
                }
                return specMode2;
            }
            return Math.min(specMode, specSize);
        }
        return Math.min(Math.min(specMode, specMode2), specSize);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5346O6
    public final WebChromeClient A0D() {
        return new C5406P5(this.A00);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5346O6
    public final WebViewClient A0E() {
        return new C5407P6(this.A00);
    }

    private int getDynamicWebViewHeight() {
        return C5411PA.A01(this.A00).A0d().optInt(A03(0, 32, 19));
    }

    private int getDynamicWebViewWidth() {
        return C5411PA.A01(this.A00).A0d().optInt(A03(32, 31, 26));
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int w, int h) {
        int widthSpecMode = getDynamicWebViewWidth();
        int heightSpecMode = getDynamicWebViewHeight();
        if (widthSpecMode <= 0 || heightSpecMode <= 0) {
            super.onMeasure(w, h);
            return;
        }
        float f = widthSpecMode / heightSpecMode;
        int mode = View.MeasureSpec.getMode(w);
        int mode2 = View.MeasureSpec.getMode(h);
        boolean z = true;
        boolean z2 = mode != 1073741824;
        if (mode2 == 1073741824) {
            z = false;
        }
        int i = getResources().getDisplayMetrics().widthPixels;
        int i2 = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int maxWidth = viewGroup.getWidth();
            i2 = Integer.MAX_VALUE;
            i = maxWidth != 0 ? viewGroup.getWidth() : Integer.MAX_VALUE;
            int maxWidth2 = viewGroup.getHeight();
            if (maxWidth2 != 0) {
                i2 = viewGroup.getHeight();
            }
        }
        int A012 = A01(widthSpecMode, i, w);
        int widthSpecMode2 = A01(heightSpecMode, i2, h);
        if (z || z2) {
            int maxWidth3 = A012 / widthSpecMode2;
            if (Math.abs(maxWidth3 - f) > 1.0E-7d) {
                boolean done = false;
                if (z) {
                    widthSpecMode2 = (int) (A012 / f);
                    done = true;
                }
                if (!done && z2) {
                    A012 = (int) (widthSpecMode2 * f);
                }
            }
        }
        setMeasuredDimension(A012, widthSpecMode2);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (C5411PA.A06(this.A00) != null) {
            C5411PA.A06(this.A00).ACX(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
