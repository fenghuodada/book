package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.m */
/* loaded from: classes3.dex */
public final class C8166m extends AbstractC8308y<C8166m, C8167a> implements InterfaceC8295s0 {
    private static final C8166m DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8166m> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.m$a */
    /* loaded from: classes3.dex */
    public static final class C8167a extends AbstractC8308y.AbstractC8309a<C8166m, C8167a> implements InterfaceC8295s0 {
        public C8167a() {
            super(C8166m.DEFAULT_INSTANCE);
        }
    }

    static {
        C8166m c8166m = new C8166m();
        DEFAULT_INSTANCE = c8166m;
        AbstractC8308y.m3465r(C8166m.class, c8166m);
    }

    /* renamed from: t */
    public static void m4007t(C8166m c8166m) {
        c8166m.keySize_ = 32;
    }

    /* renamed from: v */
    public static C8167a m4005v() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: w */
    public static C8166m m4004w(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8166m) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new C8166m();
            case 4:
                return new C8167a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8166m> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8166m.class) {
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

    /* renamed from: u */
    public final int m4006u() {
        return this.keySize_;
    }
}
