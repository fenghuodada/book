package com.google.crypto.tink;

import com.google.crypto.tink.proto.C8117a0;
import com.google.crypto.tink.proto.C8125c0;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.proto.EnumC8153i0;
import com.google.crypto.tink.proto.EnumC8192z;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.crypto.tink.h */
/* loaded from: classes3.dex */
public final class C8086h {
    @GuardedBy("this")

    /* renamed from: a */
    public final C8125c0.C8126a f15879a;

    public C8086h(C8125c0.C8126a c8126a) {
        this.f15879a = c8126a;
    }

    /* renamed from: f */
    public static int m4196f() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    @Deprecated
    /* renamed from: a */
    public final synchronized void m4201a(C8117a0 c8117a0) throws GeneralSecurityException {
        C8125c0.C8127b m4198d = m4198d(c8117a0);
        C8125c0.C8126a c8126a = this.f15879a;
        c8126a.m3461k();
        C8125c0.m4125u((C8125c0) c8126a.f16130b, m4198d);
    }

    /* renamed from: b */
    public final synchronized C8085g m4200b() throws GeneralSecurityException {
        C8125c0 m3463i;
        m3463i = this.f15879a.m3463i();
        if (m3463i.m4123w() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
        return new C8085g(m3463i);
    }

    /* renamed from: c */
    public final synchronized boolean m4199c(int i) {
        for (C8125c0.C8127b c8127b : Collections.unmodifiableList(((C8125c0) this.f15879a.f16130b).m4122x())) {
            if (c8127b.m4110y() == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final synchronized C8125c0.C8127b m4198d(C8117a0 c8117a0) throws GeneralSecurityException {
        C8125c0.C8127b.C8128a m4117C;
        C8189y m4161d = C8112p.m4161d(c8117a0);
        int m4197e = m4197e();
        EnumC8153i0 m4139x = c8117a0.m4139x();
        if (m4139x == EnumC8153i0.UNKNOWN_PREFIX) {
            m4139x = EnumC8153i0.TINK;
        }
        m4117C = C8125c0.C8127b.m4117C();
        m4117C.m3461k();
        C8125c0.C8127b.m4115t((C8125c0.C8127b) m4117C.f16130b, m4161d);
        m4117C.m3461k();
        C8125c0.C8127b.m4112w((C8125c0.C8127b) m4117C.f16130b, m4197e);
        m4117C.m3461k();
        C8125c0.C8127b.m4113v((C8125c0.C8127b) m4117C.f16130b);
        m4117C.m3461k();
        C8125c0.C8127b.m4114u((C8125c0.C8127b) m4117C.f16130b, m4139x);
        return m4117C.m3463i();
    }

    /* renamed from: e */
    public final synchronized int m4197e() {
        int m4196f;
        do {
            m4196f = m4196f();
        } while (m4199c(m4196f));
        return m4196f;
    }

    /* renamed from: g */
    public final synchronized void m4195g(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < ((C8125c0) this.f15879a.f16130b).m4123w(); i2++) {
            C8125c0.C8127b m4124v = ((C8125c0) this.f15879a.f16130b).m4124v(i2);
            if (m4124v.m4110y() == i) {
                if (m4124v.m4119A().equals(EnumC8192z.ENABLED)) {
                    C8125c0.C8126a c8126a = this.f15879a;
                    c8126a.m3461k();
                    C8125c0.m4126t((C8125c0) c8126a.f16130b, i);
                } else {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
    }
}
