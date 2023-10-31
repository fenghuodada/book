package com.vungle.warren.model;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.persistence.InterfaceC9918b;

/* renamed from: com.vungle.warren.model.f */
/* loaded from: classes3.dex */
public final class C9866f implements InterfaceC9918b<CacheBust> {
    @Override // com.vungle.warren.persistence.InterfaceC9918b
    /* renamed from: a */
    public final ContentValues mo1413a(CacheBust cacheBust) {
        String str;
        CacheBust cacheBust2 = cacheBust;
        ContentValues contentValues = new ContentValues();
        contentValues.put(FirebaseAnalytics.Param.ITEM_ID, cacheBust2.f19764a + ":" + cacheBust2.f19765b);
        contentValues.put(FacebookAdapter.KEY_ID, cacheBust2.f19764a);
        contentValues.put("time_window_end", Long.valueOf(cacheBust2.f19765b));
        contentValues.put("id_type", Integer.valueOf(cacheBust2.f19766c));
        String[] strArr = cacheBust2.f19767d;
        if (strArr != null && strArr.length != 0) {
            if (strArr.length == 1) {
                str = strArr[0];
            } else {
                StringBuilder sb = new StringBuilder(strArr[0]);
                for (int i = 1; i < strArr.length; i++) {
                    sb.append(";");
                    sb.append(strArr[i]);
                }
                str = sb.toString();
            }
        } else {
            str = "";
        }
        contentValues.put("event_ids", str);
        contentValues.put("timestamp_processed", Long.valueOf(cacheBust2.f19768e));
        return contentValues;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    @NonNull
    /* renamed from: b */
    public final CacheBust mo1412b(ContentValues contentValues) {
        String[] split;
        CacheBust cacheBust = new CacheBust();
        cacheBust.f19764a = contentValues.getAsString(FacebookAdapter.KEY_ID);
        cacheBust.f19765b = contentValues.getAsLong("time_window_end").longValue();
        cacheBust.f19766c = contentValues.getAsInteger("id_type").intValue();
        String asString = contentValues.getAsString("event_ids");
        if (asString.isEmpty()) {
            split = new String[0];
        } else {
            split = asString.split(";");
        }
        cacheBust.f19767d = split;
        cacheBust.f19768e = contentValues.getAsLong("timestamp_processed").longValue();
        return cacheBust;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    public final String tableName() {
        return "cache_bust";
    }
}
