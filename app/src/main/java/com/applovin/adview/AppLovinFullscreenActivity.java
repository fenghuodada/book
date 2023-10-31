package com.applovin.adview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.C2791o;
import com.applovin.impl.adview.InterfaceC2780k;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.ServiceConnectionC2675a;
import com.applovin.impl.adview.activity.p010b.AbstractC2688a;
import com.applovin.impl.adview.activity.p010b.C2711e;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements InterfaceC2780k {
    @SuppressLint({"StaticFieldLeak"})
    public static C2791o parentInterstitialWrapper;

    /* renamed from: a */
    private C3214m f6222a;

    /* renamed from: b */
    private AbstractC2688a f6223b;

    /* renamed from: c */
    private final AtomicBoolean f6224c = new AtomicBoolean(true);

    /* renamed from: d */
    private ServiceConnectionC2675a f6225d;

    /* renamed from: e */
    private boolean f6226e;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        r0 = getWindow().getInsetsController();
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m9316a() {
        /*
            r2 = this;
            boolean r0 = r2.f6226e
            if (r0 == 0) goto L1f
            boolean r0 = com.applovin.impl.sdk.utils.C3294g.m7017j()
            if (r0 == 0) goto L1f
            android.view.Window r0 = r2.getWindow()
            android.view.WindowInsetsController r0 = androidx.core.view.C0982o3.m11400a(r0)
            if (r0 == 0) goto L1f
            com.applovin.adview.C2645a.m9314a(r0)
            int r1 = com.applovin.adview.C2646b.m9313a()
            com.applovin.adview.C2647c.m9311b(r0, r1)
            goto L2c
        L1f:
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 5894(0x1706, float:8.259E-42)
            r0.setSystemUiVisibility(r1)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.adview.AppLovinFullscreenActivity.m9316a():void");
    }

    @Override // com.applovin.impl.adview.InterfaceC2780k
    public void dismiss() {
        AbstractC2688a abstractC2688a = this.f6223b;
        if (abstractC2688a != null) {
            abstractC2688a.mo9052h();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        AbstractC2688a abstractC2688a = this.f6223b;
        if (abstractC2688a != null) {
            abstractC2688a.m9136l();
        }
        if (Utils.isAppLovinTestEnvironment(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbstractC2688a abstractC2688a = this.f6223b;
        if (abstractC2688a != null) {
            abstractC2688a.m9155a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            if (bundle.getBoolean("com.applovin.dismiss_on_restore", false)) {
                if (C3349v.m6862a()) {
                    C3349v.m6847h("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
                }
                dismiss();
                return;
            } else if (C3349v.m6862a()) {
                C3349v.m6849f("AppLovinFullscreenActivity", "Activity was destroyed while in background.");
            }
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        getWindow().addFlags(128);
        View findViewById = findViewById(16908290);
        findViewById.setBackgroundColor(-16777216);
        C3214m c3214m = AppLovinSdk.getInstance(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"), new AppLovinSdkSettings(this), this).coreSdk;
        this.f6222a = c3214m;
        this.f6226e = ((Boolean) c3214m.m7456a(C3109b.f7906cF)).booleanValue();
        if (((Boolean) this.f6222a.m7456a(C3109b.f7907cG)).booleanValue()) {
            findViewById.setFitsSystemWindows(true);
        }
        m9316a();
        C2791o c2791o = parentInterstitialWrapper;
        if (c2791o != null) {
            AbstractC2688a.m9152a(c2791o.m8915a(), parentInterstitialWrapper.m8897d(), parentInterstitialWrapper.m8899c(), parentInterstitialWrapper.m8902b(), this.f6222a, this, new AbstractC2688a.InterfaceC2700a() { // from class: com.applovin.adview.AppLovinFullscreenActivity.1
                @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a.InterfaceC2700a
                /* renamed from: a */
                public void mo8889a(AbstractC2688a abstractC2688a) {
                    AppLovinFullscreenActivity.this.f6223b = abstractC2688a;
                    abstractC2688a.mo9055d();
                }

                @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a.InterfaceC2700a
                /* renamed from: a */
                public void mo8888a(String str, Throwable th) {
                    C2791o.m8905a(AppLovinFullscreenActivity.parentInterstitialWrapper.m8915a(), AppLovinFullscreenActivity.parentInterstitialWrapper.m8899c(), str, th, AppLovinFullscreenActivity.this);
                }
            });
            return;
        }
        Intent intent = new Intent(this, FullscreenAdService.class);
        ServiceConnectionC2675a serviceConnectionC2675a = new ServiceConnectionC2675a(this, this.f6222a);
        this.f6225d = serviceConnectionC2675a;
        bindService(intent, serviceConnectionC2675a, 1);
        if (C3294g.m7019h()) {
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        parentInterstitialWrapper = null;
        ServiceConnectionC2675a serviceConnectionC2675a = this.f6225d;
        if (serviceConnectionC2675a != null) {
            try {
                unbindService(serviceConnectionC2675a);
            } catch (Throwable unused) {
            }
        }
        AbstractC2688a abstractC2688a = this.f6223b;
        if (abstractC2688a != null) {
            if (!abstractC2688a.m9138i()) {
                this.f6223b.mo9052h();
            }
            this.f6223b.mo9069k();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC2688a abstractC2688a = this.f6223b;
        if (abstractC2688a != null) {
            abstractC2688a.m9157a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        AbstractC2688a abstractC2688a = this.f6223b;
        if (abstractC2688a != null) {
            abstractC2688a.mo9107g();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        AbstractC2688a abstractC2688a;
        try {
            super.onResume();
            if (this.f6224c.get() || (abstractC2688a = this.f6223b) == null) {
                return;
            }
            abstractC2688a.mo9108f();
        } catch (IllegalArgumentException e) {
            if (C3349v.m6862a()) {
                this.f6222a.m7487A().m6854b("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            dismiss();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C3214m c3214m = this.f6222a;
        if (c3214m != null) {
            bundle.putBoolean("com.applovin.dismiss_on_restore", ((Boolean) c3214m.m7456a(C3109b.f8018eN)).booleanValue());
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        AbstractC2688a abstractC2688a = this.f6223b;
        if (abstractC2688a != null) {
            abstractC2688a.m9137j();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.f6223b != null) {
            if (!this.f6224c.getAndSet(false) || (this.f6223b instanceof C2711e)) {
                this.f6223b.mo9073c(z);
            }
            if (z) {
                m9316a();
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void setPresenter(AbstractC2688a abstractC2688a) {
        this.f6223b = abstractC2688a;
    }
}
