package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.C2378z3;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.f4 */
/* loaded from: classes.dex */
public final class C2110f4 {

    /* renamed from: e */
    public static C2110f4 f5109e;

    /* renamed from: a */
    public C2378z3 f5110a;

    /* renamed from: b */
    public final ThreadPoolExecutor f5111b = C2232o6.m9563A();

    /* renamed from: c */
    public C2061b4 f5112c = null;

    /* renamed from: d */
    public boolean f5113d = false;

    /* renamed from: com.adcolony.sdk.f4$a */
    /* loaded from: classes.dex */
    public class RunnableC2111a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2356w5 f5114a;

        /* renamed from: b */
        public final /* synthetic */ long f5115b;

        public RunnableC2111a(InterfaceC2356w5 interfaceC2356w5, long j) {
            this.f5114a = interfaceC2356w5;
            this.f5115b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2061b4 c2061b4;
            C2110f4 c2110f4 = C2110f4.this;
            if (c2110f4.f5113d) {
                c2061b4 = c2110f4.f5112c;
            } else {
                C2279r5 m9508a = C2279r5.m9508a();
                C2378z3 c2378z3 = c2110f4.f5110a;
                if (m9508a.f5547c) {
                    SQLiteDatabase sQLiteDatabase = m9508a.f5546b;
                    ExecutorService executorService = m9508a.f5545a;
                    C2061b4 c2061b42 = new C2061b4(c2378z3.f5702a);
                    try {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        executorService.execute(new RunnableC2051a4(c2378z3, sQLiteDatabase, c2061b42, countDownLatch));
                        long j = this.f5115b;
                        if (j > 0) {
                            countDownLatch.await(j, TimeUnit.MILLISECONDS);
                        } else {
                            countDownLatch.await();
                        }
                    } catch (InterruptedException | RejectedExecutionException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("ADCDbReader.calculateFeatureVectors failed with: " + e.toString());
                        C1169e.m11129c(sb.toString(), 0, 0, true);
                    }
                    c2061b4 = c2061b42;
                } else {
                    c2061b4 = null;
                }
            }
            this.f5114a.mo9462a(c2061b4);
        }
    }

    /* renamed from: a */
    public static ContentValues m9636a(C2367y1 c2367y1, C2378z3.C2379a c2379a) throws NumberFormatException, NullPointerException {
        ContentValues contentValues = new ContentValues();
        Iterator it = c2379a.f5709f.iterator();
        while (it.hasNext()) {
            C2378z3.C2380b c2380b = (C2378z3.C2380b) it.next();
            Object m9437v = c2367y1.m9437v(c2380b.f5713a);
            if (m9437v != null) {
                boolean z = m9437v instanceof Boolean;
                String str = c2380b.f5713a;
                if (z) {
                    contentValues.put(str, (Boolean) m9437v);
                } else if (m9437v instanceof Long) {
                    contentValues.put(str, (Long) m9437v);
                } else if (m9437v instanceof Double) {
                    contentValues.put(str, (Double) m9437v);
                } else if (m9437v instanceof Number) {
                    Number number = (Number) m9437v;
                    if (number.doubleValue() == number.longValue() && "INTEGER".equalsIgnoreCase(c2380b.f5714b)) {
                        contentValues.put(str, Long.valueOf(number.longValue()));
                    } else {
                        contentValues.put(str, Double.valueOf(number.doubleValue()));
                    }
                } else if (m9437v instanceof String) {
                    contentValues.put(str, (String) m9437v);
                }
            }
        }
        return contentValues;
    }

    /* renamed from: c */
    public static C2110f4 m9634c() {
        if (f5109e == null) {
            synchronized (C2110f4.class) {
                if (f5109e == null) {
                    f5109e = new C2110f4();
                }
            }
        }
        return f5109e;
    }

    /* renamed from: b */
    public final void m9635b(InterfaceC2356w5<C2061b4> interfaceC2356w5, long j) {
        boolean z;
        C2061b4 c2061b4;
        if (this.f5110a == null) {
            c2061b4 = null;
        } else if (this.f5113d) {
            c2061b4 = this.f5112c;
        } else {
            ThreadPoolExecutor threadPoolExecutor = this.f5111b;
            RunnableC2111a runnableC2111a = new RunnableC2111a(interfaceC2356w5, j);
            ThreadPoolExecutor threadPoolExecutor2 = C2232o6.f5446a;
            try {
                threadPoolExecutor.execute(runnableC2111a);
                z = true;
            } catch (RejectedExecutionException unused) {
                z = false;
            }
            if (!z) {
                C1169e.m11129c("Execute ADCOdtEventsListener.calculateFeatureVectors failed", 0, 0, true);
                return;
            }
            return;
        }
        interfaceC2356w5.mo9462a(c2061b4);
    }
}
