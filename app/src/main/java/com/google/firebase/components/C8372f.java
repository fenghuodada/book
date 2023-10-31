package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

/* renamed from: com.google.firebase.components.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8372f {
    /* renamed from: a */
    public static Object m3387a(ComponentContainer componentContainer, Qualified qualified) {
        Provider provider = componentContainer.getProvider(qualified);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }

    /* renamed from: b */
    public static Object m3386b(ComponentContainer componentContainer, Class cls) {
        return componentContainer.get(Qualified.unqualified(cls));
    }

    /* renamed from: c */
    public static Deferred m3385c(ComponentContainer componentContainer, Class cls) {
        return componentContainer.getDeferred(Qualified.unqualified(cls));
    }

    /* renamed from: d */
    public static Provider m3384d(ComponentContainer componentContainer, Class cls) {
        return componentContainer.getProvider(Qualified.unqualified(cls));
    }

    /* renamed from: e */
    public static Set m3383e(ComponentContainer componentContainer, Qualified qualified) {
        return (Set) componentContainer.setOfProvider(qualified).get();
    }

    /* renamed from: f */
    public static Set m3382f(ComponentContainer componentContainer, Class cls) {
        return componentContainer.setOf(Qualified.unqualified(cls));
    }

    /* renamed from: g */
    public static Provider m3381g(ComponentContainer componentContainer, Class cls) {
        return componentContainer.setOfProvider(Qualified.unqualified(cls));
    }
}
