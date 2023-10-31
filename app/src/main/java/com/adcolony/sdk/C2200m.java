package com.adcolony.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.datastore.preferences.protobuf.C1169e;
import com.unity3d.ads.metadata.MediationMetaData;
import com.vungle.warren.VungleApiClient;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.m */
/* loaded from: classes.dex */
public final class C2200m {

    /* renamed from: a */
    public String f5361a = "";

    /* renamed from: b */
    public final C2367y1 f5362b;

    public C2200m() {
        C2367y1 c2367y1 = new C2367y1();
        this.f5362b = c2367y1;
        C2080d1.m9660h(c2367y1, "origin_store", "google");
    }

    /* renamed from: a */
    public final void m9594a(@NonNull Context context) {
        String str;
        Boolean bool;
        ThreadPoolExecutor threadPoolExecutor = C2232o6.f5446a;
        try {
            str = context.getPackageName();
        } catch (Exception unused) {
            str = VungleApiClient.ConnectionTypeDetail.UNKNOWN;
        }
        C2080d1.m9660h(this.f5362b, "bundle_id", str);
        C2367y1 c2367y1 = this.f5362b;
        c2367y1.getClass();
        try {
            synchronized (c2367y1.f5690a) {
                bool = Boolean.valueOf(c2367y1.f5690a.getBoolean("use_forced_controller"));
            }
        } catch (JSONException unused2) {
            bool = null;
        }
        if (bool != null) {
            C2240p3.f5458F = bool.booleanValue();
        }
        if (this.f5362b.m9444o("use_staging_launch_server")) {
            C2058b3.f4957Y = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String m9552k = C2232o6.m9552k(context, "IABUSPrivacy_String");
        String m9552k2 = C2232o6.m9552k(context, "IABTCF_TCString");
        boolean z = false;
        int i = -1;
        try {
            i = C2232o6.m9547p(context).getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused3) {
            C1169e.m11129c("Key IABTCF_gdprApplies in SharedPreferences does not have an int value.", 0, 1, true);
        }
        if (m9552k != null) {
            C2080d1.m9660h(this.f5362b, "ccpa_consent_string", m9552k);
        }
        if (m9552k2 != null) {
            C2080d1.m9660h(this.f5362b, "gdpr_consent_string", m9552k2);
        }
        if (i == 0 || i == 1) {
            C2367y1 c2367y12 = this.f5362b;
            if (i == 1) {
                z = true;
            }
            C2080d1.m9656l(c2367y12, "gdpr_required", z);
        }
    }

    /* renamed from: b */
    public final JSONObject m9593b() {
        C2367y1 c2367y1 = new C2367y1();
        C2367y1 c2367y12 = this.f5362b;
        C2080d1.m9660h(c2367y1, "name", c2367y12.m9436w("mediation_network"));
        C2080d1.m9660h(c2367y1, MediationMetaData.KEY_VERSION, c2367y12.m9436w("mediation_network_version"));
        return c2367y1.f5690a;
    }

    /* renamed from: c */
    public final JSONObject m9592c() {
        C2367y1 c2367y1 = new C2367y1();
        C2367y1 c2367y12 = this.f5362b;
        C2080d1.m9660h(c2367y1, "name", c2367y12.m9436w("plugin"));
        C2080d1.m9660h(c2367y1, MediationMetaData.KEY_VERSION, c2367y12.m9436w("plugin_version"));
        return c2367y1.f5690a;
    }
}
