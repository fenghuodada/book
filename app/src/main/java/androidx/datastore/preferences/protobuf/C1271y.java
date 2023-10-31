package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1273z;

/* renamed from: androidx.datastore.preferences.protobuf.y */
/* loaded from: classes.dex */
public final class C1271y implements InterfaceC1235r0 {

    /* renamed from: a */
    public static final C1271y f3140a = new C1271y();

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1235r0
    /* renamed from: a */
    public final InterfaceC1231q0 mo10718a(Class<?> cls) {
        if (AbstractC1273z.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC1231q0) AbstractC1273z.m10710k(cls.asSubclass(AbstractC1273z.class)).mo10711j(AbstractC1273z.EnumC1279f.BUILD_MESSAGE_INFO);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1235r0
    /* renamed from: b */
    public final boolean mo10717b(Class<?> cls) {
        return AbstractC1273z.class.isAssignableFrom(cls);
    }
}
