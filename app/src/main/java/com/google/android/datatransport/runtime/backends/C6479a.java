package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.AbstractC6512h;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
/* loaded from: classes.dex */
public final class C6479a extends AbstractC6485g {

    /* renamed from: a */
    public final Iterable<AbstractC6512h> f10202a;

    /* renamed from: b */
    public final byte[] f10203b;

    public C6479a() {
        throw null;
    }

    public C6479a(Iterable iterable, byte[] bArr) {
        this.f10202a = iterable;
        this.f10203b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6485g
    /* renamed from: a */
    public final Iterable<AbstractC6512h> mo6313a() {
        return this.f10202a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6485g
    @Nullable
    /* renamed from: b */
    public final byte[] mo6312b() {
        return this.f10203b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6485g) {
            AbstractC6485g abstractC6485g = (AbstractC6485g) obj;
            if (this.f10202a.equals(abstractC6485g.mo6313a())) {
                if (Arrays.equals(this.f10203b, abstractC6485g instanceof C6479a ? ((C6479a) abstractC6485g).f10203b : abstractC6485g.mo6312b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10202a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10203b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f10202a + ", extras=" + Arrays.toString(this.f10203b) + "}";
    }
}
