package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.C0450b;
import java.util.HashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.arch.core.internal.a */
/* loaded from: classes.dex */
public final class C0449a<K, V> extends C0450b<K, V> {

    /* renamed from: e */
    public final HashMap<K, C0450b.C0453c<K, V>> f1444e = new HashMap<>();

    @Override // androidx.arch.core.internal.C0450b
    @Nullable
    /* renamed from: a */
    public final C0450b.C0453c<K, V> mo12446a(K k) {
        return this.f1444e.get(k);
    }

    @Override // androidx.arch.core.internal.C0450b
    /* renamed from: b */
    public final V mo12445b(@NonNull K k, @NonNull V v) {
        C0450b.C0453c<K, V> mo12446a = mo12446a(k);
        if (mo12446a != null) {
            return mo12446a.f1450b;
        }
        HashMap<K, C0450b.C0453c<K, V>> hashMap = this.f1444e;
        C0450b.C0453c<K, V> c0453c = new C0450b.C0453c<>(k, v);
        this.f1448d++;
        C0450b.C0453c<K, V> c0453c2 = this.f1446b;
        if (c0453c2 == null) {
            this.f1445a = c0453c;
        } else {
            c0453c2.f1451c = c0453c;
            c0453c.f1452d = c0453c2;
        }
        this.f1446b = c0453c;
        hashMap.put(k, c0453c);
        return null;
    }

    @Override // androidx.arch.core.internal.C0450b
    /* renamed from: i */
    public final V mo12444i(@NonNull K k) {
        V v = (V) super.mo12444i(k);
        this.f1444e.remove(k);
        return v;
    }
}
