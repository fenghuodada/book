package com.applovin.impl.p008a;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.a.e */
/* loaded from: classes.dex */
public class C2657e {

    /* renamed from: c */
    private static final List<String> f6284c = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* renamed from: b */
    private final C3214m f6286b;

    /* renamed from: d */
    private final JSONObject f6287d;

    /* renamed from: e */
    private final JSONObject f6288e;

    /* renamed from: f */
    private final EnumC3076b f6289f;

    /* renamed from: a */
    protected List<C3343r> f6285a = new ArrayList();

    /* renamed from: g */
    private final long f6290g = System.currentTimeMillis();

    public C2657e(JSONObject jSONObject, JSONObject jSONObject2, EnumC3076b enumC3076b, C3214m c3214m) {
        this.f6286b = c3214m;
        this.f6287d = jSONObject;
        this.f6288e = jSONObject2;
        this.f6289f = enumC3076b;
    }

    /* renamed from: a */
    public int m9245a() {
        return this.f6285a.size();
    }

    /* renamed from: b */
    public List<C3343r> m9244b() {
        return this.f6285a;
    }

    /* renamed from: c */
    public JSONObject m9243c() {
        return this.f6287d;
    }

    /* renamed from: d */
    public JSONObject m9242d() {
        return this.f6288e;
    }

    /* renamed from: e */
    public EnumC3076b m9241e() {
        return this.f6289f;
    }

    /* renamed from: f */
    public long m9240f() {
        return this.f6290g;
    }

    /* renamed from: g */
    public List<String> m9239g() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f6287d, "vast_preferred_video_types", null));
        return !explode.isEmpty() ? explode : f6284c;
    }

    /* renamed from: h */
    public int m9238h() {
        return Utils.getVideoCompletionPercent(this.f6287d);
    }
}
