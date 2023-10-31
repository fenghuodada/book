package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.NA */
/* loaded from: assets/audience_network.dex */
public final class C5288NA extends LinearLayout {
    public static final int A06 = (int) (C5208Lr.A00 * 10.0f);
    public static final int A07 = (int) (C5208Lr.A00 * 44.0f);
    public int A00;
    public boolean A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final C5365OP A05;

    public C5288NA(C5953Xy c5953Xy, int i) {
        super(c5953Xy);
        this.A01 = false;
        this.A02 = new ImageView(c5953Xy);
        ImageView imageView = this.A02;
        int i2 = A06;
        imageView.setPadding(i2, i2, i2, i2);
        this.A05 = new C5365OP(c5953Xy);
        this.A05.setProgress(0.0f);
        C5365OP c5365op = this.A05;
        int i3 = A06;
        c5365op.setPadding(i3, i3, i3, i3);
        this.A04 = new TextView(c5953Xy);
        setOrientation(0);
        this.A03 = new LinearLayout(c5953Xy);
        this.A00 = i;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        LinearLayout.LayoutParams actionIconParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        C5245MS.A0X(this.A04, true, 16);
        this.A04.setTextColor(-1);
        this.A04.setVisibility(8);
        this.A03.addView(this.A02, layoutParams);
        this.A03.addView(this.A05, layoutParams);
        addView(this.A03, actionIconParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        addView(this.A04, layoutParams2);
    }

    private void A01() {
        int i;
        C5365OP c5365op = this.A05;
        if (this.A00 == 2) {
            i = this.A01 ? 4 : 0;
        } else {
            i = 8;
        }
        c5365op.setVisibility(i);
        this.A02.setVisibility(this.A00 == 2 ? 8 : 0);
    }

    public final boolean A02() {
        return !this.A04.getText().toString().isEmpty();
    }

    public final boolean A03() {
        int i = this.A00;
        return (i == 2 || i == 4) ? false : true;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setColors(int i) {
        this.A05.A02(C40592U.A01(i, 77), i);
        this.A02.setColorFilter(i);
    }

    public void setInitialUnskippableSeconds(int i) {
        if (i > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f) {
        this.A05.setProgressWithAnimation(f);
    }

    public void setProgressSpinnerInvisible(boolean z) {
        this.A01 = z;
        A01();
    }

    public void setToolbarActionMode(int i) {
        EnumC5253Ma enumC5253Ma;
        this.A00 = i;
        A01();
        setVisibility(0);
        if (i == 0) {
            enumC5253Ma = EnumC5253Ma.CROSS;
        } else if (i == 1) {
            enumC5253Ma = EnumC5253Ma.SKIP_ARROW;
        } else if (i == 3) {
            enumC5253Ma = EnumC5253Ma.MINIMIZE_ARROW;
        } else if (i != 4) {
            enumC5253Ma = EnumC5253Ma.CROSS;
        } else {
            enumC5253Ma = EnumC5253Ma.CROSS;
            this.A02.setVisibility(8);
            setVisibility(8);
        }
        this.A02.setImageBitmap(C5254Mb.A01(enumC5253Ma));
        C5245MS.A0G(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, this.A02);
    }

    public void setToolbarMessage(String str) {
        this.A04.setText(str);
        this.A04.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A04.setVisibility(z ? 0 : 4);
    }
}
