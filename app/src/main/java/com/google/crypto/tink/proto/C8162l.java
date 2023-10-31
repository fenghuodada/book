package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.l */
/* loaded from: classes3.dex */
public final class C8162l extends AbstractC8308y<C8162l, C8163a> implements InterfaceC8295s0 {
    private static final C8162l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile InterfaceC8317z0<C8162l> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC8228i keyValue_ = AbstractC8228i.f15998b;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.l$a */
    /* loaded from: classes3.dex */
    public static final class C8163a extends AbstractC8308y.AbstractC8309a<C8162l, C8163a> implements InterfaceC8295s0 {
        public C8163a() {
            super(C8162l.DEFAULT_INSTANCE);
        }
    }

    static {
        C8162l c8162l = new C8162l();
        DEFAULT_INSTANCE = c8162l;
        AbstractC8308y.m3465r(C8162l.class, c8162l);
    }

    /* renamed from: t */
    public static void m4016t(C8162l c8162l) {
        c8162l.version_ = 0;
    }

    /* renamed from: u */
    public static void m4015u(C8162l c8162l, AbstractC8228i.C8234f c8234f) {
        c8162l.getClass();
        c8162l.keyValue_ = c8234f;
    }

    /* renamed from: x */
    public static C8163a m4012x() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: y */
    public static C8162l m4011y(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8162l) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8162l();
            case 4:
                return new C8163a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8162l> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8162l.class) {
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
    public final AbstractC8228i m4014v() {
        return this.keyValue_;
    }

    /* renamed from: w */
    public final int m4013w() {
        return this.version_;
    }
}
