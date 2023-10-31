package com.applovin.impl.sdk.p033e;

import android.text.TextUtils;
import androidx.appcompat.widget.C0406q1;
import com.applovin.impl.adview.C2762d;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3265i;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.g */
/* loaded from: classes.dex */
public class C3145g extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final C3265i f8216a;

    /* renamed from: c */
    private final AppLovinPostbackListener f8217c;

    /* renamed from: d */
    private final C3163o.EnumC3165a f8218d;

    public C3145g(C3265i c3265i, C3163o.EnumC3165a enumC3165a, C3214m c3214m, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", c3214m);
        if (c3265i == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f8216a = c3265i;
        this.f8217c = appLovinPostbackListener;
        this.f8218d = enumC3165a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7651a() {
        AbstractC3180u<Object> abstractC3180u = new AbstractC3180u<Object>(this.f8216a, m7701d()) { // from class: com.applovin.impl.sdk.e.g.2

            /* renamed from: a */
            final String f8220a;

            {
                this.f8220a = C3145g.this.f8216a.m7325a();
            }

            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7327a(int i, String str, Object obj) {
                if (C3349v.m6862a()) {
                    StringBuilder m12536b = C0406q1.m12536b("Failed to dispatch postback. Error code: ", i, " URL: ");
                    m12536b.append(this.f8220a);
                    m7700d(m12536b.toString());
                }
                if (C3145g.this.f8217c != null) {
                    C3145g.this.f8217c.onPostbackFailure(this.f8220a, i);
                }
                if (C3145g.this.f8216a.m7193p()) {
                    this.f8192b.m7433ag().m7529a(C3145g.this.f8216a.m7192q(), this.f8220a, i, obj, str, false);
                }
            }

            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7326a(Object obj, int i) {
                if (obj instanceof String) {
                    for (String str : this.f8192b.m7423b(C3109b.f7810aO)) {
                        if (str.startsWith(str)) {
                            String str2 = (String) obj;
                            if (TextUtils.isEmpty(str2)) {
                                continue;
                            } else {
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    C3295h.m7003d(jSONObject, this.f8192b);
                                    C3295h.m7004c(jSONObject, this.f8192b);
                                    C3295h.m7001e(jSONObject, this.f8192b);
                                    break;
                                } catch (JSONException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (C3145g.this.f8217c != null) {
                    C3145g.this.f8217c.onPostbackSuccess(this.f8220a);
                }
                if (C3145g.this.f8216a.m7193p()) {
                    this.f8192b.m7433ag().m7529a(C3145g.this.f8216a.m7192q(), this.f8220a, i, obj, null, true);
                }
            }
        };
        abstractC3180u.m7588a(this.f8218d);
        m7701d().m7469S().m7621a((AbstractRunnableC3131a) abstractC3180u);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f8216a.m7325a())) {
            if (this.f8216a.m7191r()) {
                C2762d.m8973a(this.f8216a, m7701d(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.e.g.1
                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackFailure(String str, int i) {
                        C3145g.this.m7651a();
                    }

                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackSuccess(String str) {
                        if (C3145g.this.f8217c != null) {
                            C3145g.this.f8217c.onPostbackSuccess(C3145g.this.f8216a.m7325a());
                        }
                    }
                });
                return;
            } else {
                m7651a();
                return;
            }
        }
        if (C3349v.m6862a()) {
            m7703b("Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f8217c;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f8216a.m7325a(), AppLovinErrorCodes.INVALID_URL);
        }
    }
}
