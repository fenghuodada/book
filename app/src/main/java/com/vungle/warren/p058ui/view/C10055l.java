package com.vungle.warren.p058ui.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewManager;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.localbroadcastmanager.content.C1520a;
import androidx.work.C1828a;
import com.google.gson.C8695r;
import com.vungle.warren.AdConfig;
import com.vungle.warren.AdRequest;
import com.vungle.warren.C9758c;
import com.vungle.warren.C9846m1;
import com.vungle.warren.InterfaceC9800h0;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.C9879m;
import com.vungle.warren.p058ui.C10011f;
import com.vungle.warren.p058ui.InterfaceC10009e;
import com.vungle.warren.p058ui.contract.InterfaceC10003b;
import com.vungle.warren.p058ui.contract.InterfaceC10006d;
import com.vungle.warren.p058ui.contract.InterfaceC10007e;
import com.vungle.warren.utility.C10087i;
import com.vungle.warren.utility.C10091l;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.vungle.warren.ui.view.l */
/* loaded from: classes3.dex */
public final class C10055l extends WebView implements InterfaceC10007e {

    /* renamed from: a */
    public InterfaceC10006d f20242a;

    /* renamed from: b */
    public C10059d f20243b;

    /* renamed from: c */
    public final InterfaceC10003b.InterfaceC10004a f20244c;

    /* renamed from: d */
    public final AdRequest f20245d;

    /* renamed from: e */
    public final AdConfig f20246e;

    /* renamed from: f */
    public InterfaceC9800h0 f20247f;

    /* renamed from: g */
    public final AtomicReference<Boolean> f20248g;

    /* renamed from: h */
    public boolean f20249h;

    /* renamed from: i */
    public final C10056a f20250i;

    /* renamed from: com.vungle.warren.ui.view.l$a */
    /* loaded from: classes3.dex */
    public class C10056a implements InterfaceC10054k {
        public C10056a() {
        }

        @Override // com.vungle.warren.p058ui.view.InterfaceC10054k
        /* renamed from: a */
        public final void mo1296a(MotionEvent motionEvent) {
            InterfaceC10006d interfaceC10006d = C10055l.this.f20242a;
            if (interfaceC10006d != null) {
                interfaceC10006d.mo1338d(motionEvent);
            }
        }
    }

    /* renamed from: com.vungle.warren.ui.view.l$b */
    /* loaded from: classes3.dex */
    public class RunnableC10057b implements Runnable {
        public RunnableC10057b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10055l c10055l = C10055l.this;
            c10055l.stopLoading();
            c10055l.setWebViewClient(null);
            if (Build.VERSION.SDK_INT >= 29) {
                c10055l.setWebViewRenderProcessClient(null);
            }
            c10055l.loadUrl("about:blank");
        }
    }

    /* renamed from: com.vungle.warren.ui.view.l$c */
    /* loaded from: classes3.dex */
    public class C10058c implements InterfaceC9800h0.InterfaceC9802b {
        public C10058c() {
        }
    }

    /* renamed from: com.vungle.warren.ui.view.l$d */
    /* loaded from: classes3.dex */
    public class C10059d extends BroadcastReceiver {
        public C10059d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("command");
            if ("stopAll".equalsIgnoreCase(stringExtra)) {
                C10055l.this.m1297s(false);
            } else {
                VungleLogger.m1599g(C10055l.class.getSimpleName().concat("#onAttachedToWindow"), String.format("Receiving Invalid Broadcast: %1$s", stringExtra));
            }
        }
    }

    public C10055l(@NonNull Context context, @NonNull AdRequest adRequest, @Nullable AdConfig adConfig, @NonNull InterfaceC9800h0 interfaceC9800h0, @NonNull C9758c c9758c) {
        super(context);
        this.f20248g = new AtomicReference<>();
        this.f20250i = new C10056a();
        this.f20244c = c9758c;
        this.f20245d = adRequest;
        this.f20246e = adConfig;
        this.f20247f = interfaceC9800h0;
        setLayerType(2, null);
        setBackgroundColor(0);
        setOnTouchListener(new View$OnTouchListenerC10060m(this));
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: c */
    public final void mo1306c() {
        onPause();
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    public final void close() {
        if (this.f20242a != null) {
            m1297s(false);
            return;
        }
        InterfaceC9800h0 interfaceC9800h0 = this.f20247f;
        if (interfaceC9800h0 != null) {
            interfaceC9800h0.destroy();
            this.f20247f = null;
            VungleException vungleException = new VungleException(25);
            ((C9758c) this.f20244c).m1589a(this.f20245d.f19307b, vungleException);
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: e */
    public final void mo1305e(String str, @NonNull String str2, C10011f c10011f, InterfaceC10009e interfaceC10009e) {
        Log.d("com.vungle.warren.ui.view.l", "Opening " + str2);
        if (C10087i.m1271b(str, str2, getContext(), c10011f, true, interfaceC10009e)) {
            return;
        }
        Log.e("com.vungle.warren.ui.view.l", "Cannot open url " + str2);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: g */
    public final void mo1304g() {
        ViewParent parent = getParent();
        if (parent instanceof ViewManager) {
            ((ViewManager) parent).removeView(this);
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    public String getWebsiteUrl() {
        return getUrl();
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: h */
    public final void mo1303h() {
        onResume();
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10007e
    /* renamed from: l */
    public final void mo1302l() {
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: n */
    public final boolean mo1301n() {
        return true;
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: o */
    public final void mo1300o(@NonNull String str) {
        loadUrl(str);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC9800h0 interfaceC9800h0 = this.f20247f;
        if (interfaceC9800h0 != null && this.f20242a == null) {
            interfaceC9800h0.mo1506b(getContext(), this.f20245d, this.f20246e, new C10058c());
        }
        this.f20243b = new C10059d();
        C1520a.m10509a(getContext()).m10508b(this.f20243b, new IntentFilter("AdvertisementBus"));
        onResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1520a.m10509a(getContext()).m10507c(this.f20243b);
        super.onDetachedFromWindow();
        InterfaceC9800h0 interfaceC9800h0 = this.f20247f;
        if (interfaceC9800h0 != null) {
            interfaceC9800h0.destroy();
        }
        onPause();
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        super.onPause();
        setAdVisibility(false);
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        super.onResume();
        Log.d("com.vungle.warren.ui.view.l", "Resuming Flex");
        setAdVisibility(true);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        setAdVisibility(z);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: p */
    public final void mo1299p() {
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: q */
    public final void mo1298q(long j) {
        if (this.f20249h) {
            return;
        }
        this.f20249h = true;
        this.f20242a = null;
        this.f20247f = null;
        removeJavascriptInterface("Android");
        setWebChromeClient(null);
        RunnableC10057b runnableC10057b = new RunnableC10057b();
        if (j <= 0) {
            runnableC10057b.run();
        } else {
            new C10091l().f20314a.postAtTime(runnableC10057b, SystemClock.uptimeMillis() + j);
        }
    }

    /* renamed from: s */
    public final void m1297s(boolean z) {
        int i;
        InterfaceC10006d interfaceC10006d = this.f20242a;
        AdRequest adRequest = this.f20245d;
        if (interfaceC10006d != null) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            interfaceC10006d.mo1336h(i | 2);
        } else {
            InterfaceC9800h0 interfaceC9800h0 = this.f20247f;
            if (interfaceC9800h0 != null) {
                interfaceC9800h0.destroy();
                this.f20247f = null;
                ((C9758c) this.f20244c).m1589a(adRequest.f19307b, new VungleException(25));
            }
        }
        if (z) {
            C8695r c8695r = new C8695r();
            c8695r.m3215u("event", C0539e.m12265a(17));
            if (adRequest != null && adRequest.m1620a() != null) {
                c8695r.m3215u(C1828a.m9909a(4), adRequest.m1620a());
            }
            C9846m1.m1477b().m1474e(new C9879m(17, c8695r));
        }
        mo1298q(0L);
    }

    public void setAdVisibility(boolean z) {
        InterfaceC10006d interfaceC10006d = this.f20242a;
        if (interfaceC10006d != null) {
            interfaceC10006d.mo1333l(z);
        } else {
            this.f20248g.set(Boolean.valueOf(z));
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    public void setOrientation(int i) {
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    public void setPresenter(@NonNull InterfaceC10006d interfaceC10006d) {
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10007e
    public void setVisibility(boolean z) {
        setVisibility(z ? 0 : 4);
    }
}
