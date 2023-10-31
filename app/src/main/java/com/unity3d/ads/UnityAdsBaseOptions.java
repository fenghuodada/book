package com.unity3d.ads;

import com.unity3d.services.core.log.C9549a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UnityAdsBaseOptions {

    /* renamed from: b */
    private String f18000b = "objectId";

    /* renamed from: a */
    private JSONObject f17999a = new JSONObject();

    public JSONObject getData() {
        return this.f17999a;
    }

    public void set(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            this.f17999a.put(str, str2);
        } catch (JSONException e) {
            C9549a.m2023a("Failed to set Unity Ads options", e);
        }
    }

    public void setObjectId(String str) {
        set(this.f18000b, str);
    }
}
