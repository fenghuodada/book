package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0M */
/* loaded from: assets/audience_network.dex */
public final class C39280M {
    public static byte[] A00;

    static {
        A06();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 61);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{46, 33, 36, 45, 114, 103, 103};
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C39280M.A00(android.graphics.BitmapFactory$Options, int, int):int");
    }

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
            options.inSampleSize = A00(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c39290n, null, options);
        }
        return BitmapFactory.decodeStream(c39290n);
    }

    @SuppressLint({"CatchGeneralException"})
    public static Bitmap A02(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = A00(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static Bitmap A03(String str, int i, int i2, boolean z) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            if (i > 0 && i2 > 0) {
                if (z) {
                    Bitmap A01 = A01(fileInputStream, i, i2);
                    A07(fileInputStream);
                    return A01;
                }
                Bitmap A02 = A02(str, i, i2);
                A07(fileInputStream);
                return A02;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
            A07(fileInputStream);
            return decodeStream;
        } catch (Throwable th) {
            A07(null);
            throw th;
        }
    }

    @Nullable
    public static String A05(@Nullable File file) {
        if (file != null) {
            return A04(0, 7, 117) + file.getPath();
        }
        return null;
    }

    public static void A07(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
