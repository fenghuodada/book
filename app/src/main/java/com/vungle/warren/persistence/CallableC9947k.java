package com.vungle.warren.persistence;

import android.content.ContentValues;
import android.database.SQLException;
import com.vungle.warren.persistence.C9919c;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.k */
/* loaded from: classes3.dex */
public final class CallableC9947k implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ String f19967b;

    /* renamed from: d */
    public final /* synthetic */ String f19969d;

    /* renamed from: e */
    public final /* synthetic */ C9928h f19970e;

    /* renamed from: a */
    public final /* synthetic */ int f19966a = 1;

    /* renamed from: c */
    public final /* synthetic */ int f19968c = 0;

    public CallableC9947k(C9928h c9928h, String str, String str2) {
        this.f19970e = c9928h;
        this.f19967b = str;
        this.f19969d = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(this.f19966a));
        String[] strArr = {this.f19967b, String.valueOf(this.f19968c), this.f19969d};
        C9919c c9919c = this.f19970e.f19929a;
        c9919c.getClass();
        try {
            c9919c.m1411a().update("report", contentValues, "placementId = ?  AND status = ?  AND appId = ? ", strArr);
            return null;
        } catch (SQLException e) {
            throw new C9919c.C9920a(e.getMessage());
        }
    }
}
