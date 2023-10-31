package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.AbstractC6488j;
import com.google.android.datatransport.runtime.backends.InterfaceC6482d;
import com.google.android.datatransport.runtime.backends.InterfaceC6494o;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC6482d {
    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6482d
    public InterfaceC6494o create(AbstractC6488j abstractC6488j) {
        return new C6433c(abstractC6488j.mo6308a(), abstractC6488j.mo6305d(), abstractC6488j.mo6306c());
    }
}
