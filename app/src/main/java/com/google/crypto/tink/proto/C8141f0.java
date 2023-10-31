package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.f0 */
/* loaded from: classes3.dex */
public final class C8141f0 extends AbstractC8308y<C8141f0, C8142a> implements InterfaceC8295s0 {
    private static final C8141f0 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC8317z0<C8141f0> PARSER;
    private String keyUri_ = "";

    /* renamed from: com.google.crypto.tink.proto.f0$a */
    /* loaded from: classes3.dex */
    public static final class C8142a extends AbstractC8308y.AbstractC8309a<C8141f0, C8142a> implements InterfaceC8295s0 {
        public C8142a() {
            super(C8141f0.DEFAULT_INSTANCE);
        }
    }

    static {
        C8141f0 c8141f0 = new C8141f0();
        DEFAULT_INSTANCE = c8141f0;
        AbstractC8308y.m3465r(C8141f0.class, c8141f0);
    }

    /* renamed from: t */
    public static C8141f0 m4065t() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: v */
    public static C8141f0 m4063v(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8141f0) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8308y
    /* renamed from: l */
    public final Object mo3471l(AbstractC8308y.EnumC8314f enumC8314f) {
        switch (enumC8314f.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new C8141f0();
            case 4:
                return new C8142a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8141f0> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8141f0.class) {
                        try {
                            interfaceC8317z0 = PARSER;
                            if (interfaceC8317z0 == null) {
                                interfaceC8317z0 = new AbstractC8308y.C8310b<>(DEFAULT_INSTANCE);
                                PARSER = interfaceC8317z0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC8317z0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: u */
    public final String m4064u() {
        return this.keyUri_;
    }
}
