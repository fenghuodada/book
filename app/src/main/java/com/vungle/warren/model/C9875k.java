package com.vungle.warren.model;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import androidx.core.content.res.C0672b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.AdConfig;
import com.vungle.warren.persistence.InterfaceC9918b;

/* renamed from: com.vungle.warren.model.k */
/* loaded from: classes3.dex */
public final class C9875k implements InterfaceC9918b<Placement> {
    @Override // com.vungle.warren.persistence.InterfaceC9918b
    /* renamed from: a */
    public final ContentValues mo1413a(Placement placement) {
        Placement placement2 = placement;
        ContentValues contentValues = new ContentValues();
        contentValues.put(FirebaseAnalytics.Param.ITEM_ID, placement2.f19769a);
        contentValues.put("incentivized", Boolean.valueOf(placement2.f19771c));
        contentValues.put("header_bidding", Boolean.valueOf(placement2.f19775g));
        contentValues.put("auto_cached", Boolean.valueOf(placement2.f19770b));
        contentValues.put("wakeup_time", Long.valueOf(placement2.f19772d));
        contentValues.put("is_valid", Boolean.valueOf(placement2.f19776h));
        contentValues.put("refresh_duration", Integer.valueOf(placement2.f19773e));
        contentValues.put("supported_template_types", Integer.valueOf(placement2.f19777i));
        contentValues.put("ad_size", placement2.m1460a().getName());
        contentValues.put("autocache_priority", Integer.valueOf(placement2.f19774f));
        contentValues.put("max_hb_cache", Integer.valueOf(placement2.f19780l));
        contentValues.put("recommended_ad_size", placement2.f19779k.getName());
        return contentValues;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    @NonNull
    /* renamed from: b */
    public final Placement mo1412b(ContentValues contentValues) {
        Placement placement = new Placement();
        placement.f19769a = contentValues.getAsString(FirebaseAnalytics.Param.ITEM_ID);
        placement.f19772d = contentValues.getAsLong("wakeup_time").longValue();
        placement.f19771c = C0672b.m11997a(contentValues, "incentivized");
        placement.f19775g = C0672b.m11997a(contentValues, "header_bidding");
        placement.f19770b = C0672b.m11997a(contentValues, "auto_cached");
        placement.f19776h = C0672b.m11997a(contentValues, "is_valid");
        placement.f19773e = contentValues.getAsInteger("refresh_duration").intValue();
        placement.f19777i = contentValues.getAsInteger("supported_template_types").intValue();
        placement.f19778j = AdConfig.AdSize.fromName(contentValues.getAsString("ad_size"));
        placement.f19774f = contentValues.getAsInteger("autocache_priority").intValue();
        placement.f19780l = contentValues.getAsInteger("max_hb_cache").intValue();
        placement.f19779k = AdConfig.AdSize.fromName(contentValues.getAsString("recommended_ad_size"));
        return placement;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    public final String tableName() {
        return "placement";
    }
}
