package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.p031c.C3109b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.i */
/* loaded from: classes.dex */
public class C3265i<T> extends C3245c {

    /* renamed from: a */
    private String f8617a;

    /* renamed from: b */
    private boolean f8618b;

    /* renamed from: com.applovin.impl.sdk.network.i$a */
    /* loaded from: classes.dex */
    public static class C3266a<T> extends C3245c.C3246a<T> {

        /* renamed from: o */
        private String f8619o;

        /* renamed from: p */
        private boolean f8620p;

        public C3266a(C3214m c3214m) {
            super(c3214m);
            this.f8535h = ((Integer) c3214m.m7456a(C3109b.f7909cI)).intValue();
            this.f8536i = ((Integer) c3214m.m7456a(C3109b.f7908cH)).intValue();
            this.f8537j = ((Integer) c3214m.m7456a(C3109b.f7914cN)).intValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: a */
        public /* synthetic */ C3245c.C3246a mo7187a(Object obj) {
            return m7180b((C3266a<T>) obj);
        }

        /* renamed from: b */
        public C3266a m7180b(T t) {
            this.f8534g = t;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: b */
        public C3266a mo7184a(JSONObject jSONObject) {
            this.f8533f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: b */
        public C3265i<T> mo7190a() {
            return new C3265i<>(this);
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: c */
        public C3266a mo7185a(Map<String, String> map) {
            this.f8531d = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: d */
        public C3266a mo7189a(int i) {
            this.f8535h = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: d */
        public C3266a mo7186a(String str) {
            this.f8529b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: d */
        public C3266a mo7178b(Map<String, String> map) {
            this.f8532e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: e */
        public C3266a mo7182b(int i) {
            this.f8536i = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: e */
        public C3266a mo7175c(String str) {
            this.f8530c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: e */
        public C3266a mo7173c(boolean z) {
            this.f8540m = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: f */
        public C3266a mo7176c(int i) {
            this.f8537j = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: f */
        public C3266a mo7179b(String str) {
            this.f8528a = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C3245c.C3246a
        /* renamed from: f */
        public C3266a mo7169d(boolean z) {
            this.f8541n = z;
            return this;
        }

        /* renamed from: g */
        public C3266a m7162g(String str) {
            this.f8619o = str;
            return this;
        }

        /* renamed from: g */
        public C3266a m7161g(boolean z) {
            this.f8620p = z;
            return this;
        }
    }

    public C3265i(C3266a c3266a) {
        super(c3266a);
        this.f8617a = c3266a.f8619o;
        this.f8618b = c3266a.f8620p;
    }

    /* renamed from: b */
    public static C3266a m7194b(C3214m c3214m) {
        return new C3266a(c3214m);
    }

    /* renamed from: p */
    public boolean m7193p() {
        return this.f8617a != null;
    }

    /* renamed from: q */
    public String m7192q() {
        return this.f8617a;
    }

    /* renamed from: r */
    public boolean m7191r() {
        return this.f8618b;
    }
}
