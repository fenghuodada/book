package com.facebook.ads.redexgen.p036X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Mb */
/* loaded from: assets/audience_network.dex */
public final class C5254Mb {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(EnumC5253Ma enumC5253Ma) {
        byte[] decode = Base64.decode(enumC5253Ma.A00(C5208Lr.A00), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static Bitmap A02(EnumC5253Ma enumC5253Ma) {
        byte[] decode = Base64.decode(enumC5253Ma.A00(C5208Lr.A00), 0);
        return A00(BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }

    public static Drawable A03(C5953Xy c5953Xy, EnumC5253Ma enumC5253Ma) {
        return new BitmapDrawable(c5953Xy.getResources(), A01(enumC5253Ma));
    }
}
