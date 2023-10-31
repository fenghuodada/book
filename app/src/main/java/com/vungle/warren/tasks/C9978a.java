package com.vungle.warren.tasks;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.mediastore.C3468a;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8686j;
import com.google.gson.C8695r;
import com.google.gson.internal.bind.C8648a;
import com.vungle.warren.AdConfig;
import com.vungle.warren.AdLoader;
import com.vungle.warren.AdRequest;
import com.vungle.warren.C9964r;
import com.vungle.warren.InterfaceC10136z;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.model.Placement;
import com.vungle.warren.network.C9901e;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.vungle.warren.tasks.a */
/* loaded from: classes3.dex */
public final class C9978a implements Job {

    /* renamed from: d */
    public static final String[] f20059d = new String[0];

    /* renamed from: a */
    public final VungleApiClient f20060a;

    /* renamed from: b */
    public final C9928h f20061b;

    /* renamed from: c */
    public final AdLoader f20062c;

    public C9978a(@NonNull VungleApiClient vungleApiClient, @NonNull C9928h c9928h, AdLoader adLoader) {
        this.f20060a = vungleApiClient;
        this.f20061b = c9928h;
        this.f20062c = adLoader;
    }

    @Override // com.vungle.warren.tasks.Job
    /* renamed from: a */
    public final int mo1357a(Bundle bundle, InterfaceC9982e interfaceC9982e) {
        C9928h c9928h;
        String str;
        Log.i("com.vungle.warren.tasks.a", "CacheBustJob started");
        VungleApiClient vungleApiClient = this.f20060a;
        if (vungleApiClient != null && (c9928h = this.f20061b) != null) {
            try {
                C9867g c9867g = (C9867g) c9928h.m1383p(C9867g.class, "cacheBustSettings").get();
                if (c9867g == null) {
                    c9867g = new C9867g("cacheBustSettings");
                }
                C9867g c9867g2 = c9867g;
                C9901e m1432a = vungleApiClient.m1619a(c9867g2.m1447b("last_cache_bust").longValue()).m1432a();
                ArrayList arrayList = new ArrayList();
                ArrayList m1384o = c9928h.m1384o();
                if (!m1384o.isEmpty()) {
                    arrayList.addAll(m1384o);
                }
                C8686j c8686j = new C8686j();
                if (m1432a.m1430a()) {
                    C8695r c8695r = (C8695r) m1432a.f19883b;
                    if (c8695r != null && c8695r.m3219A("cache_bust")) {
                        C8695r m3211z = c8695r.m3211z("cache_bust");
                        if (m3211z.m3219A("last_updated") && m3211z.m3213w("last_updated").mo3203o() > 0) {
                            c9867g2.m1445d(Long.valueOf(m3211z.m3213w("last_updated").mo3203o()), "last_cache_bust");
                            c9928h.m1376w(c9867g2);
                        }
                        m1360b(m3211z, "campaign_ids", 1, "cannot save campaignBust=", arrayList, c8686j);
                        m1360b(m3211z, "creative_ids", 2, "cannot save creativeBust=", arrayList, c8686j);
                    }
                    Log.e("com.vungle.warren.tasks.a", "CacheBustJob finished - no jsonObject or cache_bust in it");
                    return 1;
                }
                m1359c(arrayList);
                m1358d(bundle, c9867g2);
                List<CacheBust> list = (List) c9928h.m1382q(CacheBust.class).get();
                if (list != null && list.size() != 0) {
                    LinkedList<CacheBust> linkedList = new LinkedList();
                    for (CacheBust cacheBust : list) {
                        if (cacheBust.m1463c() != 0) {
                            linkedList.add(cacheBust);
                        }
                    }
                    if (linkedList.isEmpty()) {
                        str = "sendAnalytics: no cachebusts to send analytics";
                    } else {
                        try {
                            C9901e m1432a2 = vungleApiClient.m1607m(linkedList).m1432a();
                            if (m1432a2.m1430a()) {
                                for (CacheBust cacheBust2 : linkedList) {
                                    try {
                                        c9928h.m1393f(cacheBust2);
                                    } catch (C9919c.C9920a unused) {
                                        VungleLogger.m1603c(C9964r.class.getSimpleName() + "#sendAnalytics", "can't delete bust \" + cacheBust");
                                    }
                                }
                            } else {
                                Log.e("com.vungle.warren.tasks.a", "sendAnalytics: not successful, aborting, response is " + m1432a2);
                            }
                        } catch (IOException e) {
                            Log.e("com.vungle.warren.tasks.a", "sendAnalytics: can't execute API call", e);
                        }
                        Log.d("com.vungle.warren.tasks.a", "CacheBustJob finished");
                        return 2;
                    }
                } else {
                    str = "sendAnalytics: no cachebusts in repository";
                }
                Log.d("com.vungle.warren.tasks.a", str);
                Log.d("com.vungle.warren.tasks.a", "CacheBustJob finished");
                return 2;
            } catch (C9919c.C9920a e2) {
                Log.e("com.vungle.warren.tasks.a", "CacheBustJob failed - DBException", e2);
                return 2;
            } catch (IOException e3) {
                Log.e("com.vungle.warren.tasks.a", "CacheBustJob failed - IOException", e3);
                return 2;
            }
        }
        Log.e("com.vungle.warren.tasks.a", "CacheBustJob finished - no client or repository");
        return 1;
    }

    /* renamed from: b */
    public final void m1360b(C8695r c8695r, String str, int i, String str2, ArrayList arrayList, C8686j c8686j) {
        Object m3236b;
        if (c8695r.m3219A(str)) {
            Iterator<AbstractC8692o> it = c8695r.m3212y(str).iterator();
            while (it.hasNext()) {
                AbstractC8692o next = it.next();
                if (next == null) {
                    m3236b = null;
                } else {
                    m3236b = c8686j.m3236b(new C8648a(next), CacheBust.class);
                }
                CacheBust cacheBust = (CacheBust) C3468a.m6719a(CacheBust.class).cast(m3236b);
                cacheBust.m1462d(cacheBust.m1464b() * 1000);
                cacheBust.f19766c = i;
                arrayList.add(cacheBust);
                try {
                    this.f20061b.m1376w(cacheBust);
                } catch (C9919c.C9920a unused) {
                    String concat = C9978a.class.getSimpleName().concat("#onRunJob");
                    VungleLogger.m1603c(concat, str2 + cacheBust);
                }
            }
        }
    }

    /* renamed from: c */
    public final void m1359c(ArrayList arrayList) {
        ArrayList arrayList2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CacheBust cacheBust = (CacheBust) it.next();
            int i = cacheBust.f19766c;
            C9928h c9928h = this.f20061b;
            if (i == 1) {
                String m1465a = cacheBust.m1465a();
                c9928h.getClass();
                HashSet hashSet = new HashSet(Collections.singletonList(m1465a));
                HashSet hashSet2 = new HashSet();
                for (Advertisement advertisement : c9928h.m1379t(Advertisement.class)) {
                    if (hashSet.contains(advertisement.m1472b())) {
                        hashSet2.add(advertisement);
                    }
                }
                arrayList2 = new ArrayList(hashSet2);
            } else {
                String m1465a2 = cacheBust.m1465a();
                c9928h.getClass();
                HashSet hashSet3 = new HashSet(Collections.singletonList(m1465a2));
                HashSet hashSet4 = new HashSet();
                for (Advertisement advertisement2 : c9928h.m1379t(Advertisement.class)) {
                    if (hashSet3.contains(advertisement2.m1471c())) {
                        hashSet4.add(advertisement2);
                    }
                }
                arrayList2 = new ArrayList(hashSet4);
            }
            LinkedList linkedList = new LinkedList();
            LinkedList<Advertisement> linkedList2 = new LinkedList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean z = false;
                if (!it2.hasNext()) {
                    break;
                }
                Advertisement advertisement3 = (Advertisement) it2.next();
                if (advertisement3.f19732T < cacheBust.m1464b()) {
                    int i2 = advertisement3.f19725M;
                    if (i2 != 2 && i2 != 3) {
                        z = true;
                    }
                    if (z) {
                        linkedList.add(advertisement3.getId());
                        linkedList2.add(advertisement3);
                    }
                }
            }
            if (linkedList.isEmpty()) {
                Log.d("com.vungle.warren.tasks.a", "processBust: bust has no relevant ads, deleting " + cacheBust);
                try {
                    c9928h.m1393f(cacheBust);
                } catch (C9919c.C9920a e) {
                    VungleLogger.m1603c(C9978a.class.getSimpleName().concat("#processBust"), "Cannot delete obsolete bust " + cacheBust + " because of " + e);
                }
            } else {
                cacheBust.f19767d = (String[]) linkedList.toArray(f20059d);
                for (Advertisement advertisement4 : linkedList2) {
                    AdLoader adLoader = this.f20062c;
                    try {
                        Log.d("com.vungle.warren.tasks.a", "bustAd: deleting " + advertisement4.getId());
                        adLoader.m1645d(advertisement4.getId());
                        c9928h.m1392g(advertisement4.getId());
                        Placement placement = (Placement) c9928h.m1383p(Placement.class, advertisement4.f19726N).get();
                        if (placement != null) {
                            new AdConfig().m1423c(placement.m1460a());
                            if (placement.m1458c()) {
                                this.f20062c.m1636m(placement, placement.m1460a(), 0L, false);
                            } else if (placement.m1459b()) {
                                adLoader.m1637l(new AdLoader.C9718f(new AdRequest(placement.f19769a, null, false), placement.m1460a(), 0L, 2000L, 5, 1, 0, false, placement.f19774f, new InterfaceC10136z[0]));
                            }
                        }
                        cacheBust.m1461e(System.currentTimeMillis());
                        c9928h.m1376w(cacheBust);
                    } catch (C9919c.C9920a e2) {
                        Log.e("com.vungle.warren.tasks.a", "bustAd: cannot drop cache or delete advertisement for " + advertisement4, e2);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void m1358d(Bundle bundle, C9867g c9867g) throws C9919c.C9920a {
        long j = bundle.getLong("cache_bust_interval");
        if (j != 0) {
            c9867g.m1445d(Long.valueOf(SystemClock.elapsedRealtime() + j), "next_cache_bust");
        }
        this.f20061b.m1376w(c9867g);
    }
}
