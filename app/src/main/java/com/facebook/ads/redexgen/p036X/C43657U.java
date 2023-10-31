package com.facebook.ads.redexgen.p036X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7U */
/* loaded from: assets/audience_network.dex */
public final class C43657U {
    public static InterfaceC390600 A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"8gkZjHnxCvZyg7TzwjjGeSdvls9L7Gam", "fcbSC3ja3K2jNylkxCBC51G6bXitMdQ0", "2foOCT", "ocB0m3", "KfMQJM794wt5IuG", "feDb68pnVWWOEqV45c", "KnEa0S3Tnigt4irEXno07XBXpnYxFsFq", "aK1UKkDbG3zR1xh0x3umKxUvmkPLseuR"};
    public static final String A0E;
    public static final Map<String, C391206> A0F;
    public static final Map<String, C43677W> A0G;
    public long A00;
    public C5088Jp A01;
    public final C43667V A03;
    public final C44148U A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0C = new byte[]{124, Byte.MIN_VALUE, -83, 122, -125, -85, 122, -80, 108, -105, 108, 103, 108, 106, 106, 108, 85, 84, -126, 78, Byte.MAX_VALUE, 85, 81, -119, -89, -87, -82, -85, 102, -71, -70, -89, -72, -70, -85, -86, 116, -113, -83, -81, -76, -75, -70, -77, 108, -81, -69, -71, -68, -72, -79, -64, -79, Byte.MAX_VALUE, -99, -97, -92, -91, -86, -93, 92, -94, -99, -91, -88, -95, -96, 100, -126, -124, -119, -118, -113, -120, 65, -108, -107, -126, -109, -107, -122, -123, 79, 79, 79, -116, -65, -86, -84, -73, -69, -80, -74, -75, 103, -66, -81, -80, -77, -84, 103, -84, -65, -84, -86, -68, -69, -80, -75, -82, 103, -86, -88, -86, -81, -84, 103, -85, -74, -66, -75, -77, -74, -88, -85, -70, 117, -79, -81, -79, -74, -77, -111, -67, -69, -66, -70, -77, -62, -73, -67, -68, -106, -67, -67, -71, 120, 118, 120, 125, 122, 91, 118, 126, -127, -118, -121, 122, 93, -124, -124, Byte.MIN_VALUE, -120, -101, -120, -122, -104, -105, -120, -24, -21, -35, -32, -27, -24, -38, -35, -40, -19, -30, -26, -34, -40, -26, -20, -96, -107, -100, -92};
    }

    static {
        A0F();
        A0E = C43657U.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C43657U(C44148U c44148u) {
        this.A04 = c44148u;
        this.A03 = C43667V.A06(c44148u.A00());
        this.A08 = C5064JR.A1y(c44148u);
        this.A09 = C5064JR.A26(c44148u, C5505Qg.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static synchronized InterfaceC390600 A03(C5952Xx c5952Xx) {
        InterfaceC390600 interfaceC390600;
        synchronized (C43657U.class) {
            if (A0A == null) {
                A0A = C390701.A00(c5952Xx, new Object() { // from class: com.facebook.ads.redexgen.X.07
                    public int A00;
                    public int A01;
                    public boolean A02;
                    public boolean A03;
                    public boolean A04;

                    public final C391307 A00(int i) {
                        this.A00 = i;
                        return this;
                    }

                    public final C391307 A01(int i) {
                        this.A01 = i;
                        return this;
                    }

                    public final C391307 A02(boolean z) {
                        this.A02 = z;
                        return this;
                    }

                    public final C391307 A03(boolean z) {
                        this.A03 = z;
                        return this;
                    }

                    public final C391307 A04(boolean z) {
                        this.A04 = z;
                        return this;
                    }

                    public final C391408 A05() {
                        return new C391408(this.A00, this.A02, this.A01, this.A03, this.A04);
                    }
                }.A00(C5064JR.A04(c5952Xx)).A02(c5952Xx.A03().A8P()).A01(-1).A03(C5064JR.A0j(c5952Xx)).A04(C5064JR.A25(c5952Xx)).A05(), A05(c5952Xx));
            }
            interfaceC390600 = A0A;
        }
        return interfaceC390600;
    }

    public static C391206 A04(C44148U c44148u, String str) {
        C391206 c391206 = A0F.get(str);
        if (C43687X.A06(c44148u) && c391206 != null) {
            return new C391206(c391206);
        }
        return new C391206(str);
    }

    public static InterfaceC39270L A05(C5952Xx c5952Xx) {
        return new C5956Y1(c5952Xx);
    }

    public static synchronized List<String> A09(C44148U c44148u) {
        List<String> list;
        synchronized (C43657U.class) {
            if (A0B == null) {
                A0B = new ArrayList();
                A0J(A0B, c44148u);
            }
            list = A0B;
        }
        return list;
    }

    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList<Future> arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0D;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "";
            if (!hasNext) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    for (Future future : arrayList2) {
                        Boolean bool = (Boolean) future.get();
                        atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    Log.e(A0E, A08(85, 42, 61), e);
                    atomicBoolean.set(false);
                }
                return atomicBoolean;
            }
            arrayList2.add(ExecutorC5250MX.A02().submit(it.next()));
        }
    }

    public static void A0H(C44148U c44148u, String str) {
        C43677W c43677w;
        if (C43687X.A06(c44148u) && !TextUtils.isEmpty(str) && (c43677w = A0G.get(str)) != null) {
            c43677w.A00 = A08(185, 4, 35);
            C5952Xx A00 = c44148u.A00();
            C5509Qk A05 = C5509Qk.A05(A00);
            String cacheKey = C5509Qk.A08(A00, C5191La.A00(str));
            if (cacheKey == null) {
                cacheKey = str;
            }
            C43687X.A04(c44148u, c43677w, A05.A0H(cacheKey));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(EnumC5087Jo enumC5087Jo) {
        if (this.A01 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(173, 12, 111), C5236MJ.A04(this.A00));
        this.A01.A02(enumC5087Jo, hashMap);
    }

    public static void A0J(List<String> list, C44148U c44148u) {
        A0K(list, C6326e2.A01(c44148u));
        A0K(list, C43667V.A07(c44148u));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String[] strArr = A0D;
        if (strArr[3].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[3] = "Vghlgc";
        strArr2[2] = "qwUey9";
        if (path != A08(0, 0, 127)) {
            list.add(path.toLowerCase(Locale.getDefault()));
        }
    }

    @Nullable
    public final Bitmap A0M(String str) {
        return this.A07.get(str);
    }

    @Nullable
    public final Bitmap A0N(String str, int i, int i2) {
        if (this.A08) {
            C391206 A04 = A04(this.A04, str);
            A04.A03 = A08(185, 4, 35);
            A04.A01 = i2;
            A04.A00 = i;
            return A03(this.A04.A00()).AE6(A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i, i2, A08(169, 4, 114));
    }

    @Nullable
    public final File A0O(String str) {
        C391206 A04 = A04(this.A04, str);
        A04.A03 = A08(185, 4, 35);
        return A03(this.A04.A00()).AE7(A04);
    }

    @Nullable
    public final File A0P(String str) {
        if (this.A08) {
            return A0O(str);
        }
        return this.A03.A0F(str);
    }

    public final String A0Q(String str) {
        if (this.A08) {
            return A0R(str);
        }
        return this.A03.A0G(str);
    }

    public final String A0R(String cachedUrl) {
        C391206 A04 = A04(this.A04, cachedUrl);
        A04.A03 = A08(185, 4, 35);
        String AE9 = A03(this.A04.A00()).AE9(A04);
        return AE9 != null ? AE9 : cachedUrl;
    }

    public final String A0S(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0R(str);
    }

    public final void A0T() {
        C5128KV.A05(A08(127, 19, 68), A08(37, 16, 66), A08(0, 8, 64));
    }

    public final void A0U() {
        C5128KV.A05(A08(146, 16, 11), A08(53, 14, 50), A08(16, 7, 19));
    }

    public final void A0V() {
        this.A07.clear();
    }

    public final void A0W(@Nullable InterfaceC43577M interfaceC43577M, C43587N c43587n) {
        C5128KV.A05(A08(162, 7, 25), A08(67, 18, 23), A08(8, 8, 44));
        this.A00 = System.currentTimeMillis();
        C43687X.A02(this.A04, c43587n, C43687X.A07, A08(23, 14, 60), -1L);
        ExecutorC5250MX.A03().execute(new C5957Y2(this, new ArrayList(this.A05), interfaceC43577M, c43587n, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0X(C43617Q c43617q) {
        this.A05.add(new CallableC43627R(this, c43617q));
    }

    public final void A0Y(C43617Q c43617q) {
        c43617q.A05 = true;
        this.A06.add(new CallableC43627R(this, c43617q));
    }

    public final void A0Z(C43617Q c43617q) {
        c43617q.A05 = true;
        if (this.A09) {
            this.A06.add(new CallableC43607P(this, c43617q));
        } else {
            this.A06.add(new CallableC43627R(this, c43617q));
        }
    }

    public final void A0a(C43617Q c43617q) {
        if (this.A09) {
            this.A05.add(new CallableC43607P(this, c43617q));
        } else {
            this.A05.add(new CallableC43627R(this, c43617q));
        }
    }

    public final void A0b(final C43637S c43637s) {
        Callable<Boolean> callable = new Callable<Boolean>(c43637s) { // from class: com.facebook.ads.redexgen.X.7T
            public static byte[] A02;
            public static String[] A03 = {"jwTNBF52XqMGgcVEiQTwvXvSBsl43Bcu", "zl9XISU", "9LwyCiCzMXmNgkxTRjX8XUqiNT4UlidW", "Jar4Zz8ck96tLH67JFbLbWmYESMeU49V", "Yd8bjyjazIom6Oxe2tnjIAJyfdSlHwWG", "VgUZ5KaBAYbzt3oMIew8EQ4BA2c", "hXTgBapwd4emagenALPcDOSBW5zmdf3H", "17k"};
            public final C43637S A00;

            public static String A01(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    if (A03[1].length() == 32) {
                        throw new RuntimeException();
                    }
                    A03[3] = "";
                    if (i4 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
                    i4++;
                }
            }

            public static void A02() {
                A02 = new byte[]{-20, -16, -28, -22, -24};
            }

            static {
                A02();
            }

            {
                this.A00 = c43637s;
            }

            private final Boolean A00() {
                C44148U c44148u;
                boolean z;
                C44148U c44148u2;
                InterfaceC390600 A032;
                boolean z2;
                boolean z3;
                C43667V c43667v;
                Map map;
                if (C5158L0.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    C391206 c391206 = new C391206(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 83), this.A00.A01, this.A00.A02);
                    c391206.A01 = this.A00.A04;
                    c391206.A00 = this.A00.A03;
                    c44148u = C43657U.this.A04;
                    if (C43687X.A06(c44148u)) {
                        map = C43657U.A0F;
                        map.put(this.A00.A07, c391206);
                    }
                    z = C43657U.this.A08;
                    boolean z4 = false;
                    if (A03[3].length() != 5) {
                        A03[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        if (!z) {
                            c43667v = C43657U.this.A03;
                            if (c43667v.A0D(this.A00) != null) {
                                z4 = true;
                            }
                        } else {
                            c44148u2 = C43657U.this.A04;
                            A032 = C43657U.A03(c44148u2.A00());
                            z4 = A032.AE6(c391206, false).A01();
                        }
                        C43707Z c43707z = this.A00.A00;
                        if (c43707z != null && c43707z.A02()) {
                            int A00 = c43707z.A00();
                            int A01 = c43707z.A01();
                            if (A00 <= 0 || A01 <= 0) {
                                z2 = C43657U.this.A08;
                                if (z2) {
                                    A04(this.A00.A07, c391206);
                                } else {
                                    int i = this.A00.A03;
                                    int width = this.A00.A04;
                                    A03(i, width);
                                }
                            } else {
                                z3 = C43657U.this.A08;
                                if (z3) {
                                    c391206.A00 = A00;
                                    c391206.A01 = A01;
                                    A04(this.A00.A07, c391206);
                                } else {
                                    A03(A00, A01);
                                }
                            }
                        }
                        return Boolean.valueOf(z4);
                    }
                    throw new RuntimeException();
                } catch (Throwable th) {
                    C5158L0.A00(th, this);
                    return null;
                }
            }

            private void A03(int i, int i2) {
                C43667V c43667v;
                C44148U c44148u;
                Map map;
                c43667v = C43657U.this.A03;
                c44148u = C43657U.this.A04;
                Bitmap A0E2 = c43667v.A0E(c44148u, this.A00.A07, i, i2, this.A00.A01);
                if (A0E2 == null) {
                    return;
                }
                map = C43657U.this.A07;
                map.put(this.A00.A07, A0E2);
            }

            private void A04(String str, C391206 c391206) {
                C44148U c44148u;
                InterfaceC390600 A032;
                Map map;
                c44148u = C43657U.this.A04;
                A032 = C43657U.A03(c44148u.A00());
                Bitmap A00 = A032.AE6(c391206, true).A00();
                if (A00 == null) {
                    return;
                }
                map = C43657U.this.A07;
                map.put(str, A00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (C5158L0.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    C5158L0.A00(th, this);
                    return null;
                }
            }
        };
        if (!c43637s.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0c(C43637S c43637s) {
        c43637s.A02 = true;
        A0b(c43637s);
    }

    public final void A0d(C5088Jp c5088Jp) {
        this.A01 = c5088Jp;
    }
}
