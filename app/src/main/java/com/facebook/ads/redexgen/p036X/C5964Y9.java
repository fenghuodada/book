package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Y9 */
/* loaded from: assets/audience_network.dex */
public final class C5964Y9<T> extends AbstractC43457A<List<T>> {
    public static byte[] A02;
    public static String[] A03 = {"9itrjnnCMeXzcKw4LDwr3", "0ZUpi3OgdlmKuABHcG8PMsqc4Oj", "fTRPCIaWt84rUUsVk3HDIivZKs", "V5Apl", "JVZfUK34SIuqNwHf2oV3ojB3sFjQruRb", "fsV6jHlkXkNImPX103xxf", "wiQZRNNXqXk8QOUIHtx5EDu7Qpw", "6g7apQMvF8ZkxnUyBbRCBajSKJlIo"};
    public final EnumC434479 A00;
    public final List<T> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{113};
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    public C5964Y9(long j, @Nullable C434378 c434378, List<T> list, EnumC434479 enumC434479) {
        super(j, c434378, list, EnumC434479.A08);
        this.A01 = list;
        this.A00 = enumC434479;
        if (A04()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    private int A00(T t) {
        int i = C433873.A00[this.A00.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return ((InterfaceC433671) t).AEp();
                }
                throw new UnsupportedOperationException();
            }
            return ((String) t).length();
        }
        return 4;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    private boolean A04() {
        int i = C433873.A00[this.A00.ordinal()];
        if (i != 1 && i != 2) {
            String[] strArr = A03;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A03[4] = "pkJoykusnl5HLvmmS2nCUwVdsFz02CDm";
            if (i != 3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final int A06() {
        int i = 0;
        if (A07() == null || ((List) A07()).isEmpty()) {
            return 0;
        }
        for (Object obj : (List) A07()) {
            i += A00(obj);
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (T t : this.A01) {
            int i = C433873.A00[this.A00.ordinal()];
            if (i == 1 || i == 2) {
                jSONArray.put(t);
            } else {
                String[] strArr = A03;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[3] = "TE27R";
                strArr2[0] = "fy5SSQFd7I5OAEL1WcIst";
                if (i == 3) {
                    jSONArray.put(((InterfaceC433671) t).AFA());
                }
            }
        }
        jSONObject.put(A01(0, 1, 30), jSONArray);
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.List<T>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y9 != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final boolean A0A(AbstractC43457A<List<T>> abstractC43457A) {
        List<T> A07 = abstractC43457A.A07();
        List list = (List) A07();
        if (list == null || A07 == null) {
            return list == null && A07 == null;
        } else if (abstractC43457A.A07().size() != ((List) A07()).size()) {
            return false;
        } else {
            int i = 0;
            while (true) {
                int size = A07.size();
                if (A03[4].charAt(25) != 'F') {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "t4r48";
                strArr[0] = "skb916f7am8mTaTTklPg2";
                if (i >= size) {
                    return true;
                }
                T t = A07.get(i);
                Object obj = list.get(i);
                int i2 = C433873.A00[this.A00.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3 && !((InterfaceC433671) t).A8S(obj)) {
                        return false;
                    }
                } else if (!A07.get(i).equals(list.get(i))) {
                    return false;
                }
                i++;
            }
        }
    }
}
