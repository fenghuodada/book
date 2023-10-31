package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.j */
/* loaded from: classes3.dex */
public final class C8154j extends AbstractC8308y<C8154j, C8155a> implements InterfaceC8295s0 {
    private static final C8154j DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC8317z0<C8154j> PARSER;
    private int keySize_;
    private C8158k params_;

    /* renamed from: com.google.crypto.tink.proto.j$a */
    /* loaded from: classes3.dex */
    public static final class C8155a extends AbstractC8308y.AbstractC8309a<C8154j, C8155a> implements InterfaceC8295s0 {
        public C8155a() {
            super(C8154j.DEFAULT_INSTANCE);
        }
    }

    static {
        C8154j c8154j = new C8154j();
        DEFAULT_INSTANCE = c8154j;
        AbstractC8308y.m3465r(C8154j.class, c8154j);
    }

    /* renamed from: v */
    public static C8154j m4029v(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8154j) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new C8154j();
            case 4:
                return new C8155a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8154j> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8154j.class) {
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
    public final int m4031t() {
        return this.keySize_;
    }

    /* renamed from: u */
    public final C8158k m4030u() {
        C8158k c8158k = this.params_;
        return c8158k == null ? C8158k.m4026t() : c8158k;
    }
}
