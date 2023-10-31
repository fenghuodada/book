package com.vungle.warren.persistence;

import android.database.SQLException;
import com.vungle.warren.persistence.C9919c;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.q */
/* loaded from: classes3.dex */
public final class CallableC9953q implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ int f19981a;

    /* renamed from: b */
    public final /* synthetic */ C9928h f19982b;

    public CallableC9953q(C9928h c9928h, int i) {
        this.f19982b = c9928h;
        this.f19981a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        String[] strArr = {Integer.toString(this.f19981a)};
        C9919c c9919c = this.f19982b.f19929a;
        c9919c.getClass();
        try {
            c9919c.m1411a().delete("vision_data", "_id <= ( SELECT MAX( _id ) FROM vision_data ) - ?", strArr);
            return null;
        } catch (SQLException e) {
            throw new C9919c.C9920a(e.getMessage());
        }
    }
}
