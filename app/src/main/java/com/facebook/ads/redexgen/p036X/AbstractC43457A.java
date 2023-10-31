package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7A */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC43457A<T> {
    public static byte[] A04;
    public static String[] A05 = {"IPzGtGdAf7dMWjoiAfsJwT8MSbfW", "XMCeZkZyu3cdrivUr2jZRBASAtioBKsk", "M9df3TmYW4NVaJXwV617xCLf0ka0RL", "QgNQyFbsObpuCkNzfa3XkTwr8fWterHM", "OM6XrXF8htknNzzoWXy", "2umg9hNEEJctkPlZR8BXtgIxIwG9FY0j", "MjJVouBCVmg2kVwWDhDqrlmadtoLZ7M", "22y3hOnyLMExHbJepmdK5jKs80KnwphC"};
    public static final String A06;
    public final long A00;
    @Nullable
    public final C434378 A01;
    public final EnumC434479 A02;
    public final T A03;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{105, 126, 114, 40, 124};
    }

    public abstract int A06() throws Exception;

    public abstract JSONObject A08(JSONObject jSONObject) throws JSONException;

    public abstract boolean A0A(AbstractC43457A<T> abstractC43457A);

    static {
        A04();
        A06 = AbstractC43457A.class.getSimpleName();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public AbstractC43457A(long j, @Nullable C434378 c434378, T signalValue, EnumC434479 enumC434479) {
        this.A00 = j;
        this.A01 = c434378;
        this.A03 = signalValue;
        this.A02 = enumC434479;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    private final long A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @Nullable
    private final C434378 A01() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    private final EnumC434479 A02() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @SuppressLint({"CatchGeneralException"})
    public final int A05() {
        int length = (A01() != null ? A01().A02().getBytes().length : 0) + 8;
        try {
            return A06() + length;
        } catch (Exception e) {
            C42976O.A03(e);
            return length;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public final T A07() {
        return this.A03;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public final JSONObject A09(boolean z) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put(A03(4, 1, 2), ((float) this.A00) / 1000.0f);
            } catch (Throwable th) {
                C42976O.A03(th);
            }
        }
        if (this.A01 != null && z) {
            jSONObject.put(A03(0, 3, 0), this.A01.A03());
        }
        if (this.A02 != EnumC434479.A04 && A07() != null) {
            A08(jSONObject);
        } else {
            EnumC434479 enumC434479 = this.A02;
            EnumC434479 enumC4344792 = EnumC434479.A04;
            if (A05[7].charAt(6) != 'n') {
                throw new RuntimeException();
            }
            A05[7] = "j6hvLenmhks7DifvzYp6ZMm4s1P7WZuQ";
            String A03 = A03(3, 1, 71);
            if (enumC434479 == enumC4344792) {
                jSONObject.put(A03, ((C434277) this.A03).A08());
            } else if (this.A03 == null) {
                jSONObject.put(A03, new C434277(EnumC434176.A07).A08());
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public final boolean A0B(@Nullable AbstractC43457A<T> abstractC43457A, EnumSet<EnumC43346z> enumSet) {
        long A08;
        if (abstractC43457A == null || A02() != abstractC43457A.A02()) {
            return false;
        }
        if (A02() == EnumC434479.A04 && abstractC43457A.A02() == EnumC434479.A04) {
            return A0A(abstractC43457A);
        }
        boolean z = false;
        if (enumSet.contains(EnumC43346z.A0E)) {
            z = A0A(abstractC43457A);
        }
        if (enumSet.contains(EnumC43346z.A0C)) {
            z &= (A01() == null || abstractC43457A.A01() == null || !A01().A02().equals(abstractC43457A.A01().A02())) ? false : true;
        }
        if (enumSet.contains(EnumC43346z.A0D)) {
            if (A02() == EnumC434479.A0D || A02() == EnumC434479.A0B) {
                A08 = C42856C.A08();
            } else {
                A08 = C42856C.A09();
            }
            long epsilon = Math.abs(this.A00 - abstractC43457A.A00());
            return z & (epsilon < A08);
        }
        return z;
    }
}
