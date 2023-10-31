package com.google.crypto.tink;

import androidx.constraintlayout.core.C0511i;
import com.google.crypto.tink.proto.C8117a0;
import com.google.crypto.tink.proto.EnumC8153i0;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.errorprone.annotations.Immutable;

@Immutable
/* renamed from: com.google.crypto.tink.e */
/* loaded from: classes3.dex */
public final class C8081e {

    /* renamed from: a */
    public final C8117a0 f15872a;

    public C8081e(C8117a0 c8117a0) {
        this.f15872a = c8117a0;
    }

    /* renamed from: a */
    public static C8081e m4205a(String str, byte[] bArr) {
        EnumC8153i0 enumC8153i0;
        C8117a0.C8118a m4145A = C8117a0.m4145A();
        m4145A.m3461k();
        C8117a0.m4143t((C8117a0) m4145A.f16130b, str);
        AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, bArr, bArr.length);
        m4145A.m3461k();
        C8117a0.m4142u((C8117a0) m4145A.f16130b, m3821i);
        int m12337b = C0511i.m12337b(1);
        if (m12337b != 0) {
            if (m12337b != 1) {
                if (m12337b != 2) {
                    if (m12337b == 3) {
                        enumC8153i0 = EnumC8153i0.CRUNCHY;
                    } else {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                } else {
                    enumC8153i0 = EnumC8153i0.RAW;
                }
            } else {
                enumC8153i0 = EnumC8153i0.LEGACY;
            }
        } else {
            enumC8153i0 = EnumC8153i0.TINK;
        }
        m4145A.m3461k();
        C8117a0.m4141v((C8117a0) m4145A.f16130b, enumC8153i0);
        return new C8081e(m4145A.m3463i());
    }
}
