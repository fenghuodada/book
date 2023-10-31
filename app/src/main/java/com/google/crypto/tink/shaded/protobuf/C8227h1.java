package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C8299u;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h1 */
/* loaded from: classes3.dex */
public final class C8227h1 extends C8237i1<Object, Object> {
    public C8227h1(int i) {
        super(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8237i1
    /* renamed from: g */
    public final void mo3800g() {
        if (!this.f16010d) {
            for (int i = 0; i < m3803d(); i++) {
                ((C8299u.InterfaceC8300a) m3804c(i).getKey()).mo3459B();
            }
            for (Map.Entry<Object, Object> entry : m3802e()) {
                ((C8299u.InterfaceC8300a) entry.getKey()).mo3459B();
            }
        }
        super.mo3800g();
    }
}
