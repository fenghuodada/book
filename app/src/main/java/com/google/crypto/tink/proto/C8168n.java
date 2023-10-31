package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.n */
/* loaded from: classes3.dex */
public final class C8168n extends AbstractC8308y<C8168n, C8169a> implements InterfaceC8295s0 {
    private static final C8168n DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile InterfaceC8317z0<C8168n> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC8228i keyValue_ = AbstractC8228i.f15998b;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.n$a */
    /* loaded from: classes3.dex */
    public static final class C8169a extends AbstractC8308y.AbstractC8309a<C8168n, C8169a> implements InterfaceC8295s0 {
        public C8169a() {
            super(C8168n.DEFAULT_INSTANCE);
        }
    }

    static {
        C8168n c8168n = new C8168n();
        DEFAULT_INSTANCE = c8168n;
        AbstractC8308y.m3465r(C8168n.class, c8168n);
    }

    /* renamed from: t */
    public static void m4002t(C8168n c8168n) {
        c8168n.version_ = 0;
    }

    /* renamed from: u */
    public static void m4001u(C8168n c8168n, AbstractC8228i.C8234f c8234f) {
        c8168n.getClass();
        c8168n.keyValue_ = c8234f;
    }

    /* renamed from: x */
    public static C8169a m3998x() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: y */
    public static C8168n m3997y(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8168n) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8168n();
            case 4:
                return new C8169a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8168n> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8168n.class) {
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
    public final AbstractC8228i m4000v() {
        return this.keyValue_;
    }

    /* renamed from: w */
    public final int m3999w() {
        return this.version_;
    }
}
