package com.vungle.warren.persistence;

import android.content.ContentValues;
import android.database.SQLException;
import android.util.Log;
import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.C9919c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.o */
/* loaded from: classes3.dex */
public final class CallableC9951o implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ List f19977a;

    /* renamed from: b */
    public final /* synthetic */ C9928h f19978b;

    public CallableC9951o(C9928h c9928h, ArrayList arrayList) {
        this.f19978b = c9928h;
        this.f19977a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        boolean z;
        synchronized (C9928h.class) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_valid", Boolean.FALSE);
            C9919c c9919c = this.f19978b.f19929a;
            c9919c.getClass();
            try {
                c9919c.m1411a().update("placement", contentValues, null, null);
                for (Placement placement : this.f19977a) {
                    Placement placement2 = (Placement) C9928h.m1398a(this.f19978b, Placement.class, placement.f19769a);
                    if (placement2 != null && (placement2.f19771c != placement.f19771c || placement2.f19775g != placement.f19775g)) {
                        Log.w("h", "Placements data for " + placement.f19769a + " is different from disc, deleting old");
                        for (String str : C9928h.m1395d(this.f19978b, placement.f19769a)) {
                            C9928h.m1397b(this.f19978b, str);
                        }
                        this.f19978b.m1390i(Placement.class, placement2.f19769a);
                    }
                    if (placement2 != null) {
                        placement.f19772d = placement2.f19772d;
                        placement.f19778j = placement2.m1460a();
                    }
                    if (placement.f19777i != 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    placement.f19776h = z;
                    if (placement.f19780l == Integer.MIN_VALUE) {
                        placement.f19776h = false;
                    }
                    C9928h.m1394e(this.f19978b, placement);
                }
            } catch (SQLException e) {
                throw new C9919c.C9920a(e.getMessage());
            }
        }
        return null;
    }
}
