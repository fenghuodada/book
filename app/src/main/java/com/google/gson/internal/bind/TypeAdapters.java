package com.google.gson.internal.bind;

import com.google.gson.AbstractC8576a0;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8686j;
import com.google.gson.C8690m;
import com.google.gson.C8693p;
import com.google.gson.C8694q;
import com.google.gson.C8695r;
import com.google.gson.C8700u;
import com.google.gson.C8703x;
import com.google.gson.C8707z;
import com.google.gson.InterfaceC8578b0;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C8667m;
import com.google.gson.internal.C8668n;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public final class TypeAdapters {

    /* renamed from: A */
    public static final C8641t f16380A;

    /* renamed from: B */
    public static final InterfaceC8578b0 f16381B;

    /* renamed from: C */
    public static final InterfaceC8578b0 f16382C;

    /* renamed from: a */
    public static final InterfaceC8578b0 f16383a = new C861332(Class.class, new C8707z(new C8632k()));

    /* renamed from: b */
    public static final InterfaceC8578b0 f16384b = new C861332(BitSet.class, new C8707z(new C8642u()));

    /* renamed from: c */
    public static final C8645x f16385c;

    /* renamed from: d */
    public static final InterfaceC8578b0 f16386d;

    /* renamed from: e */
    public static final InterfaceC8578b0 f16387e;

    /* renamed from: f */
    public static final InterfaceC8578b0 f16388f;

    /* renamed from: g */
    public static final InterfaceC8578b0 f16389g;

    /* renamed from: h */
    public static final InterfaceC8578b0 f16390h;

    /* renamed from: i */
    public static final InterfaceC8578b0 f16391i;

    /* renamed from: j */
    public static final InterfaceC8578b0 f16392j;

    /* renamed from: k */
    public static final C8620b f16393k;

    /* renamed from: l */
    public static final InterfaceC8578b0 f16394l;

    /* renamed from: m */
    public static final InterfaceC8578b0 f16395m;

    /* renamed from: n */
    public static final C8629h f16396n;

    /* renamed from: o */
    public static final C8630i f16397o;

    /* renamed from: p */
    public static final InterfaceC8578b0 f16398p;

    /* renamed from: q */
    public static final InterfaceC8578b0 f16399q;

    /* renamed from: r */
    public static final InterfaceC8578b0 f16400r;

    /* renamed from: s */
    public static final InterfaceC8578b0 f16401s;

    /* renamed from: t */
    public static final InterfaceC8578b0 f16402t;

    /* renamed from: u */
    public static final InterfaceC8578b0 f16403u;

    /* renamed from: v */
    public static final InterfaceC8578b0 f16404v;

    /* renamed from: w */
    public static final InterfaceC8578b0 f16405w;

    /* renamed from: x */
    public static final InterfaceC8578b0 f16406x;

    /* renamed from: y */
    public static final InterfaceC8578b0 f16407y;

    /* renamed from: z */
    public static final InterfaceC8578b0 f16408z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32 */
    /* loaded from: classes3.dex */
    public class C861332 implements InterfaceC8578b0 {

        /* renamed from: a */
        public final /* synthetic */ Class f16412a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC8576a0 f16413b;

        public C861332(Class cls, AbstractC8576a0 abstractC8576a0) {
            this.f16412a = cls;
            this.f16413b = abstractC8576a0;
        }

        @Override // com.google.gson.InterfaceC8578b0
        /* renamed from: a */
        public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
            if (c8696a.getRawType() == this.f16412a) {
                return this.f16413b;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f16412a.getName() + ",adapter=" + this.f16413b + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$33 */
    /* loaded from: classes3.dex */
    public class C861433 implements InterfaceC8578b0 {

        /* renamed from: a */
        public final /* synthetic */ Class f16414a;

        /* renamed from: b */
        public final /* synthetic */ Class f16415b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC8576a0 f16416c;

        public C861433(Class cls, Class cls2, AbstractC8576a0 abstractC8576a0) {
            this.f16414a = cls;
            this.f16415b = cls2;
            this.f16416c = abstractC8576a0;
        }

        @Override // com.google.gson.InterfaceC8578b0
        /* renamed from: a */
        public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
            Class<? super T> rawType = c8696a.getRawType();
            if (rawType == this.f16414a || rawType == this.f16415b) {
                return this.f16416c;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f16415b.getName() + "+" + this.f16414a.getName() + ",adapter=" + this.f16416c + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$a */
    /* loaded from: classes3.dex */
    public class C8618a extends AbstractC8576a0<AtomicIntegerArray> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final AtomicIntegerArray mo3199a(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (NumberFormatException e) {
                    throw new C8703x(e);
                }
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            jsonWriter.beginArray();
            int length = atomicIntegerArray2.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value(atomicIntegerArray2.get(i));
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$a0 */
    /* loaded from: classes3.dex */
    public class C8619a0 extends AbstractC8576a0<Number> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Number mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new C8703x(e);
            }
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$b */
    /* loaded from: classes3.dex */
    public class C8620b extends AbstractC8576a0<Number> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Number mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e) {
                throw new C8703x(e);
            }
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$b0 */
    /* loaded from: classes3.dex */
    public class C8621b0 extends AbstractC8576a0<AtomicInteger> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final AtomicInteger mo3199a(JsonReader jsonReader) throws IOException {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new C8703x(e);
            }
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
            jsonWriter.value(atomicInteger.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$c */
    /* loaded from: classes3.dex */
    public class C8622c extends AbstractC8576a0<Number> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Number mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$c0 */
    /* loaded from: classes3.dex */
    public class C8623c0 extends AbstractC8576a0<AtomicBoolean> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final AtomicBoolean mo3199a(JsonReader jsonReader) throws IOException {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
            jsonWriter.value(atomicBoolean.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$d */
    /* loaded from: classes3.dex */
    public class C8624d extends AbstractC8576a0<Number> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Number mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$d0 */
    /* loaded from: classes3.dex */
    public static final class C8625d0<T extends Enum<T>> extends AbstractC8576a0<T> {

        /* renamed from: a */
        public final HashMap f16424a = new HashMap();

        /* renamed from: b */
        public final HashMap f16425b = new HashMap();

        public C8625d0(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    SerializedName serializedName = (SerializedName) cls.getField(name).getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        name = serializedName.value();
                        for (String str : serializedName.alternate()) {
                            this.f16424a.put(str, t);
                        }
                    }
                    this.f16424a.put(name, t);
                    this.f16425b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Object mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return (Enum) this.f16424a.get(jsonReader.nextString());
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            Enum r3 = (Enum) obj;
            if (r3 == null) {
                str = null;
            } else {
                str = (String) this.f16425b.get(r3);
            }
            jsonWriter.value(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$e */
    /* loaded from: classes3.dex */
    public class C8626e extends AbstractC8576a0<Number> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Number mo3199a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            int i = C8643v.f16426a[peek.ordinal()];
            if (i == 1 || i == 3) {
                return new C8667m(jsonReader.nextString());
            }
            if (i == 4) {
                jsonReader.nextNull();
                return null;
            }
            throw new C8703x("Expecting number, got: " + peek);
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$f */
    /* loaded from: classes3.dex */
    public class C8627f extends AbstractC8576a0<Character> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Character mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if (nextString.length() == 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new C8703x("Expecting character, got: ".concat(nextString));
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Character ch) throws IOException {
            String valueOf;
            Character ch2 = ch;
            if (ch2 == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(ch2);
            }
            jsonWriter.value(valueOf);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$g */
    /* loaded from: classes3.dex */
    public class C8628g extends AbstractC8576a0<String> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final String mo3199a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek != JsonToken.NULL) {
                return peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$h */
    /* loaded from: classes3.dex */
    public class C8629h extends AbstractC8576a0<BigDecimal> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final BigDecimal mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e) {
                throw new C8703x(e);
            }
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$i */
    /* loaded from: classes3.dex */
    public class C8630i extends AbstractC8576a0<BigInteger> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final BigInteger mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e) {
                throw new C8703x(e);
            }
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$j */
    /* loaded from: classes3.dex */
    public class C8631j extends AbstractC8576a0<StringBuilder> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final StringBuilder mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuilder(jsonReader.nextString());
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
            String sb2;
            StringBuilder sb3 = sb;
            if (sb3 == null) {
                sb2 = null;
            } else {
                sb2 = sb3.toString();
            }
            jsonWriter.value(sb2);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$k */
    /* loaded from: classes3.dex */
    public class C8632k extends AbstractC8576a0<Class> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Class mo3199a(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$l */
    /* loaded from: classes3.dex */
    public class C8633l extends AbstractC8576a0<StringBuffer> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final StringBuffer mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuffer(jsonReader.nextString());
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
            String stringBuffer2;
            StringBuffer stringBuffer3 = stringBuffer;
            if (stringBuffer3 == null) {
                stringBuffer2 = null;
            } else {
                stringBuffer2 = stringBuffer3.toString();
            }
            jsonWriter.value(stringBuffer2);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$m */
    /* loaded from: classes3.dex */
    public class C8634m extends AbstractC8576a0<URL> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final URL mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if ("null".equals(nextString)) {
                return null;
            }
            return new URL(nextString);
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, URL url) throws IOException {
            String externalForm;
            URL url2 = url;
            if (url2 == null) {
                externalForm = null;
            } else {
                externalForm = url2.toExternalForm();
            }
            jsonWriter.value(externalForm);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$n */
    /* loaded from: classes3.dex */
    public class C8635n extends AbstractC8576a0<URI> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final URI mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
            } else {
                try {
                    String nextString = jsonReader.nextString();
                    if (!"null".equals(nextString)) {
                        return new URI(nextString);
                    }
                } catch (URISyntaxException e) {
                    throw new C8693p(e);
                }
            }
            return null;
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, URI uri) throws IOException {
            String aSCIIString;
            URI uri2 = uri;
            if (uri2 == null) {
                aSCIIString = null;
            } else {
                aSCIIString = uri2.toASCIIString();
            }
            jsonWriter.value(aSCIIString);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$o */
    /* loaded from: classes3.dex */
    public class C8636o extends AbstractC8576a0<InetAddress> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final InetAddress mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return InetAddress.getByName(jsonReader.nextString());
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
            String hostAddress;
            InetAddress inetAddress2 = inetAddress;
            if (inetAddress2 == null) {
                hostAddress = null;
            } else {
                hostAddress = inetAddress2.getHostAddress();
            }
            jsonWriter.value(hostAddress);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$p */
    /* loaded from: classes3.dex */
    public class C8637p extends AbstractC8576a0<UUID> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final UUID mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return UUID.fromString(jsonReader.nextString());
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, UUID uuid) throws IOException {
            String uuid2;
            UUID uuid3 = uuid;
            if (uuid3 == null) {
                uuid2 = null;
            } else {
                uuid2 = uuid3.toString();
            }
            jsonWriter.value(uuid2);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$q */
    /* loaded from: classes3.dex */
    public class C8638q extends AbstractC8576a0<Currency> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Currency mo3199a(JsonReader jsonReader) throws IOException {
            return Currency.getInstance(jsonReader.nextString());
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Currency currency) throws IOException {
            jsonWriter.value(currency.getCurrencyCode());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$r */
    /* loaded from: classes3.dex */
    public class C8639r extends AbstractC8576a0<Calendar> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Calendar mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String nextName = jsonReader.nextName();
                int nextInt = jsonReader.nextInt();
                if ("year".equals(nextName)) {
                    i = nextInt;
                } else if ("month".equals(nextName)) {
                    i2 = nextInt;
                } else if ("dayOfMonth".equals(nextName)) {
                    i3 = nextInt;
                } else if ("hourOfDay".equals(nextName)) {
                    i4 = nextInt;
                } else if ("minute".equals(nextName)) {
                    i5 = nextInt;
                } else if ("second".equals(nextName)) {
                    i6 = nextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Calendar calendar) throws IOException {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("year");
            jsonWriter.value(calendar2.get(1));
            jsonWriter.name("month");
            jsonWriter.value(calendar2.get(2));
            jsonWriter.name("dayOfMonth");
            jsonWriter.value(calendar2.get(5));
            jsonWriter.name("hourOfDay");
            jsonWriter.value(calendar2.get(11));
            jsonWriter.name("minute");
            jsonWriter.value(calendar2.get(12));
            jsonWriter.name("second");
            jsonWriter.value(calendar2.get(13));
            jsonWriter.endObject();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$s */
    /* loaded from: classes3.dex */
    public class C8640s extends AbstractC8576a0<Locale> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Locale mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            return nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Locale locale) throws IOException {
            String locale2;
            Locale locale3 = locale;
            if (locale3 == null) {
                locale2 = null;
            } else {
                locale2 = locale3.toString();
            }
            jsonWriter.value(locale2);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$t */
    /* loaded from: classes3.dex */
    public class C8641t extends AbstractC8576a0<AbstractC8692o> {
        /* renamed from: c */
        public static AbstractC8692o m3266c(JsonReader jsonReader) throws IOException {
            switch (C8643v.f16426a[jsonReader.peek().ordinal()]) {
                case 1:
                    return new C8700u(new C8667m(jsonReader.nextString()));
                case 2:
                    return new C8700u(Boolean.valueOf(jsonReader.nextBoolean()));
                case 3:
                    return new C8700u(jsonReader.nextString());
                case 4:
                    jsonReader.nextNull();
                    return C8694q.f16515a;
                case 5:
                    C8690m c8690m = new C8690m();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c8690m.m3224r(m3266c(jsonReader));
                    }
                    jsonReader.endArray();
                    return c8690m;
                case 6:
                    C8695r c8695r = new C8695r();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        c8695r.m3218r(m3266c(jsonReader), jsonReader.nextName());
                    }
                    jsonReader.endObject();
                    return c8695r;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: d */
        public static void m3265d(AbstractC8692o abstractC8692o, JsonWriter jsonWriter) throws IOException {
            boolean z;
            if (abstractC8692o != null && !(abstractC8692o instanceof C8694q)) {
                boolean z2 = abstractC8692o instanceof C8700u;
                if (z2) {
                    if (z2) {
                        C8700u c8700u = (C8700u) abstractC8692o;
                        Serializable serializable = c8700u.f16518a;
                        if (serializable instanceof Number) {
                            jsonWriter.value(c8700u.m3201r());
                            return;
                        } else if (serializable instanceof Boolean) {
                            jsonWriter.value(c8700u.mo3207b());
                            return;
                        } else {
                            jsonWriter.value(c8700u.mo3202p());
                            return;
                        }
                    }
                    throw new IllegalStateException("Not a JSON Primitive: " + abstractC8692o);
                } else if (abstractC8692o instanceof C8690m) {
                    jsonWriter.beginArray();
                    Iterator<AbstractC8692o> it = abstractC8692o.m3221m().iterator();
                    while (it.hasNext()) {
                        m3265d(it.next(), jsonWriter);
                    }
                    jsonWriter.endArray();
                } else if (abstractC8692o instanceof C8695r) {
                    jsonWriter.beginObject();
                    C8668n c8668n = C8668n.this;
                    C8668n.C8675e c8675e = c8668n.f16464e.f16476d;
                    int i = c8668n.f16463d;
                    while (true) {
                        C8668n.C8675e c8675e2 = c8668n.f16464e;
                        if (c8675e != c8675e2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (c8675e != c8675e2) {
                                if (c8668n.f16463d == i) {
                                    C8668n.C8675e c8675e3 = c8675e.f16476d;
                                    jsonWriter.name((String) c8675e.f16478f);
                                    m3265d((AbstractC8692o) c8675e.f16479g, jsonWriter);
                                    c8675e = c8675e3;
                                } else {
                                    throw new ConcurrentModificationException();
                                }
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            jsonWriter.endObject();
                            return;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Couldn't write " + abstractC8692o.getClass());
                }
            } else {
                jsonWriter.nullValue();
            }
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC8692o mo3199a(JsonReader jsonReader) throws IOException {
            return m3266c(jsonReader);
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo3198b(JsonWriter jsonWriter, AbstractC8692o abstractC8692o) throws IOException {
            m3265d(abstractC8692o, jsonWriter);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$u */
    /* loaded from: classes3.dex */
    public class C8642u extends AbstractC8576a0<BitSet> {
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
            if (r8.nextInt() != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
            r5 = false;
         */
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.BitSet mo3199a(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.beginArray()
                com.google.gson.stream.JsonToken r1 = r8.peek()
                r2 = 0
                r3 = r2
            Le:
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r4) goto L67
                int[] r4 = com.google.gson.internal.bind.TypeAdapters.C8643v.f16426a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L53
                r6 = 2
                if (r4 == r6) goto L4e
                r6 = 3
                if (r4 != r6) goto L3a
                java.lang.String r1 = r8.nextString()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L2e
                if (r1 == 0) goto L5a
                goto L5b
            L2e:
                com.google.gson.x r8 = new com.google.gson.x
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = androidx.constraintlayout.motion.widget.C0552c.m12192b(r0, r1)
                r8.<init>(r0)
                throw r8
            L3a:
                com.google.gson.x r8 = new com.google.gson.x
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid bitset value type: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L4e:
                boolean r5 = r8.nextBoolean()
                goto L5b
            L53:
                int r1 = r8.nextInt()
                if (r1 == 0) goto L5a
                goto L5b
            L5a:
                r5 = r2
            L5b:
                if (r5 == 0) goto L60
                r0.set(r3)
            L60:
                int r3 = r3 + 1
                com.google.gson.stream.JsonToken r1 = r8.peek()
                goto Le
            L67:
                r8.endArray()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C8642u.mo3199a(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            jsonWriter.beginArray();
            int length = bitSet2.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value(bitSet2.get(i) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$v */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C8643v {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16426a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f16426a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16426a[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16426a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16426a[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16426a[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16426a[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16426a[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16426a[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16426a[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16426a[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$w */
    /* loaded from: classes3.dex */
    public class C8644w extends AbstractC8576a0<Boolean> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Boolean mo3199a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek != JsonToken.NULL) {
                return Boolean.valueOf(peek == JsonToken.STRING ? Boolean.parseBoolean(jsonReader.nextString()) : jsonReader.nextBoolean());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$x */
    /* loaded from: classes3.dex */
    public class C8645x extends AbstractC8576a0<Boolean> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Boolean mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Boolean.valueOf(jsonReader.nextString());
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Boolean bool) throws IOException {
            String bool2;
            Boolean bool3 = bool;
            if (bool3 == null) {
                bool2 = "null";
            } else {
                bool2 = bool3.toString();
            }
            jsonWriter.value(bool2);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$y */
    /* loaded from: classes3.dex */
    public class C8646y extends AbstractC8576a0<Number> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Number mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new C8703x(e);
            }
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$z */
    /* loaded from: classes3.dex */
    public class C8647z extends AbstractC8576a0<Number> {
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Number mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new C8703x(e);
            }
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    static {
        C8644w c8644w = new C8644w();
        f16385c = new C8645x();
        f16386d = new C861433(Boolean.TYPE, Boolean.class, c8644w);
        f16387e = new C861433(Byte.TYPE, Byte.class, new C8646y());
        f16388f = new C861433(Short.TYPE, Short.class, new C8647z());
        f16389g = new C861433(Integer.TYPE, Integer.class, new C8619a0());
        f16390h = new C861332(AtomicInteger.class, new C8707z(new C8621b0()));
        f16391i = new C861332(AtomicBoolean.class, new C8707z(new C8623c0()));
        f16392j = new C861332(AtomicIntegerArray.class, new C8707z(new C8618a()));
        f16393k = new C8620b();
        new C8622c();
        new C8624d();
        f16394l = new C861332(Number.class, new C8626e());
        f16395m = new C861433(Character.TYPE, Character.class, new C8627f());
        C8628g c8628g = new C8628g();
        f16396n = new C8629h();
        f16397o = new C8630i();
        f16398p = new C861332(String.class, c8628g);
        f16399q = new C861332(StringBuilder.class, new C8631j());
        f16400r = new C861332(StringBuffer.class, new C8633l());
        f16401s = new C861332(URL.class, new C8634m());
        f16402t = new C861332(URI.class, new C8635n());
        final C8636o c8636o = new C8636o();
        f16403u = new InterfaceC8578b0() { // from class: com.google.gson.internal.bind.TypeAdapters.35

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$35$a */
            /* loaded from: classes3.dex */
            public class C8617a extends AbstractC8576a0<Object> {

                /* renamed from: a */
                public final /* synthetic */ Class f16422a;

                public C8617a(Class cls) {
                    this.f16422a = cls;
                }

                @Override // com.google.gson.AbstractC8576a0
                /* renamed from: a */
                public final Object mo3199a(JsonReader jsonReader) throws IOException {
                    Object mo3199a = c8636o.mo3199a(jsonReader);
                    if (mo3199a != null) {
                        Class cls = this.f16422a;
                        if (!cls.isInstance(mo3199a)) {
                            throw new C8703x("Expected a " + cls.getName() + " but was " + mo3199a.getClass().getName());
                        }
                    }
                    return mo3199a;
                }

                @Override // com.google.gson.AbstractC8576a0
                /* renamed from: b */
                public final void mo3198b(JsonWriter jsonWriter, Object obj) throws IOException {
                    c8636o.mo3198b(jsonWriter, obj);
                }
            }

            @Override // com.google.gson.InterfaceC8578b0
            /* renamed from: a */
            public final <T2> AbstractC8576a0<T2> mo3267a(C8686j c8686j, C8696a<T2> c8696a) {
                Class<? super T2> rawType = c8696a.getRawType();
                if (r1.isAssignableFrom(rawType)) {
                    return new C8617a(rawType);
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + r1.getName() + ",adapter=" + c8636o + "]";
            }
        };
        f16404v = new C861332(UUID.class, new C8637p());
        f16405w = new C861332(Currency.class, new C8707z(new C8638q()));
        f16406x = new InterfaceC8578b0() { // from class: com.google.gson.internal.bind.TypeAdapters.26

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$26$a */
            /* loaded from: classes3.dex */
            public class C8610a extends AbstractC8576a0<Timestamp> {

                /* renamed from: a */
                public final /* synthetic */ AbstractC8576a0 f16409a;

                public C8610a(AbstractC8576a0 abstractC8576a0) {
                    this.f16409a = abstractC8576a0;
                }

                @Override // com.google.gson.AbstractC8576a0
                /* renamed from: a */
                public final Timestamp mo3199a(JsonReader jsonReader) throws IOException {
                    Date date = (Date) this.f16409a.mo3199a(jsonReader);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                @Override // com.google.gson.AbstractC8576a0
                /* renamed from: b */
                public final void mo3198b(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
                    this.f16409a.mo3198b(jsonWriter, timestamp);
                }
            }

            @Override // com.google.gson.InterfaceC8578b0
            /* renamed from: a */
            public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
                if (c8696a.getRawType() != Timestamp.class) {
                    return null;
                }
                c8686j.getClass();
                return new C8610a(c8686j.m3233e(C8696a.get(Date.class)));
            }
        };
        final C8639r c8639r = new C8639r();
        f16407y = new InterfaceC8578b0() { // from class: com.google.gson.internal.bind.TypeAdapters.34

            /* renamed from: a */
            public final /* synthetic */ Class f16417a = Calendar.class;

            /* renamed from: b */
            public final /* synthetic */ Class f16418b = GregorianCalendar.class;

            @Override // com.google.gson.InterfaceC8578b0
            /* renamed from: a */
            public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
                Class<? super T> rawType = c8696a.getRawType();
                if (rawType == this.f16417a || rawType == this.f16418b) {
                    return c8639r;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + this.f16417a.getName() + "+" + this.f16418b.getName() + ",adapter=" + c8639r + "]";
            }
        };
        f16408z = new C861332(Locale.class, new C8640s());
        final C8641t c8641t = new C8641t();
        f16380A = c8641t;
        f16381B = new InterfaceC8578b0() { // from class: com.google.gson.internal.bind.TypeAdapters.35

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$35$a */
            /* loaded from: classes3.dex */
            public class C8617a extends AbstractC8576a0<Object> {

                /* renamed from: a */
                public final /* synthetic */ Class f16422a;

                public C8617a(Class cls) {
                    this.f16422a = cls;
                }

                @Override // com.google.gson.AbstractC8576a0
                /* renamed from: a */
                public final Object mo3199a(JsonReader jsonReader) throws IOException {
                    Object mo3199a = c8641t.mo3199a(jsonReader);
                    if (mo3199a != null) {
                        Class cls = this.f16422a;
                        if (!cls.isInstance(mo3199a)) {
                            throw new C8703x("Expected a " + cls.getName() + " but was " + mo3199a.getClass().getName());
                        }
                    }
                    return mo3199a;
                }

                @Override // com.google.gson.AbstractC8576a0
                /* renamed from: b */
                public final void mo3198b(JsonWriter jsonWriter, Object obj) throws IOException {
                    c8641t.mo3198b(jsonWriter, obj);
                }
            }

            @Override // com.google.gson.InterfaceC8578b0
            /* renamed from: a */
            public final <T2> AbstractC8576a0<T2> mo3267a(C8686j c8686j, C8696a<T2> c8696a) {
                Class<? super T2> rawType = c8696a.getRawType();
                if (r1.isAssignableFrom(rawType)) {
                    return new C8617a(rawType);
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + r1.getName() + ",adapter=" + c8641t + "]";
            }
        };
        f16382C = new InterfaceC8578b0() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.InterfaceC8578b0
            /* renamed from: a */
            public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
                Class rawType = c8696a.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = (Class<? super Object>) rawType.getSuperclass();
                }
                return new C8625d0(rawType);
            }
        };
    }

    /* renamed from: a */
    public static <TT> InterfaceC8578b0 m3270a(final C8696a<TT> c8696a, final AbstractC8576a0<TT> abstractC8576a0) {
        return new InterfaceC8578b0() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.InterfaceC8578b0
            /* renamed from: a */
            public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a2) {
                if (c8696a2.equals(C8696a.this)) {
                    return abstractC8576a0;
                }
                return null;
            }
        };
    }

    /* renamed from: b */
    public static <TT> InterfaceC8578b0 m3269b(Class<TT> cls, AbstractC8576a0<TT> abstractC8576a0) {
        return new C861332(cls, abstractC8576a0);
    }

    /* renamed from: c */
    public static <TT> InterfaceC8578b0 m3268c(Class<TT> cls, Class<TT> cls2, AbstractC8576a0<? super TT> abstractC8576a0) {
        return new C861433(cls, cls2, abstractC8576a0);
    }
}
