package com.vungle.warren.persistence;

import android.content.ContentValues;
import android.database.SQLException;
import com.vungle.warren.persistence.C9919c;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.l */
/* loaded from: classes3.dex */
public final class CallableC9948l implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ C9928h f19971a;

    public CallableC9948l(C9928h c9928h) {
        this.f19971a = c9928h;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        C9928h c9928h = this.f19971a;
        c9928h.f19929a.m1411a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", (Integer) 3);
        String[] strArr = {String.valueOf(2)};
        C9919c c9919c = c9928h.f19929a;
        c9919c.getClass();
        try {
            c9919c.m1411a().update("advertisement", contentValues, "state=?", strArr);
            return null;
        } catch (SQLException e) {
            throw new C9919c.C9920a(e.getMessage());
        }
    }
}
