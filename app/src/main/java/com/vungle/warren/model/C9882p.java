package com.vungle.warren.model;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.persistence.InterfaceC9918b;

/* renamed from: com.vungle.warren.model.p */
/* loaded from: classes3.dex */
public final class C9882p implements InterfaceC9918b<C9881o> {
    @NonNull
    /* renamed from: c */
    public static C9881o m1439c(ContentValues contentValues) {
        return new C9881o(contentValues.getAsLong("timestamp").longValue(), contentValues.getAsString("creative"), contentValues.getAsString(FirebaseAnalytics.Param.CAMPAIGN), contentValues.getAsString("advertiser"));
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    /* renamed from: a */
    public final ContentValues mo1413a(C9881o c9881o) {
        C9881o c9881o2 = c9881o;
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(c9881o2.f19842a));
        contentValues.put("creative", c9881o2.f19843b);
        contentValues.put(FirebaseAnalytics.Param.CAMPAIGN, c9881o2.f19844c);
        contentValues.put("advertiser", c9881o2.f19845d);
        return contentValues;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    @NonNull
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C9881o mo1412b(ContentValues contentValues) {
        return m1439c(contentValues);
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    public final String tableName() {
        return "vision_data";
    }
}
