package com.vungle.warren.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.C9881o;
import com.vungle.warren.model.C9882p;
import com.vungle.warren.vision.C10121b;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.r */
/* loaded from: classes3.dex */
public final class CallableC9954r implements Callable<C10121b> {

    /* renamed from: a */
    public final /* synthetic */ long f19983a;

    /* renamed from: b */
    public final /* synthetic */ C9928h f19984b;

    public CallableC9954r(C9928h c9928h, long j) {
        this.f19984b = c9928h;
        this.f19983a = j;
    }

    @Override // java.util.concurrent.Callable
    public final C10121b call() throws Exception {
        String[] strArr = {Long.toString(this.f19983a)};
        C9928h c9928h = this.f19984b;
        Cursor query = c9928h.f19929a.m1411a().query("vision_data", null, "timestamp >= ?", strArr, null, null, "_id DESC", null);
        C9882p c9882p = (C9882p) c9928h.f19933e.get(C9881o.class);
        if (query != null) {
            try {
                if (c9882p != null) {
                    try {
                        if (query.moveToFirst()) {
                            ContentValues contentValues = new ContentValues();
                            DatabaseUtils.cursorRowToContentValues(query, contentValues);
                            return new C10121b(query.getCount(), C9882p.m1439c(contentValues).f19843b);
                        }
                    } catch (Exception e) {
                        VungleLogger.m1605a(C9928h.class.getSimpleName(), "getVisionAggregationInfo", e.toString());
                    }
                }
            } finally {
                query.close();
            }
        }
        return null;
    }
}
