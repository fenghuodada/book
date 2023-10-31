package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C1627k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public final class RunnableC1619c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f3882a;

    /* renamed from: b */
    public final /* synthetic */ C1627k f3883b;

    public RunnableC1619c(C1627k c1627k, ArrayList arrayList) {
        this.f3883b = c1627k;
        this.f3882a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f3882a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C1627k c1627k = this.f3883b;
            if (hasNext) {
                C1627k.C1629b c1629b = (C1627k.C1629b) it.next();
                RecyclerView.AbstractC1597y abstractC1597y = c1629b.f3928a;
                c1627k.getClass();
                View view = abstractC1597y.itemView;
                int i = c1629b.f3931d - c1629b.f3929b;
                int i2 = c1629b.f3932e - c1629b.f3930c;
                if (i != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i2 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                c1627k.f3919p.add(abstractC1597y);
                animate.setDuration(c1627k.f3711e).setListener(new C1624h(c1627k, abstractC1597y, i, view, i2, animate)).start();
            } else {
                arrayList.clear();
                c1627k.f3916m.remove(arrayList);
                return;
            }
        }
    }
}
