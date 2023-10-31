package com.applovin.impl.mediation.debugger.p021ui.testmode;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.b */
/* loaded from: classes.dex */
public class C2976b implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C3214m f7353a;

    /* renamed from: b */
    private boolean f7354b;

    /* renamed from: c */
    private boolean f7355c;

    /* renamed from: d */
    private String f7356d;

    public C2976b(C3214m c3214m) {
        this.f7353a = c3214m;
        C3111d<String> c3111d = C3111d.f8063B;
        this.f7356d = (String) c3214m.m7421b((C3111d<C3111d<String>>) c3111d, (C3111d<String>) null);
        c3214m.m7422b(c3111d);
        if (StringUtils.isValidString(this.f7356d)) {
            this.f7355c = true;
        }
        C3111d<Boolean> c3111d2 = C3111d.f8064C;
        this.f7354b = ((Boolean) c3214m.m7421b((C3111d<C3111d<Boolean>>) c3111d2, (C3111d<Boolean>) Boolean.FALSE)).booleanValue();
        c3214m.m7422b(c3111d2);
        AppLovinCommunicator.getInstance(c3214m.m7476L()).subscribe(this, "test_mode_settings");
    }

    /* renamed from: a */
    public void m8197a(@Nullable String str) {
        this.f7356d = str;
    }

    /* renamed from: a */
    public void m8196a(JSONObject jSONObject) {
        if (this.f7354b) {
            return;
        }
        this.f7354b = JsonUtils.containsCaseInsensitiveString(this.f7353a.m7466V().m7129k().f8637b, JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray())) || this.f7353a.m7466V().m7133g() || AppLovinSdkUtils.isEmulator();
    }

    /* renamed from: a */
    public void m8195a(boolean z) {
        this.f7355c = z;
    }

    /* renamed from: a */
    public boolean m8198a() {
        return this.f7354b;
    }

    /* renamed from: b */
    public void m8193b(String str) {
        this.f7353a.m7453a((C3111d<C3111d<String>>) C3111d.f8063B, (C3111d<String>) str);
    }

    /* renamed from: b */
    public boolean m8194b() {
        return this.f7355c;
    }

    @Nullable
    /* renamed from: c */
    public String m8192c() {
        return this.f7356d;
    }

    /* renamed from: d */
    public void m8191d() {
        this.f7353a.m7453a((C3111d<C3111d<Boolean>>) C3111d.f8064C, (C3111d<Boolean>) Boolean.TRUE);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "b";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("test_mode_settings".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            String string = BundleUtils.getString("force_ad_network", messageData);
            if (StringUtils.isValidString(string)) {
                this.f7355c = true;
                this.f7356d = string;
            }
            String string2 = BundleUtils.getString("test_mode_network_next_session", messageData);
            if (StringUtils.isValidString(string2)) {
                m8191d();
                m8193b(string2);
            }
        }
    }
}
