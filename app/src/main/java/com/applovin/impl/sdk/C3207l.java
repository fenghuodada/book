package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.sdk.C3201k;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.AbstractC3287a;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.l */
/* loaded from: classes.dex */
public class C3207l implements C3201k.InterfaceC3206a, AppLovinWebViewActivity.EventListener {

    /* renamed from: a */
    private static final AtomicBoolean f8356a = new AtomicBoolean();

    /* renamed from: b */
    private static WeakReference<AppLovinWebViewActivity> f8357b;

    /* renamed from: c */
    private final C3214m f8358c;

    /* renamed from: d */
    private final C3349v f8359d;

    /* renamed from: e */
    private AppLovinUserService.OnConsentDialogDismissListener f8360e;

    /* renamed from: f */
    private C3201k f8361f;

    /* renamed from: g */
    private WeakReference<Activity> f8362g;

    /* renamed from: h */
    private AbstractC3287a f8363h;

    /* renamed from: i */
    private AtomicBoolean f8364i = new AtomicBoolean();

    public C3207l(C3214m c3214m) {
        this.f8362g = new WeakReference<>(null);
        this.f8358c = c3214m;
        this.f8359d = c3214m.m7487A();
        if (c3214m.m7474N() != null) {
            this.f8362g = new WeakReference<>(c3214m.m7474N());
        }
        C3214m.m7459a(C3214m.m7475M()).m8069a(new AbstractC3287a() { // from class: com.applovin.impl.sdk.l.1
            @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                C3207l.this.f8362g = new WeakReference(activity);
            }
        });
        this.f8361f = new C3201k(this, c3214m);
    }

    /* renamed from: a */
    private void m7497a(boolean z, long j) {
        m7488g();
        if (z) {
            m7506a(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m7499a(C3214m c3214m) {
        if (m7492d()) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinSdk", "Consent dialog already showing");
            }
            return false;
        } else if (!C3295h.m7013a(c3214m.m7476L())) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinSdk", "No internet available, skip showing of consent dialog");
            }
            return false;
        } else if (!((Boolean) c3214m.m7456a(C3109b.f7840as)).booleanValue()) {
            if (C3349v.m6862a()) {
                this.f8359d.m6850e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        } else if (StringUtils.isValidString((String) c3214m.m7456a(C3109b.f7841at))) {
            return true;
        } else {
            if (C3349v.m6862a()) {
                this.f8359d.m6850e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
            }
            return false;
        }
    }

    /* renamed from: g */
    private void m7488g() {
        this.f8358c.m7434af().m8067b(this.f8363h);
        if (m7492d()) {
            AppLovinWebViewActivity appLovinWebViewActivity = f8357b.get();
            f8357b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f8360e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f8360e = null;
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.C3201k.InterfaceC3206a
    /* renamed from: a */
    public void mo7507a() {
        final Activity activity = this.f8362g.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.l.5
                @Override // java.lang.Runnable
                public void run() {
                    C3207l.this.m7505a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.f8358c.m7456a(C3109b.f7843av)).longValue());
        }
    }

    /* renamed from: a */
    public void m7506a(final long j) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.4
            @Override // java.lang.Runnable
            public void run() {
                if (C3349v.m6862a()) {
                    C3207l.this.f8359d.m6855b("ConsentDialogManager", "Scheduling repeating consent alert");
                }
                C3207l.this.f8361f.m7511a(j, C3207l.this.f8358c, C3207l.this);
            }
        });
    }

    /* renamed from: a */
    public void m7505a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.3
            @Override // java.lang.Runnable
            public void run() {
                C3207l c3207l = C3207l.this;
                if (!c3207l.m7499a(c3207l.f8358c) || C3207l.f8356a.getAndSet(true)) {
                    AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener2 = onConsentDialogDismissListener;
                    if (onConsentDialogDismissListener2 != null) {
                        onConsentDialogDismissListener2.onDismiss();
                        return;
                    }
                    return;
                }
                C3207l.this.f8362g = new WeakReference(activity);
                C3207l.this.f8360e = onConsentDialogDismissListener;
                C3207l.this.f8363h = new AbstractC3287a() { // from class: com.applovin.impl.sdk.l.3.1
                    @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity2) {
                        if (activity2 instanceof AppLovinWebViewActivity) {
                            if (!C3207l.this.m7492d() || C3207l.f8357b.get() != activity2) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity2;
                                WeakReference unused = C3207l.f8357b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) C3207l.this.f8358c.m7456a(C3109b.f7841at), C3207l.this);
                            }
                            C3207l.f8356a.set(false);
                        }
                    }
                };
                C3207l.this.f8358c.m7434af().m8069a(C3207l.this.f8363h);
                Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, C3207l.this.f8358c.m7386z());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) C3207l.this.f8358c.m7456a(C3109b.f7842au));
                activity.startActivity(intent);
            }
        });
    }

    @Override // com.applovin.impl.sdk.C3201k.InterfaceC3206a
    /* renamed from: b */
    public void mo7496b() {
    }

    /* renamed from: c */
    public void m7494c() {
        if (this.f8364i.getAndSet(true)) {
            return;
        }
        final String str = (String) this.f8358c.m7456a(C3109b.f7841at);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.2
            @Override // java.lang.Runnable
            public void run() {
                WebView tryToCreateWebView = Utils.tryToCreateWebView(C3207l.this.f8358c.m7476L(), "preloading consent dialog");
                if (tryToCreateWebView == null) {
                    return;
                }
                tryToCreateWebView.loadUrl(str);
            }
        });
    }

    /* renamed from: d */
    public boolean m7492d() {
        WeakReference<AppLovinWebViewActivity> weakReference = f8357b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        boolean booleanValue;
        C3214m c3214m;
        C3109b<Long> c3109b;
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, this.f8358c.m7476L());
            m7488g();
            return;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, this.f8358c.m7476L());
            booleanValue = ((Boolean) this.f8358c.m7456a(C3109b.f7844aw)).booleanValue();
            c3214m = this.f8358c;
            c3109b = C3109b.f7797aB;
        } else if ("closed".equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f8358c.m7456a(C3109b.f7845ax)).booleanValue();
            c3214m = this.f8358c;
            c3109b = C3109b.f7798aC;
        } else if (!AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            return;
        } else {
            booleanValue = ((Boolean) this.f8358c.m7456a(C3109b.f7846ay)).booleanValue();
            c3214m = this.f8358c;
            c3109b = C3109b.f7799aD;
        }
        m7497a(booleanValue, ((Long) c3214m.m7456a(c3109b)).longValue());
    }
}
