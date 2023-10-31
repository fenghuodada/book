package com.facebook.ads.redexgen.p036X;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ZX */
/* loaded from: assets/audience_network.dex */
public class C6050ZX implements InterfaceC43306v {
    public static String[] A02 = {"2ZaMFzGKyd9hSHjcUno1udsEhbeu09ce", "vtEgA47YqlpfzAewuy7ISaRlDIFsO2a2", "0pnteHQI04JELPJiiEYAY3M", "2nICVeqwE", "Lm6L6ti1RgkYKkQwD0idrMIu4GdN9z0L", "56JOKRJet", "nEp6Q7dVZjXWwne9d2QyLy7miVXBQb0l", "dXPHGnc4ncUJghGdDaugHzl"};
    public final /* synthetic */ C6048ZV A00;
    public final /* synthetic */ List A01;

    public C6050ZX(C6048ZV c6048zv, List list) {
        this.A00 = c6048zv;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        AbstractC43457A A022;
        String A07;
        File A03;
        HashMap hashMap = new HashMap();
        Iterator it = this.A01.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A02;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "3z5KEoLDxtAdyJAxPBbZMV2";
            strArr2[5] = "xCESy1UOQ";
            if (!hasNext) {
                A022 = this.A00.A02(hashMap);
                return A022;
            }
            C43296u c43296u = (C43296u) it.next();
            if (c43296u.A02()) {
                A07 = C6048ZV.A07((String) c43296u.A01());
                A03 = C6048ZV.A03(A07);
                hashMap.put(A07, new C6049ZW(A03));
            }
        }
    }
}
