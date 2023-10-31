package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j0 */
/* loaded from: classes3.dex */
public final class C8246j0 {

    /* renamed from: b */
    public static final C8247a f16033b = new C8247a();

    /* renamed from: a */
    public final InterfaceC8279q0 f16034a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.j0$a */
    /* loaded from: classes3.dex */
    public class C8247a implements InterfaceC8279q0 {
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8279q0
        /* renamed from: a */
        public final InterfaceC8270p0 mo3481a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8279q0
        /* renamed from: b */
        public final boolean mo3480b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.j0$b */
    /* loaded from: classes3.dex */
    public static class C8248b implements InterfaceC8279q0 {

        /* renamed from: a */
        public final InterfaceC8279q0[] f16035a;

        public C8248b(InterfaceC8279q0... interfaceC8279q0Arr) {
            this.f16035a = interfaceC8279q0Arr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8279q0
        /* renamed from: a */
        public final InterfaceC8270p0 mo3481a(Class<?> cls) {
            InterfaceC8279q0[] interfaceC8279q0Arr;
            for (InterfaceC8279q0 interfaceC8279q0 : this.f16035a) {
                if (interfaceC8279q0.mo3480b(cls)) {
                    return interfaceC8279q0.mo3481a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8279q0
        /* renamed from: b */
        public final boolean mo3480b(Class<?> cls) {
            for (InterfaceC8279q0 interfaceC8279q0 : this.f16035a) {
                if (interfaceC8279q0.mo3480b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C8246j0() {
        InterfaceC8279q0 interfaceC8279q0;
        InterfaceC8279q0[] interfaceC8279q0Arr = new InterfaceC8279q0[2];
        interfaceC8279q0Arr[0] = C8306x.f16128a;
        try {
            interfaceC8279q0 = (InterfaceC8279q0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC8279q0 = f16033b;
        }
        interfaceC8279q0Arr[1] = interfaceC8279q0;
        C8248b c8248b = new C8248b(interfaceC8279q0Arr);
        Charset charset = C8196a0.f15949a;
        this.f16034a = c8248b;
    }
}
