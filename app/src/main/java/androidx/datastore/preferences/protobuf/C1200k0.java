package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.k0 */
/* loaded from: classes.dex */
public final class C1200k0 {

    /* renamed from: b */
    public static final C1201a f3014b = new C1201a();

    /* renamed from: a */
    public final InterfaceC1235r0 f3015a;

    /* renamed from: androidx.datastore.preferences.protobuf.k0$a */
    /* loaded from: classes.dex */
    public static class C1201a implements InterfaceC1235r0 {
        @Override // androidx.datastore.preferences.protobuf.InterfaceC1235r0
        /* renamed from: a */
        public final InterfaceC1231q0 mo10718a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1235r0
        /* renamed from: b */
        public final boolean mo10717b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k0$b */
    /* loaded from: classes.dex */
    public static class C1202b implements InterfaceC1235r0 {

        /* renamed from: a */
        public final InterfaceC1235r0[] f3016a;

        public C1202b(InterfaceC1235r0... interfaceC1235r0Arr) {
            this.f3016a = interfaceC1235r0Arr;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1235r0
        /* renamed from: a */
        public final InterfaceC1231q0 mo10718a(Class<?> cls) {
            InterfaceC1235r0[] interfaceC1235r0Arr;
            for (InterfaceC1235r0 interfaceC1235r0 : this.f3016a) {
                if (interfaceC1235r0.mo10717b(cls)) {
                    return interfaceC1235r0.mo10718a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1235r0
        /* renamed from: b */
        public final boolean mo10717b(Class<?> cls) {
            for (InterfaceC1235r0 interfaceC1235r0 : this.f3016a) {
                if (interfaceC1235r0.mo10717b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C1200k0() {
        InterfaceC1235r0 interfaceC1235r0;
        InterfaceC1235r0[] interfaceC1235r0Arr = new InterfaceC1235r0[2];
        interfaceC1235r0Arr[0] = C1271y.f3140a;
        try {
            interfaceC1235r0 = (InterfaceC1235r0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC1235r0 = f3014b;
        }
        interfaceC1235r0Arr[1] = interfaceC1235r0;
        C1202b c1202b = new C1202b(interfaceC1235r0Arr);
        Charset charset = C1157b0.f2944a;
        this.f3015a = c1202b;
    }
}
