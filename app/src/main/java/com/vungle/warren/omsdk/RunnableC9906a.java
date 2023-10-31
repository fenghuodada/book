package com.vungle.warren.omsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;
import androidx.appcompat.resources.C0176c;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.work.C1828a;
import com.google.gson.C8695r;
import com.iab.omid.library.vungle.C8817a;
import com.iab.omid.library.vungle.C8840c;
import com.iab.omid.library.vungle.p051a.C8820c;
import com.iab.omid.library.vungle.p052b.C8833b;
import com.iab.omid.library.vungle.p052b.C8836d;
import com.iab.omid.library.vungle.p052b.C8839g;
import com.iab.omid.library.vungle.p054d.C8846a;
import com.vungle.warren.C9846m1;
import com.vungle.warren.model.C9879m;

/* renamed from: com.vungle.warren.omsdk.a */
/* loaded from: classes3.dex */
public final class RunnableC9906a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9907b f19894a;

    public RunnableC9906a(C9907b c9907b) {
        this.f19894a = c9907b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8840c c8840c = C8817a.f16787a;
        if (!c8840c.f16846a) {
            Context applicationContext = this.f19894a.f19896b.get().getApplicationContext();
            if (applicationContext != null) {
                if (!c8840c.f16846a) {
                    c8840c.f16846a = true;
                    C8839g m2936a = C8839g.m2936a();
                    m2936a.f16843c.getClass();
                    C0176c c0176c = new C0176c();
                    Handler handler = new Handler();
                    m2936a.f16842b.getClass();
                    m2936a.f16844d = new C8820c(handler, applicationContext, c0176c, m2936a);
                    C8833b c8833b = C8833b.f16832d;
                    if (applicationContext instanceof Application) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(c8833b);
                    }
                    WindowManager windowManager = C8846a.f16851a;
                    C8846a.f16853c = applicationContext.getResources().getDisplayMetrics().density;
                    C8846a.f16851a = (WindowManager) applicationContext.getSystemService("window");
                    C8836d.f16836b.f16837a = applicationContext.getApplicationContext();
                }
                C9846m1 m1477b = C9846m1.m1477b();
                C8695r c8695r = new C8695r();
                c8695r.m3215u("event", C0539e.m12265a(15));
                c8695r.m3217s(C1828a.m9909a(10), Boolean.TRUE);
                c8695r.m3217s(C1828a.m9909a(3), Boolean.valueOf(c8840c.f16846a));
                m1477b.m1474e(new C9879m(15, c8695r));
                return;
            }
            throw new IllegalArgumentException("Application Context cannot be null");
        }
    }
}
