package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.h0 */
/* loaded from: classes3.dex */
public final class C8149h0 extends AbstractC8308y<C8149h0, C8150a> implements InterfaceC8295s0 {
    private static final C8149h0 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC8317z0<C8149h0> PARSER;
    private C8117a0 dekTemplate_;
    private String kekUri_ = "";

    /* renamed from: com.google.crypto.tink.proto.h0$a */
    /* loaded from: classes3.dex */
    public static final class C8150a extends AbstractC8308y.AbstractC8309a<C8149h0, C8150a> implements InterfaceC8295s0 {
        public C8150a() {
            super(C8149h0.DEFAULT_INSTANCE);
        }
    }

    static {
        C8149h0 c8149h0 = new C8149h0();
        DEFAULT_INSTANCE = c8149h0;
        AbstractC8308y.m3465r(C8149h0.class, c8149h0);
    }

    /* renamed from: t */
    public static C8149h0 m4046t() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: w */
    public static C8149h0 m4043w(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8149h0) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new C8149h0();
            case 4:
                return new C8150a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8149h0> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8149h0.class) {
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
    public final C8117a0 m4045u() {
        C8117a0 c8117a0 = this.dekTemplate_;
        return c8117a0 == null ? C8117a0.m4140w() : c8117a0;
    }

    /* renamed from: v */
    public final String m4044v() {
        return this.kekUri_;
    }
}
