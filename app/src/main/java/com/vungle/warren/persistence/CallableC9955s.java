package com.vungle.warren.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.vision.C10120a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.s */
/* loaded from: classes3.dex */
public final class CallableC9955s implements Callable<List<C10120a>> {

    /* renamed from: a */
    public final /* synthetic */ String f19985a;

    /* renamed from: b */
    public final /* synthetic */ int f19986b;

    /* renamed from: c */
    public final /* synthetic */ long f19987c;

    /* renamed from: d */
    public final /* synthetic */ C9928h f19988d;

    public CallableC9955s(C9928h c9928h, String str, int i, long j) {
        this.f19988d = c9928h;
        this.f19985a = str;
        this.f19986b = i;
        this.f19987c = j;
    }

    @Override // java.util.concurrent.Callable
    public final List<C10120a> call() throws Exception {
        ArrayList arrayList = new ArrayList();
        String str = this.f19985a;
        if ("advertiser".equals(str) || FirebaseAnalytics.Param.CAMPAIGN.equals(str) || "creative".equals(str)) {
            String str2 = this.f19985a;
            Cursor query = this.f19988d.f19929a.m1411a().query("vision_data", new String[]{"COUNT ( * ) as viewCount", "MAX ( timestamp ) as lastTimeStamp", str2}, "timestamp >= ?", new String[]{Long.toString(this.f19987c)}, str2, null, "_id DESC", Integer.toString(this.f19986b));
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        try {
                            ContentValues contentValues = new ContentValues();
                            DatabaseUtils.cursorRowToContentValues(query, contentValues);
                            arrayList.add(new C10120a(contentValues.getAsString(str), contentValues.getAsInteger("viewCount").intValue(), contentValues.getAsLong("lastTimeStamp").longValue()));
                        } catch (Exception e) {
                            VungleLogger.m1605a(C9928h.class.getSimpleName(), "getVisionAggregationInfo", e.toString());
                            arrayList = new ArrayList();
                        }
                    } finally {
                        query.close();
                    }
                }
            }
        }
        return arrayList;
    }
}
