package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0486c;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.C3337o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.sdk.k */
/* loaded from: classes.dex */
public class C3201k implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b */
    private static AlertDialog f8346b;

    /* renamed from: c */
    private static final AtomicBoolean f8347c = new AtomicBoolean();

    /* renamed from: a */
    private final C3207l f8348a;

    /* renamed from: d */
    private C3337o f8349d;

    /* renamed from: com.applovin.impl.sdk.k$1 */
    /* loaded from: classes.dex */
    public class RunnableC32021 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3214m f8350a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3206a f8351b;

        public RunnableC32021(C3214m c3214m, InterfaceC3206a interfaceC3206a) {
            this.f8350a = c3214m;
            this.f8351b = interfaceC3206a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3349v m7487A;
            String str;
            if (C3201k.this.f8348a.m7492d()) {
                if (C3349v.m6862a()) {
                    this.f8350a.m7487A().m6850e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                    return;
                }
                return;
            }
            Activity m8070a = this.f8350a.m7434af().m8070a();
            if (m8070a != null && C3295h.m7013a(this.f8350a.m7476L())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.k.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AlertDialog unused = C3201k.f8346b = new AlertDialog.Builder(RunnableC32021.this.f8350a.m7434af().m8070a()).setTitle((CharSequence) RunnableC32021.this.f8350a.m7456a(C3109b.f7802aG)).setMessage((CharSequence) RunnableC32021.this.f8350a.m7456a(C3109b.f7803aH)).setCancelable(false).setPositiveButton((CharSequence) RunnableC32021.this.f8350a.m7456a(C3109b.f7804aI), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.k.1.1.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                RunnableC32021.this.f8351b.mo7507a();
                                dialogInterface.dismiss();
                                C3201k.f8347c.set(false);
                            }
                        }).setNegativeButton((CharSequence) RunnableC32021.this.f8350a.m7456a(C3109b.f7805aJ), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.k.1.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                RunnableC32021.this.f8351b.mo7496b();
                                dialogInterface.dismiss();
                                C3201k.f8347c.set(false);
                                long longValue = ((Long) RunnableC32021.this.f8350a.m7456a(C3109b.f7800aE)).longValue();
                                RunnableC32021 runnableC32021 = RunnableC32021.this;
                                C3201k.this.m7511a(longValue, runnableC32021.f8350a, runnableC32021.f8351b);
                            }
                        }).create();
                        C3201k.f8346b.show();
                    }
                });
                return;
            }
            if (C3349v.m6862a()) {
                if (m8070a == null) {
                    m7487A = this.f8350a.m7487A();
                    str = "No parent Activity found - rescheduling consent alert...";
                } else {
                    m7487A = this.f8350a.m7487A();
                    str = "No internet available - rescheduling consent alert...";
                }
                m7487A.m6850e("ConsentAlertManager", str);
            }
            C3201k.f8347c.set(false);
            C3201k.this.m7511a(((Long) this.f8350a.m7456a(C3109b.f7801aF)).longValue(), this.f8350a, this.f8351b);
        }
    }

    /* renamed from: com.applovin.impl.sdk.k$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3206a {
        /* renamed from: a */
        void mo7507a();

        /* renamed from: b */
        void mo7496b();
    }

    public C3201k(C3207l c3207l, C3214m c3214m) {
        this.f8348a = c3207l;
        c3214m.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        c3214m.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public void m7511a(long j, C3214m c3214m, InterfaceC3206a interfaceC3206a) {
        if (j <= 0) {
            return;
        }
        AlertDialog alertDialog = f8346b;
        if (alertDialog != null && alertDialog.isShowing()) {
            return;
        }
        if (f8347c.getAndSet(true)) {
            if (j < this.f8349d.m6907a()) {
                if (C3349v.m6862a()) {
                    C3349v m7487A = c3214m.m7487A();
                    StringBuilder m12390a = C0486c.m12390a("Scheduling consent alert earlier (", j, "ms) than remaining scheduled time (");
                    m12390a.append(this.f8349d.m6907a());
                    m12390a.append("ms)");
                    m7487A.m6855b("ConsentAlertManager", m12390a.toString());
                }
                this.f8349d.m6899d();
            } else if (C3349v.m6862a()) {
                C3349v m7487A2 = c3214m.m7487A();
                m7487A2.m6851d("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f8349d.m6907a() + " milliseconds");
                return;
            } else {
                return;
            }
        }
        if (C3349v.m6862a()) {
            C3349v m7487A3 = c3214m.m7487A();
            m7487A3.m6855b("ConsentAlertManager", "Scheduling consent alert for " + j + " milliseconds");
        }
        this.f8349d = C3337o.m6906a(j, c3214m, new RunnableC32021(c3214m, interfaceC3206a));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map) {
        if (this.f8349d == null) {
            return;
        }
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f8349d.m6903b();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f8349d.m6901c();
        }
    }
}
