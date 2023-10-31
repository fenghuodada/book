package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10806j;
import kotlin.InterfaceC10739c;
import kotlin.collections.C10752h;
import kotlin.collections.C10753i;
import kotlin.collections.C10764t;
import kotlin.collections.C10765u;
import kotlin.jvm.C10807a;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.functions.InterfaceC10810b;
import kotlin.jvm.functions.InterfaceC10811c;
import kotlin.jvm.functions.InterfaceC10812d;
import kotlin.jvm.functions.InterfaceC10813e;
import kotlin.jvm.functions.InterfaceC10814f;
import kotlin.jvm.functions.InterfaceC10815g;
import kotlin.jvm.functions.InterfaceC10816h;
import kotlin.jvm.functions.InterfaceC10817i;
import kotlin.jvm.functions.InterfaceC10818j;
import kotlin.jvm.functions.InterfaceC10819k;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.functions.InterfaceC10821m;
import kotlin.jvm.functions.InterfaceC10822n;
import kotlin.jvm.functions.InterfaceC10823o;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.functions.InterfaceC10825q;
import kotlin.jvm.functions.InterfaceC10826r;
import kotlin.jvm.functions.InterfaceC10827s;
import kotlin.jvm.functions.InterfaceC10828t;
import kotlin.jvm.functions.InterfaceC10829u;
import kotlin.jvm.functions.InterfaceC10830v;
import kotlin.jvm.functions.InterfaceC10831w;
import kotlin.reflect.InterfaceC10885c;
import kotlin.text.C10929r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n442#3:215\n392#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
/* renamed from: kotlin.jvm.internal.d */
/* loaded from: classes3.dex */
public final class C10837d implements InterfaceC10885c<Object>, InterfaceC10836c {
    @NotNull

    /* renamed from: b */
    public static final Map<Class<? extends InterfaceC10739c<?>>, Integer> f21402b;
    @NotNull

    /* renamed from: c */
    public static final LinkedHashMap f21403c;
    @NotNull

    /* renamed from: a */
    public final Class<?> f21404a;

    static {
        int i = 0;
        List m485d = C10752h.m485d(InterfaceC10809a.class, InterfaceC10820l.class, InterfaceC10824p.class, InterfaceC10825q.class, InterfaceC10826r.class, InterfaceC10827s.class, InterfaceC10828t.class, InterfaceC10829u.class, InterfaceC10830v.class, InterfaceC10831w.class, InterfaceC10810b.class, InterfaceC10811c.class, InterfaceC10812d.class, InterfaceC10813e.class, InterfaceC10814f.class, InterfaceC10815g.class, InterfaceC10816h.class, InterfaceC10817i.class, InterfaceC10818j.class, InterfaceC10819k.class, InterfaceC10821m.class, InterfaceC10822n.class, InterfaceC10823o.class);
        ArrayList arrayList = new ArrayList(C10753i.m482g(m485d));
        for (Object obj : m485d) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C10806j((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                C10752h.m483f();
                throw null;
            }
        }
        f21402b = C10765u.m464e(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C10843j.m431e(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            C10843j.m431e(kotlinName, "kotlinName");
            sb.append(C10929r.m382J(kotlinName, kotlinName));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), kotlinName.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends InterfaceC10739c<?>>, Integer> entry : f21402b.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10764t.m468a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str = (String) entry2.getValue();
            linkedHashMap.put(key, C10929r.m382J(str, str));
        }
        f21403c = linkedHashMap;
    }

    public C10837d(@NotNull Class<?> jClass) {
        C10843j.m430f(jClass, "jClass");
        this.f21404a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC10836c
    @NotNull
    /* renamed from: a */
    public final Class<?> mo423a() {
        return this.f21404a;
    }

    @Override // kotlin.reflect.InterfaceC10885c
    @Nullable
    /* renamed from: b */
    public final String mo410b() {
        String str;
        Method enclosingMethod;
        Constructor<?> enclosingConstructor;
        String str2;
        Class<?> jClass = this.f21404a;
        C10843j.m430f(jClass, "jClass");
        String str3 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (jClass.isLocalClass()) {
            String simpleName = jClass.getSimpleName();
            if (jClass.getEnclosingMethod() != null) {
                str2 = enclosingMethod.getName() + '$';
            } else {
                if (jClass.getEnclosingConstructor() != null) {
                    str2 = enclosingConstructor.getName() + '$';
                } else {
                    int m374r = C10929r.m374r(simpleName, '$', 0, false, 6);
                    if (m374r != -1) {
                        String substring = simpleName.substring(m374r + 1, simpleName.length());
                        C10843j.m431e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        return substring;
                    }
                    return simpleName;
                }
            }
            return C10929r.m383I(simpleName, str2);
        }
        boolean isArray = jClass.isArray();
        LinkedHashMap linkedHashMap = f21403c;
        if (isArray) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str3 = str.concat("Array");
            }
            if (str3 == null) {
                return "Array";
            }
            return str3;
        }
        String str4 = (String) linkedHashMap.get(jClass.getName());
        if (str4 == null) {
            return jClass.getSimpleName();
        }
        return str4;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C10837d) && C10843j.m435a(C10807a.m442a(this), C10807a.m442a((InterfaceC10885c) obj));
    }

    public final int hashCode() {
        return C10807a.m442a(this).hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f21404a.toString() + " (Kotlin reflection is not available)";
    }
}
