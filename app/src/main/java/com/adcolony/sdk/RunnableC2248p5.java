package com.adcolony.sdk;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.adcolony.sdk.C2058b3;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.p5 */
/* loaded from: classes.dex */
public final class RunnableC2248p5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2367y1 f5472a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2356w5 f5473b;

    /* renamed from: c */
    public final /* synthetic */ Context f5474c;

    /* renamed from: d */
    public final /* synthetic */ C2279r5 f5475d;

    public RunnableC2248p5(C2279r5 c2279r5, C2367y1 c2367y1, C2058b3.C2060b c2060b, Context context) {
        this.f5475d = c2279r5;
        this.f5472a = c2367y1;
        this.f5473b = c2060b;
        this.f5474c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2378z3 c2378z3;
        boolean z;
        try {
            c2378z3 = new C2378z3(this.f5472a);
        } catch (JSONException unused) {
            c2378z3 = null;
        }
        if (c2378z3 != null) {
            C2279r5 c2279r5 = this.f5475d;
            InterfaceC2356w5 interfaceC2356w5 = this.f5473b;
            Context context = this.f5474c;
            synchronized (c2279r5) {
                try {
                    SQLiteDatabase sQLiteDatabase = c2279r5.f5546b;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        c2279r5.f5546b = context.openOrCreateDatabase("adc_events_db", 0, null);
                    }
                    if (c2279r5.f5546b.needUpgrade(c2378z3.f5702a)) {
                        if (c2279r5.m9505d(c2378z3) && c2279r5.f5548d != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c2279r5.f5547c = z;
                        if (z) {
                            ((C2377z2) c2279r5.f5548d).getClass();
                            C2110f4.m9634c().f5113d = false;
                        }
                    } else {
                        c2279r5.f5547c = true;
                    }
                    if (c2279r5.f5547c) {
                        interfaceC2356w5.mo9462a(c2378z3);
                    }
                } catch (SQLiteException e) {
                    C2201m0.m9588d().m9689n().m9706d("Database cannot be opened" + e.toString(), 0, 1, true);
                }
            }
        }
    }
}
