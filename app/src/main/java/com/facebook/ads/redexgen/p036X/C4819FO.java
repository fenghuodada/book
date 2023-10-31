package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.FO */
/* loaded from: assets/audience_network.dex */
public final class C4819FO extends AbstractC6264d2 {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, 12, 69, 95, 12, 66, 67, 88, 12, 94, 73, 77, 72, 85, 12, 67, 94, 12, 77, 64, 94, 73, 77, 72, 85, 12, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, 61, 37};
    }

    static {
        A03();
    }

    public C4819FO(C5953Xy c5953Xy, C40181p c40181p) {
        super(c5953Xy, c40181p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> list, Map<String, String> map) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (hasNext) {
                new AsyncTaskC5547RM(this.A0B, map).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6264d2
    public final void A0J() {
        C6298da c6298da = (C6298da) this.A01;
        if (c6298da.A0T()) {
            if (this.A06 != null) {
                this.A06.A0B(c6298da);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6264d2
    public final void A0L(InterfaceC39540n interfaceC39540n, C44639H c44639h, C44619F c44619f, C40191q c40191q) {
        C6298da c6298da = (C6298da) interfaceC39540n;
        long currentTimeMillis = System.currentTimeMillis();
        C6261cz c6261cz = new C6261cz(this, c40191q, c6298da, currentTimeMillis, c44619f);
        A0C().postDelayed(c6261cz, c44639h.A05().A05());
        c6298da.A0L(this.A0B, new C6260cy(this, c6261cz, currentTimeMillis, c44619f), this.A08, c40191q, C5721UB.A0K());
    }
}
