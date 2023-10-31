package com.google.gson.internal;

import com.google.gson.AbstractC8576a0;
import com.google.gson.C8686j;
import com.google.gson.InterfaceC8577b;
import com.google.gson.InterfaceC8578b0;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Excluder implements InterfaceC8578b0, Cloneable {

    /* renamed from: f */
    public static final Excluder f16317f = new Excluder();

    /* renamed from: a */
    public final double f16318a = -1.0d;

    /* renamed from: b */
    public final int f16319b = 136;

    /* renamed from: c */
    public final boolean f16320c = true;

    /* renamed from: d */
    public final List<InterfaceC8577b> f16321d = Collections.emptyList();

    /* renamed from: e */
    public final List<InterfaceC8577b> f16322e = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.Excluder$a */
    /* loaded from: classes3.dex */
    public class C8592a<T> extends AbstractC8576a0<T> {

        /* renamed from: a */
        public AbstractC8576a0<T> f16323a;

        /* renamed from: b */
        public final /* synthetic */ boolean f16324b;

        /* renamed from: c */
        public final /* synthetic */ boolean f16325c;

        /* renamed from: d */
        public final /* synthetic */ C8686j f16326d;

        /* renamed from: e */
        public final /* synthetic */ C8696a f16327e;

        public C8592a(boolean z, boolean z2, C8686j c8686j, C8696a c8696a) {
            this.f16324b = z;
            this.f16325c = z2;
            this.f16326d = c8686j;
            this.f16327e = c8696a;
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final T mo3199a(JsonReader jsonReader) throws IOException {
            if (this.f16324b) {
                jsonReader.skipValue();
                return null;
            }
            AbstractC8576a0<T> abstractC8576a0 = this.f16323a;
            if (abstractC8576a0 == null) {
                abstractC8576a0 = this.f16326d.m3232f(Excluder.this, this.f16327e);
                this.f16323a = abstractC8576a0;
            }
            return abstractC8576a0.mo3199a(jsonReader);
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, T t) throws IOException {
            if (this.f16325c) {
                jsonWriter.nullValue();
                return;
            }
            AbstractC8576a0<T> abstractC8576a0 = this.f16323a;
            if (abstractC8576a0 == null) {
                abstractC8576a0 = this.f16326d.m3232f(Excluder.this, this.f16327e);
                this.f16323a = abstractC8576a0;
            }
            abstractC8576a0.mo3198b(jsonWriter, t);
        }
    }

    @Override // com.google.gson.InterfaceC8578b0
    /* renamed from: a */
    public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
        Class<? super T> rawType = c8696a.getRawType();
        boolean m3284b = m3284b(rawType);
        boolean z = m3284b || m3283c(rawType, true);
        boolean z2 = m3284b || m3283c(rawType, false);
        if (z || z2) {
            return new C8592a(z2, z, c8686j, c8696a);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[RETURN] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3284b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            double r0 = r4.f16318a
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L20
            java.lang.Class<com.google.gson.annotations.Since> r0 = com.google.gson.annotations.Since.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            com.google.gson.annotations.Since r0 = (com.google.gson.annotations.Since) r0
            java.lang.Class<com.google.gson.annotations.Until> r2 = com.google.gson.annotations.Until.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)
            com.google.gson.annotations.Until r2 = (com.google.gson.annotations.Until) r2
            boolean r0 = r4.m3282d(r0, r2)
            if (r0 != 0) goto L20
            return r1
        L20:
            boolean r0 = r4.f16320c
            r2 = 0
            if (r0 != 0) goto L3e
            boolean r0 = r5.isMemberClass()
            if (r0 == 0) goto L3a
            int r0 = r5.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L35
            r0 = r1
            goto L36
        L35:
            r0 = r2
        L36:
            if (r0 != 0) goto L3a
            r0 = r1
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 == 0) goto L3e
            return r1
        L3e:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 != 0) goto L54
            boolean r0 = r5.isAnonymousClass()
            if (r0 != 0) goto L52
            boolean r5 = r5.isLocalClass()
            if (r5 == 0) goto L54
        L52:
            r5 = r1
            goto L55
        L54:
            r5 = r2
        L55:
            if (r5 == 0) goto L58
            return r1
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.m3284b(java.lang.Class):boolean");
    }

    /* renamed from: c */
    public final boolean m3283c(Class<?> cls, boolean z) {
        for (InterfaceC8577b interfaceC8577b : z ? this.f16321d : this.f16322e) {
            if (interfaceC8577b.m3289a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final boolean m3282d(Since since, Until until) {
        boolean z;
        boolean z2;
        double d = this.f16318a;
        if (since != null && since.value() > d) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (until != null && until.value() <= d) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        return true;
    }
}
