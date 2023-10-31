package com.vungle.warren.tasks;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.work.C1828a;
import com.google.gson.C8695r;
import com.vungle.warren.AdLoader;
import com.vungle.warren.C9846m1;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.C9879m;
import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.persistence.CallableC9952p;
import com.vungle.warren.persistence.FutureC9926f;
import com.vungle.warren.persistence.InterfaceC9923d;
import com.vungle.warren.utility.C10089k;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: com.vungle.warren.tasks.b */
/* loaded from: classes3.dex */
public final class C9979b implements Job {

    /* renamed from: d */
    public static final /* synthetic */ int f20063d = 0;

    /* renamed from: a */
    public final InterfaceC9923d f20064a;

    /* renamed from: b */
    public final C9928h f20065b;

    /* renamed from: c */
    public final AdLoader f20066c;

    public C9979b(@NonNull InterfaceC9923d interfaceC9923d, @NonNull C9928h c9928h, @NonNull AdLoader adLoader) {
        this.f20064a = interfaceC9923d;
        this.f20065b = c9928h;
        this.f20066c = adLoader;
    }

    @Override // com.vungle.warren.tasks.Job
    /* renamed from: a */
    public final int mo1357a(Bundle bundle, InterfaceC9982e interfaceC9982e) {
        C9928h c9928h;
        int i = 1;
        InterfaceC9923d interfaceC9923d = this.f20064a;
        if (interfaceC9923d == null || (c9928h = this.f20065b) == null) {
            return 1;
        }
        Log.d("com.vungle.warren.tasks.b", "CleanupJob: Current directory snapshot");
        interfaceC9923d.mo1399e();
        List<Class<?>> list = C10089k.f20313a;
        File[] listFiles = interfaceC9923d.mo1399e().listFiles();
        List<Placement> list2 = (List) c9928h.m1382q(Placement.class).get();
        char c = 0;
        if (list2 == null || list2.size() == 0) {
            return 0;
        }
        Collection<Placement> collection = c9928h.m1378u().get();
        HashSet hashSet = new HashSet();
        try {
            try {
                for (Placement placement : list2) {
                    try {
                        if (collection != null && !collection.isEmpty() && !collection.contains(placement)) {
                            Locale locale = Locale.ENGLISH;
                            Object[] objArr = new Object[i];
                            objArr[c] = placement.f19769a;
                            Log.d("com.vungle.warren.tasks.b", String.format(locale, "Placement %s is no longer valid, deleting it and its advertisement", objArr));
                            c9928h.m1393f(placement);
                        } else {
                            List<String> list3 = (List) new FutureC9926f(c9928h.f19930b.submit(new CallableC9952p(c9928h, placement.f19769a))).get();
                            if (list3 != null) {
                                for (String str : list3) {
                                    Advertisement advertisement = (Advertisement) c9928h.m1383p(Advertisement.class, str).get();
                                    if (advertisement != null) {
                                        if (advertisement.f19740e * 1000 <= System.currentTimeMillis() && advertisement.f19725M != 2) {
                                            c9928h.m1392g(str);
                                            C9846m1 m1477b = C9846m1.m1477b();
                                            C8695r c8695r = new C8695r();
                                            c8695r.m3215u("event", C0539e.m12265a(6));
                                            c8695r.m3215u(C1828a.m9909a(4), str);
                                            m1477b.m1474e(new C9879m(6, c8695r));
                                            this.f20066c.m1636m(placement, placement.m1460a(), 1000L, false);
                                        } else {
                                            hashSet.add(advertisement.getId());
                                            Log.w("com.vungle.warren.tasks.b", "setting valid adv " + str + " for placement " + placement.f19769a);
                                        }
                                    }
                                }
                            }
                        }
                        i = 1;
                        c = 0;
                    } catch (C9919c.C9920a unused) {
                        return 1;
                    }
                }
                List<Advertisement> list4 = (List) c9928h.m1382q(Advertisement.class).get();
                if (list4 != null) {
                    for (Advertisement advertisement2 : list4) {
                        if (advertisement2.f19725M == 2) {
                            hashSet.add(advertisement2.getId());
                            Log.d("com.vungle.warren.tasks.b", "found adv in viewing state " + advertisement2.getId());
                        } else if (!hashSet.contains(advertisement2.getId())) {
                            Log.e("com.vungle.warren.tasks.b", "    delete ad " + advertisement2.getId());
                            c9928h.m1392g(advertisement2.getId());
                        }
                    }
                }
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (!hashSet.contains(file.getName())) {
                            Log.v("com.vungle.warren.tasks.b", String.format(Locale.ENGLISH, "Deleting assets under directory %s", file.getName()));
                            C10089k.m1268b(file);
                        }
                    }
                    return 0;
                }
                return 0;
            } catch (IOException e) {
                Log.e("com.vungle.warren.tasks.b", "Failed to delete asset directory!", e);
            }
        } catch (C9919c.C9920a unused2) {
            return 1;
        }
    }
}
