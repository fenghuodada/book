package com.vungle.warren;

import android.util.Log;
import com.vungle.warren.model.C9879m;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.vungle.warren.l1 */
/* loaded from: classes3.dex */
public final class RunnableC9826l1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f19619a;

    /* renamed from: b */
    public final /* synthetic */ C9928h f19620b;

    /* renamed from: c */
    public final /* synthetic */ C9846m1 f19621c;

    public RunnableC9826l1(C9846m1 c9846m1, boolean z, C9928h c9928h) {
        this.f19621c = c9846m1;
        this.f19619a = z;
        this.f19620b = c9928h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9846m1 c9846m1 = this.f19621c;
        if (!c9846m1.f19688f.isEmpty() && this.f19619a) {
            for (C9879m c9879m : c9846m1.f19688f) {
                c9846m1.m1474e(c9879m);
            }
        }
        c9846m1.f19688f.clear();
        int i = c9846m1.f19692j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (List) this.f19620b.m1382q(C9879m.class).get()) {
            arrayList2.add(obj);
            if (arrayList2.size() == i) {
                arrayList.add(arrayList2);
                arrayList2 = new ArrayList();
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            if (list.size() >= c9846m1.f19692j) {
                try {
                    C9846m1.m1478a(c9846m1, list);
                } catch (C9919c.C9920a e) {
                    C9846m1 c9846m12 = C9846m1.f19681o;
                    Log.e("m1", "Unable to retrieve data to send " + e.getLocalizedMessage());
                }
            } else {
                c9846m1.f19693k.set(list.size());
            }
        }
    }
}
