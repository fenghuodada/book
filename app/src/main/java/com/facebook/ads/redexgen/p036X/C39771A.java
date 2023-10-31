package com.facebook.ads.redexgen.p036X;

import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1A */
/* loaded from: assets/audience_network.dex */
public final class C39771A extends View$OnTouchListenerC40101h implements InterfaceC5434PX {
    public static byte[] A07;
    public static String[] A08 = {"T7MK6mm4Fzbg8PTMnM4kcHpb21LLpIaw", "PTQtUxKdjysMmbj8hCZsGKEwd1IRWqqZ", "Zw8mt4VncD", "79VYCrnrWW", "2MnAMBnkkiKtyd2cP7mHhabJycDYuMiE", "jaMauIT7sdi", "OgIH7ZaBRtH9hoDgrnw", "xZmsCngT77DU5lblEiekqTVKPqNdsast"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC5274Mv A04;
    public boolean A05;
    public final C4583BF A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-6, -7, -37, -20, -14, -16, -50, -13, -20, -7, -14, -16, -17};
    }

    static {
        A03();
    }

    public C39771A(C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C4583BF(c5953Xy, new C5431PU(), new C5430PT());
        A02();
    }

    public C39771A(C5953Xy c5953Xy, AttributeSet attributeSet) {
        super(c5953Xy, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C4583BF(c5953Xy, new C5431PU(), new C5430PT());
        A02();
    }

    public C39771A(C5953Xy c5953Xy, AttributeSet attributeSet, int i) {
        super(c5953Xy, attributeSet, i);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C4583BF(c5953Xy, new C5431PU(), new C5430PT());
        A02();
    }

    private int A00(int availableWidth) {
        int numFullItems = this.A00 * 2;
        int itemSize = (getMeasuredWidth() - getPaddingLeft()) - numFullItems;
        int A0D = getAdapter().A0D();
        int i = 0;
        int numItems = Integer.MAX_VALUE;
        while (numItems > availableWidth) {
            i++;
            if (i >= A0D) {
                return availableWidth;
            }
            int numItems2 = i * numFullItems;
            numItems = (int) ((itemSize - numItems2) / (i + 0.333f));
        }
        return numItems;
    }

    private void A02() {
        this.A06.A2E(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        C5245MS.A0K(this);
    }

    private void A04(int i, int i2) {
        if (i == this.A03 && i2 == this.A02) {
            return;
        }
        this.A03 = i;
        if (A08[1].charAt(11) == 'q') {
            throw new RuntimeException();
        }
        A08[6] = "hNBaptvkpj";
        this.A02 = i2;
        if (this.A04 != null) {
            throw new NullPointerException(A01(0, 13, 111));
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.View$OnTouchListenerC40101h
    public final void A22(int i, boolean z) {
        super.A22(i, z);
        A04(i, 0);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5434PX
    public final int A7G(int i) {
        int abs = Math.abs(i);
        if (abs <= ((View$OnTouchListenerC40101h) this).A06) {
            return 0;
        }
        int i2 = this.A01;
        if (i2 == 0) {
            return 1;
        }
        return 1 + (abs / i2);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.C4804F9, android.view.View
    public final void onMeasure(int i, int itemSize) {
        int round;
        int A00;
        super.onMeasure(i, itemSize);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            round = (((int) C5208Lr.A00) * C5064JR.A0C(getContext())) + paddingTop;
        } else {
            round = Math.round(getMeasuredWidth() / 1.91f);
        }
        int mode = View.MeasureSpec.getMode(itemSize);
        if (mode == Integer.MIN_VALUE) {
            round = Math.min(View.MeasureSpec.getSize(itemSize), round);
        } else if (mode == 1073741824) {
            round = View.MeasureSpec.getSize(itemSize);
        }
        int i2 = round - paddingTop;
        if (this.A05) {
            A00 = Math.min(C5271Ms.A09, i2);
        } else {
            A00 = A00(i2);
        }
        setMeasuredDimension(getMeasuredWidth(), A00 + paddingTop);
        if (!this.A05) {
            setChildWidth((this.A00 * 2) + A00);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.C4804F9
    public void setAdapter(@Nullable AbstractC41674H abstractC41674H) {
        this.A06.A2L(abstractC41674H == null ? -1 : abstractC41674H.hashCode());
        super.setAdapter(abstractC41674H);
    }

    public void setChildSpacing(int i) {
        this.A00 = i;
    }

    public void setChildWidth(int i) {
        this.A01 = i;
        int measuredWidth = getMeasuredWidth();
        this.A06.A2M((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - this.A01) / 2);
        this.A06.A2K(this.A01 / measuredWidth);
    }

    public void setCurrentPosition(int i) {
        A22(i, false);
    }

    public void setOnPageChangedListener(InterfaceC5274Mv interfaceC5274Mv) {
        this.A04 = interfaceC5274Mv;
    }

    public void setShowTextInCarousel(boolean z) {
        this.A05 = z;
    }
}
