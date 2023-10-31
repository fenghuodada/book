package com.adcolony.sdk;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.zip.CRC32;

/* renamed from: com.adcolony.sdk.o2 */
/* loaded from: classes.dex */
public final class C2227o2 implements InterfaceC2203m2 {
    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2367y1 c2367y1 = new C2367y1();
        String m9436w = c2100e2.f5098b.m9436w("data");
        ThreadPoolExecutor threadPoolExecutor = C2232o6.f5446a;
        CRC32 crc32 = new CRC32();
        int length = m9436w.length();
        for (int i = 0; i < length; i++) {
            crc32.update(m9436w.charAt(i));
        }
        C2080d1.m9657k((int) crc32.getValue(), c2367y1, "crc32");
        c2100e2.m9641a(c2367y1).m9640b();
    }
}
