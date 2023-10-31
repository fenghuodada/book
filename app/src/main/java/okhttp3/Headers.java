package okhttp3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.C10806j;
import kotlin.Deprecated;
import kotlin.EnumC10735a;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.C10759o;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10832a;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import kotlin.ranges.C10876a;
import kotlin.ranges.C10878c;
import kotlin.ranges.C10882g;
import kotlin.text.C10925n;
import kotlin.text.C10929r;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p060j$.time.Instant;
import p060j$.util.DateRetargetClass;

@Metadata(m509d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 '2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002('B\u0017\b\u0002\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0004\b%\u0010&J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0014J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0016H\u0096\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006)"}, m508d2 = {"Lokhttp3/Headers;", "", "Lkotlin/j;", "", "name", "get", "Ljava/util/Date;", "getDate", "j$/time/Instant", "getInstant", "", "-deprecated_size", "()I", "size", FirebaseAnalytics.Param.INDEX, "value", "", "names", "", "values", "", "byteCount", "", "iterator", "Lokhttp3/Headers$Builder;", "newBuilder", "", "other", "", "equals", "hashCode", "toString", "", "toMultimap", "", "namesAndValues", "[Ljava/lang/String;", "<init>", "([Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Headers implements Iterable<C10806j<? extends String, ? extends String>>, InterfaceC10847a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    @Metadata(m509d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000eJ\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000fH\u0007J\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000eH\u0086\u0002J\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000fH\u0087\u0002J\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0014\u001a\u00020\u000bR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m508d2 = {"Lokhttp3/Headers$Builder;", "", "", "line", "addLenient$okhttp", "(Ljava/lang/String;)Lokhttp3/Headers$Builder;", "addLenient", "add", "name", "value", "addUnsafeNonAscii", "Lokhttp3/Headers;", "headers", "addAll", "Ljava/util/Date;", "j$/time/Instant", "set", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "removeAll", "get", "build", "", "namesAndValues", "Ljava/util/List;", "getNamesAndValues$okhttp", "()Ljava/util/List;", "<init>", "()V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Builder {
        @NotNull
        private final List<String> namesAndValues = new ArrayList(20);

        @NotNull
        public final Builder add(@NotNull String line) {
            C10843j.m430f(line, "line");
            int m374r = C10929r.m374r(line, ':', 0, false, 6);
            if (m374r != -1) {
                String substring = line.substring(0, m374r);
                C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String obj = C10929r.m381K(substring).toString();
                String substring2 = line.substring(m374r + 1);
                C10843j.m431e(substring2, "(this as java.lang.String).substring(startIndex)");
                add(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException("Unexpected header: ".concat(line).toString());
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder add(@NotNull String name, @NotNull Instant value) {
            C10843j.m430f(name, "name");
            C10843j.m430f(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull String value) {
            C10843j.m430f(name, "name");
            C10843j.m430f(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull Date value) {
            C10843j.m430f(name, "name");
            C10843j.m430f(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @NotNull
        public final Builder addAll(@NotNull Headers headers) {
            C10843j.m430f(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String line) {
            C10843j.m430f(line, "line");
            int m374r = C10929r.m374r(line, ':', 1, false, 4);
            if (m374r != -1) {
                String substring = line.substring(0, m374r);
                C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = line.substring(m374r + 1);
                C10843j.m431e(substring2, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else {
                if (line.charAt(0) == ':') {
                    line = line.substring(1);
                    C10843j.m431e(line, "(this as java.lang.String).substring(startIndex)");
                }
                addLenient$okhttp("", line);
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String name, @NotNull String value) {
            C10843j.m430f(name, "name");
            C10843j.m430f(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(C10929r.m381K(value).toString());
            return this;
        }

        @NotNull
        public final Builder addUnsafeNonAscii(@NotNull String name, @NotNull String value) {
            C10843j.m430f(name, "name");
            C10843j.m430f(value, "value");
            Headers.Companion.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @Nullable
        public final String get(@NotNull String name) {
            C10843j.m430f(name, "name");
            C10876a m412b = C10882g.m412b(new C10876a(this.namesAndValues.size() - 2, 0, -1), 2);
            int i = m412b.f21422a;
            int i2 = m412b.f21423b;
            int i3 = m412b.f21424c;
            if (i3 >= 0) {
                if (i > i2) {
                    return null;
                }
            } else if (i < i2) {
                return null;
            }
            while (!C10925n.m398e(name, this.namesAndValues.get(i))) {
                if (i != i2) {
                    i += i3;
                } else {
                    return null;
                }
            }
            return this.namesAndValues.get(i + 1);
        }

        @NotNull
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @NotNull
        public final Builder removeAll(@NotNull String name) {
            C10843j.m430f(name, "name");
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (C10925n.m398e(name, this.namesAndValues.get(i))) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder set(@NotNull String name, @NotNull Instant value) {
            C10843j.m430f(name, "name");
            C10843j.m430f(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull String value) {
            C10843j.m430f(name, "name");
            C10843j.m430f(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull Date value) {
            C10843j.m430f(name, "name");
            C10843j.m430f(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }
    }

    @Metadata(m509d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J#\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0004\b\r\u0010\u0012J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0017"}, m508d2 = {"Lokhttp3/Headers$Companion;", "", "", "", "namesAndValues", "name", "get", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/p;", "checkName", "value", "checkValue", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "headersOf", "-deprecated_of", "", "(Ljava/util/Map;)Lokhttp3/Headers;", "toHeaders", "headers", "<init>", "()V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!('!' <= charAt && '~' >= charAt)) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    sb.append(Util.isSensitiveHeader(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            C10876a m412b = C10882g.m412b(new C10876a(strArr.length - 2, 0, -1), 2);
            int i = m412b.f21422a;
            int i2 = m412b.f21423b;
            int i3 = m412b.f21424c;
            if (i3 >= 0) {
                if (i > i2) {
                    return null;
                }
            } else if (i < i2) {
                return null;
            }
            while (!C10925n.m398e(str, strArr[i])) {
                if (i != i2) {
                    i += i3;
                } else {
                    return null;
                }
            }
            return strArr[i + 1];
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "function moved to extension", replaceWith = @ReplaceWith(expression = "headers.toHeaders()", imports = {}))
        @JvmName(name = "-deprecated_of")
        @NotNull
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m13142deprecated_of(@NotNull Map<String, String> headers) {
            C10843j.m430f(headers, "headers");
            return m62of(headers);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "function name changed", replaceWith = @ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}))
        @JvmName(name = "-deprecated_of")
        @NotNull
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m13143deprecated_of(@NotNull String... namesAndValues) {
            C10843j.m430f(namesAndValues, "namesAndValues");
            return m61of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        /* renamed from: of */
        public final Headers m62of(@NotNull Map<String, String> toHeaders) {
            C10843j.m430f(toHeaders, "$this$toHeaders");
            String[] strArr = new String[toHeaders.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : toHeaders.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String obj = C10929r.m381K(key).toString();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String obj2 = C10929r.m381K(value).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new Headers(strArr, null);
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        /* renamed from: of */
        public final Headers m61of(@NotNull String... namesAndValues) {
            boolean z;
            boolean z2;
            C10843j.m430f(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Object clone = namesAndValues.clone();
                if (clone != null) {
                    String[] strArr = (String[]) clone;
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        String str = strArr[i];
                        if (str != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (str != null) {
                                strArr[i] = C10929r.m381K(str).toString();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        }
                    }
                    C10876a m412b = C10882g.m412b(new C10878c(0, strArr.length - 1), 2);
                    int i2 = m412b.f21422a;
                    int i3 = m412b.f21423b;
                    int i4 = m412b.f21424c;
                    if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                        while (true) {
                            String str2 = strArr[i2];
                            String str3 = strArr[i2 + 1];
                            checkName(str2);
                            checkValue(str3, str2);
                            if (i2 == i3) {
                                break;
                            }
                            i2 += i4;
                        }
                    }
                    return new Headers(strArr, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, C10839f c10839f) {
        this(strArr);
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    /* renamed from: of */
    public static final Headers m64of(@NotNull Map<String, String> map) {
        return Companion.m62of(map);
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    /* renamed from: of */
    public static final Headers m63of(@NotNull String... strArr) {
        return Companion.m61of(strArr);
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m13141deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    @Nullable
    public final String get(@NotNull String name) {
        C10843j.m430f(name, "name");
        return Companion.get(this.namesAndValues, name);
    }

    @Nullable
    public final Date getDate(@NotNull String name) {
        C10843j.m430f(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant getInstant(@NotNull String name) {
        C10843j.m430f(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return DateRetargetClass.toInstant(date);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<C10806j<? extends String, ? extends String>> iterator() {
        int size = size();
        C10806j[] c10806jArr = new C10806j[size];
        for (int i = 0; i < size; i++) {
            c10806jArr[i] = new C10806j(name(i), value(i));
        }
        return new C10832a(c10806jArr);
    }

    @NotNull
    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    @NotNull
    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(C10925n.m397f());
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        C10843j.m431e(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        List<String> namesAndValues$okhttp = builder.getNamesAndValues$okhttp();
        String[] elements = this.namesAndValues;
        C10843j.m430f(namesAndValues$okhttp, "<this>");
        C10843j.m430f(elements, "elements");
        List asList = Arrays.asList(elements);
        C10843j.m431e(asList, "asList(this)");
        namesAndValues$okhttp.addAll(asList);
        return builder;
    }

    @JvmName(name = "size")
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @NotNull
    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(C10925n.m397f());
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            Locale locale = Locale.US;
            C10843j.m431e(locale, "Locale.US");
            if (name == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = name.toLowerCase(locale);
            C10843j.m431e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i));
        }
        return treeMap;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            String value = value(i);
            sb.append(name);
            sb.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        C10843j.m431e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    @NotNull
    public final List<String> values(@NotNull String name) {
        C10843j.m430f(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (C10925n.m398e(name, name(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            C10843j.m431e(unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }
        return C10759o.f21363a;
    }
}
