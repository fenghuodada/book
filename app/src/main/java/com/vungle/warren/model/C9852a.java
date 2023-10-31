package com.vungle.warren.model;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.persistence.InterfaceC9918b;

/* renamed from: com.vungle.warren.model.a */
/* loaded from: classes3.dex */
public final class C9852a implements InterfaceC9918b<AdAsset> {
    @Override // com.vungle.warren.persistence.InterfaceC9918b
    /* renamed from: a */
    public final ContentValues mo1413a(AdAsset adAsset) {
        AdAsset adAsset2 = adAsset;
        ContentValues contentValues = new ContentValues();
        contentValues.put(FirebaseAnalytics.Param.ITEM_ID, adAsset2.f19701a);
        contentValues.put("ad_identifier", adAsset2.f19702b);
        contentValues.put("paren_id", adAsset2.f19703c);
        contentValues.put("server_path", adAsset2.f19704d);
        contentValues.put("local_path", adAsset2.f19705e);
        contentValues.put("file_status", Integer.valueOf(adAsset2.f19706f));
        contentValues.put("file_type", Integer.valueOf(adAsset2.f19707g));
        contentValues.put("file_size", Long.valueOf(adAsset2.f19708h));
        contentValues.put("retry_count", Integer.valueOf(adAsset2.f19709i));
        contentValues.put("retry_error", Integer.valueOf(adAsset2.f19710j));
        return contentValues;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    @NonNull
    /* renamed from: b */
    public final AdAsset mo1412b(ContentValues contentValues) {
        AdAsset adAsset = new AdAsset(contentValues.getAsString("ad_identifier"), contentValues.getAsString("server_path"), contentValues.getAsString("local_path"), contentValues.getAsString(FirebaseAnalytics.Param.ITEM_ID));
        adAsset.f19706f = contentValues.getAsInteger("file_status").intValue();
        adAsset.f19707g = contentValues.getAsInteger("file_type").intValue();
        adAsset.f19708h = contentValues.getAsInteger("file_size").intValue();
        adAsset.f19709i = contentValues.getAsInteger("retry_count").intValue();
        adAsset.f19710j = contentValues.getAsInteger("retry_error").intValue();
        adAsset.f19703c = contentValues.getAsString("paren_id");
        return adAsset;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    public final String tableName() {
        return "adAsset";
    }
}
