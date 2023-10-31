package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.s */
/* loaded from: classes3.dex */
public final class C8178s extends AbstractC8308y<C8178s, C8179a> implements InterfaceC8295s0 {
    private static final C8178s DEFAULT_INSTANCE;
    private static volatile InterfaceC8317z0<C8178s> PARSER;

    /* renamed from: com.google.crypto.tink.proto.s$a */
    /* loaded from: classes3.dex */
    public static final class C8179a extends AbstractC8308y.AbstractC8309a<C8178s, C8179a> implements InterfaceC8295s0 {
        public C8179a() {
            super(C8178s.DEFAULT_INSTANCE);
        }
    }

    static {
        C8178s c8178s = new C8178s();
        DEFAULT_INSTANCE = c8178s;
        AbstractC8308y.m3465r(C8178s.class, c8178s);
    }

    /* renamed from: t */
    public static C8178s m3973t(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8178s) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8178s();
            case 4:
                return new C8179a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8178s> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8178s.class) {
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
