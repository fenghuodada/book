package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.p036X.AbstractC5268Mp;
import com.facebook.ads.redexgen.p036X.C39871K;
import com.facebook.ads.redexgen.p036X.C39971U;
import com.facebook.ads.redexgen.p036X.C40041b;
import com.facebook.ads.redexgen.p036X.C5088Jp;
import com.facebook.ads.redexgen.p036X.C5208Lr;
import com.facebook.ads.redexgen.p036X.C5245MS;
import com.facebook.ads.redexgen.p036X.C5266Mn;
import com.facebook.ads.redexgen.p036X.C5288NA;
import com.facebook.ads.redexgen.p036X.C5436PZ;
import com.facebook.ads.redexgen.p036X.C5953Xy;
import com.facebook.ads.redexgen.p036X.InterfaceC5267Mo;
import com.facebook.ads.redexgen.p036X.InterfaceC5269Mq;
import com.facebook.ads.redexgen.p036X.View$OnClickListenerC5273Mu;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends AbstractC5268Mp {
    public static byte[] A07;
    public static String[] A08 = {"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    @Nullable
    public InterfaceC5267Mo A00;
    public final RelativeLayout A01;
    public final C5088Jp A02;
    public final C5266Mn A03;
    public final InterfaceC5269Mq A04;
    public final C5288NA A05;
    public final C5436PZ A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-26, 15, 18, 22, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, 74};
    }

    static {
        A03();
        A09 = (int) (C5208Lr.A00 * 10.0f);
        A0D = (int) (C5208Lr.A00 * 16.0f);
        int i = A0D;
        int i2 = A09;
        A0B = i - i2;
        A0C = (i * 2) - i2;
        A0A = (int) (C5208Lr.A00 * 4.0f);
    }

    public FullScreenAdToolbar(C5953Xy c5953Xy, InterfaceC5269Mq interfaceC5269Mq, C5088Jp c5088Jp, @ToolbarActionView$ToolbarActionMode int i, int i2) {
        super(c5953Xy);
        this.A04 = interfaceC5269Mq;
        this.A02 = c5088Jp;
        setGravity(16);
        this.A05 = new C5288NA(c5953Xy, i);
        this.A05.setContentDescription(A02(0, 8, 50));
        this.A05.setActionClickListener(new View$OnClickListenerC5273Mu(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i3 = A0B;
        layoutParams.setMargins(i3, i3, A0C, i3);
        addView(this.A05, layoutParams);
        this.A01 = new RelativeLayout(c5953Xy);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A06 = new C5436PZ(c5953Xy);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.A06.setLayoutParams(layoutParams3);
        this.A01.addView(this.A06);
        addView(this.A01, layoutParams2);
        this.A03 = new C5266Mn(c5953Xy, i2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        int i4 = A0D;
        layoutParams4.setMargins(0, i4 / 2, i4 / 2, i4 / 2);
        addView(this.A03, layoutParams4);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5268Mp
    public final void A04(C39871K c39871k, boolean z) {
        int A04 = c39871k.A04(z);
        this.A06.A01(c39871k.A0A(z), A04);
        this.A03.setIconColors(A04);
        this.A03.setContentDescription(A02(8, 9, 117));
        this.A05.setColors(A04);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            C5245MS.A0S(this, gradientDrawable);
            C5245MS.A0Q(this.A03, 0, -16777216, A0A);
            return;
        }
        C5245MS.A0M(this, 0);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5268Mp
    public final boolean A05() {
        return this.A05.A02();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5268Mp
    public int getToolbarHeight() {
        return AbstractC5268Mp.A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5268Mp
    public void setAdReportingVisible(boolean z) {
        this.A03.setVisibility(z ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5268Mp
    public void setPageDetails(C39971U c39971u, String str, int i, C40041b c40041b) {
        this.A05.setInitialUnskippableSeconds(i);
        this.A06.setPageDetails(c39971u);
        this.A03.setAdDetails(c39971u, str, this.A02, this.A04);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5268Mp
    public void setPageDetailsVisible(boolean z) {
        this.A01.removeAllViews();
        if (z) {
            RelativeLayout relativeLayout = this.A01;
            C5436PZ c5436pz = this.A06;
            if (A08[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(c5436pz);
        }
        C5288NA c5288na = this.A05;
        String[] strArr2 = A08;
        if (strArr2[2].length() == strArr2[3].length()) {
            c5288na.setToolbarMessageEnabled(!z);
            return;
        }
        A08[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
        c5288na.setToolbarMessageEnabled(!z);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5268Mp
    public void setProgress(float f) {
        this.A05.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5268Mp
    public void setProgressSpinnerInvisible(boolean z) {
        this.A05.setProgressSpinnerInvisible(z);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5268Mp
    public void setToolbarActionMessage(String str) {
        this.A05.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5268Mp
    public void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i) {
        this.A05.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5268Mp
    public void setToolbarListener(InterfaceC5267Mo interfaceC5267Mo) {
        this.A00 = interfaceC5267Mo;
    }
}
