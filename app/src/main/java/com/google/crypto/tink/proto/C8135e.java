package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.e */
/* loaded from: classes3.dex */
public final class C8135e extends AbstractC8308y<C8135e, C8136a> implements InterfaceC8295s0 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C8135e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8135e> PARSER;
    private C8143g aesCtrKeyFormat_;
    private C8185w hmacKeyFormat_;

    /* renamed from: com.google.crypto.tink.proto.e$a */
    /* loaded from: classes3.dex */
    public static final class C8136a extends AbstractC8308y.AbstractC8309a<C8135e, C8136a> implements InterfaceC8295s0 {
        public C8136a() {
            super(C8135e.DEFAULT_INSTANCE);
        }
    }

    static {
        C8135e c8135e = new C8135e();
        DEFAULT_INSTANCE = c8135e;
        AbstractC8308y.m3465r(C8135e.class, c8135e);
    }

    /* renamed from: v */
    public static C8135e m4084v(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8135e) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new C8135e();
            case 4:
                return new C8136a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8135e> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8135e.class) {
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
    public final C8143g m4086t() {
        C8143g c8143g = this.aesCtrKeyFormat_;
        return c8143g == null ? C8143g.m4061t() : c8143g;
    }

    /* renamed from: u */
    public final C8185w m4085u() {
        C8185w c8185w = this.hmacKeyFormat_;
        return c8185w == null ? C8185w.m3954t() : c8185w;
    }
}
