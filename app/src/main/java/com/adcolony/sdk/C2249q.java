package com.adcolony.sdk;

import androidx.annotation.NonNull;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.C2232o6;

/* renamed from: com.adcolony.sdk.q */
/* loaded from: classes.dex */
public final class C2249q {

    /* renamed from: a */
    public AbstractC2317u f5476a;

    /* renamed from: b */
    public InterfaceC2252c f5477b;

    /* renamed from: c */
    public C2135i1 f5478c;

    /* renamed from: d */
    public C2114g f5479d;

    /* renamed from: e */
    public C2120g4 f5480e;

    /* renamed from: f */
    public int f5481f;

    /* renamed from: g */
    public final String f5482g;

    /* renamed from: h */
    public String f5483h;
    @NonNull

    /* renamed from: i */
    public final String f5484i;

    /* renamed from: j */
    public String f5485j;

    /* renamed from: k */
    public String f5486k;

    /* renamed from: m */
    public boolean f5488m;

    /* renamed from: n */
    public String f5489n;

    /* renamed from: o */
    public final C2250a f5490o = new C2250a();

    /* renamed from: l */
    public int f5487l = 1;

    /* renamed from: com.adcolony.sdk.q$a */
    /* loaded from: classes.dex */
    public class C2250a implements C2232o6.InterfaceRunnableC2233a {

        /* renamed from: a */
        public boolean f5491a;

        public C2250a() {
        }

        @Override // com.adcolony.sdk.C2232o6.InterfaceRunnableC2233a
        /* renamed from: a */
        public final boolean mo9518a() {
            return this.f5491a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                if (this.f5491a) {
                    return;
                }
                this.f5491a = true;
                if (!C2201m0.m9586f()) {
                    return;
                }
                C2058b3 m9588d = C2201m0.m9588d();
                if (m9588d.f4962D.f5701a) {
                    m9588d.m9695h();
                }
                StringBuilder sb = new StringBuilder("Ad show failed due to a native timeout (5000 ms). ");
                sb.append("Interstitial with adSessionId(" + C2249q.this.f5482g + "). ");
                sb.append("Reloading controller.");
                C1169e.m11129c(sb.toString(), 0, 0, true);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.q$b */
    /* loaded from: classes.dex */
    public class RunnableC2251b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2317u f5493a;

        public RunnableC2251b(AbstractC2317u abstractC2317u) {
            this.f5493a = abstractC2317u;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5493a.onExpiring(C2249q.this);
        }
    }

    /* renamed from: com.adcolony.sdk.q$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2252c {
    }

    public C2249q(String str, @NonNull AbstractC2317u abstractC2317u, @NonNull String str2) {
        this.f5476a = abstractC2317u;
        this.f5484i = str2;
        this.f5482g = str;
    }

    /* renamed from: a */
    public final void m9521a() {
        InterfaceC2252c interfaceC2252c;
        synchronized (this) {
            this.f5487l = 6;
            interfaceC2252c = this.f5477b;
            if (interfaceC2252c != null) {
                this.f5477b = null;
            } else {
                interfaceC2252c = null;
            }
        }
        if (interfaceC2252c != null) {
            C2058b3 c2058b3 = ((C2101e3) interfaceC2252c).f5099a;
            int i = c2058b3.f4981W - 1;
            c2058b3.f4981W = i;
            if (i == 0) {
                c2058b3.m9701b();
            }
        }
    }

    /* renamed from: b */
    public final boolean m9520b() {
        this.f5487l = 4;
        AbstractC2317u abstractC2317u = this.f5476a;
        if (abstractC2317u == null) {
            return false;
        }
        C2232o6.m9548o(new RunnableC2251b(abstractC2317u));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9519c() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2249q.m9519c():void");
    }
}
