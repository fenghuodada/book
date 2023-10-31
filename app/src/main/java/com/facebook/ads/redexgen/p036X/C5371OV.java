package com.facebook.ads.redexgen.p036X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.OV */
/* loaded from: assets/audience_network.dex */
public final class C5371OV extends LinearLayout {
    public static String[] A05 = {"JiUd07qZ", "phaLMHqUBlp6P5RZzzm", "VtPMRXbuUkVLmtGCwM", "RgvNiIo52t", "FYi9K2JmgPw1hqWSXD3EPgcEPQmLRiB", "yPPKnDMDveXTdnfoUUkFxo3t2NtgVDwK", "Cr", "5lHXxybE2bQiDNmNKuHItJ8Sueck67l"};
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C5371OV(C5953Xy c5953Xy, C39871K c39871k, int dotSize) {
        super(c5953Xy);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f = C5208Lr.A00;
        int i = (int) (8.0f * f);
        int i2 = (int) (6.0f * f);
        int margin = (int) (1.0f * f);
        this.A02 = margin;
        int margin2 = c39871k.A04(false);
        this.A04 = margin2;
        int margin3 = C40592U.A01(this.A04, 128);
        this.A03 = margin3;
        this.A01 = new ArrayList();
        for (int i3 = 0; i3 < dotSize; i3++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i, i);
            int margin4 = this.A02;
            gradientDrawable.setStroke(margin4, 0);
            ImageView imageView = new ImageView(c5953Xy);
            LinearLayout.LayoutParams dotImageParams = new LinearLayout.LayoutParams(-2, -2);
            dotImageParams.setMargins(0, 0, i2, 0);
            dotImageParams.gravity = 17;
            imageView.setLayoutParams(dotImageParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    public final void A00(int i) {
        int i2;
        int i3;
        if (this.A00 == i) {
            return;
        }
        this.A00 = i;
        if (A05[2].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[4] = "BJqXxH8n0fuaHx3JVwGHjWVcPjmBGjI";
        strArr[7] = "ZUGfW6Md7SIL60yz7Eq8Bq3LU56iFcm";
        for (int i4 = 0; i4 < this.A01.size(); i4++) {
            if (i4 == i) {
                i2 = this.A04;
                i3 = this.A04;
            } else {
                i2 = this.A03;
                i3 = 0;
            }
            int borderColor = this.A02;
            this.A01.get(i4).setStroke(borderColor, i3);
            this.A01.get(i4).setColor(i2);
            this.A01.get(i4).invalidateSelf();
        }
    }
}
