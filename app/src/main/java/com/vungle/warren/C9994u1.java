package com.vungle.warren;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.tasks.InterfaceC9981d;
import com.vungle.warren.tasks.InterfaceC9982e;
import com.vungle.warren.tasks.JobInfo;
import com.vungle.warren.tasks.runnable.C9989a;
import com.vungle.warren.tasks.utility.C9990a;
import com.vungle.warren.tasks.utility.InterfaceC9991b;
import com.vungle.warren.utility.C10095p;
import com.vungle.warren.utility.C10111y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* renamed from: com.vungle.warren.u1 */
/* loaded from: classes3.dex */
public final class C9994u1 implements InterfaceC9982e {

    /* renamed from: i */
    public static final Handler f20089i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public static final String f20090j = C9994u1.class.getSimpleName();

    /* renamed from: a */
    public final InterfaceC9991b f20091a;

    /* renamed from: b */
    public final C10095p f20092b;

    /* renamed from: c */
    public final InterfaceC9981d f20093c;

    /* renamed from: d */
    public final Executor f20094d;

    /* renamed from: g */
    public long f20097g = Long.MAX_VALUE;

    /* renamed from: h */
    public final C9995a f20098h = new C9995a();

    /* renamed from: e */
    public final CopyOnWriteArrayList f20095e = new CopyOnWriteArrayList();

    /* renamed from: f */
    public final RunnableC9997c f20096f = new RunnableC9997c(new WeakReference(this));

    /* renamed from: com.vungle.warren.u1$a */
    /* loaded from: classes3.dex */
    public class C9995a implements C10095p.InterfaceC10097b {
        public C9995a() {
        }

        @Override // com.vungle.warren.utility.C10095p.InterfaceC10097b
        /* renamed from: a */
        public final void mo1260a(int i) {
            C9994u1.this.m1351c();
        }
    }

    /* renamed from: com.vungle.warren.u1$b */
    /* loaded from: classes3.dex */
    public static class C9996b {

        /* renamed from: a */
        public final long f20100a;

        /* renamed from: b */
        public final JobInfo f20101b;

        public C9996b(long j, JobInfo jobInfo) {
            this.f20100a = j;
            this.f20101b = jobInfo;
        }
    }

    /* renamed from: com.vungle.warren.u1$c */
    /* loaded from: classes3.dex */
    public static class RunnableC9997c implements Runnable {

        /* renamed from: a */
        public final WeakReference<C9994u1> f20102a;

        public RunnableC9997c(WeakReference<C9994u1> weakReference) {
            this.f20102a = weakReference;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9994u1 c9994u1 = this.f20102a.get();
            if (c9994u1 != null) {
                c9994u1.m1351c();
            }
        }
    }

    public C9994u1(@NonNull InterfaceC9981d interfaceC9981d, @NonNull C10111y c10111y, @Nullable C9990a c9990a, @NonNull C10095p c10095p) {
        this.f20093c = interfaceC9981d;
        this.f20094d = c10111y;
        this.f20091a = c9990a;
        this.f20092b = c10095p;
    }

    @Override // com.vungle.warren.tasks.InterfaceC9982e
    /* renamed from: a */
    public final synchronized void mo1353a(@NonNull JobInfo jobInfo) {
        JobInfo m1361a = jobInfo.m1361a();
        String str = m1361a.f20050a;
        long j = m1361a.f20052c;
        m1361a.f20052c = 0L;
        if (m1361a.f20051b) {
            Iterator it = this.f20095e.iterator();
            while (it.hasNext()) {
                C9996b c9996b = (C9996b) it.next();
                if (c9996b.f20101b.f20050a.equals(str)) {
                    String str2 = f20090j;
                    Log.d(str2, "replacing pending job with new " + str);
                    this.f20095e.remove(c9996b);
                }
            }
        }
        this.f20095e.add(new C9996b(SystemClock.uptimeMillis() + j, m1361a));
        m1351c();
    }

    @Override // com.vungle.warren.tasks.InterfaceC9982e
    /* renamed from: b */
    public final synchronized void mo1352b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f20095e.iterator();
        while (it.hasNext()) {
            C9996b c9996b = (C9996b) it.next();
            if (c9996b.f20101b.f20050a.equals("com.vungle.warren.tasks.a")) {
                arrayList.add(c9996b);
            }
        }
        this.f20095e.removeAll(arrayList);
    }

    /* renamed from: c */
    public final synchronized void m1351c() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        long uptimeMillis = SystemClock.uptimeMillis();
        Iterator it = this.f20095e.iterator();
        long j = Long.MAX_VALUE;
        long j2 = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            C9996b c9996b = (C9996b) it.next();
            long j3 = c9996b.f20100a;
            if (uptimeMillis >= j3) {
                if (c9996b.f20101b.f20058i == 1 && this.f20092b.m1263a() == -1) {
                    j2++;
                    z = false;
                }
                if (z) {
                    this.f20095e.remove(c9996b);
                    this.f20094d.execute(new C9989a(c9996b.f20101b, this.f20093c, this, this.f20091a));
                }
            } else {
                j = Math.min(j, j3);
            }
        }
        if (j != Long.MAX_VALUE && j != this.f20097g) {
            Handler handler = f20089i;
            handler.removeCallbacks(this.f20096f);
            handler.postAtTime(this.f20096f, f20090j, j);
        }
        this.f20097g = j;
        if (j2 > 0) {
            C10095p c10095p = this.f20092b;
            c10095p.f20326e.add(this.f20098h);
            c10095p.m1261c(true);
        } else {
            C10095p c10095p2 = this.f20092b;
            C9995a c9995a = this.f20098h;
            c10095p2.f20326e.remove(c9995a);
            c10095p2.m1261c(!copyOnWriteArraySet.isEmpty());
        }
    }
}
