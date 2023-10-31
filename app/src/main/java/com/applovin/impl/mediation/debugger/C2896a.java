package com.applovin.impl.mediation.debugger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2905a;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2911b;
import com.applovin.impl.mediation.debugger.p020c.C2916a;
import com.applovin.impl.mediation.debugger.p021ui.p023b.C2946b;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3240b;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.AbstractC3287a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.a */
/* loaded from: classes.dex */
public class C2896a implements C3240b.InterfaceC3244c<JSONObject> {

    /* renamed from: a */
    private static WeakReference<MaxDebuggerActivity> f7027a;

    /* renamed from: b */
    private static final AtomicBoolean f7028b = new AtomicBoolean();

    /* renamed from: c */
    private final C3214m f7029c;

    /* renamed from: d */
    private final C3349v f7030d;

    /* renamed from: e */
    private final C2946b f7031e;

    /* renamed from: h */
    private boolean f7034h;

    /* renamed from: j */
    private boolean f7036j;

    /* renamed from: k */
    private final Context f7037k;

    /* renamed from: f */
    private final Map<String, C2911b> f7032f = new HashMap();

    /* renamed from: g */
    private final AtomicBoolean f7033g = new AtomicBoolean();

    /* renamed from: i */
    private int f7035i = 2;

    public C2896a(C3214m c3214m) {
        this.f7029c = c3214m;
        this.f7030d = c3214m.m7487A();
        Context m7476L = c3214m.m7476L();
        this.f7037k = m7476L;
        this.f7031e = new C2946b(m7476L);
    }

    /* renamed from: a */
    private List<C2911b> m8445a(JSONObject jSONObject, C3214m c3214m) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                C2911b c2911b = new C2911b(jSONObject2, c3214m);
                arrayList.add(c2911b);
                this.f7032f.put(c2911b.m8384m(), c2911b);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private List<C2905a> m8444a(JSONObject jSONObject, List<C2911b> list, C3214m c3214m) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C2905a(jSONObject2, this.f7032f, c3214m));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private void m8447a(List<C2911b> list) {
        boolean z;
        Iterator<C2911b> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C2911b next = it.next();
            if (next.m8392e() && next.m8401a() == C2911b.EnumC2912a.INVALID_INTEGRATION) {
                z = true;
                break;
            }
        }
        if (z) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.a.2
                @Override // java.lang.Runnable
                public void run() {
                    new AlertDialog.Builder(C2896a.this.f7029c.m7434af().m8070a()).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.a.2.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            C2896a.this.m8440c();
                        }
                    }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
                }
            }, TimeUnit.SECONDS.toMillis(2L));
        }
    }

    /* renamed from: f */
    private void m8436f() {
        this.f7029c.m7434af().m8069a(new AbstractC3287a() { // from class: com.applovin.impl.mediation.debugger.a.1
            @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxDebuggerActivity) {
                    C3349v.m6849f("AppLovinSdk", "Started mediation debugger");
                    if (!C2896a.this.m8435g() || C2896a.f7027a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = C2896a.f7027a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(C2896a.this.f7031e, C2896a.this.f7029c.m7434af());
                    }
                    C2896a.f7028b.set(false);
                }
            }

            @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    C3349v.m6849f("AppLovinSdk", "Mediation debugger destroyed");
                    WeakReference unused = C2896a.f7027a = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m8435g() {
        WeakReference<MaxDebuggerActivity> weakReference = f7027a;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* renamed from: a */
    public void m8451a() {
        if (this.f7033g.compareAndSet(false, true)) {
            this.f7029c.m7469S().m7620a(new C2916a(this, this.f7029c), C3163o.EnumC3165a.MEDIATION_MAIN);
        }
    }

    @Override // com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
    /* renamed from: a */
    public void mo7327a(int i, String str, JSONObject jSONObject) {
        C3349v c3349v = this.f7030d;
        c3349v.m6850e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        C3349v.m6846i("AppLovinSdk", "Unable to show mediation debugger.");
        this.f7031e.m8308a(null, null, null, null, null, this.f7029c);
        this.f7033g.set(false);
    }

    @Override // com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
    /* renamed from: a */
    public void mo7326a(JSONObject jSONObject, int i) {
        List<C2911b> m8445a = m8445a(jSONObject, this.f7029c);
        List<C2905a> m8444a = m8444a(jSONObject, m8445a, this.f7029c);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f7031e.m8308a(m8445a, m8444a, JsonUtils.getString(jSONObject2, AppIntroBaseFragmentKt.ARG_TITLE, null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), this.f7029c);
        if (m8442b()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.a.3
                @Override // java.lang.Runnable
                public void run() {
                    C2896a.this.m8440c();
                }
            }, TimeUnit.SECONDS.toMillis(this.f7035i));
        } else {
            m8447a(m8445a);
        }
    }

    /* renamed from: a */
    public void m8443a(boolean z, int i) {
        this.f7034h = z;
        this.f7035i = i;
    }

    /* renamed from: b */
    public boolean m8442b() {
        return this.f7034h;
    }

    /* renamed from: c */
    public void m8440c() {
        m8451a();
        if (m8435g() || !f7028b.compareAndSet(false, true)) {
            C3349v.m6846i("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        if (!this.f7036j) {
            m8436f();
            this.f7036j = true;
        }
        Intent intent = new Intent(this.f7037k, MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        C3349v.m6849f("AppLovinSdk", "Starting mediation debugger...");
        this.f7037k.startActivity(intent);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f7031e + "}";
    }
}
