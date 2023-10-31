package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7Y */
/* loaded from: assets/audience_network.dex */
public final class C43697Y {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{92, 88, 84, 82, 80};
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(android.graphics.BitmapFactory.Options r3, int r4, int r5) {
        /*
            int r1 = r3.outHeight
            int r0 = r3.outWidth
            r3 = 1
            if (r1 > r5) goto L9
            if (r0 <= r4) goto L18
        L9:
            int r2 = r1 / 2
            int r1 = r0 / 2
        Ld:
            int r0 = r2 / r3
            if (r0 < r5) goto L18
            int r0 = r1 / r3
            if (r0 < r4) goto L18
            int r3 = r3 * 2
            goto Ld
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C43697Y.A00(android.graphics.BitmapFactory$Options, int, int):int");
    }

    @Nullable
    public static Bitmap A01(InputStream inputStream, int i, int i2) throws IOException {
        if (Build.VERSION.SDK_INT < 19) {
            return BitmapFactory.decodeStream(inputStream);
        }
        C39290N c39290n = new C39290N(inputStream);
        c39290n.mark(8192);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c39290n, null, options);
        c39290n.reset();
        if (!c39290n.A00()) {
            options.inSampleSize = A00(options, i2, i);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c39290n, null, options);
        }
        return BitmapFactory.decodeStream(c39290n);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static Bitmap A02(String str, int i, int i2, C44148U c44148u) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i2, i);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable th) {
            c44148u.A06().A8y(A03(0, 5, 99), C44458z.A1g, new C444690(th));
            return null;
        }
    }
}
