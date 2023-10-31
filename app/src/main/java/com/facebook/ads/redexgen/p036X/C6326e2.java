package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

@SuppressLint({"BadMethodUse-java.lang.String.length"})
/* renamed from: com.facebook.ads.redexgen.X.e2 */
/* loaded from: assets/audience_network.dex */
public final class C6326e2 implements InterfaceC390600 {
    public static byte[] A09;
    public static String[] A0A = {"2hmAfzTadn", "1uDqsMr9wv4o5ZghfCOZg4FuDp7sllqp", "nT1KYDstdBBAZ5nN", "UVqk4rMzzgqbiyaJgpoGMOUy0jQCoEBq", "ewXxsmpHr", "rT44HeCpkJQ", "C3kiv90mrVS0BL1BSM5Dfu9lHf0n3Csl", "grgxNBq6hb"};
    public static final String A0B;
    public final int A00;
    public final int A01;
    public final C391408 A02;
    public final InterfaceC39270L A04;
    public final C44148U A05;
    public final boolean A08;
    public final Map<String, File> A06 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Semaphore> A07 = new HashMap();
    public final C39160A A03 = new C39160A();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            String[] strArr = A0A;
            if (strArr[5].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "m9U6X0moZlc";
            strArr2[7] = "IfCNkNm6kG";
            copyOfRange[i4] = (byte) (i5 - 76);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-105, -33, -40, -22, -105, -39, -36, -36, -27, -105, -32, -27, -21, -36, -23, -23, -20, -25, -21, -36, -37, -91, -63, -75, -5, -2, 1, -6, -75, -8, 1, -6, -10, 3, -6, -7, -49, -75, -125, 117, -106, -55, -55, -70, -62, -59, -55, -113, 117, -7, 23, 25, 30, 31, 36, 29, -42, 28, 31, 34, 27, -42, 25, 37, 35, 38, 34, 27, 42, 27, -42, 4, 34, 36, 41, 42, 47, 40, -31, 39, 42, 45, 38, -31, 47, 48, 53, -31, 36, 48, 46, 49, 45, 38, 53, 38, -31, -91, -61, -59, -54, -53, -48, -55, -126, -47, -56, -126, -32, -2, 11, -60, 17, -67, 0, 9, 12, 16, 2, -67, 0, -2, 0, 5, 2, -67, 3, 6, 9, 2, -53, -80, -50, -37, -108, -31, -115, -33, -46, -50, -47, -115, -50, -32, -32, -46, -31, -32, -101, -69, -39, -26, -97, -20, -104, -22, -35, -39, -36, -104, -28, -35, -26, -33, -20, -32, -104, -25, -34, -104, -72, -39, -32, -39, -24, -35, -30, -37, -108, -41, -43, -41, -36, -39, -108, -38, -35, -32, -39, -108, -43, -38, -24, -39, -26, -108, -39, -20, -41, -39, -39, -40, -35, -30, -37, -108, -26, -39, -24, -26, -19, -108, -43, -24, -24, -39, -31, -28, -24, -25, -82, -108, -43, 2, 2, -1, 2, -80, -13, -15, -13, -8, -7, -2, -9, -80, 4, -8, -11, -80, -10, -7, -4, -11, -54, -9, -9, -12, -9, -91, -24, -15, -22, -26, -13, -18, -13, -20, -91, -21, -18, -15, -22, -72, -27, -27, -30, -27, -109, -42, -33, -30, -26, -36, -31, -38, -109, -26, -30, -24, -27, -42, -40, -72, -35, -46, -34, -36, -33, -37, -44, -29, -44, -113, -31, -44, -30, -33, -34, -35, -30, -44, -99, -65, -35, -28, -44, -39, -46, -117, -33, -38, -117, -35, -48, -52, -49, -117, -73, -70, -60, -51, -125, -68, -65, -62, -69, -125, -71, -73, -71, -66, -69, -18, 0, 0, -14, 1, -57, -68, -68, -68, 5, 8, 11, 4, -39, -50, -50, -50, 0, 13, 3, 17, 14, 8, 3, -2, 0, 18, 18, 4, 19, -50};
        String[] strArr = A0A;
        if (strArr[1].charAt(5) == strArr[3].charAt(5)) {
            throw new RuntimeException();
        }
        A0A[6] = "1YrvosXM8zHw8wsMUb3ulJ8Xgx5scBHO";
    }

    static {
        A04();
        A0B = C6326e2.class.getSimpleName();
    }

    public C6326e2(C44148U c44148u, C391408 c391408, InterfaceC39270L interfaceC39270L) {
        this.A05 = c44148u;
        this.A08 = c391408.A02();
        this.A00 = c391408.A00();
        this.A04 = interfaceC39270L;
        this.A01 = c391408.A01();
        this.A02 = c391408;
    }

    public static InterfaceC39260K A00(Context context, String str) throws C39230H {
        try {
            InputStream open = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr, 0, bArr.length);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return new C6324e0(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (IOException e) {
            throw new C39230H(A03(131, 18, 33), e);
        }
    }

    public static File A01(Context context) {
        return new File(context.getCacheDir(), A03(318, 15, 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
        r8 = r6.A03();
        r6.A06();
        r6 = java.lang.System.currentTimeMillis() - r13;
        r21.A00().A4B(r3, r16.A04);
        r16.A06.put(r10, r3);
        r16.A04.ADf(r10, 2112, null, java.lang.Long.valueOf(r8), java.lang.Long.valueOf(r6), r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
        return r3;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0101: INVOKE  
      (r9v1 ?? I:com.facebook.ads.redexgen.X.0L)
      (r10 I:java.lang.String)
      (r11 I:int)
      (r12 I:java.lang.String)
      (r13 I:java.lang.Long)
      (r14 I:java.lang.Long)
      (r15 I:com.facebook.ads.redexgen.X.06)
     type: INTERFACE call: com.facebook.ads.redexgen.X.0L.ADf(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void, block:B:40:0x00f6 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x011b: INVOKE  
      (r9v0 ?? I:com.facebook.ads.redexgen.X.0L)
      (r10 I:java.lang.String)
      (r11 I:int)
      (r12 I:java.lang.String)
      (r13 I:java.lang.Long)
      (r14 I:java.lang.Long)
      (r15 I:com.facebook.ads.redexgen.X.06)
     type: INTERFACE call: com.facebook.ads.redexgen.X.0L.ADf(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void, block:B:46:0x0110 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0100: MOVE  (r15 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:40:0x00f6 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x011a: MOVE  (r15 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:46:0x0110 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File A02(com.facebook.ads.redexgen.p036X.C391206 r17, java.lang.String r18, java.lang.String r19, int r20, com.facebook.ads.redexgen.p036X.C391509 r21) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C6326e2.A02(com.facebook.ads.redexgen.X.06, java.lang.String, java.lang.String, int, com.facebook.ads.redexgen.X.09):java.io.File");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9 A[Catch: all -> 0x0114, 0H -> 0x0117, TRY_LEAVE, TryCatch #11 {0H -> 0x0117, all -> 0x0114, blocks: (B:12:0x0079, B:34:0x00f9, B:40:0x010c, B:32:0x00f3, B:24:0x00b1, B:26:0x00b9), top: B:107:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd A[Catch: all -> 0x0185, 0H -> 0x0187, TRY_ENTER, TryCatch #12 {0H -> 0x0187, all -> 0x0185, blocks: (B:9:0x0051, B:15:0x0085, B:38:0x0106, B:45:0x0119, B:35:0x00fd, B:37:0x0103, B:29:0x00e5, B:30:0x00ec), top: B:105:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c A[Catch: all -> 0x0114, 0H -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #11 {0H -> 0x0117, all -> 0x0114, blocks: (B:12:0x0079, B:34:0x00f9, B:40:0x010c, B:32:0x00f3, B:24:0x00b1, B:26:0x00b9), top: B:107:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05(android.content.Context r24, com.facebook.ads.redexgen.p036X.C6322dy r25, java.lang.String r26, int r27, int r28, long r29) throws com.facebook.ads.redexgen.p036X.C39230H {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C6326e2.A05(android.content.Context, com.facebook.ads.redexgen.X.dy, java.lang.String, int, int, long):void");
    }

    @SuppressLint({"CatchGeneralException"})
    private void A06(C6322dy c6322dy) {
        try {
            File A04 = c6322dy.A04();
            if (A04.exists()) {
                c6322dy.A06();
                boolean delete = A04.delete();
                if (this.A08) {
                    String str = A0B;
                    Log.i(str, A03(170, 52, 40) + delete);
                }
            }
        } catch (Exception e) {
            if (this.A08) {
                Log.e(A0B, A03(108, 23, 81), e);
            }
        }
    }

    private boolean A07(C6322dy c6322dy) {
        try {
            c6322dy.A05();
            if (A0A[6].charAt(7) != 'U') {
                A0A[6] = "AEs2mSbxTVyMZvMH4XlDgcN9VznTkYzp";
                return true;
            }
            throw new RuntimeException();
        } catch (C6320dw e) {
            if (this.A08) {
                Log.e(A0B, A03(244, 19, 57), e);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final <T> C390802<T> A08(C391206 c391206, C391509<T> c391509) {
        Semaphore semaphore;
        if (c391509.A03()) {
            File file = this.A06.get(c391206.A09);
            if (file != null) {
                this.A04.ADg(c391206.A09, true, c391206);
                return c391509.A00().A3A(file, this.A04);
            }
            this.A04.ADg(c391206.A09, false, c391206);
            return new C390802<>(false, null);
        }
        String str = c391206.A09;
        String extension = c391206.A04;
        String str2 = this.A03.A03(str) + extension;
        synchronized (this.A07) {
            semaphore = this.A07.get(str2);
            if (semaphore == null) {
                semaphore = new Semaphore(1);
                this.A07.put(str2, semaphore);
            }
            try {
            } catch (Throwable th) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(str2);
                    throw th;
                }
            }
        }
        try {
            semaphore.acquire();
            File A02 = A02(c391206, str, str2, this.A01, c391509);
            if (A02 != null) {
                C390802<T> A3A = c391509.A00().A3A(A02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(str2);
                }
                return A3A;
            }
            C390802<T> c390802 = new C390802<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(str2);
            }
            return c390802;
        } catch (InterruptedException unused) {
            if (this.A08) {
                String str3 = A03(97, 11, 22) + str + A03(0, 22, 43);
            }
            C390802<T> c3908022 = new C390802<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(str2);
                return c3908022;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC390600
    public final C390802<Bitmap> AE6(C391206 c391206, boolean z) {
        return A08(c391206, new C391509(new C6329e5(c391206.A01, c391206.A00, this.A02.A04(), this.A02.A03(), z)));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.io.File> */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC390600
    @Nullable
    public final File AE7(C391206 c391206) {
        C391509 c391509 = new C391509(new C6328e4());
        c391509.A01(true);
        c391509.A02(false);
        return (File) A08(c391206, c391509).A00();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC390600
    @Nullable
    public final String AE8(C391206 c391206) {
        return (String) A08(c391206, new C391509(new C6327e3())).A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.lang.String> */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC390600
    @Nullable
    public final String AE9(C391206 c391206) {
        C391509 c391509 = new C391509(new C6327e3());
        c391509.A01(true);
        c391509.A02(false);
        return (String) A08(c391206, c391509).A00();
    }
}
