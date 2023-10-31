package com.unity3d.services.core.configuration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Experiments {

    /* renamed from: a */
    private final JSONObject f18683a;

    public Experiments() {
        this(null);
    }

    public Experiments(JSONObject jSONObject) {
        this.f18683a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public JSONObject getExperimentData() {
        return this.f18683a;
    }

    public Map<String, String> getExperimentTags() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.f18683a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, String.valueOf(this.f18683a.opt(next)));
        }
        return hashMap;
    }

    public boolean isForwardExperimentsToWebViewEnabled() {
        return this.f18683a.optBoolean("fff", false);
    }

    public boolean isNativeTokenEnabled() {
        return this.f18683a.optBoolean("tsi_nt", false);
    }

    public boolean isNativeWebViewCacheEnabled() {
        return this.f18683a.optBoolean("nwc", false);
    }

    public boolean isNewLifecycleTimer() {
        return this.f18683a.optBoolean("nlt", false);
    }

    public boolean isPrivacyRequestEnabled() {
        return this.f18683a.optBoolean("tsi_prr", false);
    }

    public boolean isTwoStageInitializationEnabled() {
        return this.f18683a.optBoolean("tsi", false);
    }

    public boolean isUpdatePiiFields() {
        return this.f18683a.optBoolean("tsi_upii", false);
    }

    public boolean isWebAssetAdCaching() {
        return this.f18683a.optBoolean("wac", false);
    }

    public boolean shouldNativeTokenAwaitPrivacy() {
        return this.f18683a.optBoolean("tsi_prw", false);
    }
}
