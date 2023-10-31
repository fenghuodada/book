package com.facebook.ads.redexgen.p036X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zg */
/* loaded from: assets/audience_network.dex */
public class C6059Zg implements InterfaceC43306v {
    public static String[] A02 = {"IDUzbTXfLYpZDU4pK2kXQil8tMhG7RY8", "Z5d5k39m9crHDopO6AEw9f8SoKMTT7ix", "IveabQPx2elzsPaafQdxf", "DTCFkmk3oZJb2r35tHvEOgJ8FwtFSJKN", "oJAEAa909Y4vXdHyK3IPvCd4oyzp37cQ", "4smqyHOTFll606jIQbjCa", "GdFqyjY9JjKZ3ZH3Nsuny0jnLefl3EYG", "u7DTPzY4ZnL64vf2BaZ33uVh1ryYgEua"};
    public final /* synthetic */ C6057Ze A00;
    public final /* synthetic */ List A01;

    public C6059Zg(C6057Ze c6057Ze, List list) {
        this.A00 = c6057Ze;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        AbstractC43457A A03;
        HashMap hashMap = new HashMap();
        Iterator it = this.A01.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A02;
            if (strArr[1].charAt(13) == strArr[7].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "Um1XGSBPp3z3NkeiC1bP7QkPe7DiDluX";
            strArr2[7] = "6eK8uyM5uh6d0JMEhPLz83VmKAM97iIF";
            if (!hasNext) {
                A03 = this.A00.A03(hashMap);
                return A03;
            }
            C43296u c43296u = (C43296u) it.next();
            if (c43296u.A02()) {
                String str = (String) c43296u.A01();
                hashMap.put(str, new C6058Zf(str));
            }
        }
    }
}
