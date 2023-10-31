package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.a */
/* loaded from: classes3.dex */
public final class C8115a extends AbstractC8308y<C8115a, C8116a> implements InterfaceC8295s0 {
    private static final C8115a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile InterfaceC8317z0<C8115a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC8228i keyValue_ = AbstractC8228i.f15998b;
    private C8123c params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.a$a */
    /* loaded from: classes3.dex */
    public static final class C8116a extends AbstractC8308y.AbstractC8309a<C8115a, C8116a> implements InterfaceC8295s0 {
        public C8116a() {
            super(C8115a.DEFAULT_INSTANCE);
        }
    }

    static {
        C8115a c8115a = new C8115a();
        DEFAULT_INSTANCE = c8115a;
        AbstractC8308y.m3465r(C8115a.class, c8115a);
    }

    /* renamed from: A */
    public static C8115a m4154A(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8115a) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
    }

    /* renamed from: t */
    public static void m4152t(C8115a c8115a) {
        c8115a.version_ = 0;
    }

    /* renamed from: u */
    public static void m4151u(C8115a c8115a, AbstractC8228i.C8234f c8234f) {
        c8115a.getClass();
        c8115a.keyValue_ = c8234f;
    }

    /* renamed from: v */
    public static void m4150v(C8115a c8115a, C8123c c8123c) {
        c8115a.getClass();
        c8123c.getClass();
        c8115a.params_ = c8123c;
    }

    /* renamed from: z */
    public static C8116a m4146z() {
        return DEFAULT_INSTANCE.m3472k();
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C8115a();
            case 4:
                return new C8116a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8115a> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8115a.class) {
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

    /* renamed from: w */
    public final AbstractC8228i m4149w() {
        return this.keyValue_;
    }

    /* renamed from: x */
    public final C8123c m4148x() {
        C8123c c8123c = this.params_;
        return c8123c == null ? C8123c.m4130t() : c8123c;
    }

    /* renamed from: y */
    public final int m4147y() {
        return this.version_;
    }
}
