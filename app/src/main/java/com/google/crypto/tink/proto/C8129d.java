package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.d */
/* loaded from: classes3.dex */
public final class C8129d extends AbstractC8308y<C8129d, C8130a> implements InterfaceC8295s0 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C8129d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile InterfaceC8317z0<C8129d> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C8139f aesCtrKey_;
    private C8183v hmacKey_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.d$a */
    /* loaded from: classes3.dex */
    public static final class C8130a extends AbstractC8308y.AbstractC8309a<C8129d, C8130a> implements InterfaceC8295s0 {
        public C8130a() {
            super(C8129d.DEFAULT_INSTANCE);
        }
    }

    static {
        C8129d c8129d = new C8129d();
        DEFAULT_INSTANCE = c8129d;
        AbstractC8308y.m3465r(C8129d.class, c8129d);
    }

    /* renamed from: A */
    public static C8129d m4108A(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8129d) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
    }

    /* renamed from: t */
    public static void m4106t(C8129d c8129d) {
        c8129d.version_ = 0;
    }

    /* renamed from: u */
    public static void m4105u(C8129d c8129d, C8139f c8139f) {
        c8129d.getClass();
        c8139f.getClass();
        c8129d.aesCtrKey_ = c8139f;
    }

    /* renamed from: v */
    public static void m4104v(C8129d c8129d, C8183v c8183v) {
        c8129d.getClass();
        c8183v.getClass();
        c8129d.hmacKey_ = c8183v;
    }

    /* renamed from: z */
    public static C8130a m4100z() {
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new C8129d();
            case 4:
                return new C8130a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8129d> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8129d.class) {
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
    public final C8139f m4103w() {
        C8139f c8139f = this.aesCtrKey_;
        return c8139f == null ? C8139f.m4070w() : c8139f;
    }

    /* renamed from: x */
    public final C8183v m4102x() {
        C8183v c8183v = this.hmacKey_;
        return c8183v == null ? C8183v.m3959w() : c8183v;
    }

    /* renamed from: y */
    public final int m4101y() {
        return this.version_;
    }
}
