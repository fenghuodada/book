package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.5R */
/* loaded from: assets/audience_network.dex */
public class AsyncTaskC42395R extends AsyncTask<C42415T, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    public final InterfaceC42405S A00;
    public final C5953Xy A01;
    public final boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, Utf8.REPLACEMENT_BYTE};
    }

    static {
        A02();
    }

    public AsyncTaskC42395R(C5953Xy c5953Xy, InterfaceC42405S interfaceC42405S, boolean z) {
        this.A01 = c5953Xy;
        this.A00 = interfaceC42405S;
        this.A02 = z;
    }

    public /* synthetic */ AsyncTaskC42395R(C5953Xy c5953Xy, InterfaceC42405S interfaceC42405S, boolean z, C6172bV c6172bV) {
        this(c5953Xy, interfaceC42405S, z);
    }

    @SuppressLint({"CatchGeneralException"})
    private final Drawable A00(C42415T... c42415tArr) {
        if (!C5158L0.A02(this) && c42415tArr != null) {
            try {
                if (c42415tArr.length >= 1) {
                    String str = c42415tArr[0].A01;
                    String str2 = c42415tArr[0].A00;
                    Bitmap A0N = new C43657U(this.A01).A0N(str, -1, -1);
                    if (A0N != null) {
                        return C5721UB.A05(this.A01, A0N, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th) {
                C5158L0.A00(th, this);
                return null;
            }
        }
        return null;
    }

    private final void A03(Drawable drawable) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.AAy(drawable);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    @SuppressLint({"CatchGeneralException"})
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C42415T[] c42415tArr) {
        if (C5158L0.A02(this)) {
            return null;
        }
        try {
            return A00(c42415tArr);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}
