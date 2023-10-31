package kotlin.text;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.AbstractC10762r;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C10878c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,825:1\n1174#2,2:826\n1#3:828\n1726#4,3:829\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:826,2\n621#1:829,3\n*E\n"})
/* renamed from: kotlin.text.n */
/* loaded from: classes3.dex */
public class C10925n extends C10924m {
    /* renamed from: d */
    public static boolean m399d(String str, String suffix) {
        C10843j.m430f(str, "<this>");
        C10843j.m430f(suffix, "suffix");
        return str.endsWith(suffix);
    }

    /* renamed from: e */
    public static final boolean m398e(@Nullable String str, @Nullable String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    @NotNull
    /* renamed from: f */
    public static final Comparator m397f() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        C10843j.m431e(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    /* renamed from: g */
    public static final boolean m396g(@NotNull CharSequence charSequence) {
        boolean z;
        C10843j.m430f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        C10878c c10878c = new C10878c(0, charSequence.length() - 1);
        if (!(c10878c instanceof Collection) || !((Collection) c10878c).isEmpty()) {
            Iterator<Integer> it = c10878c.iterator();
            while (it.hasNext()) {
                if (!C10909a.m405c(charSequence.charAt(((AbstractC10762r) it).nextInt()))) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m395h(int i, int i2, int i3, @NotNull String str, @NotNull String other, boolean z) {
        C10843j.m430f(str, "<this>");
        C10843j.m430f(other, "other");
        return !z ? str.regionMatches(i, other, i2, i3) : str.regionMatches(z, i, other, i2, i3);
    }

    /* renamed from: i */
    public static String m394i(String str, String oldValue, String str2) {
        C10843j.m430f(str, "<this>");
        C10843j.m430f(oldValue, "oldValue");
        int m376p = C10929r.m376p(0, str, oldValue, false);
        if (m376p >= 0) {
            int length = oldValue.length();
            int i = 1;
            if (length >= 1) {
                i = length;
            }
            int length2 = str2.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int i2 = 0;
                do {
                    sb.append((CharSequence) str, i2, m376p);
                    sb.append(str2);
                    i2 = m376p + length;
                    if (m376p >= str.length()) {
                        break;
                    }
                    m376p = C10929r.m376p(m376p + i, str, oldValue, false);
                } while (m376p > 0);
                sb.append((CharSequence) str, i2, str.length());
                String sb2 = sb.toString();
                C10843j.m431e(sb2, "stringBuilder.append(this, i, length).toString()");
                return sb2;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    /* renamed from: j */
    public static final boolean m393j(@NotNull String str, @NotNull String str2, int i, boolean z) {
        C10843j.m430f(str, "<this>");
        return !z ? str.startsWith(str2, i) : m395h(i, 0, str2.length(), str, str2, z);
    }

    /* renamed from: k */
    public static final boolean m392k(@NotNull String str, @NotNull String prefix, boolean z) {
        C10843j.m430f(str, "<this>");
        C10843j.m430f(prefix, "prefix");
        return !z ? str.startsWith(prefix) : m395h(0, 0, prefix.length(), str, prefix, z);
    }
}
