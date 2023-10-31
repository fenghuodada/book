package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.q */
/* loaded from: classes3.dex */
public final class C8174q extends AbstractC8308y<C8174q, C8175a> implements InterfaceC8295s0 {
    private static final C8174q DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC8317z0<C8174q> PARSER;
    private int keySize_;

    /* renamed from: com.google.crypto.tink.proto.q$a */
    /* loaded from: classes3.dex */
    public static final class C8175a extends AbstractC8308y.AbstractC8309a<C8174q, C8175a> implements InterfaceC8295s0 {
        public C8175a() {
            super(C8174q.DEFAULT_INSTANCE);
        }
    }

    static {
        C8174q c8174q = new C8174q();
        DEFAULT_INSTANCE = c8174q;
        AbstractC8308y.m3465r(C8174q.class, c8174q);
    }

    /* renamed from: t */
    public static void m3985t(C8174q c8174q) {
        c8174q.keySize_ = 64;
    }

    /* renamed from: v */
    public static C8175a m3983v() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: w */
    public static C8174q m3982w(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8174q) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"keySize_"});
            case 3:
                return new C8174q();
            case 4:
                return new C8175a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8174q> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8174q.class) {
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
    public final int m3984u() {
        return this.keySize_;
    }
}
