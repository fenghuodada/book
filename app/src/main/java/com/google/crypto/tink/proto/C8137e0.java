package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.e0 */
/* loaded from: classes3.dex */
public final class C8137e0 extends AbstractC8308y<C8137e0, C8138a> implements InterfaceC8295s0 {
    private static final C8137e0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8137e0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C8141f0 params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.e0$a */
    /* loaded from: classes3.dex */
    public static final class C8138a extends AbstractC8308y.AbstractC8309a<C8137e0, C8138a> implements InterfaceC8295s0 {
        public C8138a() {
            super(C8137e0.DEFAULT_INSTANCE);
        }
    }

    static {
        C8137e0 c8137e0 = new C8137e0();
        DEFAULT_INSTANCE = c8137e0;
        AbstractC8308y.m3465r(C8137e0.class, c8137e0);
    }

    /* renamed from: t */
    public static void m4082t(C8137e0 c8137e0) {
        c8137e0.version_ = 0;
    }

    /* renamed from: u */
    public static void m4081u(C8137e0 c8137e0, C8141f0 c8141f0) {
        c8137e0.getClass();
        c8141f0.getClass();
        c8137e0.params_ = c8141f0;
    }

    /* renamed from: x */
    public static C8138a m4078x() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: y */
    public static C8137e0 m4077y(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8137e0) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new C8137e0();
            case 4:
                return new C8138a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8137e0> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8137e0.class) {
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
    public final C8141f0 m4080v() {
        C8141f0 c8141f0 = this.params_;
        return c8141f0 == null ? C8141f0.m4065t() : c8141f0;
    }

    /* renamed from: w */
    public final int m4079w() {
        return this.version_;
    }
}
