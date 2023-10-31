package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.v */
/* loaded from: classes.dex */
public final class C2806v {

    /* renamed from: a */
    private JSONObject f6699a;

    public C2806v(JSONObject jSONObject) {
        this.f6699a = jSONObject;
    }

    @TargetApi(21)
    /* renamed from: a */
    public Integer m8869a() {
        int i;
        String string = JsonUtils.getString(this.f6699a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                i = 0;
            } else if ("never_allow".equalsIgnoreCase(string)) {
                i = 1;
            } else if ("compatibility_mode".equalsIgnoreCase(string)) {
                i = 2;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    /* renamed from: b */
    public WebSettings.PluginState m8868b() {
        String string = JsonUtils.getString(this.f6699a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    /* renamed from: c */
    public Boolean m8867c() {
        return JsonUtils.getBoolean(this.f6699a, "allow_file_access", null);
    }

    /* renamed from: d */
    public Boolean m8866d() {
        return JsonUtils.getBoolean(this.f6699a, "load_with_overview_mode", null);
    }

    /* renamed from: e */
    public Boolean m8865e() {
        return JsonUtils.getBoolean(this.f6699a, "use_wide_view_port", null);
    }

    /* renamed from: f */
    public Boolean m8864f() {
        return JsonUtils.getBoolean(this.f6699a, "allow_content_access", null);
    }

    /* renamed from: g */
    public Boolean m8863g() {
        return JsonUtils.getBoolean(this.f6699a, "use_built_in_zoom_controls", null);
    }

    /* renamed from: h */
    public Boolean m8862h() {
        return JsonUtils.getBoolean(this.f6699a, "display_zoom_controls", null);
    }

    /* renamed from: i */
    public Boolean m8861i() {
        return JsonUtils.getBoolean(this.f6699a, "save_form_data", null);
    }

    /* renamed from: j */
    public Boolean m8860j() {
        return JsonUtils.getBoolean(this.f6699a, "geolocation_enabled", null);
    }

    /* renamed from: k */
    public Boolean m8859k() {
        return JsonUtils.getBoolean(this.f6699a, "need_initial_focus", null);
    }

    /* renamed from: l */
    public Boolean m8858l() {
        return JsonUtils.getBoolean(this.f6699a, "allow_file_access_from_file_urls", null);
    }

    /* renamed from: m */
    public Boolean m8857m() {
        return JsonUtils.getBoolean(this.f6699a, "allow_universal_access_from_file_urls", null);
    }

    /* renamed from: n */
    public Boolean m8856n() {
        return JsonUtils.getBoolean(this.f6699a, "offscreen_pre_raster", null);
    }
}
