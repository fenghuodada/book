package com.applovin.impl.sdk.p033e;

import android.text.TextUtils;
import androidx.appcompat.widget.C0406q1;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3240b;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.u */
/* loaded from: classes.dex */
public abstract class AbstractC3180u<T> extends AbstractRunnableC3131a implements C3240b.InterfaceC3244c<T> {

    /* renamed from: a */
    private final C3245c<T> f8295a;

    /* renamed from: c */
    private final C3240b.InterfaceC3244c<T> f8296c;

    /* renamed from: d */
    protected C3240b.C3242a f8297d;

    /* renamed from: e */
    private C3163o.EnumC3165a f8298e;

    /* renamed from: f */
    private C3109b<String> f8299f;

    /* renamed from: g */
    private C3109b<String> f8300g;

    public AbstractC3180u(C3245c<T> c3245c, C3214m c3214m) {
        this(c3245c, c3214m, false);
    }

    public AbstractC3180u(C3245c<T> c3245c, final C3214m c3214m, boolean z) {
        super("TaskRepeatRequest", c3214m, z);
        this.f8298e = C3163o.EnumC3165a.BACKGROUND;
        this.f8299f = null;
        this.f8300g = null;
        if (c3245c == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f8295a = c3245c;
        this.f8297d = new C3240b.C3242a();
        this.f8296c = new C3240b.InterfaceC3244c<T>() { // from class: com.applovin.impl.sdk.e.u.1
            @Override // com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7327a(int i, String str, T t) {
                boolean z2;
                boolean z3;
                boolean z4;
                AbstractC3180u abstractC3180u;
                C3109b c3109b;
                long m7311k;
                boolean z5 = false;
                if (i >= 200 && i < 500) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i == 429) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i != -1009) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (z2 || z3 || AbstractC3180u.this.f8295a.m7309m())) {
                    String m7316f = AbstractC3180u.this.f8295a.m7316f();
                    if (AbstractC3180u.this.f8295a.m7314h() > 0) {
                        if (C3349v.m6862a()) {
                            AbstractC3180u abstractC3180u2 = AbstractC3180u.this;
                            StringBuilder m12536b = C0406q1.m12536b("Unable to send request due to server failure (code ", i, "). ");
                            m12536b.append(AbstractC3180u.this.f8295a.m7314h());
                            m12536b.append(" attempts left, retrying in ");
                            m12536b.append(TimeUnit.MILLISECONDS.toSeconds(AbstractC3180u.this.f8295a.m7311k()));
                            m12536b.append(" seconds...");
                            abstractC3180u2.m7702c(m12536b.toString());
                        }
                        int m7314h = AbstractC3180u.this.f8295a.m7314h() - 1;
                        AbstractC3180u.this.f8295a.m7324a(m7314h);
                        if (m7314h == 0) {
                            AbstractC3180u abstractC3180u3 = AbstractC3180u.this;
                            abstractC3180u3.m7583c(abstractC3180u3.f8299f);
                            if (StringUtils.isValidString(m7316f) && m7316f.length() >= 4) {
                                if (C3349v.m6862a()) {
                                    AbstractC3180u.this.m7703b("Switching to backup endpoint ".concat(m7316f));
                                }
                                AbstractC3180u.this.f8295a.m7322a(m7316f);
                                z5 = true;
                            }
                        }
                        if (((Boolean) c3214m.m7456a(C3109b.f7982dd)).booleanValue() && z5) {
                            m7311k = 0;
                        } else if (AbstractC3180u.this.f8295a.m7310l()) {
                            m7311k = TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, AbstractC3180u.this.f8295a.m7313i()));
                        } else {
                            m7311k = AbstractC3180u.this.f8295a.m7311k();
                        }
                        C3163o m7469S = c3214m.m7469S();
                        AbstractC3180u abstractC3180u4 = AbstractC3180u.this;
                        m7469S.m7619a(abstractC3180u4, abstractC3180u4.f8298e, m7311k);
                        return;
                    }
                    if (m7316f != null && m7316f.equals(AbstractC3180u.this.f8295a.m7325a())) {
                        abstractC3180u = AbstractC3180u.this;
                        c3109b = abstractC3180u.f8300g;
                    } else {
                        abstractC3180u = AbstractC3180u.this;
                        c3109b = abstractC3180u.f8299f;
                    }
                    abstractC3180u.m7583c(c3109b);
                }
                AbstractC3180u.this.mo7327a(i, str, t);
            }

            @Override // com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7326a(T t, int i) {
                AbstractC3180u.this.f8295a.m7324a(0);
                AbstractC3180u.this.mo7326a((AbstractC3180u) t, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public <ST> void m7583c(C3109b<ST> c3109b) {
        if (c3109b != null) {
            m7701d().m7477K().m7805a((C3109b<?>) c3109b, (Object) c3109b.m7809b());
        }
    }

    /* renamed from: a */
    public abstract void mo7327a(int i, String str, T t);

    /* renamed from: a */
    public void m7589a(C3109b<String> c3109b) {
        this.f8299f = c3109b;
    }

    /* renamed from: a */
    public void m7588a(C3163o.EnumC3165a enumC3165a) {
        this.f8298e = enumC3165a;
    }

    /* renamed from: a */
    public abstract void mo7326a(T t, int i);

    /* renamed from: b */
    public void m7585b(C3109b<String> c3109b) {
        this.f8300g = c3109b;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        C3240b m7470R = m7701d().m7470R();
        if (!m7701d().m7415c() && !m7701d().m7411d()) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinSdk", "AppLovin SDK is disabled");
            }
            i = -22;
        } else if (StringUtils.isValidString(this.f8295a.m7325a()) && this.f8295a.m7325a().length() >= 4) {
            if (TextUtils.isEmpty(this.f8295a.m7321b())) {
                this.f8295a.m7320b(this.f8295a.m7317e() != null ? "POST" : "GET");
            }
            m7470R.m7341a(this.f8295a, this.f8297d, this.f8296c);
            return;
        } else {
            if (C3349v.m6862a()) {
                m7700d("Task has an invalid or null request endpoint.");
            }
            i = AppLovinErrorCodes.INVALID_URL;
        }
        mo7327a(i, null, null);
    }
}
