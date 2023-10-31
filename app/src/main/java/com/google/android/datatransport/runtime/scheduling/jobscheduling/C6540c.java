package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import androidx.activity.result.C0063d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6544f;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
/* loaded from: classes.dex */
public final class C6540c extends AbstractC6544f.AbstractC6545a {

    /* renamed from: a */
    public final long f10318a;

    /* renamed from: b */
    public final long f10319b;

    /* renamed from: c */
    public final Set<AbstractC6544f.EnumC6547b> f10320c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a */
    /* loaded from: classes.dex */
    public static final class C6541a extends AbstractC6544f.AbstractC6545a.AbstractC6546a {

        /* renamed from: a */
        public Long f10321a;

        /* renamed from: b */
        public Long f10322b;

        /* renamed from: c */
        public Set<AbstractC6544f.EnumC6547b> f10323c;

        /* renamed from: a */
        public final C6540c m6267a() {
            String str;
            if (this.f10321a == null) {
                str = " delta";
            } else {
                str = "";
            }
            if (this.f10322b == null) {
                str = str.concat(" maxAllowedDelay");
            }
            if (this.f10323c == null) {
                str = C0063d.m13053a(str, " flags");
            }
            if (str.isEmpty()) {
                return new C6540c(this.f10321a.longValue(), this.f10322b.longValue(), this.f10323c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public C6540c(long j, long j2, Set set) {
        this.f10318a = j;
        this.f10319b = j2;
        this.f10320c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6544f.AbstractC6545a
    /* renamed from: a */
    public final long mo6263a() {
        return this.f10318a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6544f.AbstractC6545a
    /* renamed from: b */
    public final Set<AbstractC6544f.EnumC6547b> mo6262b() {
        return this.f10320c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6544f.AbstractC6545a
    /* renamed from: c */
    public final long mo6261c() {
        return this.f10319b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6544f.AbstractC6545a) {
            AbstractC6544f.AbstractC6545a abstractC6545a = (AbstractC6544f.AbstractC6545a) obj;
            return this.f10318a == abstractC6545a.mo6263a() && this.f10319b == abstractC6545a.mo6261c() && this.f10320c.equals(abstractC6545a.mo6262b());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10318a;
        long j2 = this.f10319b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f10320c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f10318a + ", maxAllowedDelay=" + this.f10319b + ", flags=" + this.f10320c + "}";
    }
}
