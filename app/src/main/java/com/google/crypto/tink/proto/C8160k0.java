package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.k0 */
/* loaded from: classes3.dex */
public final class C8160k0 extends AbstractC8308y<C8160k0, C8161a> implements InterfaceC8295s0 {
    private static final C8160k0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile InterfaceC8317z0<C8160k0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC8228i keyValue_ = AbstractC8228i.f15998b;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.k0$a */
    /* loaded from: classes3.dex */
    public static final class C8161a extends AbstractC8308y.AbstractC8309a<C8160k0, C8161a> implements InterfaceC8295s0 {
        public C8161a() {
            super(C8160k0.DEFAULT_INSTANCE);
        }
    }

    static {
        C8160k0 c8160k0 = new C8160k0();
        DEFAULT_INSTANCE = c8160k0;
        AbstractC8308y.m3465r(C8160k0.class, c8160k0);
    }

    /* renamed from: t */
    public static void m4023t(C8160k0 c8160k0) {
        c8160k0.version_ = 0;
    }

    /* renamed from: u */
    public static void m4022u(C8160k0 c8160k0, AbstractC8228i.C8234f c8234f) {
        c8160k0.getClass();
        c8160k0.keyValue_ = c8234f;
    }

    /* renamed from: x */
    public static C8161a m4019x() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: y */
    public static C8160k0 m4018y(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8160k0) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new C8160k0();
            case 4:
                return new C8161a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8160k0> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8160k0.class) {
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

    /* renamed from: v */
    public final AbstractC8228i m4021v() {
        return this.keyValue_;
    }

    /* renamed from: w */
    public final int m4020w() {
        return this.version_;
    }
}
