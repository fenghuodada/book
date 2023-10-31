package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.C0484a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.model.j */
/* loaded from: classes.dex */
public final class C3617j implements InterfaceC3615h {

    /* renamed from: b */
    public final Map<String, List<InterfaceC3616i>> f9550b;

    /* renamed from: c */
    public volatile Map<String, String> f9551c;

    /* renamed from: com.bumptech.glide.load.model.j$a */
    /* loaded from: classes.dex */
    public static final class C3618a {

        /* renamed from: b */
        public static final Map<String, List<InterfaceC3616i>> f9552b;

        /* renamed from: a */
        public final Map<String, List<InterfaceC3616i>> f9553a = f9552b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                        charAt = '?';
                    }
                    sb.append(charAt);
                }
                property = sb.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new C3619b(property)));
            }
            f9552b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.j$b */
    /* loaded from: classes.dex */
    public static final class C3619b implements InterfaceC3616i {
        @NonNull

        /* renamed from: a */
        public final String f9554a;

        public C3619b(@NonNull String str) {
            this.f9554a = str;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3616i
        /* renamed from: a */
        public final String mo6594a() {
            return this.f9554a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C3619b) {
                return this.f9554a.equals(((C3619b) obj).f9554a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f9554a.hashCode();
        }

        public final String toString() {
            return C0484a.m12392a(new StringBuilder("StringHeaderFactory{value='"), this.f9554a, "'}");
        }
    }

    public C3617j(Map<String, List<InterfaceC3616i>> map) {
        this.f9550b = Collections.unmodifiableMap(map);
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3615h
    /* renamed from: a */
    public final Map<String, String> mo6596a() {
        if (this.f9551c == null) {
            synchronized (this) {
                if (this.f9551c == null) {
                    this.f9551c = Collections.unmodifiableMap(m6595b());
                }
            }
        }
        return this.f9551c;
    }

    /* renamed from: b */
    public final HashMap m6595b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<InterfaceC3616i>> entry : this.f9550b.entrySet()) {
            List<InterfaceC3616i> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String mo6594a = value.get(i).mo6594a();
                if (!TextUtils.isEmpty(mo6594a)) {
                    sb.append(mo6594a);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3617j) {
            return this.f9550b.equals(((C3617j) obj).f9550b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9550b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f9550b + '}';
    }
}
