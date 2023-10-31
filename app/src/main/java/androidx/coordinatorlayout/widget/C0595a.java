package androidx.coordinatorlayout.widget;

import androidx.annotation.RestrictTo;
import androidx.collection.C0482i;
import androidx.core.util.C0802f;
import java.util.ArrayList;
import java.util.HashSet;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: classes.dex */
public final class C0595a<T> {

    /* renamed from: a */
    public final C0802f f2232a = new C0802f(10);

    /* renamed from: b */
    public final C0482i<T, ArrayList<T>> f2233b = new C0482i<>();

    /* renamed from: c */
    public final ArrayList<T> f2234c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f2235d = new HashSet<>();

    /* renamed from: a */
    public final void m12107a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> orDefault = this.f2233b.getOrDefault(t, null);
            if (orDefault != null) {
                int size = orDefault.size();
                for (int i = 0; i < size; i++) {
                    m12107a(orDefault.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
