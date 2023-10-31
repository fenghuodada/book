package com.google.android.datatransport;

import androidx.annotation.Nullable;

/* renamed from: com.google.android.datatransport.a */
/* loaded from: classes.dex */
public final class C6428a<T> extends AbstractC6430c<T> {

    /* renamed from: a */
    public final Integer f10056a = null;

    /* renamed from: b */
    public final T f10057b;

    /* renamed from: c */
    public final EnumC6464d f10058c;

    /* JADX WARN: Multi-variable type inference failed */
    public C6428a(Object obj, EnumC6464d enumC6464d) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f10057b = obj;
        this.f10058c = enumC6464d;
    }

    @Override // com.google.android.datatransport.AbstractC6430c
    @Nullable
    /* renamed from: a */
    public final Integer mo6356a() {
        return this.f10056a;
    }

    @Override // com.google.android.datatransport.AbstractC6430c
    /* renamed from: b */
    public final T mo6355b() {
        return this.f10057b;
    }

    @Override // com.google.android.datatransport.AbstractC6430c
    /* renamed from: c */
    public final EnumC6464d mo6354c() {
        return this.f10058c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6430c) {
            AbstractC6430c abstractC6430c = (AbstractC6430c) obj;
            Integer num = this.f10056a;
            if (num != null ? num.equals(abstractC6430c.mo6356a()) : abstractC6430c.mo6356a() == null) {
                if (this.f10057b.equals(abstractC6430c.mo6355b()) && this.f10058c.equals(abstractC6430c.mo6354c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f10056a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f10057b.hashCode()) * 1000003) ^ this.f10058c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f10056a + ", payload=" + this.f10057b + ", priority=" + this.f10058c + "}";
    }
}
