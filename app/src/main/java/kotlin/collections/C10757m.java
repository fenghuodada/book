package kotlin.collections;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C10919h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3683:1\n288#1,2:3684\n518#1,7:3686\n533#1,6:3693\n857#1,2:3700\n788#1:3702\n1864#1,2:3703\n789#1,2:3705\n1866#1:3707\n791#1:3708\n1864#1,3:3709\n809#1,2:3712\n847#1,2:3714\n1253#1,4:3720\n1222#1,4:3724\n1238#1,4:3728\n1285#1,4:3732\n1446#1,5:3736\n1461#1,5:3741\n1502#1,3:3746\n1505#1,3:3756\n1520#1,3:3759\n1523#1,3:3769\n1620#1,3:3786\n1590#1,4:3789\n1579#1:3793\n1864#1,2:3794\n1866#1:3797\n1580#1:3798\n1864#1,3:3799\n1611#1:3802\n1855#1:3803\n1856#1:3805\n1612#1:3806\n1855#1,2:3807\n1864#1,3:3809\n2847#1,3:3812\n2850#1,6:3816\n2872#1,3:3822\n2875#1,7:3826\n857#1,2:3833\n819#1:3835\n847#1,2:3836\n819#1:3838\n847#1,2:3839\n819#1:3841\n847#1,2:3842\n3405#1,8:3848\n3433#1,7:3856\n3464#1,10:3863\n1#2:3699\n1#2:3796\n1#2:3804\n1#2:3815\n1#2:3825\n37#3,2:3716\n37#3,2:3718\n361#4,7:3749\n361#4,7:3762\n361#4,7:3772\n361#4,7:3779\n32#5,2:3844\n32#5,2:3846\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n167#1:3684,2\n177#1:3686,7\n187#1:3693,6\n766#1:3700,2\n777#1:3702\n777#1:3703,2\n777#1:3705,2\n777#1:3707\n777#1:3708\n788#1:3709,3\n800#1:3712,2\n819#1:3714,2\n1180#1:3720,4\n1195#1:3724,4\n1209#1:3728,4\n1272#1:3732,4\n1360#1:3736,5\n1373#1:3741,5\n1477#1:3746,3\n1477#1:3756,3\n1490#1:3759,3\n1490#1:3769,3\n1549#1:3786,3\n1559#1:3789,4\n1569#1:3793\n1569#1:3794,2\n1569#1:3797\n1569#1:3798\n1579#1:3799,3\n1603#1:3802\n1603#1:3803\n1603#1:3805\n1603#1:3806\n1611#1:3807,2\n2645#1:3809,3\n2949#1:3812,3\n2949#1:3816,6\n2967#1:3822,3\n2967#1:3826,7\n3143#1:3833,2\n3151#1:3835\n3151#1:3836,2\n3161#1:3838\n3161#1:3839,2\n3171#1:3841\n3171#1:3842,2\n3394#1:3848,8\n3422#1:3856,7\n3451#1:3863,10\n1569#1:3796\n1603#1:3804\n2949#1:3815\n2967#1:3825\n1032#1:3716,2\n1075#1:3718,2\n1477#1:3749,7\n1490#1:3762,7\n1504#1:3772,7\n1522#1:3779,7\n3339#1:3844,2\n3381#1:3846,2\n*E\n"})
/* renamed from: kotlin.collections.m */
/* loaded from: classes3.dex */
public class C10757m extends C10755k {
    /* renamed from: i */
    public static final boolean m480i(@NotNull Iterable iterable, Serializable serializable) {
        int i;
        C10843j.m430f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(serializable);
        }
        if (iterable instanceof List) {
            i = ((List) iterable).indexOf(serializable);
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i2 >= 0) {
                        if (C10843j.m435a(serializable, next)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        C10752h.m483f();
                        throw null;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static final <T> T m479j(@NotNull List<? extends T> list) {
        C10843j.m430f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @Nullable
    /* renamed from: k */
    public static final <T> T m478k(@NotNull List<? extends T> list) {
        C10843j.m430f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @NotNull
    /* renamed from: l */
    public static final void m477l(@NotNull Iterable iterable, @NotNull StringBuilder sb, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i, @NotNull CharSequence truncated, @Nullable InterfaceC10820l interfaceC10820l) {
        C10843j.m430f(iterable, "<this>");
        C10843j.m430f(separator, "separator");
        C10843j.m430f(prefix, "prefix");
        C10843j.m430f(postfix, "postfix");
        C10843j.m430f(truncated, "truncated");
        sb.append(prefix);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C10919h.m402a(sb, obj, interfaceC10820l);
        }
        if (i >= 0 && i2 > i) {
            sb.append(truncated);
        }
        sb.append(postfix);
    }

    /* renamed from: m */
    public static /* synthetic */ void m476m(ArrayList arrayList, StringBuilder sb) {
        m477l(arrayList, sb, "\n", "", "", -1, "...", null);
    }

    /* renamed from: n */
    public static String m475n(Iterable iterable, String str, String str2, String str3, InterfaceC10820l interfaceC10820l, int i) {
        String prefix;
        String postfix;
        int i2;
        CharSequence truncated;
        InterfaceC10820l interfaceC10820l2;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        if ((i & 2) != 0) {
            prefix = "";
        } else {
            prefix = str2;
        }
        if ((i & 4) != 0) {
            postfix = "";
        } else {
            postfix = str3;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        if ((i & 16) != 0) {
            truncated = "...";
        } else {
            truncated = null;
        }
        if ((i & 32) != 0) {
            interfaceC10820l2 = null;
        } else {
            interfaceC10820l2 = interfaceC10820l;
        }
        C10843j.m430f(iterable, "<this>");
        C10843j.m430f(separator, "separator");
        C10843j.m430f(prefix, "prefix");
        C10843j.m430f(postfix, "postfix");
        C10843j.m430f(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        m477l(iterable, sb, separator, prefix, postfix, i3, truncated, interfaceC10820l2);
        String sb2 = sb.toString();
        C10843j.m431e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @NotNull
    /* renamed from: o */
    public static final ArrayList m474o(@NotNull Iterable elements, @NotNull Collection collection) {
        C10843j.m430f(collection, "<this>");
        C10843j.m430f(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C10755k.m481h(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @NotNull
    /* renamed from: p */
    public static final ArrayList m473p(Object obj, @NotNull Collection collection) {
        C10843j.m430f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    @NotNull
    /* renamed from: q */
    public static final void m472q(@NotNull Iterable iterable, @NotNull AbstractCollection abstractCollection) {
        C10843j.m430f(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    @NotNull
    /* renamed from: r */
    public static final <T> List<T> m471r(@NotNull Iterable<? extends T> iterable) {
        ArrayList arrayList;
        Object next;
        C10843j.m430f(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return m470s(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return C10752h.m486c(next);
            }
            return C10759o.f21363a;
        }
        if (z) {
            arrayList = m470s((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            m472q(iterable, arrayList2);
            arrayList = arrayList2;
        }
        return C10752h.m484e(arrayList);
    }

    @NotNull
    /* renamed from: s */
    public static final ArrayList m470s(@NotNull Collection collection) {
        C10843j.m430f(collection, "<this>");
        return new ArrayList(collection);
    }

    @NotNull
    /* renamed from: t */
    public static final <T> Set<T> m469t(@NotNull Iterable<? extends T> iterable) {
        Object next;
        C10843j.m430f(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C10761q c10761q = C10761q.f21365a;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(C10764t.m468a(collection.size()));
                    m472q(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                Set<T> singleton = Collections.singleton(next);
                C10843j.m431e(singleton, "singleton(element)");
                return singleton;
            }
            return c10761q;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m472q(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            Set<T> singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
            C10843j.m431e(singleton2, "singleton(element)");
            return singleton2;
        }
        return c10761q;
    }
}
