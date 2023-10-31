package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;

/* renamed from: com.facebook.ads.redexgen.X.2P */
/* loaded from: assets/audience_network.dex */
public final class C40542P {
    public static TypedValue A00;
    public static final Object A01 = new Object();

    public static final Drawable A00(Context context, @DrawableRes int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (A01) {
            if (A00 == null) {
                A00 = new TypedValue();
            }
            context.getResources().getValue(i, A00, true);
            i2 = A00.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }
}
