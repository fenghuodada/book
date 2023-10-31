package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C1627k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public final class RunnableC1620d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f3884a;

    /* renamed from: b */
    public final /* synthetic */ C1627k f3885b;

    public RunnableC1620d(C1627k c1627k, ArrayList arrayList) {
        this.f3885b = c1627k;
        this.f3884a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        ArrayList arrayList = this.f3884a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C1627k c1627k = this.f3885b;
            if (hasNext) {
                C1627k.C1628a c1628a = (C1627k.C1628a) it.next();
                c1627k.getClass();
                RecyclerView.AbstractC1597y abstractC1597y = c1628a.f3922a;
                View view2 = null;
                if (abstractC1597y == null) {
                    view = null;
                } else {
                    view = abstractC1597y.itemView;
                }
                RecyclerView.AbstractC1597y abstractC1597y2 = c1628a.f3923b;
                if (abstractC1597y2 != null) {
                    view2 = abstractC1597y2.itemView;
                }
                ArrayList<RecyclerView.AbstractC1597y> arrayList2 = c1627k.f3921r;
                long j = c1627k.f3712f;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(j);
                    arrayList2.add(c1628a.f3922a);
                    duration.translationX(c1628a.f3926e - c1628a.f3924c);
                    duration.translationY(c1628a.f3927f - c1628a.f3925d);
                    duration.alpha(0.0f).setListener(new C1625i(c1627k, c1628a, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    arrayList2.add(c1628a.f3923b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C1626j(c1627k, c1628a, animate, view2)).start();
                }
            } else {
                arrayList.clear();
                c1627k.f3917n.remove(arrayList);
                return;
            }
        }
    }
}
