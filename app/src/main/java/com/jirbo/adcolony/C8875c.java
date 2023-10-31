package com.jirbo.adcolony;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.C2058b3;
import com.adcolony.sdk.C2074d;
import com.adcolony.sdk.C2080d1;
import com.adcolony.sdk.C2114g;
import com.adcolony.sdk.C2200m;
import com.adcolony.sdk.C2201m0;
import com.adcolony.sdk.C2367y1;
import com.adcolony.sdk.RunnableC2086e;
import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import com.google.ads.mediation.adcolony.AdColonyMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: com.jirbo.adcolony.c */
/* loaded from: classes3.dex */
public final class C8875c {

    /* renamed from: c */
    public static C8875c f16907c;

    /* renamed from: a */
    public final ArrayList<String> f16908a = new ArrayList<>();

    /* renamed from: b */
    public boolean f16909b = false;

    /* renamed from: com.jirbo.adcolony.c$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8876a {
        void onInitializeFailed(@NonNull AdError adError);

        void onInitializeSuccess();
    }

    /* renamed from: c */
    public static C2114g m2915c(MediationAdConfiguration mediationAdConfiguration) {
        boolean z;
        Bundle mediationExtras = mediationAdConfiguration.getMediationExtras();
        boolean z2 = false;
        if (mediationExtras != null) {
            boolean z3 = mediationExtras.getBoolean("show_pre_popup", false);
            z = mediationExtras.getBoolean("show_post_popup", false);
            z2 = z3;
        } else {
            z = false;
        }
        C2114g c2114g = new C2114g();
        c2114g.f5119a = z2;
        C2367y1 c2367y1 = c2114g.f5121c;
        C2080d1.m9656l(c2367y1, "confirmation_enabled", true);
        c2114g.f5120b = z;
        C2080d1.m9656l(c2367y1, "results_enabled", true);
        String bidResponse = mediationAdConfiguration.getBidResponse();
        if (!bidResponse.isEmpty()) {
            C2080d1.m9660h(c2367y1, AdColonyAdapterUtils.KEY_ADCOLONY_BID_RESPONSE, bidResponse);
        }
        return c2114g;
    }

    /* renamed from: d */
    public static C8875c m2914d() {
        if (f16907c == null) {
            f16907c = new C8875c();
        }
        return f16907c;
    }

    /* renamed from: e */
    public static String m2913e(ArrayList arrayList, Bundle bundle) {
        String str = (arrayList == null || arrayList.isEmpty()) ? null : (String) arrayList.get(0);
        return (bundle == null || bundle.getString("zone_id") == null) ? str : bundle.getString("zone_id");
    }

    /* renamed from: f */
    public static ArrayList m2912f(Bundle bundle) {
        if (bundle != null) {
            String str = AdColonyAdapterUtils.KEY_ZONE_IDS;
            if (bundle.getString(AdColonyAdapterUtils.KEY_ZONE_IDS) == null) {
                str = "zone_id";
            }
            String string = bundle.getString(str);
            if (string != null) {
                return new ArrayList(Arrays.asList(string.split(";")));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m2917a(@NonNull Context context, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @NonNull InterfaceC8876a interfaceC8876a) {
        String string = bundle.getString(AdColonyAdapterUtils.KEY_APP_ID);
        ArrayList<String> m2912f = m2912f(bundle);
        C2200m appOptions = AdColonyMediationAdapter.getAppOptions();
        if (mediationAdRequest.isTesting()) {
            C2080d1.m9656l(appOptions.f5362b, "test_mode", true);
        }
        m2916b(context, appOptions, string, m2912f, interfaceC8876a);
    }

    /* renamed from: b */
    public final void m2916b(@NonNull Context context, @NonNull C2200m c2200m, @NonNull String str, @NonNull ArrayList<String> arrayList, @NonNull InterfaceC8876a interfaceC8876a) {
        ArrayList<String> arrayList2;
        boolean z;
        boolean m9674c;
        int i;
        String str2;
        String str3;
        String str4;
        AdError createAdapterError;
        boolean z2 = context instanceof Activity;
        if (!z2 && !(context instanceof Application)) {
            i = 106;
            str2 = "AdColony SDK requires an Activity context to initialize";
        } else {
            if (TextUtils.isEmpty(str)) {
                str4 = "Missing or invalid AdColony app ID.";
            } else if (arrayList.isEmpty()) {
                str4 = "No zones provided to initialize the AdColony SDK.";
            } else {
                Iterator<String> it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    arrayList2 = this.f16908a;
                    z = false;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (!arrayList2.contains(next)) {
                        arrayList2.add(next);
                        this.f16909b = false;
                    }
                }
                if (this.f16909b) {
                    ExecutorService executorService = C2074d.f5043a;
                    if (!C2201m0.f5365c) {
                        C1169e.m11129c("Ignoring call to AdColony.setAppOptions() as AdColony has not yet been configured.", 0, 1, false);
                    } else {
                        if (c2200m == null) {
                            c2200m = new C2200m();
                        }
                        C2201m0.m9591a(c2200m);
                        if (C2201m0.m9586f()) {
                            C2058b3 m9588d = C2201m0.m9588d();
                            if (m9588d.f5000r != null) {
                                z = true;
                            }
                            if (z && (str3 = m9588d.m9687p().f5361a) != null) {
                                c2200m.f5361a = str3;
                                C2080d1.m9660h(c2200m.f5362b, AdColonyAdapterUtils.KEY_APP_ID, str3);
                            }
                        }
                        C2201m0.m9588d().f5000r = c2200m;
                        Context context2 = C2201m0.f5363a;
                        if (context2 != null) {
                            c2200m.m9594a(context2);
                        }
                        C2074d.m9673d(new RunnableC2086e(c2200m));
                    }
                } else {
                    String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                    C2367y1 c2367y1 = c2200m.f5362b;
                    C2080d1.m9660h(c2367y1, "mediation_network", "AdMob");
                    C2080d1.m9660h(c2367y1, "mediation_network_version", "4.8.0.0");
                    if (z2) {
                        m9674c = C2074d.m9674c((Activity) context, c2200m, str);
                    } else {
                        m9674c = C2074d.m9674c((Application) context, c2200m, str);
                    }
                    this.f16909b = m9674c;
                }
                if (!this.f16909b) {
                    i = 103;
                    str2 = "AdColony SDK failed to initialize.";
                } else {
                    interfaceC8876a.onInitializeSuccess();
                    return;
                }
            }
            createAdapterError = AdColonyMediationAdapter.createAdapterError(101, str4);
            interfaceC8876a.onInitializeFailed(createAdapterError);
        }
        createAdapterError = AdColonyMediationAdapter.createAdapterError(i, str2);
        interfaceC8876a.onInitializeFailed(createAdapterError);
    }
}
