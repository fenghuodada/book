package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.C1839g;
import androidx.work.EnumC2018s;
import androidx.work.impl.C1890d;
import androidx.work.impl.foreground.C1896c;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.utils.futures.AbstractC1966a;
import androidx.work.impl.utils.futures.C1977c;
import java.util.UUID;

/* renamed from: androidx.work.impl.utils.p */
/* loaded from: classes.dex */
public final class RunnableC1990p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1977c f4830a;

    /* renamed from: b */
    public final /* synthetic */ UUID f4831b;

    /* renamed from: c */
    public final /* synthetic */ C1839g f4832c;

    /* renamed from: d */
    public final /* synthetic */ Context f4833d;

    /* renamed from: e */
    public final /* synthetic */ C1991q f4834e;

    public RunnableC1990p(C1991q c1991q, C1977c c1977c, UUID uuid, C1839g c1839g, Context context) {
        this.f4834e = c1991q;
        this.f4830a = c1977c;
        this.f4831b = uuid;
        this.f4832c = c1839g;
        this.f4833d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f4830a.f4776a instanceof AbstractC1966a.C1968b)) {
                String uuid = this.f4831b.toString();
                EnumC2018s m9796f = ((C1943r) this.f4834e.f4837c).m9796f(uuid);
                if (m9796f != null && !m9796f.m9727a()) {
                    ((C1890d) this.f4834e.f4836b).m9836g(uuid, this.f4832c);
                    this.f4833d.startService(C1896c.m9826a(this.f4833d, uuid, this.f4832c));
                } else {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
            }
            this.f4830a.m9750h(null);
        } catch (Throwable th) {
            this.f4830a.m9749i(th);
        }
    }
}
