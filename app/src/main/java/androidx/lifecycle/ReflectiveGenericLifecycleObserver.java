package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1448b;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC1479k {

    /* renamed from: a */
    public final Object f3400a;

    /* renamed from: b */
    public final C1448b.C1449a f3401b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3400a = obj;
        this.f3401b = C1448b.f3413c.m10565b(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1479k
    public final void onStateChanged(@NonNull InterfaceC1483m interfaceC1483m, @NonNull AbstractC1464h.EnumC1465a enumC1465a) {
        HashMap hashMap = this.f3401b.f3416a;
        Object obj = this.f3400a;
        C1448b.C1449a.m10563a((List) hashMap.get(enumC1465a), interfaceC1483m, enumC1465a, obj);
        C1448b.C1449a.m10563a((List) hashMap.get(AbstractC1464h.EnumC1465a.ON_ANY), interfaceC1483m, enumC1465a, obj);
    }
}
