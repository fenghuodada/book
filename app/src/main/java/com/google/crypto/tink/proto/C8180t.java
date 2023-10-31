package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.t */
/* loaded from: classes3.dex */
public final class C8180t extends AbstractC8308y<C8180t, C8181a> implements InterfaceC8295s0 {
    private static final C8180t DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile InterfaceC8317z0<C8180t> PARSER;
    private AbstractC8228i encryptedKeyset_ = AbstractC8228i.f15998b;
    private C8131d0 keysetInfo_;

    /* renamed from: com.google.crypto.tink.proto.t$a */
    /* loaded from: classes3.dex */
    public static final class C8181a extends AbstractC8308y.AbstractC8309a<C8180t, C8181a> implements InterfaceC8295s0 {
        public C8181a() {
            super(C8180t.DEFAULT_INSTANCE);
        }
    }

    static {
        C8180t c8180t = new C8180t();
        DEFAULT_INSTANCE = c8180t;
        AbstractC8308y.m3465r(C8180t.class, c8180t);
    }

    /* renamed from: t */
    public static void m3971t(C8180t c8180t, AbstractC8228i.C8234f c8234f) {
        c8180t.getClass();
        c8180t.encryptedKeyset_ = c8234f;
    }

    /* renamed from: u */
    public static void m3970u(C8180t c8180t, C8131d0 c8131d0) {
        c8180t.getClass();
        c8180t.keysetInfo_ = c8131d0;
    }

    /* renamed from: w */
    public static C8181a m3968w() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: x */
    public static C8180t m3967x(byte[] bArr, C8277q c8277q) throws C8202b0 {
        return (C8180t) AbstractC8308y.m3467p(DEFAULT_INSTANCE, bArr, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new C8180t();
            case 4:
                return new C8181a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8180t> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8180t.class) {
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
    public final AbstractC8228i m3969v() {
        return this.encryptedKeyset_;
    }
}
