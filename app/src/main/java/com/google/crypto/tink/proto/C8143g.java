package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.g */
/* loaded from: classes3.dex */
public final class C8143g extends AbstractC8308y<C8143g, C8144a> implements InterfaceC8295s0 {
    private static final C8143g DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC8317z0<C8143g> PARSER;
    private int keySize_;
    private C8147h params_;

    /* renamed from: com.google.crypto.tink.proto.g$a */
    /* loaded from: classes3.dex */
    public static final class C8144a extends AbstractC8308y.AbstractC8309a<C8143g, C8144a> implements InterfaceC8295s0 {
        public C8144a() {
            super(C8143g.DEFAULT_INSTANCE);
        }
    }

    static {
        C8143g c8143g = new C8143g();
        DEFAULT_INSTANCE = c8143g;
        AbstractC8308y.m3465r(C8143g.class, c8143g);
    }

    /* renamed from: t */
    public static C8143g m4061t() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: w */
    public static C8143g m4058w(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8143g) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8143g();
            case 4:
                return new C8144a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8143g> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8143g.class) {
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
    public final int m4060u() {
        return this.keySize_;
    }

    /* renamed from: v */
    public final C8147h m4059v() {
        C8147h c8147h = this.params_;
        return c8147h == null ? C8147h.m4049t() : c8147h;
    }
}
