package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.EnumC6464d;
import com.google.android.datatransport.runtime.AbstractC6522n;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.d */
/* loaded from: classes.dex */
public final class C6496d extends AbstractC6522n {

    /* renamed from: a */
    public final String f10228a;

    /* renamed from: b */
    public final byte[] f10229b;

    /* renamed from: c */
    public final EnumC6464d f10230c;

    /* renamed from: com.google.android.datatransport.runtime.d$a */
    /* loaded from: classes.dex */
    public static final class C6497a extends AbstractC6522n.AbstractC6523a {

        /* renamed from: a */
        public String f10231a;

        /* renamed from: b */
        public byte[] f10232b;

        /* renamed from: c */
        public EnumC6464d f10233c;

        /* renamed from: a */
        public final C6496d m6301a() {
            String str = this.f10231a == null ? " backendName" : "";
            if (this.f10233c == null) {
                str = str.concat(" priority");
            }
            if (str.isEmpty()) {
                return new C6496d(this.f10231a, this.f10232b, this.f10233c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        /* renamed from: b */
        public final C6497a m6300b(String str) {
            if (str != null) {
                this.f10231a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: c */
        public final C6497a m6299c(EnumC6464d enumC6464d) {
            if (enumC6464d != null) {
                this.f10233c = enumC6464d;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public C6496d(String str, byte[] bArr, EnumC6464d enumC6464d) {
        this.f10228a = str;
        this.f10229b = bArr;
        this.f10230c = enumC6464d;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6522n
    /* renamed from: b */
    public final String mo6277b() {
        return this.f10228a;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6522n
    @Nullable
    /* renamed from: c */
    public final byte[] mo6276c() {
        return this.f10229b;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6522n
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: d */
    public final EnumC6464d mo6275d() {
        return this.f10230c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6522n) {
            AbstractC6522n abstractC6522n = (AbstractC6522n) obj;
            if (this.f10228a.equals(abstractC6522n.mo6277b())) {
                if (Arrays.equals(this.f10229b, abstractC6522n instanceof C6496d ? ((C6496d) abstractC6522n).f10229b : abstractC6522n.mo6276c()) && this.f10230c.equals(abstractC6522n.mo6275d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10228a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10229b)) * 1000003) ^ this.f10230c.hashCode();
    }
}
