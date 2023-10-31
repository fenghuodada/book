package com.google.gson.internal.bind;

import com.google.gson.AbstractC8576a0;
import com.google.gson.C8703x;
import com.google.gson.EnumC8579c;
import com.google.gson.InterfaceC8578b0;
import com.google.gson.InterfaceC8586d;
import com.google.gson.internal.C8658f;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.InterfaceC8676o;
import com.google.gson.internal.reflect.AbstractC8681b;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements InterfaceC8578b0 {

    /* renamed from: a */
    public final C8658f f16354a;

    /* renamed from: b */
    public final InterfaceC8586d f16355b;

    /* renamed from: c */
    public final Excluder f16356c;

    /* renamed from: d */
    public final JsonAdapterAnnotationTypeAdapterFactory f16357d;

    /* renamed from: e */
    public final AbstractC8681b f16358e = AbstractC8681b.f16485a;

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    /* loaded from: classes3.dex */
    public static final class C8604a<T> extends AbstractC8576a0<T> {

        /* renamed from: a */
        public final InterfaceC8676o<T> f16359a;

        /* renamed from: b */
        public final Map<String, AbstractC8605b> f16360b;

        public C8604a(InterfaceC8676o interfaceC8676o, LinkedHashMap linkedHashMap) {
            this.f16359a = interfaceC8676o;
            this.f16360b = linkedHashMap;
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final T mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T mo3242a = this.f16359a.mo3242a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    AbstractC8605b abstractC8605b = this.f16360b.get(jsonReader.nextName());
                    if (abstractC8605b != null && abstractC8605b.f16363c) {
                        abstractC8605b.mo3257a(jsonReader, mo3242a);
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return mo3242a;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new C8703x(e2);
            }
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (AbstractC8605b abstractC8605b : this.f16360b.values()) {
                    if (abstractC8605b.mo3255c(t)) {
                        jsonWriter.name(abstractC8605b.f16361a);
                        abstractC8605b.mo3256b(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8605b {

        /* renamed from: a */
        public final String f16361a;

        /* renamed from: b */
        public final boolean f16362b;

        /* renamed from: c */
        public final boolean f16363c;

        public AbstractC8605b(String str, boolean z, boolean z2) {
            this.f16361a = str;
            this.f16362b = z;
            this.f16363c = z2;
        }

        /* renamed from: a */
        public abstract void mo3257a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: b */
        public abstract void mo3256b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: c */
        public abstract boolean mo3255c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(C8658f c8658f, EnumC8579c.C8580a c8580a, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f16354a = c8658f;
        this.f16355b = c8580a;
        this.f16356c = excluder;
        this.f16357d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    @Override // com.google.gson.InterfaceC8578b0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> com.google.gson.AbstractC8576a0<T> mo3267a(com.google.gson.C8686j r35, com.google.gson.reflect.C8696a<T> r36) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.mo3267a(com.google.gson.j, com.google.gson.reflect.a):com.google.gson.a0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
        if (r0 == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3272b(java.lang.reflect.Field r10, boolean r11) {
        /*
            r9 = this;
            java.lang.Class r0 = r10.getType()
            com.google.gson.internal.Excluder r1 = r9.f16356c
            boolean r2 = r1.m3284b(r0)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L17
            boolean r0 = r1.m3283c(r0, r11)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = r3
            goto L18
        L17:
            r0 = r4
        L18:
            if (r0 != 0) goto Lb5
            int r0 = r10.getModifiers()
            int r2 = r1.f16319b
            r0 = r0 & r2
            if (r0 == 0) goto L25
            goto Laf
        L25:
            double r5 = r1.f16318a
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L45
            java.lang.Class<com.google.gson.annotations.Since> r0 = com.google.gson.annotations.Since.class
            java.lang.annotation.Annotation r0 = r10.getAnnotation(r0)
            com.google.gson.annotations.Since r0 = (com.google.gson.annotations.Since) r0
            java.lang.Class<com.google.gson.annotations.Until> r2 = com.google.gson.annotations.Until.class
            java.lang.annotation.Annotation r2 = r10.getAnnotation(r2)
            com.google.gson.annotations.Until r2 = (com.google.gson.annotations.Until) r2
            boolean r0 = r1.m3282d(r0, r2)
            if (r0 != 0) goto L45
            goto Laf
        L45:
            boolean r0 = r10.isSynthetic()
            if (r0 == 0) goto L4d
            goto Laf
        L4d:
            boolean r0 = r1.f16320c
            if (r0 != 0) goto L6e
            java.lang.Class r0 = r10.getType()
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L6a
            int r0 = r0.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L65
            r0 = r4
            goto L66
        L65:
            r0 = r3
        L66:
            if (r0 != 0) goto L6a
            r0 = r4
            goto L6b
        L6a:
            r0 = r3
        L6b:
            if (r0 == 0) goto L6e
            goto Laf
        L6e:
            java.lang.Class r10 = r10.getType()
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 != 0) goto L88
            boolean r0 = r10.isAnonymousClass()
            if (r0 != 0) goto L86
            boolean r10 = r10.isLocalClass()
            if (r10 == 0) goto L88
        L86:
            r10 = r4
            goto L89
        L88:
            r10 = r3
        L89:
            if (r10 == 0) goto L8c
            goto Laf
        L8c:
            if (r11 == 0) goto L91
            java.util.List<com.google.gson.b> r10 = r1.f16321d
            goto L93
        L91:
            java.util.List<com.google.gson.b> r10 = r1.f16322e
        L93:
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto Lb1
            java.util.Iterator r10 = r10.iterator()
        L9d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb1
            java.lang.Object r11 = r10.next()
            com.google.gson.b r11 = (com.google.gson.InterfaceC8577b) r11
            boolean r11 = r11.m3288b()
            if (r11 == 0) goto L9d
        Laf:
            r10 = r4
            goto Lb2
        Lb1:
            r10 = r3
        Lb2:
            if (r10 != 0) goto Lb5
            r3 = r4
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.m3272b(java.lang.reflect.Field, boolean):boolean");
    }
}
