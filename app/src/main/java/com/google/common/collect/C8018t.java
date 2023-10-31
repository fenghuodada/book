package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractC8021u;
import com.google.common.collect.AbstractC8028w;
import com.google.common.collect.C7986l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@GwtCompatible(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.t */
/* loaded from: classes3.dex */
public class C8018t<K, V> extends AbstractC8028w<K, V> {

    /* renamed from: com.google.common.collect.t$a */
    /* loaded from: classes3.dex */
    public static final class C8019a<K, V> extends AbstractC8028w.C8029a<K, V> {
        /* renamed from: a */
        public final C8018t<K, V> m4235a() {
            Set<Map.Entry<K, V>> entrySet = this.f15837a.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                return C7999o.f15788f;
            }
            C7986l.C7987a c7987a = (C7986l.C7987a) entrySet;
            AbstractC8021u.C8022a c8022a = new AbstractC8021u.C8022a(C7986l.this.f15766h);
            Iterator<Map.Entry<K, V>> it = c7987a.iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                K key = next.getKey();
                AbstractC8013s m4246p = AbstractC8013s.m4246p((Collection) next.getValue());
                if (!m4246p.isEmpty()) {
                    c8022a.m4228b(key, m4246p);
                    i += m4246p.size();
                }
            }
            return new C8018t<>(c8022a.m4229a(), i);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final void m4234b(Object[] objArr, String str) {
            List asList = Arrays.asList(objArr);
            C7986l c7986l = this.f15837a;
            Collection collection = (Collection) c7986l.get(str);
            Iterator it = asList.iterator();
            if (collection != null) {
                while (it.hasNext()) {
                    Object next = it.next();
                    C7978h.m4266a(str, next);
                    collection.add(next);
                }
            } else if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    C7978h.m4266a(str, next2);
                    arrayList.add(next2);
                }
                c7986l.put(str, arrayList);
            }
        }
    }

    public C8018t(C8000o0 c8000o0, int i) {
        super(c8000o0, i);
    }

    /* renamed from: f */
    public static <K, V> C8019a<K, V> m4236f() {
        return new C8019a<>();
    }
}
