package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AbstractC6460o;

/* renamed from: com.google.android.datatransport.cct.internal.i */
/* loaded from: classes.dex */
public final class C6452i extends AbstractC6460o {

    /* renamed from: a */
    public final AbstractC6460o.EnumC6462b f10154a;

    /* renamed from: b */
    public final AbstractC6460o.EnumC6461a f10155b;

    public C6452i(AbstractC6460o.EnumC6462b enumC6462b, AbstractC6460o.EnumC6461a enumC6461a) {
        this.f10154a = enumC6462b;
        this.f10155b = enumC6461a;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6460o
    @Nullable
    /* renamed from: a */
    public final AbstractC6460o.EnumC6461a mo6318a() {
        return this.f10155b;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6460o
    @Nullable
    /* renamed from: b */
    public final AbstractC6460o.EnumC6462b mo6317b() {
        return this.f10154a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6460o) {
            AbstractC6460o abstractC6460o = (AbstractC6460o) obj;
            AbstractC6460o.EnumC6462b enumC6462b = this.f10154a;
            if (enumC6462b != null ? enumC6462b.equals(abstractC6460o.mo6317b()) : abstractC6460o.mo6317b() == null) {
                AbstractC6460o.EnumC6461a enumC6461a = this.f10155b;
                AbstractC6460o.EnumC6461a mo6318a = abstractC6460o.mo6318a();
                if (enumC6461a == null) {
                    if (mo6318a == null) {
                        return true;
                    }
                } else if (enumC6461a.equals(mo6318a)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        AbstractC6460o.EnumC6462b enumC6462b = this.f10154a;
        int hashCode = ((enumC6462b == null ? 0 : enumC6462b.hashCode()) ^ 1000003) * 1000003;
        AbstractC6460o.EnumC6461a enumC6461a = this.f10155b;
        return (enumC6461a != null ? enumC6461a.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f10154a + ", mobileSubtype=" + this.f10155b + "}";
    }
}
