package com.iab.omid.library.applovin.adsession;

import com.iab.omid.library.applovin.p048d.C8790b;
import com.iab.omid.library.applovin.p048d.C8794e;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        this.creativeType = creativeType;
        this.impressionType = impressionType;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        C8794e.m3038a(creativeType, "CreativeType is null");
        C8794e.m3038a(impressionType, "ImpressionType is null");
        C8794e.m3038a(owner, "Impression owner is null");
        C8794e.m3040a(owner, creativeType, impressionType);
        return new AdSessionConfiguration(creativeType, impressionType, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C8790b.m3054a(jSONObject, "impressionOwner", this.impressionOwner);
        C8790b.m3054a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C8790b.m3054a(jSONObject, "creativeType", this.creativeType);
        C8790b.m3054a(jSONObject, "impressionType", this.impressionType);
        C8790b.m3054a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
