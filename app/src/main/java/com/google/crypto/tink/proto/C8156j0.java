package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import com.google.crypto.tink.shaded.protobuf.C8207c1;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

@Deprecated
/* renamed from: com.google.crypto.tink.proto.j0 */
/* loaded from: classes3.dex */
public final class C8156j0 extends AbstractC8308y<C8156j0, C8157a> implements InterfaceC8295s0 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final C8156j0 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8156j0> PARSER;
    private String configName_ = "";
    private C8196a0.InterfaceC8199c<C8121b0> entry_ = C8207c1.f15968d;

    /* renamed from: com.google.crypto.tink.proto.j0$a */
    /* loaded from: classes3.dex */
    public static final class C8157a extends AbstractC8308y.AbstractC8309a<C8156j0, C8157a> implements InterfaceC8295s0 {
        public C8157a() {
            super(C8156j0.DEFAULT_INSTANCE);
        }
    }

    static {
        C8156j0 c8156j0 = new C8156j0();
        DEFAULT_INSTANCE = c8156j0;
        AbstractC8308y.m3465r(C8156j0.class, c8156j0);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", C8121b0.class});
            case 3:
                return new C8156j0();
            case 4:
                return new C8157a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8156j0> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8156j0.class) {
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
}
