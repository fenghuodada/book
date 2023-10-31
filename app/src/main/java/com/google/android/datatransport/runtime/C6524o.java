package com.google.android.datatransport.runtime;

import com.google.android.datatransport.C6429b;
import com.google.android.datatransport.InterfaceC6465e;
import com.google.android.datatransport.InterfaceC6467g;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.o */
/* loaded from: classes.dex */
public final class C6524o implements InterfaceC6467g {

    /* renamed from: a */
    public final Set<C6429b> f10278a;

    /* renamed from: b */
    public final AbstractC6522n f10279b;

    /* renamed from: c */
    public final InterfaceC6526q f10280c;

    public C6524o(Set set, C6496d c6496d, InterfaceC6526q interfaceC6526q) {
        this.f10278a = set;
        this.f10279b = c6496d;
        this.f10280c = interfaceC6526q;
    }

    @Override // com.google.android.datatransport.InterfaceC6467g
    /* renamed from: a */
    public final C6525p mo6273a(String str, C6429b c6429b, InterfaceC6465e interfaceC6465e) {
        Set<C6429b> set = this.f10278a;
        if (set.contains(c6429b)) {
            return new C6525p(this.f10279b, str, c6429b, interfaceC6465e, this.f10280c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c6429b, set));
    }
}
