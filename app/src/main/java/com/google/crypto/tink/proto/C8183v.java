package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.v */
/* loaded from: classes3.dex */
public final class C8183v extends AbstractC8308y<C8183v, C8184a> implements InterfaceC8295s0 {
    private static final C8183v DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8183v> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC8228i keyValue_ = AbstractC8228i.f15998b;
    private C8187x params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.v$a */
    /* loaded from: classes3.dex */
    public static final class C8184a extends AbstractC8308y.AbstractC8309a<C8183v, C8184a> implements InterfaceC8295s0 {
        public C8184a() {
            super(C8183v.DEFAULT_INSTANCE);
        }
    }

    static {
        C8183v c8183v = new C8183v();
        DEFAULT_INSTANCE = c8183v;
        AbstractC8308y.m3465r(C8183v.class, c8183v);
    }

    /* renamed from: A */
    public static C8184a m3965A() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: B */
    public static C8183v m3964B(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8183v) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
    }

    /* renamed from: t */
    public static void m3962t(C8183v c8183v) {
        c8183v.version_ = 0;
    }

    /* renamed from: u */
    public static void m3961u(C8183v c8183v, C8187x c8187x) {
        c8183v.getClass();
        c8187x.getClass();
        c8183v.params_ = c8187x;
    }

    /* renamed from: v */
    public static void m3960v(C8183v c8183v, AbstractC8228i.C8234f c8234f) {
        c8183v.getClass();
        c8183v.keyValue_ = c8234f;
    }

    /* renamed from: w */
    public static C8183v m3959w() {
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
                return new C8183v();
            case 4:
                return new C8184a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8183v> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8183v.class) {
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
    public final AbstractC8228i m3958x() {
        return this.keyValue_;
    }

    /* renamed from: y */
    public final C8187x m3957y() {
        C8187x c8187x = this.params_;
        return c8187x == null ? C8187x.m3949t() : c8187x;
    }

    /* renamed from: z */
    public final int m3956z() {
        return this.version_;
    }
}
