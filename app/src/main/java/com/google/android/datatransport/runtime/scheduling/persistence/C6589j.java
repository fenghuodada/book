package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.j */
/* loaded from: classes.dex */
public final class C6589j implements InterfaceC6499b<AbstractC6576e> {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.j$a */
    /* loaded from: classes.dex */
    public static final class C6590a {

        /* renamed from: a */
        public static final C6589j f10421a = new C6589j();
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        C6566a c6566a = AbstractC6576e.f10409a;
        if (c6566a != null) {
            return c6566a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
