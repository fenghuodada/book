package com.google.crypto.tink;

import com.google.crypto.tink.integration.android.C8093d;
import com.google.crypto.tink.proto.C8125c0;
import com.google.crypto.tink.proto.C8180t;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.g */
/* loaded from: classes3.dex */
public final class C8085g {

    /* renamed from: a */
    public final C8125c0 f15878a;

    public C8085g(C8125c0 c8125c0) {
        this.f15878a = c8125c0;
    }

    /* renamed from: b */
    public static final C8085g m4202b(C8093d c8093d, InterfaceC8038a interfaceC8038a) throws GeneralSecurityException, IOException {
        C8180t m3967x = C8180t.m3967x(c8093d.m4183a(), C8277q.m3569a());
        if (m3967x.m3969v().size() != 0) {
            try {
                C8125c0 m4128A = C8125c0.m4128A(interfaceC8038a.mo3427b(m3967x.m3969v().m3820r(), new byte[0]), C8277q.m3569a());
                if (m4128A.m4123w() > 0) {
                    return new C8085g(m4128A);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (C8202b0 unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x018b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <P> P m4203a(java.lang.Class<P> r15) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.C8085g.m4203a(java.lang.Class):java.lang.Object");
    }

    public final String toString() {
        return C8193q.m3936a(this.f15878a).toString();
    }
}
