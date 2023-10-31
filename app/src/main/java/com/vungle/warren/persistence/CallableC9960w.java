package com.vungle.warren.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.C9856b;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.w */
/* loaded from: classes3.dex */
public final class CallableC9960w implements Callable<Advertisement> {

    /* renamed from: a */
    public final /* synthetic */ String f19999a;

    /* renamed from: b */
    public final /* synthetic */ String f20000b;

    /* renamed from: c */
    public final /* synthetic */ C9928h f20001c;

    public CallableC9960w(C9928h c9928h, String str, String str2) {
        this.f20001c = c9928h;
        this.f19999a = str;
        this.f20000b = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Advertisement call() throws Exception {
        String[] strArr;
        StringBuilder sb = new StringBuilder("placement_id = ? AND (state = ? OR state = ?)");
        String str = this.f20000b;
        String str2 = this.f19999a;
        if (str2 != null) {
            sb.append(" AND item_id = ?");
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0), str2};
        } else {
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0)};
        }
        String sb2 = sb.toString();
        C9928h c9928h = this.f20001c;
        Cursor query = c9928h.f19929a.m1411a().query("advertisement", null, sb2, strArr, null, null, null, null);
        Advertisement advertisement = null;
        try {
            if (query != null) {
                try {
                    C9856b c9856b = (C9856b) c9928h.f19933e.get(Advertisement.class);
                    if (c9856b != null && query.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(query, contentValues);
                        advertisement = c9856b.mo1412b(contentValues);
                    }
                } catch (Exception e) {
                    VungleLogger.m1605a(C9928h.class.getSimpleName(), "findPotentiallyExpiredAd", e.toString());
                }
            }
            return advertisement;
        } finally {
            query.close();
        }
    }
}
