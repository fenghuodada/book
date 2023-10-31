package com.google.android.datatransport.runtime;

import androidx.activity.result.C0063d;
import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.AbstractC6512h;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.b */
/* loaded from: classes.dex */
public final class C6477b extends AbstractC6512h {

    /* renamed from: a */
    public final String f10190a;

    /* renamed from: b */
    public final Integer f10191b;

    /* renamed from: c */
    public final C6511g f10192c;

    /* renamed from: d */
    public final long f10193d;

    /* renamed from: e */
    public final long f10194e;

    /* renamed from: f */
    public final Map<String, String> f10195f;

    /* renamed from: com.google.android.datatransport.runtime.b$a */
    /* loaded from: classes.dex */
    public static final class C6478a extends AbstractC6512h.AbstractC6513a {

        /* renamed from: a */
        public String f10196a;

        /* renamed from: b */
        public Integer f10197b;

        /* renamed from: c */
        public C6511g f10198c;

        /* renamed from: d */
        public Long f10199d;

        /* renamed from: e */
        public Long f10200e;

        /* renamed from: f */
        public Map<String, String> f10201f;

        /* renamed from: b */
        public final C6477b m6316b() {
            String str;
            if (this.f10196a == null) {
                str = " transportName";
            } else {
                str = "";
            }
            if (this.f10198c == null) {
                str = str.concat(" encodedPayload");
            }
            if (this.f10199d == null) {
                str = C0063d.m13053a(str, " eventMillis");
            }
            if (this.f10200e == null) {
                str = C0063d.m13053a(str, " uptimeMillis");
            }
            if (this.f10201f == null) {
                str = C0063d.m13053a(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new C6477b(this.f10196a, this.f10197b, this.f10198c, this.f10199d.longValue(), this.f10200e.longValue(), this.f10201f);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        /* renamed from: c */
        public final C6478a m6315c(C6511g c6511g) {
            if (c6511g != null) {
                this.f10198c = c6511g;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: d */
        public final C6478a m6314d(String str) {
            if (str != null) {
                this.f10196a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public C6477b(String str, Integer num, C6511g c6511g, long j, long j2, Map map) {
        this.f10190a = str;
        this.f10191b = num;
        this.f10192c = c6511g;
        this.f10193d = j;
        this.f10194e = j2;
        this.f10195f = map;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6512h
    /* renamed from: b */
    public final Map<String, String> mo6296b() {
        return this.f10195f;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6512h
    @Nullable
    /* renamed from: c */
    public final Integer mo6295c() {
        return this.f10191b;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6512h
    /* renamed from: d */
    public final C6511g mo6294d() {
        return this.f10192c;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6512h
    /* renamed from: e */
    public final long mo6293e() {
        return this.f10193d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6512h) {
            AbstractC6512h abstractC6512h = (AbstractC6512h) obj;
            return this.f10190a.equals(abstractC6512h.mo6291g()) && ((num = this.f10191b) != null ? num.equals(abstractC6512h.mo6295c()) : abstractC6512h.mo6295c() == null) && this.f10192c.equals(abstractC6512h.mo6294d()) && this.f10193d == abstractC6512h.mo6293e() && this.f10194e == abstractC6512h.mo6290h() && this.f10195f.equals(abstractC6512h.mo6296b());
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6512h
    /* renamed from: g */
    public final String mo6291g() {
        return this.f10190a;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6512h
    /* renamed from: h */
    public final long mo6290h() {
        return this.f10194e;
    }

    public final int hashCode() {
        int hashCode = (this.f10190a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f10191b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f10193d;
        long j2 = this.f10194e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f10192c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f10195f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f10190a + ", code=" + this.f10191b + ", encodedPayload=" + this.f10192c + ", eventMillis=" + this.f10193d + ", uptimeMillis=" + this.f10194e + ", autoMetadata=" + this.f10195f + "}";
    }
}
