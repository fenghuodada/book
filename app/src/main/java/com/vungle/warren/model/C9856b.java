package com.vungle.warren.model;

import android.content.ContentValues;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.core.content.res.C0672b;
import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.C8686j;
import com.google.gson.C8688k;
import com.google.gson.reflect.C8696a;
import com.vungle.warren.AdConfig;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.persistence.InterfaceC9918b;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.vungle.warren.model.b */
/* loaded from: classes3.dex */
public final class C9856b implements InterfaceC9918b<Advertisement> {

    /* renamed from: e */
    public static final Type f19813e = new C9859c().getType();

    /* renamed from: f */
    public static final Type f19814f = new C9860d().getType();

    /* renamed from: a */
    public final C8686j f19815a = new C8688k().m3226a();

    /* renamed from: b */
    public final Type f19816b;

    /* renamed from: c */
    public final Type f19817c;

    /* renamed from: d */
    public final Type f19818d;

    /* renamed from: com.vungle.warren.model.b$a */
    /* loaded from: classes3.dex */
    public class C9857a extends C8696a<String[]> {
    }

    /* renamed from: com.vungle.warren.model.b$b */
    /* loaded from: classes3.dex */
    public class C9858b extends C8696a<Map<String, String>> {
    }

    /* renamed from: com.vungle.warren.model.b$c */
    /* loaded from: classes3.dex */
    public class C9859c extends C8696a<List<Advertisement.C9850a>> {
    }

    /* renamed from: com.vungle.warren.model.b$d */
    /* loaded from: classes3.dex */
    public class C9860d extends C8696a<Map<String, ArrayList<String>>> {
    }

    /* renamed from: com.vungle.warren.model.b$e */
    /* loaded from: classes3.dex */
    public class C9861e extends C8696a<Map<String, Pair<String, String>>> {
    }

    /* renamed from: com.vungle.warren.model.b$f */
    /* loaded from: classes3.dex */
    public class C9862f extends C8696a<List<String>> {
    }

    public C9856b() {
        new C9857a().getType();
        this.f19816b = new C9858b().getType();
        this.f19817c = new C9861e().getType();
        this.f19818d = new C9862f().getType();
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    /* renamed from: a */
    public final ContentValues mo1413a(Advertisement advertisement) {
        Advertisement advertisement2 = advertisement;
        ContentValues contentValues = new ContentValues();
        contentValues.put(FirebaseAnalytics.Param.ITEM_ID, advertisement2.f19738c);
        contentValues.put("ad_type", Integer.valueOf(advertisement2.f19737b));
        contentValues.put("expire_time", Long.valueOf(advertisement2.f19740e));
        contentValues.put("delay", Integer.valueOf(advertisement2.f19743h));
        contentValues.put("show_close_delay", Integer.valueOf(advertisement2.f19745j));
        contentValues.put("show_close_incentivized", Integer.valueOf(advertisement2.f19746k));
        contentValues.put("countdown", Integer.valueOf(advertisement2.f19747l));
        contentValues.put("video_width", Integer.valueOf(advertisement2.f19749n));
        contentValues.put("video_height", Integer.valueOf(advertisement2.f19750o));
        contentValues.put("cta_overlay_enabled", Boolean.valueOf(advertisement2.f19753r));
        contentValues.put("cta_click_area", Boolean.valueOf(advertisement2.f19754s));
        contentValues.put("retry_count", Integer.valueOf(advertisement2.f19758w));
        contentValues.put("requires_non_market_install", Boolean.valueOf(advertisement2.f19721I));
        contentValues.put(AdColonyAdapterUtils.KEY_APP_ID, advertisement2.f19739d);
        contentValues.put(FirebaseAnalytics.Param.CAMPAIGN, advertisement2.f19744i);
        contentValues.put("video_url", advertisement2.f19748m);
        contentValues.put("md5", advertisement2.f19751p);
        contentValues.put("postroll_bundle_url", advertisement2.f19752q);
        contentValues.put("cta_destination_url", advertisement2.f19755t);
        contentValues.put("cta_url", advertisement2.f19756u);
        contentValues.put("ad_token", advertisement2.f19759x);
        contentValues.put("video_identifier", advertisement2.f19760y);
        contentValues.put("template_url", advertisement2.f19761z);
        contentValues.put("TEMPLATE_ID", advertisement2.f19717E);
        contentValues.put("TEMPLATE_TYPE", advertisement2.f19718F);
        contentValues.put("ad_market_id", advertisement2.f19722J);
        contentValues.put("bid_token", advertisement2.f19723K);
        contentValues.put("state", Integer.valueOf(advertisement2.f19725M));
        contentValues.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, advertisement2.f19726N);
        AdConfig adConfig = advertisement2.f19757v;
        C8686j c8686j = this.f19815a;
        contentValues.put("ad_config", c8686j.m3230h(adConfig));
        contentValues.put("checkpoints", c8686j.m3229i(advertisement2.f19741f, f19813e));
        contentValues.put("dynamic_events_and_urls", c8686j.m3229i(advertisement2.f19742g, f19814f));
        Map<String, String> map = advertisement2.f19713A;
        Type type = this.f19816b;
        contentValues.put("template_settings", c8686j.m3229i(map, type));
        contentValues.put("mraid_files", c8686j.m3229i(advertisement2.f19714B, type));
        contentValues.put("cacheable_assets", c8686j.m3229i(advertisement2.f19715C, this.f19817c));
        contentValues.put("column_notifications", c8686j.m3229i(advertisement2.f19735W, this.f19818d));
        contentValues.put("tt_download", Long.valueOf(advertisement2.f19727O));
        contentValues.put("asset_download_timestamp", Long.valueOf(advertisement2.f19729Q));
        contentValues.put("asset_download_duration", Long.valueOf(advertisement2.f19730R));
        contentValues.put("ad_request_start_time", Long.valueOf(advertisement2.f19731S));
        contentValues.put("column_enable_om_sdk", Boolean.valueOf(advertisement2.f19719G));
        contentValues.put("column_om_sdk_extra_vast", advertisement2.f19720H);
        contentValues.put("column_request_timestamp", Long.valueOf(advertisement2.f19732T));
        contentValues.put("column_click_coordinates_enabled", Boolean.valueOf(advertisement2.f19733U));
        contentValues.put("column_assets_fully_downloaded", Boolean.valueOf(advertisement2.f19734V));
        contentValues.put("column_deep_link", advertisement2.f19728P);
        contentValues.put("column_header_bidding", Boolean.valueOf(advertisement2.f19724L));
        return contentValues;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    @NonNull
    /* renamed from: c */
    public final Advertisement mo1412b(ContentValues contentValues) {
        Advertisement advertisement = new Advertisement();
        advertisement.f19738c = contentValues.getAsString(FirebaseAnalytics.Param.ITEM_ID);
        advertisement.f19737b = contentValues.getAsInteger("ad_type").intValue();
        advertisement.f19740e = contentValues.getAsLong("expire_time").longValue();
        advertisement.f19743h = contentValues.getAsInteger("delay").intValue();
        advertisement.f19745j = contentValues.getAsInteger("show_close_delay").intValue();
        advertisement.f19746k = contentValues.getAsInteger("show_close_incentivized").intValue();
        advertisement.f19747l = contentValues.getAsInteger("countdown").intValue();
        advertisement.f19749n = contentValues.getAsInteger("video_width").intValue();
        advertisement.f19750o = contentValues.getAsInteger("video_height").intValue();
        advertisement.f19758w = contentValues.getAsInteger("retry_count").intValue();
        advertisement.f19721I = C0672b.m11997a(contentValues, "requires_non_market_install");
        advertisement.f19739d = contentValues.getAsString(AdColonyAdapterUtils.KEY_APP_ID);
        advertisement.f19744i = contentValues.getAsString(FirebaseAnalytics.Param.CAMPAIGN);
        advertisement.f19748m = contentValues.getAsString("video_url");
        advertisement.f19751p = contentValues.getAsString("md5");
        advertisement.f19752q = contentValues.getAsString("postroll_bundle_url");
        advertisement.f19755t = contentValues.getAsString("cta_destination_url");
        advertisement.f19756u = contentValues.getAsString("cta_url");
        advertisement.f19759x = contentValues.getAsString("ad_token");
        advertisement.f19760y = contentValues.getAsString("video_identifier");
        advertisement.f19761z = contentValues.getAsString("template_url");
        advertisement.f19717E = contentValues.getAsString("TEMPLATE_ID");
        advertisement.f19718F = contentValues.getAsString("TEMPLATE_TYPE");
        advertisement.f19722J = contentValues.getAsString("ad_market_id");
        advertisement.f19723K = contentValues.getAsString("bid_token");
        advertisement.f19725M = contentValues.getAsInteger("state").intValue();
        advertisement.f19726N = contentValues.getAsString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        advertisement.f19753r = C0672b.m11997a(contentValues, "cta_overlay_enabled");
        advertisement.f19754s = C0672b.m11997a(contentValues, "cta_click_area");
        String asString = contentValues.getAsString("ad_config");
        C8686j c8686j = this.f19815a;
        advertisement.f19757v = (AdConfig) c8686j.m3235c(AdConfig.class, asString);
        advertisement.f19741f = (List) c8686j.m3234d(contentValues.getAsString("checkpoints"), f19813e);
        advertisement.f19742g = (Map) c8686j.m3234d(contentValues.getAsString("dynamic_events_and_urls"), f19814f);
        String asString2 = contentValues.getAsString("template_settings");
        Type type = this.f19816b;
        advertisement.f19713A = (Map) c8686j.m3234d(asString2, type);
        advertisement.f19714B = (Map) c8686j.m3234d(contentValues.getAsString("mraid_files"), type);
        advertisement.f19715C = (Map) c8686j.m3234d(contentValues.getAsString("cacheable_assets"), this.f19817c);
        advertisement.f19727O = contentValues.getAsLong("tt_download").longValue();
        advertisement.f19729Q = contentValues.getAsLong("asset_download_timestamp").longValue();
        advertisement.f19730R = contentValues.getAsLong("asset_download_duration").longValue();
        advertisement.f19731S = contentValues.getAsLong("ad_request_start_time").longValue();
        advertisement.f19719G = C0672b.m11997a(contentValues, "column_enable_om_sdk");
        List<String> list = (List) c8686j.m3234d(contentValues.getAsString("column_notifications"), this.f19818d);
        if (list == null) {
            advertisement.f19735W.clear();
        } else {
            advertisement.f19735W = list;
        }
        advertisement.f19720H = contentValues.getAsString("column_om_sdk_extra_vast");
        advertisement.f19732T = contentValues.getAsLong("column_request_timestamp").longValue();
        advertisement.f19733U = contentValues.getAsBoolean("column_click_coordinates_enabled").booleanValue();
        advertisement.f19734V = C0672b.m11997a(contentValues, "column_assets_fully_downloaded");
        advertisement.f19728P = contentValues.getAsString("column_deep_link");
        advertisement.f19724L = contentValues.getAsBoolean("column_header_bidding").booleanValue();
        return advertisement;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    public final String tableName() {
        return "advertisement";
    }
}
