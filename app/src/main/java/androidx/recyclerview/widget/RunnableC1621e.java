package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public final class RunnableC1621e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f3886a;

    /* renamed from: b */
    public final /* synthetic */ C1627k f3887b;

    public RunnableC1621e(C1627k c1627k, ArrayList arrayList) {
        this.f3887b = c1627k;
        this.f3886a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f3886a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C1627k c1627k = this.f3887b;
            if (hasNext) {
                RecyclerView.AbstractC1597y abstractC1597y = (RecyclerView.AbstractC1597y) it.next();
                c1627k.getClass();
                View view = abstractC1597y.itemView;
                ViewPropertyAnimator animate = view.animate();
                c1627k.f3918o.add(abstractC1597y);
                animate.alpha(1.0f).setDuration(c1627k.f3709c).setListener(new C1623g(view, animate, c1627k, abstractC1597y)).start();
            } else {
                arrayList.clear();
                c1627k.f3915l.remove(arrayList);
                return;
            }
        }
    }
}
