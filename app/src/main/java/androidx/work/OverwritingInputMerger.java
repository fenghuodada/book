package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.C1837f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC1841i {
    @Override // androidx.work.AbstractC1841i
    @NonNull
    /* renamed from: a */
    public final C1837f mo9901a(@NonNull ArrayList arrayList) {
        C1837f.C1838a c1838a = new C1837f.C1838a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((C1837f) it.next()).f4459a));
        }
        c1838a.m9902a(hashMap);
        C1837f c1837f = new C1837f(c1838a.f4460a);
        C1837f.m9903b(c1837f);
        return c1837f;
    }
}
