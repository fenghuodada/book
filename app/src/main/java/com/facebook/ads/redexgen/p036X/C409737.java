package com.facebook.ads.redexgen.p036X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.37 */
/* loaded from: assets/audience_network.dex */
public class C409737 {
    public static Field A00;
    public static boolean A01;
    public static Field A02;
    public static Field A03;
    public static boolean A04;
    public static boolean A05;
    public static byte[] A06;
    public static String[] A07 = {"L3s3T89NtFpuDxLEKy", "cPbOOnF1boG888iUsBU9Kxy6grpVf", "WRFzwzYh2MAqPiUxzG9bo2kJfp2KHcHO", "9vcbGLR2T7yxWMobTpRq8bB9U", "SibURF26AGynrFSfxWD5QUR4x22xGZFQ", "yTrIgm3menGhBZg1uO8L6V5Q1", "HbZuQ189OK2eO85oLGeDxMojN", "ndmjFhTTq"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{26, 54, 20, 20, 18, 4, 4, 30, 21, 30, 27, 30, 3, 14, 51, 18, 27, 18, 16, 22, 3, 18, 81, 113, 85, 82, 116, 89, 85, 91, 84, 72, 107, 75, 111, 104, 81, 111, 98, 114, 110, 14, 16, 23, 29, 22, 14};
    }

    static {
        A02();
        A01 = false;
    }

    private final long A00() {
        return ValueAnimator.getFrameDelay();
    }

    public int A03(View view) {
        return 0;
    }

    public int A04(View view) {
        return 0;
    }

    public int A05(View view) {
        if (!A04) {
            try {
                A02 = View.class.getDeclaredField(A01(22, 10, 116));
                A02.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            A04 = true;
        }
        Field field = A02;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        String[] strArr = A07;
        if (strArr[6].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "NCc6Jqv2GO376CQKGw1IxKfvH";
        strArr2[5] = "YVXHACGvNzaMPxLwmScJLLvmY";
        return 0;
    }

    public int A06(View view) {
        if (!A05) {
            try {
                A03 = View.class.getDeclaredField(A01(32, 9, 78));
                A03.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            A05 = true;
        }
        Field field = A03;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public Display A07(View view) {
        if (A0J(view)) {
            Context context = view.getContext();
            String[] strArr = A07;
            if (strArr[4].charAt(26) != strArr[2].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "4a3eiuhXeUDn5EQ45doxduLNA";
            strArr2[5] = "KtzDkVpoyjscLRsaaF8xyCPTY";
            return ((WindowManager) context.getSystemService(A01(41, 6, 49))).getDefaultDisplay();
        }
        return null;
    }

    public C41143P A08(View view, C41143P c41143p) {
        return c41143p;
    }

    public C41143P A09(View view, C41143P c41143p) {
        return c41143p;
    }

    public void A0A(View view) {
        view.postInvalidate();
    }

    public void A0B(View view) {
        if (view instanceof InterfaceC40792p) {
            ((InterfaceC40792p) view).stopNestedScroll();
        }
    }

    public void A0C(View view, int i) {
    }

    public void A0D(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public final void A0E(View view, @Nullable C40762m c40762m) {
        view.setAccessibilityDelegate(c40762m == null ? null : c40762m.A00());
    }

    public void A0F(View view, InterfaceC40822s interfaceC40822s) {
    }

    public void A0G(View view, Runnable runnable) {
        view.postDelayed(runnable, A00());
    }

    public void A0H(View view, Runnable runnable, long j) {
        view.postDelayed(runnable, A00() + j);
    }

    public boolean A0I(View view) {
        return false;
    }

    public boolean A0J(View view) {
        return view.getWindowToken() != null;
    }

    public final boolean A0K(View view) {
        if (A01) {
            return false;
        }
        if (A00 == null) {
            try {
                A00 = View.class.getDeclaredField(A01(0, 22, 63));
                A00.setAccessible(true);
            } catch (Throwable unused) {
                A01 = true;
                return false;
            }
        }
        try {
            return A00.get(view) != null;
        } catch (Throwable unused2) {
            A01 = true;
            return false;
        }
    }
}
