package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Es */
/* loaded from: assets/audience_network.dex */
public class RunnableC4787Es implements Runnable {
    public static byte[] A02;
    public static String[] A03 = {"ygrR2oCQuDV4", "DNKcGXijWm6BAbsHYB9tJVHVwOJf9ZE7", "LXio5gucrx5pRKqWpkHtzDtUlmJWag3t", "79sxQvyKDcGCor525oKKoplIPAz2exYS", "G4RdIjdfwRebxnJM9f1GRZk4OR8ZnwMf", "KNt7Wd51BXMZnN1lzx9YZQc0XvITGZGG", "KZ351c6FjYQvk7DZPBJOKLteXh4ScOon", "e5Lfk6CJXwKq"};
    public final /* synthetic */ C4795F0 A00;
    public final /* synthetic */ DownloadAction[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {56, 19, 11, 18, 16, 19, 29, 24, 49, 29, 18, 29, 27, 25, 14, 121, 76, 91, 90, 64, 90, 93, 64, 71, 78, 9, 72, 74, 93, 64, 70, 71, 90, 9, 79, 72, 64, 69, 76, 77, 7};
        if (A03[6].charAt(27) == 't') {
            throw new RuntimeException();
        }
        A03[3] = "P9OfQ9yL9WD45vqgxteLJEc4LCKor8r2";
        A02 = bArr;
    }

    static {
        A01();
    }

    public RunnableC4787Es(C4795F0 c4795f0, DownloadAction[] downloadActionArr) {
        this.A00 = c4795f0;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4777Eg c4777Eg;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            try {
                c4777Eg = this.A00.A09;
                c4777Eg.A02(this.A01);
            } catch (IOException e) {
                Log.e(A00(0, 15, 80), A00(15, 26, 5), e);
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            String[] strArr = A03;
            if (strArr[2].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            A03[5] = "LLc1NddejmN7rNF53s5OYYgeggfBVRnl";
        }
    }
}
