package com.facebook.ads.redexgen.p036X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ph */
/* loaded from: assets/audience_network.dex */
public final class C5444Ph {
    public static boolean A00;
    public static byte[] A01;
    public static String[] A02 = {"Y0rICHp14ARSNu9MlXOQlrQKpJ7V2hwf", "9bmfgm9m8nITbmWk0ICcMAG3MrS", "cwEc0HiI6y8ZhWJ4MUGuUSsWKgKIPOUb", "CeguwAwwe", "1UN8Pz5pD", "KG5kSs2s3o8nfvSCZiVMOrQyfdZTA2DP", "BO8EwxINC4bfwl9QwPIiUjcYWt5Jq71N", "VnsxrIf3KddrD6MinhDJfsdqz9CBs5tu"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[2].charAt(4) == 'h') {
                throw new RuntimeException();
            }
            A02[5] = "V4DWKv2CalsHghC0GoFw5ZQ5aRA0odCa";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
            i4++;
        }
    }

    public static void A03() {
        A01 = new byte[]{-1, 36, 46, 43, 39, 28, 52, 8, 32, 47, 45, 36, 30, 46, -37, 36, 46, -37, 41, 48, 39, 39, -23, 9, 28, 42, 38, 44, 41, 26, 28, 42, -41, 32, 42, -41, 37, 44, 35, 35, -27, -65, -54, -43, -46, -51, -54, -35, -46, -40, -41, -119, -49, -54, -46, -43, -50, -51, -105, -34, -32, -35};
    }

    static {
        A03();
        A00 = true;
    }

    @Nullable
    public static BitmapDrawable A00(C5953Xy c5953Xy, @Nullable String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] decode = Base64.decode(str, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray != null && (!A00 || A05(c5953Xy, decodeByteArray))) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeByteArray);
                bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                Resources resources = c5953Xy.getResources();
                if (resources != null) {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A04(c5953Xy, A02(0, 23, 116));
                    }
                } else {
                    A04(c5953Xy, A02(23, 18, 112));
                }
                return bitmapDrawable;
            }
            return null;
        } catch (Throwable th) {
            c5953Xy.A06().A8y(A02(59, 3, 42), C44458z.A1t, new C444690(th));
            return null;
        }
    }

    @Nullable
    public static C5445Pi A01(C5953Xy c5953Xy, @Nullable String str) {
        BitmapDrawable A002;
        try {
            if (TextUtils.isEmpty(str) || (A002 = A00(c5953Xy, str)) == null) {
                return null;
            }
            C5445Pi c5445Pi = new C5445Pi(c5953Xy);
            if (Build.VERSION.SDK_INT >= 16) {
                c5445Pi.setBackground(A002);
            } else {
                c5445Pi.setBackgroundDrawable(A002);
            }
            c5445Pi.setClickable(false);
            c5445Pi.setFocusable(false);
            return c5445Pi;
        } catch (Throwable th) {
            c5953Xy.A06().A8y(A02(59, 3, 42), C44458z.A1t, new C444690(th));
            return null;
        }
    }

    public static void A04(C5953Xy c5953Xy, String str) {
        c5953Xy.A06().A8y(A02(59, 3, 42), C44458z.A1t, new C444690(str));
    }

    @VisibleForTesting
    public static boolean A05(C5953Xy c5953Xy, Bitmap bitmap) {
        int i = 0;
        while (true) {
            int width = bitmap.getWidth();
            if (A02[2].charAt(4) == 'h') {
                throw new RuntimeException();
            }
            A02[2] = "44dBdHmZhYYzc5DiIB6SXSnn6xfqMO61";
            if (i < width) {
                for (int i2 = 0; i2 < bitmap.getHeight(); i2++) {
                    if (Color.alpha(bitmap.getPixel(i, i2)) / 255.0f > 0.03f) {
                        A04(c5953Xy, A02(41, 18, 34));
                        return false;
                    }
                }
                i++;
            } else {
                return true;
            }
        }
    }
}
