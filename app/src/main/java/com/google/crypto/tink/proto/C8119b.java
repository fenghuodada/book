package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.b */
/* loaded from: classes3.dex */
public final class C8119b extends AbstractC8308y<C8119b, C8120a> implements InterfaceC8295s0 {
    private static final C8119b DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8119b> PARSER;
    private int keySize_;
    private C8123c params_;

    /* renamed from: com.google.crypto.tink.proto.b$a */
    /* loaded from: classes3.dex */
    public static final class C8120a extends AbstractC8308y.AbstractC8309a<C8119b, C8120a> implements InterfaceC8295s0 {
        public C8120a() {
            super(C8119b.DEFAULT_INSTANCE);
        }
    }

    static {
        C8119b c8119b = new C8119b();
        DEFAULT_INSTANCE = c8119b;
        AbstractC8308y.m3465r(C8119b.class, c8119b);
    }

    /* renamed from: v */
    public static C8119b m4133v(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8119b) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new C8119b();
            case 4:
                return new C8120a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8119b> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8119b.class) {
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

    /* renamed from: t */
    public final int m4135t() {
        return this.keySize_;
    }

    /* renamed from: u */
    public final C8123c m4134u() {
        C8123c c8123c = this.params_;
        return c8123c == null ? C8123c.m4130t() : c8123c;
    }
}
