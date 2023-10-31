package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.ads.redexgen.X.68 */
/* loaded from: assets/audience_network.dex */
public final class C428168 {
    public static byte[] A00;
    public static String[] A01 = {"r7c1s5U0efOStYGowMowhUbuYlQTG1Tt", "4N5luf2P5Kce0fziMzoENYJ9JUsEy4RG", "Zwxj", "L2KmiKnie6D54jPyz7fJn9CofNiJStjg", "Reipc3PbxUqE4G7HYurM4m8tamMVkuwI", "qFHCxa5Kyhox8u", "zslT757DGHQcDkpTRw1DlpZ4hqoBSQOy", "oFLB5GUqllb2V05SIM"};
    public static final AtomicReference<C42866D> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].charAt(15) != 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "ewynTuX5etTUvRbKneAORAXWy6m3gfja";
            strArr[0] = "MEXbvG7De7lT0m7kyXT3Vo2bJU5t0LAQ";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{60, 40, 57, 52, 56, 51, 62, 56, 2, 51, 56, 41, 42, 50, 47, 54, 115, 57, 56, 37, 45, 47, 36, 47, 56, 35, 41};
    }

    static {
        A01();
        A02 = new AtomicReference<>();
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A02(@Nullable Activity activity, MotionEvent motionEvent) {
        C42866D c42866d;
        try {
            if (C428269.A0P(activity) && (c42866d = A02.get()) != null) {
                c42866d.A05(motionEvent);
            }
        } catch (Throwable th) {
            C5952Xx A002 = C44138T.A00();
            if (A002 != null) {
                A002.A06().A8y(A00(20, 7, 86), C44458z.A1F, new C444690(th));
            }
        }
    }

    public static void A03(Context context) {
        if (!(context instanceof Application)) {
            return;
        }
        ActivityUtils.A05(new C6153bC());
    }

    public static void A04(C5952Xx c5952Xx, @Nullable String str) {
        ExecutorC5250MX.A06.execute(new C6156bF(c5952Xx, str));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A05(C5952Xx c5952Xx, String str) {
        if (!C428269.A0P(c5952Xx)) {
            return;
        }
        if (A02.get() == null && C43547J.A0E(C43547J.A03(str))) {
            A04(c5952Xx, str);
            return;
        }
        C42866D c42866d = A02.get();
        if (c42866d != null) {
            ExecutorC5250MX.A06.execute(new C6155bE(c42866d, str, c5952Xx));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.ads.redexgen.X.6B] */
    @SuppressLint({"CatchGeneralException"})
    public static synchronized void A07(C5952Xx c5952Xx, @Nullable String str) {
        synchronized (C428168.class) {
            try {
            } finally {
            }
            if (A02.get() != null) {
                return;
            }
            if (C428269.A0P(c5952Xx)) {
                C6151bA c6151bA = new C6151bA(c5952Xx);
                C6152bB c6152bB = new C6152bB(c5952Xx);
                C42856C A0J = new Object() { // from class: com.facebook.ads.redexgen.X.6B
                    public double A00;
                    public float A01;
                    public int A02;
                    public int A03;
                    public int A04;
                    public int A05;
                    public int A06;
                    public long A07;
                    public long A08;
                    public long A09;
                    public InterfaceC42946L A0A;
                    public InterfaceC42956M A0B;
                    public InterfaceC42966N A0C;
                    public EnumC43346z A0D;
                    public InterfaceC43467B A0E;
                    public InterfaceC43477C A0F;
                    public Class A0G;
                    @Nullable
                    public String A0H;
                    @Nullable
                    public String A0I;
                    public String A0J;
                    public HashMap<Integer, Integer> A0K;
                    public Map<Integer, String> A0L;
                    public ScheduledExecutorService A0M;
                    public boolean A0N;

                    public final C42846B A00(double d) {
                        this.A00 = d;
                        return this;
                    }

                    public final C42846B A01(float f) {
                        this.A01 = f;
                        return this;
                    }

                    public final C42846B A02(int i) {
                        this.A02 = i;
                        return this;
                    }

                    public final C42846B A03(int i) {
                        this.A03 = i;
                        return this;
                    }

                    public final C42846B A04(int i) {
                        this.A04 = i;
                        return this;
                    }

                    public final C42846B A05(int i) {
                        this.A05 = i;
                        return this;
                    }

                    public final C42846B A06(int i) {
                        this.A06 = i;
                        return this;
                    }

                    public final C42846B A07(long j) {
                        this.A07 = j;
                        return this;
                    }

                    public final C42846B A08(long j) {
                        this.A08 = j;
                        return this;
                    }

                    public final C42846B A09(InterfaceC42946L interfaceC42946L) {
                        this.A0A = interfaceC42946L;
                        return this;
                    }

                    public final C42846B A0A(InterfaceC42956M interfaceC42956M) {
                        this.A0B = interfaceC42956M;
                        return this;
                    }

                    public final C42846B A0B(InterfaceC42966N interfaceC42966N) {
                        this.A0C = interfaceC42966N;
                        return this;
                    }

                    public final C42846B A0C(EnumC43346z enumC43346z) {
                        this.A0D = enumC43346z;
                        return this;
                    }

                    public final C42846B A0D(Class cls) {
                        this.A0G = cls;
                        return this;
                    }

                    public final C42846B A0E(@Nullable String str2) {
                        this.A0I = str2;
                        return this;
                    }

                    public final C42846B A0F(String str2) {
                        this.A0J = str2;
                        return this;
                    }

                    public final C42846B A0G(HashMap<Integer, Integer> circularBufferLengthMap) {
                        this.A0K = circularBufferLengthMap;
                        return this;
                    }

                    public final C42846B A0H(Map map) {
                        this.A0L = map;
                        return this;
                    }

                    public final C42846B A0I(boolean z) {
                        this.A0N = z;
                        return this;
                    }

                    public final C42856C A0J() {
                        C42856C c42856c = new C42856C();
                        c42856c.A0J = this.A0N;
                        c42856c.A02 = this.A04;
                        c42856c.A0G = this.A0K;
                        c42856c.A01 = this.A03;
                        c42856c.A00 = this.A02;
                        c42856c.A04 = this.A06;
                        c42856c.A0F = this.A0J;
                        c42856c.A07 = this.A0B;
                        c42856c.A06 = this.A0A;
                        double unused = C42856C.A0K = this.A00;
                        c42856c.A09 = this.A0D;
                        c42856c.A0H = this.A0L;
                        c42856c.A03 = this.A05;
                        c42856c.A0C = this.A0G;
                        c42856c.A08 = this.A0C;
                        float unused2 = C42856C.A0L = this.A01;
                        long unused3 = C42856C.A0N = this.A08;
                        long unused4 = C42856C.A0M = this.A07;
                        c42856c.A05 = this.A09;
                        c42856c.A0B = this.A0F;
                        c42856c.A0A = this.A0E;
                        c42856c.A0I = this.A0M;
                        c42856c.A0D = this.A0H;
                        c42856c.A0E = this.A0I;
                        return c42856c;
                    }
                }.A0I(true).A04(C428269.A05(c5952Xx)).A02(C428269.A03(c5952Xx)).A03(C428269.A04(c5952Xx)).A06(C428269.A07(c5952Xx)).A0G(C428269.A0M()).A0A(c6151bA).A09(c6152bB.A00()).A00(C428269.A01(c5952Xx)).A0C(EnumC43346z.A0G).A0F(C428269.A0D(c5952Xx)).A0H(C428269.A0N(c5952Xx)).A05(C428269.A06(c5952Xx)).A0D(Build.class).A01(C428269.A02(c5952Xx)).A08(C428269.A09(c5952Xx)).A07(C428269.A08(c5952Xx)).A0B(c6152bB).A0E(A00(0, 20, 65)).A0J();
                if (C428269.A0Q(c5952Xx)) {
                    A03(c5952Xx.getApplicationContext());
                }
                C42866D c42866d = new C42866D(c5952Xx, A0J, C428269.A0A(c5952Xx));
                if (str != null) {
                    c42866d.A06(str);
                }
                A02.set(c42866d);
            }
        }
    }
}
