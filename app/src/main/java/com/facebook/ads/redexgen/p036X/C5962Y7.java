package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Y7 */
/* loaded from: assets/audience_network.dex */
public final class C5962Y7<K, V> extends AbstractC43457A<HashMap<K, InterfaceC433772>> {
    public static byte[] A02;
    public static String[] A03 = {"cKuQ341bpQpj1np", "NRRRR4TEAm42mDR", "Q3CZak00lhavTOo6A", "zaO6DFhzYxSygkW1IzlMUY8ES4dk", "HbJVSBx3MNS6tqQ9XVLKo36QU0gI1Znv", "JrCrl10lt1AHnaihPuUoLOH", "SHM67NRdcA0GW9YM4", "2pIXYY"};
    public final EnumC434479 A00;
    public final HashMap<K, InterfaceC433772> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{104};
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    public C5962Y7(long j, @Nullable C434378 c434378, HashMap<K, InterfaceC433772> hashMap, EnumC434479 enumC434479) {
        super(j, c434378, hashMap, EnumC434479.A0A);
        this.A01 = hashMap;
        this.A00 = enumC434479;
        if (A04()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    private int A00(K k) {
        int i = C433974.A00[this.A00.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return ((String) k).length();
            }
            throw new UnsupportedOperationException();
        }
        return 4;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    private boolean A04() {
        int i = C433974.A00[this.A00.ordinal()];
        return i == 1 || i == 2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final int A06() {
        int i = 0;
        if (A07() == null || ((HashMap) A07()).isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : ((HashMap) A07()).entrySet()) {
            int A00 = i + A00(entry.getKey());
            if (A03[5].length() == 26) {
                throw new RuntimeException();
            }
            A03[4] = "UsP7Xgcu0nWDAT33HhVsw8aoixo7a0Y1";
            i = A00 + ((InterfaceC433772) entry.getValue()).AEp();
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final JSONObject A08(JSONObject mapJsonObject) throws JSONException {
        Set<K> keySet = this.A01.keySet();
        JSONObject jSONObject = new JSONObject();
        for (K k : keySet) {
            InterfaceC433772 interfaceC433772 = this.A01.get(k);
            if (A03[5].length() == 26) {
                throw new RuntimeException();
            }
            A03[5] = "RtRjz";
            if (interfaceC433772 != null) {
                interfaceC433772.AFB(k, jSONObject);
            }
        }
        mapJsonObject.put(A01(0, 1, 112), jSONObject);
        return mapJsonObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.HashMap<K, com.facebook.ads.internal.botdetection.signals.model.signal_value.IMapSignalValueDef>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    @SuppressLint({"Nullable Dereference"})
    public final boolean A0A(AbstractC43457A<HashMap<K, InterfaceC433772>> abstractC43457A) {
        boolean A8S;
        if (A07() == null || abstractC43457A.A07() == null) {
            return A07() == null && abstractC43457A.A07() == null;
        } else if (abstractC43457A.A07().size() != A07().size()) {
            return false;
        } else {
            HashMap<K, InterfaceC433772> A07 = abstractC43457A.A07();
            HashMap<K, InterfaceC433772> A072 = A07();
            Iterator<K> it = A07.keySet().iterator();
            Iterator<K> it2 = A072.keySet().iterator();
            do {
                boolean hasNext = it.hasNext();
                String[] strArr = A03;
                if (strArr[1].length() == strArr[0].length()) {
                    String[] strArr2 = A03;
                    strArr2[1] = "rUsYWVrpG3VWCqr";
                    strArr2[0] = "lLqYbR21ojeq3r6";
                    if (!hasNext || !it2.hasNext()) {
                        return true;
                    }
                    K next = it.next();
                    K next2 = it2.next();
                    if (!next.equals(next2) || !A07.containsKey(next) || !A072.containsKey(next2)) {
                        return false;
                    }
                    InterfaceC433772 interfaceC433772 = A07.get(next);
                    InterfaceC433772 newSignal = A072.get(next2);
                    InterfaceC433772 prevSignal = newSignal;
                    if (interfaceC433772 == null || prevSignal == null) {
                        return interfaceC433772 == null && prevSignal == null;
                    }
                    A8S = interfaceC433772.A8S(prevSignal);
                    String[] strArr3 = A03;
                    if (strArr3[7].length() != strArr3[3].length()) {
                        String[] strArr4 = A03;
                        strArr4[6] = "3Jq7wk4KgDHXBRv7A";
                        strArr4[2] = "zXvlpWgAojYXCnWeF";
                    }
                }
                throw new RuntimeException();
            } while (A8S);
            return false;
        }
    }
}
