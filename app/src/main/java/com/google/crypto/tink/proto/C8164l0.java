package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.l0 */
/* loaded from: classes3.dex */
public final class C8164l0 extends AbstractC8308y<C8164l0, C8165a> implements InterfaceC8295s0 {
    private static final C8164l0 DEFAULT_INSTANCE;
    private static volatile InterfaceC8317z0<C8164l0> PARSER;

    /* renamed from: com.google.crypto.tink.proto.l0$a */
    /* loaded from: classes3.dex */
    public static final class C8165a extends AbstractC8308y.AbstractC8309a<C8164l0, C8165a> implements InterfaceC8295s0 {
        public C8165a() {
            super(C8164l0.DEFAULT_INSTANCE);
        }
    }

    static {
        C8164l0 c8164l0 = new C8164l0();
        DEFAULT_INSTANCE = c8164l0;
        AbstractC8308y.m3465r(C8164l0.class, c8164l0);
    }

    /* renamed from: t */
    public static C8164l0 m4009t(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8164l0) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new C8164l0();
            case 4:
                return new C8165a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8164l0> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8164l0.class) {
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
}
