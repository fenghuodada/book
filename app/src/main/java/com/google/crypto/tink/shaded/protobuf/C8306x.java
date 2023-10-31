package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;

/* renamed from: com.google.crypto.tink.shaded.protobuf.x */
/* loaded from: classes3.dex */
public final class C8306x implements InterfaceC8279q0 {

    /* renamed from: a */
    public static final C8306x f16128a = new C8306x();

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8279q0
    /* renamed from: a */
    public final InterfaceC8270p0 mo3481a(Class<?> cls) {
        if (AbstractC8308y.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC8270p0) AbstractC8308y.m3470m(cls.asSubclass(AbstractC8308y.class)).mo3471l(AbstractC8308y.EnumC8314f.BUILD_MESSAGE_INFO);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8279q0
    /* renamed from: b */
    public final boolean mo3480b(Class<?> cls) {
        return AbstractC8308y.class.isAssignableFrom(cls);
    }
}
