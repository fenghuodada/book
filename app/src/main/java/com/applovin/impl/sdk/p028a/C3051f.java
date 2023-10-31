package com.applovin.impl.sdk.p028a;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C3393R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.applovin.impl.sdk.a.f */
/* loaded from: classes.dex */
public class C3051f {

    /* renamed from: a */
    private final C3214m f7589a;

    /* renamed from: b */
    private final Context f7590b;

    /* renamed from: c */
    private String f7591c;

    public C3051f(C3214m c3214m) {
        this.f7589a = c3214m;
        this.f7590b = c3214m.m7476L();
    }

    /* renamed from: a */
    public String m8052a(String str) {
        try {
            return ScriptInjector.injectScriptContentIntoHtml(this.f7591c, str);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                this.f7589a.m7487A().m6854b("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }

    /* renamed from: a */
    public void m8055a() {
        if (((Boolean) this.f7589a.m7456a(C3109b.f7838aq)).booleanValue()) {
            if (C3349v.m6862a()) {
                C3349v m7487A = this.f7589a.m7487A();
                m7487A.m6855b("OpenMeasurementService", "Initializing Open Measurement SDK v" + m8049c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.f.1
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    Omid.activate(C3051f.this.f7590b);
                    if (C3349v.m6862a()) {
                        C3349v m7487A2 = C3051f.this.f7589a.m7487A();
                        StringBuilder sb = new StringBuilder("Init ");
                        sb.append(C3051f.this.m8051b() ? "succeeded" : "failed");
                        sb.append(" and took ");
                        sb.append(System.currentTimeMillis() - currentTimeMillis);
                        sb.append("ms");
                        m7487A2.m6855b("OpenMeasurementService", sb.toString());
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C3051f.this.f7590b.getResources().openRawResource(C3393R.raw.omsdk_v_1_0)));
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    C3051f.this.f7591c = sb2.toString();
                                    bufferedReader.close();
                                    return;
                                }
                                sb2.append(readLine);
                            }
                        } catch (IOException e) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                        }
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            C3051f.this.f7589a.m7487A().m6854b("OpenMeasurementService", "Failed to retrieve resource omskd_v_1_0.js", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public boolean m8051b() {
        return Omid.isActive();
    }

    /* renamed from: c */
    public String m8049c() {
        return Omid.getVersion();
    }

    /* renamed from: d */
    public Partner m8048d() {
        return Partner.createPartner((String) this.f7589a.m7456a(C3109b.f7839ar), AppLovinSdk.VERSION);
    }

    @Nullable
    /* renamed from: e */
    public String m8047e() {
        return this.f7591c;
    }
}
