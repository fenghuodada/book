package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7E */
/* loaded from: assets/audience_network.dex */
public final class C43497E {
    public static byte[] A06;
    public static String[] A07 = {"aJ4yIqlrLMt", "EKTEccEpmR5675IOZ9lerUvwdG3ro5hY", "jTSIV3oRBrHoNrPkrRMeoeXpEd5JgTWm", "V52m2mthgbiWP0xFHXCG", "Wq", "BEItf56ADM92z1bkMxhlUdx7QMuMYd3L", "2Z", "ce4p6sp9ssAJXyOyOHhkkoq4sskZtb0W"};
    public int A00;
    public final Context A01;
    public final C42856C A02;
    public final InterfaceC43467B A03;
    public final InterfaceC43477C A04;
    public final Set<C43276s> A05 = new HashSet();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "0R";
            strArr2[4] = "EB";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
            i4++;
        }
    }

    public static void A02() {
        A06 = new byte[]{91, 77, 92, 100, 73, 91, 92, 120, 77, 90, 65, 71, 76, 65, 75, 107, 71, 68, 68, 77, 75, 92, 65, 71, 70, 124, 65, 69, 77, 101, 91};
    }

    static {
        A02();
    }

    public C43497E(Context context, C42856C c42856c) {
        this.A02 = c42856c;
        this.A01 = context;
        this.A04 = c42856c.A0c();
        this.A03 = c42856c.A0b();
    }

    @Nullable
    private C434378 A00() {
        if (this.A02.A0a() == EnumC43346z.A0G) {
            return null;
        }
        Context context = this.A01;
        return new C434378(context == null ? A01(0, 0, 58) : context.getPackageName());
    }

    @SuppressLint({"CatchGeneralException"})
    private void A03(long j) {
        AbstractC43457A signalValueTypeDef;
        try {
            JSONObject jSONObject = new JSONObject();
            for (C43276s c43276s : this.A05) {
                InterfaceC43306v A01 = c43276s.A01();
                if (A01 == null) {
                    signalValueTypeDef = new C5968YD(SystemClock.elapsedRealtime(), A00(), new C434277(EnumC434176.A04));
                } else {
                    signalValueTypeDef = A01.A5J();
                }
                jSONObject.put(Integer.toString(c43276s.A00()), signalValueTypeDef.A09(false));
            }
            Throwable t = new NullPointerException(A01(0, 31, 26));
            throw t;
        } catch (Throwable t2) {
            C42976O.A03(t2);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private void A04(long j) {
        try {
            this.A02.A0j().schedule(new Runnable() { // from class: com.facebook.ads.redexgen.X.7D
                @Override // java.lang.Runnable
                public final void run() {
                    if (C5158L0.A02(this)) {
                        return;
                    }
                    try {
                        C43497E.this.A05();
                    } catch (Throwable th) {
                        C5158L0.A00(th, this);
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            C42976O.A03(th);
        }
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    public final void A05() {
        if (this.A02.A0W() <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A04.getLastPeriodicCollectionTimeMs() >= this.A02.A0W()) {
            A03(currentTimeMillis);
            A04(this.A02.A0W());
            return;
        }
        A04(Math.abs(currentTimeMillis - (this.A04.getLastPeriodicCollectionTimeMs() + this.A02.A0W())));
    }

    public final void A06(int i) {
        this.A00 = i;
    }

    public final void A07(C43276s c43276s) {
        this.A05.add(c43276s);
    }
}
