package com.google.crypto.tink.integration.android;

import android.app.Application;
import android.util.Log;
import androidx.cardview.C0463a;
import com.google.crypto.tink.C8081e;
import com.google.crypto.tink.C8085g;
import com.google.crypto.tink.C8086h;
import com.google.crypto.tink.C8193q;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.proto.C8125c0;
import com.google.crypto.tink.proto.C8131d0;
import com.google.crypto.tink.proto.C8180t;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.crypto.tink.integration.android.a */
/* loaded from: classes3.dex */
public final class C8088a {

    /* renamed from: c */
    public static final /* synthetic */ int f15880c = 0;

    /* renamed from: a */
    public final InterfaceC8038a f15881a;
    @GuardedBy("this")

    /* renamed from: b */
    public final C8086h f15882b;

    /* renamed from: com.google.crypto.tink.integration.android.a$a */
    /* loaded from: classes3.dex */
    public static final class C8089a {

        /* renamed from: a */
        public C8093d f15883a = null;

        /* renamed from: b */
        public C8094e f15884b = null;

        /* renamed from: c */
        public String f15885c = null;

        /* renamed from: d */
        public C8090b f15886d = null;

        /* renamed from: e */
        public C8081e f15887e = null;
        @GuardedBy("this")

        /* renamed from: f */
        public C8086h f15888f;

        /* renamed from: a */
        public final synchronized C8088a m4193a() throws GeneralSecurityException, IOException {
            if (this.f15885c != null) {
                this.f15886d = m4191c();
            }
            this.f15888f = m4192b();
            return new C8088a(this);
        }

        /* renamed from: b */
        public final C8086h m4192b() throws GeneralSecurityException, IOException {
            try {
                C8090b c8090b = this.f15886d;
                if (c8090b != null) {
                    try {
                        C8085g m4202b = C8085g.m4202b(this.f15883a, c8090b);
                        AbstractC8308y.EnumC8314f enumC8314f = AbstractC8308y.EnumC8314f.NEW_BUILDER;
                        C8125c0 c8125c0 = m4202b.f15878a;
                        AbstractC8308y.AbstractC8309a abstractC8309a = (AbstractC8308y.AbstractC8309a) c8125c0.mo3471l(enumC8314f);
                        abstractC8309a.m3461k();
                        AbstractC8308y.AbstractC8309a.m3460l(abstractC8309a.f16130b, c8125c0);
                        return new C8086h((C8125c0.C8126a) abstractC8309a);
                    } catch (C8202b0 | GeneralSecurityException e) {
                        int i = C8088a.f15880c;
                        Log.w("a", "cannot decrypt keyset: ", e);
                    }
                }
                C8125c0 m4128A = C8125c0.m4128A(this.f15883a.m4183a(), C8277q.m3569a());
                if (m4128A.m4123w() > 0) {
                    AbstractC8308y.AbstractC8309a abstractC8309a2 = (AbstractC8308y.AbstractC8309a) m4128A.mo3471l(AbstractC8308y.EnumC8314f.NEW_BUILDER);
                    abstractC8309a2.m3461k();
                    AbstractC8308y.AbstractC8309a.m3460l(abstractC8309a2.f16130b, m4128A);
                    return new C8086h((C8125c0.C8126a) abstractC8309a2);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (FileNotFoundException e2) {
                int i2 = C8088a.f15880c;
                Log.w("a", "keyset not found, will generate a new one", e2);
                if (this.f15887e != null) {
                    C8086h c8086h = new C8086h(C8125c0.m4120z());
                    C8081e c8081e = this.f15887e;
                    synchronized (c8086h) {
                        c8086h.m4201a(c8081e.f15872a);
                        c8086h.m4195g(C8193q.m3936a(c8086h.m4200b().f15878a).m4096v().m4089x());
                        if (this.f15886d != null) {
                            C8085g m4200b = c8086h.m4200b();
                            C8094e c8094e = this.f15884b;
                            C8090b c8090b2 = this.f15886d;
                            C8125c0 c8125c02 = m4200b.f15878a;
                            byte[] mo3428a = c8090b2.mo3428a(c8125c02.mo3556g(), new byte[0]);
                            try {
                                if (C8125c0.m4128A(c8090b2.mo3427b(mo3428a, new byte[0]), C8277q.m3569a()).equals(c8125c02)) {
                                    C8180t.C8181a m3968w = C8180t.m3968w();
                                    AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, mo3428a, mo3428a.length);
                                    m3968w.m3461k();
                                    C8180t.m3971t((C8180t) m3968w.f16130b, m3821i);
                                    C8131d0 m3936a = C8193q.m3936a(c8125c02);
                                    m3968w.m3461k();
                                    C8180t.m3970u((C8180t) m3968w.f16130b, m3936a);
                                    c8094e.getClass();
                                    if (!c8094e.f15895a.putString(c8094e.f15896b, C0463a.m12438c(m3968w.m3463i().mo3556g())).commit()) {
                                        throw new IOException("Failed to write to SharedPreferences");
                                    }
                                } else {
                                    throw new GeneralSecurityException("cannot encrypt keyset");
                                }
                            } catch (C8202b0 unused) {
                                throw new GeneralSecurityException("invalid keyset, corrupted key material");
                            }
                        } else {
                            C8085g m4200b2 = c8086h.m4200b();
                            C8094e c8094e2 = this.f15884b;
                            C8125c0 c8125c03 = m4200b2.f15878a;
                            c8094e2.getClass();
                            if (!c8094e2.f15895a.putString(c8094e2.f15896b, C0463a.m12438c(c8125c03.mo3556g())).commit()) {
                                throw new IOException("Failed to write to SharedPreferences");
                            }
                        }
                        return c8086h;
                    }
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        /* renamed from: c */
        public final C8090b m4191c() throws GeneralSecurityException {
            int i = C8088a.f15880c;
            C8091c c8091c = new C8091c();
            boolean m4184d = c8091c.m4184d(this.f15885c);
            if (!m4184d) {
                try {
                    C8091c.m4185c(this.f15885c);
                } catch (GeneralSecurityException e) {
                    e = e;
                    int i2 = C8088a.f15880c;
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                } catch (ProviderException e2) {
                    e = e2;
                    int i22 = C8088a.f15880c;
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            }
            try {
                return c8091c.mo4186b(this.f15885c);
            } catch (GeneralSecurityException | ProviderException e3) {
                e = e3;
                if (m4184d) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f15885c), e);
                }
                int i222 = C8088a.f15880c;
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        }

        /* renamed from: d */
        public final void m4190d(Application application, String str) throws IOException {
            this.f15883a = new C8093d(application, str);
            this.f15884b = new C8094e(application, str);
        }
    }

    public C8088a(C8089a c8089a) throws GeneralSecurityException, IOException {
        C8094e c8094e = c8089a.f15884b;
        this.f15881a = c8089a.f15886d;
        this.f15882b = c8089a.f15888f;
    }

    /* renamed from: a */
    public final synchronized C8085g m4194a() throws GeneralSecurityException {
        return this.f15882b.m4200b();
    }
}
