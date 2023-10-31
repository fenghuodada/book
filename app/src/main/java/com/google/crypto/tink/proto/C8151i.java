package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.i */
/* loaded from: classes3.dex */
public final class C8151i extends AbstractC8308y<C8151i, C8152a> implements InterfaceC8295s0 {
    private static final C8151i DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8151i> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC8228i keyValue_ = AbstractC8228i.f15998b;
    private C8158k params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.i$a */
    /* loaded from: classes3.dex */
    public static final class C8152a extends AbstractC8308y.AbstractC8309a<C8151i, C8152a> implements InterfaceC8295s0 {
        public C8152a() {
            super(C8151i.DEFAULT_INSTANCE);
        }
    }

    static {
        C8151i c8151i = new C8151i();
        DEFAULT_INSTANCE = c8151i;
        AbstractC8308y.m3465r(C8151i.class, c8151i);
    }

    /* renamed from: A */
    public static C8151i m4042A(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8151i) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
    }

    /* renamed from: t */
    public static void m4040t(C8151i c8151i) {
        c8151i.version_ = 0;
    }

    /* renamed from: u */
    public static void m4039u(C8151i c8151i, C8158k c8158k) {
        c8151i.getClass();
        c8158k.getClass();
        c8151i.params_ = c8158k;
    }

    /* renamed from: v */
    public static void m4038v(C8151i c8151i, AbstractC8228i.C8234f c8234f) {
        c8151i.getClass();
        c8151i.keyValue_ = c8234f;
    }

    /* renamed from: z */
    public static C8152a m4034z() {
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new C8151i();
            case 4:
                return new C8152a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8151i> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8151i.class) {
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
    public final AbstractC8228i m4037w() {
        return this.keyValue_;
    }

    /* renamed from: x */
    public final C8158k m4036x() {
        C8158k c8158k = this.params_;
        return c8158k == null ? C8158k.m4026t() : c8158k;
    }

    /* renamed from: y */
    public final int m4035y() {
        return this.version_;
    }
}
