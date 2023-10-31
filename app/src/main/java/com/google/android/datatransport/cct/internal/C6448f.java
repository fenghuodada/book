package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AbstractC6456l;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.cct.internal.f */
/* loaded from: classes.dex */
public final class C6448f extends AbstractC6456l {

    /* renamed from: a */
    public final long f10132a;

    /* renamed from: b */
    public final Integer f10133b;

    /* renamed from: c */
    public final long f10134c;

    /* renamed from: d */
    public final byte[] f10135d;

    /* renamed from: e */
    public final String f10136e;

    /* renamed from: f */
    public final long f10137f;

    /* renamed from: g */
    public final AbstractC6460o f10138g;

    /* renamed from: com.google.android.datatransport.cct.internal.f$a */
    /* loaded from: classes.dex */
    public static final class C6449a extends AbstractC6456l.AbstractC6457a {

        /* renamed from: a */
        public Long f10139a;

        /* renamed from: b */
        public Integer f10140b;

        /* renamed from: c */
        public Long f10141c;

        /* renamed from: d */
        public byte[] f10142d;

        /* renamed from: e */
        public String f10143e;

        /* renamed from: f */
        public Long f10144f;

        /* renamed from: g */
        public AbstractC6460o f10145g;
    }

    public C6448f(long j, Integer num, long j2, byte[] bArr, String str, long j3, AbstractC6460o abstractC6460o) {
        this.f10132a = j;
        this.f10133b = num;
        this.f10134c = j2;
        this.f10135d = bArr;
        this.f10136e = str;
        this.f10137f = j3;
        this.f10138g = abstractC6460o;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6456l
    @Nullable
    /* renamed from: a */
    public final Integer mo6334a() {
        return this.f10133b;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6456l
    /* renamed from: b */
    public final long mo6333b() {
        return this.f10132a;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6456l
    /* renamed from: c */
    public final long mo6332c() {
        return this.f10134c;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6456l
    @Nullable
    /* renamed from: d */
    public final AbstractC6460o mo6331d() {
        return this.f10138g;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6456l
    @Nullable
    /* renamed from: e */
    public final byte[] mo6330e() {
        return this.f10135d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6456l) {
            AbstractC6456l abstractC6456l = (AbstractC6456l) obj;
            if (this.f10132a == abstractC6456l.mo6333b() && ((num = this.f10133b) != null ? num.equals(abstractC6456l.mo6334a()) : abstractC6456l.mo6334a() == null) && this.f10134c == abstractC6456l.mo6332c()) {
                if (Arrays.equals(this.f10135d, abstractC6456l instanceof C6448f ? ((C6448f) abstractC6456l).f10135d : abstractC6456l.mo6330e()) && ((str = this.f10136e) != null ? str.equals(abstractC6456l.mo6329f()) : abstractC6456l.mo6329f() == null) && this.f10137f == abstractC6456l.mo6328g()) {
                    AbstractC6460o abstractC6460o = this.f10138g;
                    AbstractC6460o mo6331d = abstractC6456l.mo6331d();
                    if (abstractC6460o == null) {
                        if (mo6331d == null) {
                            return true;
                        }
                    } else if (abstractC6460o.equals(mo6331d)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6456l
    @Nullable
    /* renamed from: f */
    public final String mo6329f() {
        return this.f10136e;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6456l
    /* renamed from: g */
    public final long mo6328g() {
        return this.f10137f;
    }

    public final int hashCode() {
        long j = this.f10132a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f10133b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f10134c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f10135d)) * 1000003;
        String str = this.f10136e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f10137f;
        int i2 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        AbstractC6460o abstractC6460o = this.f10138g;
        return i2 ^ (abstractC6460o != null ? abstractC6460o.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f10132a + ", eventCode=" + this.f10133b + ", eventUptimeMs=" + this.f10134c + ", sourceExtension=" + Arrays.toString(this.f10135d) + ", sourceExtensionJsonProto3=" + this.f10136e + ", timezoneOffsetSeconds=" + this.f10137f + ", networkConnectionInfo=" + this.f10138g + "}";
    }
}
