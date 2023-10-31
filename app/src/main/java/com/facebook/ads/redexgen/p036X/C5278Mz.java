package com.facebook.ads.redexgen.p036X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Mz */
/* loaded from: assets/audience_network.dex */
public final class C5278Mz extends RelativeLayout {
    @Nullable
    public TextView A00;
    public final Button A01;
    public final Button A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public static final int A08 = (int) (C5208Lr.A00 * 60.0f);
    public static final int A07 = (int) (C5208Lr.A00 * 8.0f);
    public static final int A09 = (int) (C5208Lr.A00 * 16.0f);
    public static final int A0A = (int) (C5208Lr.A00 * 24.0f);
    public static final int A06 = (int) (C5208Lr.A00 * 12.0f);

    public C5278Mz(C5953Xy c5953Xy, int i, int i2, String str, @Nullable String str2, String str3, String str4, Bitmap bitmap) {
        super(c5953Xy);
        this.A05 = new TextView(c5953Xy);
        this.A02 = new Button(c5953Xy);
        this.A01 = new Button(c5953Xy);
        this.A03 = new ImageView(c5953Xy);
        this.A04 = new LinearLayout(c5953Xy);
        if (!TextUtils.isEmpty(str2)) {
            this.A00 = new TextView(c5953Xy);
        }
        this.A05.setText(str);
        this.A05.setTextColor(i);
        C5245MS.A0X(this.A05, true, 20);
        TextView textView = this.A00;
        if (textView != null) {
            textView.setText(str2);
            this.A00.setTextColor(i);
            C5245MS.A0X(this.A00, false, 18);
        }
        this.A03.setImageBitmap(bitmap);
        this.A03.setColorFilter(i);
        this.A02.setText(str3);
        C5245MS.A0X(this.A02, true, 18);
        this.A02.setAllCaps(true);
        this.A02.setTextColor(i2);
        Button button = this.A02;
        int i3 = A06;
        button.setPadding(i3, i3, i3, i3);
        this.A01.setText(str4);
        C5245MS.A0X(this.A01, true, 18);
        this.A01.setAllCaps(true);
        this.A01.setTextColor(i);
        Button button2 = this.A01;
        int i4 = A06;
        button2.setPadding(i4, i4, i4, i4);
        int A01 = C40592U.A01(i2, 20);
        C5245MS.A0O(this.A02, i, A07);
        C5245MS.A0O(this.A01, A01, A07);
        A00();
        setGravity(17);
    }

    private void A00() {
        int i = A0A;
        setPadding(i, i, i, i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        this.A04.setOrientation(1);
        this.A04.setGravity(14);
        addView(this.A04, layoutParams);
        int i2 = A08;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams2.setMargins(0, 0, 0, A09);
        layoutParams2.gravity = 1;
        this.A04.addView(this.A03, layoutParams2);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(-1, -2);
        titleParams.setMargins(0, 0, 0, A09 / 2);
        this.A05.setGravity(17);
        this.A04.addView(this.A05, titleParams);
        if (this.A00 != null) {
            LinearLayout.LayoutParams titleParams2 = new LinearLayout.LayoutParams(-1, -2);
            titleParams2.setMargins(0, 0, 0, A09);
            this.A00.setGravity(17);
            this.A04.addView(this.A00, titleParams2);
        }
        LinearLayout.LayoutParams titleParams3 = new LinearLayout.LayoutParams(-1, -2);
        titleParams3.setMargins(0, 0, 0, A09);
        this.A04.addView(this.A02, titleParams3);
        this.A04.addView(this.A01, titleParams3);
    }
}
