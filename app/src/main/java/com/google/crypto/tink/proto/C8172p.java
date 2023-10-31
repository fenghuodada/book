package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.p */
/* loaded from: classes3.dex */
public final class C8172p extends AbstractC8308y<C8172p, C8173a> implements InterfaceC8295s0 {
    private static final C8172p DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8172p> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC8228i keyValue_ = AbstractC8228i.f15998b;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.p$a */
    /* loaded from: classes3.dex */
    public static final class C8173a extends AbstractC8308y.AbstractC8309a<C8172p, C8173a> implements InterfaceC8295s0 {
        public C8173a() {
            super(C8172p.DEFAULT_INSTANCE);
        }
    }

    static {
        C8172p c8172p = new C8172p();
        DEFAULT_INSTANCE = c8172p;
        AbstractC8308y.m3465r(C8172p.class, c8172p);
    }

    /* renamed from: t */
    public static void m3992t(C8172p c8172p) {
        c8172p.version_ = 0;
    }

    /* renamed from: u */
    public static void m3991u(C8172p c8172p, AbstractC8228i.C8234f c8234f) {
        c8172p.getClass();
        c8172p.keyValue_ = c8234f;
    }

    /* renamed from: x */
    public static C8173a m3988x() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: y */
    public static C8172p m3987y(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8172p) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new C8172p();
            case 4:
                return new C8173a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8172p> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8172p.class) {
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
    public final AbstractC8228i m3990v() {
        return this.keyValue_;
    }

    /* renamed from: w */
    public final int m3989w() {
        return this.version_;
    }
}
