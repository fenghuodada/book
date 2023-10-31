package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.a0 */
/* loaded from: classes3.dex */
public final class C8117a0 extends AbstractC8308y<C8117a0, C8118a> implements InterfaceC8295s0 {
    private static final C8117a0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC8317z0<C8117a0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC8228i value_ = AbstractC8228i.f15998b;

    /* renamed from: com.google.crypto.tink.proto.a0$a */
    /* loaded from: classes3.dex */
    public static final class C8118a extends AbstractC8308y.AbstractC8309a<C8117a0, C8118a> implements InterfaceC8295s0 {
        public C8118a() {
            super(C8117a0.DEFAULT_INSTANCE);
        }
    }

    static {
        C8117a0 c8117a0 = new C8117a0();
        DEFAULT_INSTANCE = c8117a0;
        AbstractC8308y.m3465r(C8117a0.class, c8117a0);
    }

    /* renamed from: A */
    public static C8118a m4145A() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: t */
    public static void m4143t(C8117a0 c8117a0, String str) {
        c8117a0.getClass();
        c8117a0.typeUrl_ = str;
    }

    /* renamed from: u */
    public static void m4142u(C8117a0 c8117a0, AbstractC8228i.C8234f c8234f) {
        c8117a0.getClass();
        c8117a0.value_ = c8234f;
    }

    /* renamed from: v */
    public static void m4141v(C8117a0 c8117a0, EnumC8153i0 enumC8153i0) {
        c8117a0.getClass();
        c8117a0.outputPrefixType_ = enumC8153i0.getNumber();
    }

    /* renamed from: w */
    public static C8117a0 m4140w() {
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new C8117a0();
            case 4:
                return new C8118a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8117a0> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8117a0.class) {
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
    public final EnumC8153i0 m4139x() {
        EnumC8153i0 m4033a = EnumC8153i0.m4033a(this.outputPrefixType_);
        return m4033a == null ? EnumC8153i0.UNRECOGNIZED : m4033a;
    }

    /* renamed from: y */
    public final String m4138y() {
        return this.typeUrl_;
    }

    /* renamed from: z */
    public final AbstractC8228i m4137z() {
        return this.value_;
    }
}
