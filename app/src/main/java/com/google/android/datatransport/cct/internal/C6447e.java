package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AbstractC6454k;

/* renamed from: com.google.android.datatransport.cct.internal.e */
/* loaded from: classes.dex */
public final class C6447e extends AbstractC6454k {

    /* renamed from: a */
    public final AbstractC6454k.EnumC6455a f10130a;

    /* renamed from: b */
    public final AbstractC6437a f10131b;

    public C6447e(AbstractC6454k.EnumC6455a enumC6455a, AbstractC6437a abstractC6437a) {
        this.f10130a = enumC6455a;
        this.f10131b = abstractC6437a;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6454k
    @Nullable
    /* renamed from: a */
    public final AbstractC6437a mo6336a() {
        return this.f10131b;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6454k
    @Nullable
    /* renamed from: b */
    public final AbstractC6454k.EnumC6455a mo6335b() {
        return this.f10130a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6454k) {
            AbstractC6454k abstractC6454k = (AbstractC6454k) obj;
            AbstractC6454k.EnumC6455a enumC6455a = this.f10130a;
            if (enumC6455a != null ? enumC6455a.equals(abstractC6454k.mo6335b()) : abstractC6454k.mo6335b() == null) {
                AbstractC6437a abstractC6437a = this.f10131b;
                AbstractC6437a mo6336a = abstractC6454k.mo6336a();
                if (abstractC6437a == null) {
                    if (mo6336a == null) {
                        return true;
                    }
                } else if (abstractC6437a.equals(mo6336a)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        AbstractC6454k.EnumC6455a enumC6455a = this.f10130a;
        int hashCode = ((enumC6455a == null ? 0 : enumC6455a.hashCode()) ^ 1000003) * 1000003;
        AbstractC6437a abstractC6437a = this.f10131b;
        return (abstractC6437a != null ? abstractC6437a.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f10130a + ", androidClientInfo=" + this.f10131b + "}";
    }
}
