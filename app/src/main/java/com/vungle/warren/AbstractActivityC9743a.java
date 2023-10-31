package com.vungle.warren;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.C1520a;
import com.vungle.warren.InterfaceC9800h0;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.p058ui.InterfaceC10008d;
import com.vungle.warren.p058ui.InterfaceC9998a;
import com.vungle.warren.p058ui.contract.InterfaceC10002a;
import com.vungle.warren.p058ui.contract.InterfaceC10003b;
import com.vungle.warren.p058ui.state.C10028a;
import com.vungle.warren.p058ui.state.InterfaceC10030b;
import com.vungle.warren.p058ui.view.FullAdWidget;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: com.vungle.warren.a */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC9743a extends Activity {

    /* renamed from: j */
    public static InterfaceC10003b.InterfaceC10004a f19393j;
    @Nullable

    /* renamed from: a */
    public InterfaceC10003b f19394a;

    /* renamed from: b */
    public C9755b f19395b;

    /* renamed from: c */
    public AdRequest f19396c;

    /* renamed from: d */
    public InterfaceC9800h0 f19397d;

    /* renamed from: e */
    public InterfaceC10030b f19398e;

    /* renamed from: f */
    public final AtomicBoolean f19399f = new AtomicBoolean(false);

    /* renamed from: g */
    public boolean f19400g = false;

    /* renamed from: h */
    public boolean f19401h = false;

    /* renamed from: i */
    public final C9746c f19402i = new C9746c();

    /* renamed from: com.vungle.warren.a$a */
    /* loaded from: classes3.dex */
    public class C9744a implements InterfaceC9998a {
        public C9744a() {
        }

        @Override // com.vungle.warren.p058ui.InterfaceC9998a
        public final void close() {
            AbstractActivityC9743a.this.finish();
        }
    }

    /* renamed from: com.vungle.warren.a$b */
    /* loaded from: classes3.dex */
    public class C9745b implements InterfaceC10008d {
        public C9745b() {
        }
    }

    /* renamed from: com.vungle.warren.a$c */
    /* loaded from: classes3.dex */
    public class C9746c implements InterfaceC9800h0.InterfaceC9801a {
        public C9746c() {
        }

        /* renamed from: a */
        public final void m1594a(@NonNull Pair<InterfaceC10002a, InterfaceC10003b> pair, @Nullable VungleException vungleException) {
            AbstractActivityC9743a abstractActivityC9743a = AbstractActivityC9743a.this;
            if (vungleException != null) {
                abstractActivityC9743a.f19397d = null;
                AbstractActivityC9743a.m1598b(vungleException.f19507a, abstractActivityC9743a.f19396c);
                abstractActivityC9743a.finish();
                return;
            }
            InterfaceC10003b interfaceC10003b = (InterfaceC10003b) pair.second;
            abstractActivityC9743a.f19394a = interfaceC10003b;
            interfaceC10003b.mo1334k(AbstractActivityC9743a.f19393j);
            abstractActivityC9743a.f19394a.mo1339c((InterfaceC10002a) pair.first, abstractActivityC9743a.f19398e);
            if (abstractActivityC9743a.f19399f.getAndSet(false)) {
                abstractActivityC9743a.m1596d();
            }
        }
    }

    /* renamed from: b */
    public static void m1598b(int i, AdRequest adRequest) {
        VungleException vungleException = new VungleException(i);
        InterfaceC10003b.InterfaceC10004a interfaceC10004a = f19393j;
        if (interfaceC10004a != null) {
            ((C9758c) interfaceC10004a).m1589a(adRequest.f19307b, vungleException);
        }
        VungleLogger.m1603c(AbstractActivityC9743a.class.getSimpleName().concat("#deliverError"), vungleException.getLocalizedMessage());
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: c */
    public static AdRequest m1597c(@NonNull Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return (AdRequest) extras.getSerializable("request");
        }
        return null;
    }

    /* renamed from: a */
    public abstract void mo1350a();

    /* renamed from: d */
    public final void m1596d() {
        if (this.f19394a == null) {
            this.f19399f.set(true);
        } else if (!this.f19400g && this.f19401h && hasWindowFocus()) {
            this.f19394a.start();
            this.f19400g = true;
        }
    }

    /* renamed from: e */
    public final void m1595e() {
        if (this.f19394a != null && this.f19400g) {
            this.f19394a.mo1337e(isChangingConfigurations() | (isFinishing() ? 2 : 0));
            this.f19400g = false;
        }
        this.f19399f.set(false);
    }

    @Override // android.app.Activity
    @SuppressLint({"ResourceType"})
    public final void onBackPressed() {
        InterfaceC10003b interfaceC10003b = this.f19394a;
        if (interfaceC10003b != null) {
            interfaceC10003b.mo1331n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onConfigurationChanged(android.content.res.Configuration r3) {
        /*
            r2 = this;
            super.onConfigurationChanged(r3)
            int r3 = r3.orientation
            r0 = 2
            java.lang.String r1 = "VungleActivity"
            if (r3 != r0) goto L10
            java.lang.String r3 = "landscape"
        Lc:
            android.util.Log.d(r1, r3)
            goto L16
        L10:
            r0 = 1
            if (r3 != r0) goto L16
            java.lang.String r3 = "portrait"
            goto Lc
        L16:
            com.vungle.warren.ui.contract.b r3 = r2.f19394a
            if (r3 == 0) goto L1d
            r3.mo1340b()
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AbstractActivityC9743a.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onCreate(@Nullable Bundle bundle) {
        AdRequest adRequest;
        InterfaceC10030b interfaceC10030b;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        this.f19396c = m1597c(getIntent());
        C10114v0 m1234a = C10114v0.m1234a(this);
        if (((InterfaceC10128w1) m1234a.m1232c(InterfaceC10128w1.class)).isInitialized() && f19393j != null && (adRequest = this.f19396c) != null && !TextUtils.isEmpty(adRequest.f19307b)) {
            long currentTimeMillis = System.currentTimeMillis();
            VungleLogger.m1600f("VungleActivity", "ttDownloadContext", String.format("Creating ad, request = %1$s, at: %2$d", this.f19396c, Long.valueOf(currentTimeMillis)));
            try {
                FullAdWidget fullAdWidget = new FullAdWidget(this, getWindow());
                this.f19397d = (InterfaceC9800h0) m1234a.m1232c(InterfaceC9800h0.class);
                if (bundle == null) {
                    interfaceC10030b = null;
                } else {
                    interfaceC10030b = (InterfaceC10030b) bundle.getParcelable("presenter_state");
                }
                InterfaceC10030b interfaceC10030b2 = interfaceC10030b;
                this.f19398e = interfaceC10030b2;
                this.f19397d.mo1507a(this, this.f19396c, fullAdWidget, interfaceC10030b2, new C9744a(), new C9745b(), bundle, this.f19402i);
                setContentView(fullAdWidget, fullAdWidget.getLayoutParams());
                this.f19395b = new C9755b(this);
                C1520a.m10509a(getApplicationContext()).m10508b(this.f19395b, new IntentFilter("AdvertisementBus"));
                VungleLogger.m1600f("VungleActivity", "ttDownloadContext", String.format("Ad created, request = %1$s, elapsed time: %2$dms", this.f19396c, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                return;
            } catch (InstantiationException unused) {
                m1598b(10, this.f19396c);
                finish();
                return;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C1520a.m10509a(getApplicationContext()).m10507c(this.f19395b);
        InterfaceC10003b interfaceC10003b = this.f19394a;
        if (interfaceC10003b != null) {
            interfaceC10003b.mo1336h(isChangingConfigurations() | 2);
        } else {
            InterfaceC9800h0 interfaceC9800h0 = this.f19397d;
            if (interfaceC9800h0 != null) {
                interfaceC9800h0.destroy();
                this.f19397d = null;
                m1598b(25, this.f19396c);
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        AdRequest m1597c = m1597c(getIntent());
        AdRequest m1597c2 = m1597c(intent);
        String str = m1597c != null ? m1597c.f19307b : null;
        String str2 = m1597c2 != null ? m1597c2.f19307b : null;
        if (str == null || str2 == null || str.equals(str2)) {
            return;
        }
        Log.d("VungleActivity", "Tried to play another placement " + str2 + " while playing " + str);
        m1598b(15, m1597c2);
        VungleLogger.m1599g(AbstractActivityC9743a.class.getSimpleName().concat("#onNewIntent"), String.format("Tried to play another placement %1$s while playing %2$s", str2, str));
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f19401h = false;
        m1595e();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        InterfaceC10003b interfaceC10003b;
        super.onRestoreInstanceState(bundle);
        Log.d("VungleActivity", "onRestoreInstanceState(" + bundle + ")");
        if (bundle == null || (interfaceC10003b = this.f19394a) == null) {
            return;
        }
        interfaceC10003b.mo1335i((InterfaceC10030b) bundle.getParcelable("presenter_state"));
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f19401h = true;
        m1596d();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Log.d("VungleActivity", "onSaveInstanceState");
        C10028a c10028a = new C10028a();
        InterfaceC10003b interfaceC10003b = this.f19394a;
        if (interfaceC10003b != null) {
            interfaceC10003b.mo1341a(c10028a);
            bundle.putParcelable("presenter_state", c10028a);
        }
        InterfaceC9800h0 interfaceC9800h0 = this.f19397d;
        if (interfaceC9800h0 != null) {
            interfaceC9800h0.mo1505c(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m1596d();
        } else {
            m1595e();
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i) {
        mo1350a();
        super.setRequestedOrientation(i);
    }
}
