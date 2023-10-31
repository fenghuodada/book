package com.google.crypto.tink;

import com.google.crypto.tink.proto.C8125c0;
import com.google.crypto.tink.proto.C8131d0;
import com.google.crypto.tink.proto.EnumC8153i0;
import com.google.crypto.tink.proto.EnumC8192z;
import java.nio.charset.Charset;

/* renamed from: com.google.crypto.tink.q */
/* loaded from: classes3.dex */
public final class C8193q {

    /* renamed from: a */
    public static final /* synthetic */ int f15948a = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static C8131d0 m3936a(C8125c0 c8125c0) {
        C8131d0.C8132a m4095w = C8131d0.m4095w();
        int m4121y = c8125c0.m4121y();
        m4095w.m3461k();
        C8131d0.m4098t((C8131d0) m4095w.f16130b, m4121y);
        for (C8125c0.C8127b c8127b : c8125c0.m4122x()) {
            C8131d0.C8133b.C8134a m4088y = C8131d0.C8133b.m4088y();
            String m3939y = c8127b.m4111x().m3939y();
            m4088y.m3461k();
            C8131d0.C8133b.m4093t((C8131d0.C8133b) m4088y.f16130b, m3939y);
            EnumC8192z m4119A = c8127b.m4119A();
            m4088y.m3461k();
            C8131d0.C8133b.m4091v((C8131d0.C8133b) m4088y.f16130b, m4119A);
            EnumC8153i0 m4109z = c8127b.m4109z();
            m4088y.m3461k();
            C8131d0.C8133b.m4092u((C8131d0.C8133b) m4088y.f16130b, m4109z);
            int m4110y = c8127b.m4110y();
            m4088y.m3461k();
            C8131d0.C8133b.m4090w((C8131d0.C8133b) m4088y.f16130b, m4110y);
            m4095w.m3461k();
            C8131d0.m4097u((C8131d0) m4095w.f16130b, m4088y.m3463i());
        }
        return m4095w.m3463i();
    }
}
