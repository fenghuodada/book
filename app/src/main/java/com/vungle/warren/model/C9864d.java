package com.vungle.warren.model;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.persistence.InterfaceC9918b;

/* renamed from: com.vungle.warren.model.d */
/* loaded from: classes3.dex */
public final class C9864d implements InterfaceC9918b<C9863c> {
    @Override // com.vungle.warren.persistence.InterfaceC9918b
    /* renamed from: a */
    public final ContentValues mo1413a(C9863c c9863c) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FirebaseAnalytics.Param.ITEM_ID, c9863c.f19819a);
        return contentValues;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    @NonNull
    /* renamed from: b */
    public final C9863c mo1412b(ContentValues contentValues) {
        return new C9863c(contentValues.getAsString(FirebaseAnalytics.Param.ITEM_ID));
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    public final String tableName() {
        return "analytic_url";
    }
}
