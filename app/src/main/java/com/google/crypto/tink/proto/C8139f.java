package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.f */
/* loaded from: classes3.dex */
public final class C8139f extends AbstractC8308y<C8139f, C8140a> implements InterfaceC8295s0 {
    private static final C8139f DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8139f> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC8228i keyValue_ = AbstractC8228i.f15998b;
    private C8147h params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.f$a */
    /* loaded from: classes3.dex */
    public static final class C8140a extends AbstractC8308y.AbstractC8309a<C8139f, C8140a> implements InterfaceC8295s0 {
        public C8140a() {
            super(C8139f.DEFAULT_INSTANCE);
        }
    }

    static {
        C8139f c8139f = new C8139f();
        DEFAULT_INSTANCE = c8139f;
        AbstractC8308y.m3465r(C8139f.class, c8139f);
    }

    /* renamed from: A */
    public static C8140a m4076A() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: B */
    public static C8139f m4075B(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8139f) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
    }

    /* renamed from: t */
    public static void m4073t(C8139f c8139f) {
        c8139f.version_ = 0;
    }

    /* renamed from: u */
    public static void m4072u(C8139f c8139f, C8147h c8147h) {
        c8139f.getClass();
        c8147h.getClass();
        c8139f.params_ = c8147h;
    }

    /* renamed from: v */
    public static void m4071v(C8139f c8139f, AbstractC8228i.C8234f c8234f) {
        c8139f.getClass();
        c8139f.keyValue_ = c8234f;
    }

    /* renamed from: w */
    public static C8139f m4070w() {
        return DEFAULT_INSTANCE;
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
                return new C8139f();
            case 4:
                return new C8140a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8139f> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8139f.class) {
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

    /* renamed from: x */
    public final AbstractC8228i m4069x() {
        return this.keyValue_;
    }

    /* renamed from: y */
    public final C8147h m4068y() {
        C8147h c8147h = this.params_;
        return c8147h == null ? C8147h.m4049t() : c8147h;
    }

    /* renamed from: z */
    public final int m4067z() {
        return this.version_;
    }
}
