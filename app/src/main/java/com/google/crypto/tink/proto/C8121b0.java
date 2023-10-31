package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

@Deprecated
/* renamed from: com.google.crypto.tink.proto.b0 */
/* loaded from: classes3.dex */
public final class C8121b0 extends AbstractC8308y<C8121b0, C8122a> implements InterfaceC8295s0 {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final C8121b0 DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile InterfaceC8317z0<C8121b0> PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    /* renamed from: com.google.crypto.tink.proto.b0$a */
    /* loaded from: classes3.dex */
    public static final class C8122a extends AbstractC8308y.AbstractC8309a<C8121b0, C8122a> implements InterfaceC8295s0 {
        public C8122a() {
            super(C8121b0.DEFAULT_INSTANCE);
        }
    }

    static {
        C8121b0 c8121b0 = new C8121b0();
        DEFAULT_INSTANCE = c8121b0;
        AbstractC8308y.m3465r(C8121b0.class, c8121b0);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 3:
                return new C8121b0();
            case 4:
                return new C8122a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8121b0> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8121b0.class) {
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
