package kotlin.text;

import androidx.appcompat.view.menu.C0235r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10751g;
import kotlin.collections.C10752h;
import kotlin.collections.C10753i;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C10876a;
import kotlin.ranges.C10877b;
import kotlin.ranges.C10878c;
import kotlin.sequences.C10903e;
import kotlin.sequences.C10906h;
import kotlin.sequences.C10907i;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n79#1,22:1487\n113#1,5:1509\n130#1,5:1514\n79#1,22:1519\n107#1:1541\n79#1,22:1542\n113#1,5:1564\n124#1:1569\n113#1,5:1570\n130#1,5:1575\n141#1:1580\n130#1,5:1581\n79#1,22:1586\n113#1,5:1608\n130#1,5:1613\n12824#2,2:1618\n12824#2,2:1620\n288#3,2:1622\n288#3,2:1624\n1549#3:1627\n1620#3,3:1628\n1549#3:1631\n1620#3,3:1632\n1#4:1626\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n107#1:1487,22\n124#1:1509,5\n141#1:1514,5\n146#1:1519,22\n151#1:1541\n151#1:1542,22\n156#1:1564,5\n161#1:1569\n161#1:1570,5\n166#1:1575,5\n171#1:1580\n171#1:1581,5\n176#1:1586,22\n187#1:1608,5\n198#1:1613,5\n940#1:1618,2\n964#1:1620,2\n1003#1:1622,2\n1009#1:1624,2\n1309#1:1627\n1309#1:1628,3\n1334#1:1631\n1334#1:1632,3\n*E\n"})
/* renamed from: kotlin.text.r */
/* loaded from: classes3.dex */
public class C10929r extends C10925n {
    @NotNull
    /* renamed from: A */
    public static final String m391A(@NotNull String str, @NotNull String str2) {
        if (m378n(str2, str)) {
            String substring = str2.substring(0, str2.length() - str.length());
            C10843j.m431e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    @NotNull
    /* renamed from: B */
    public static final String m390B(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C10843j.m430f(str, "<this>");
        if (str.length() >= str3.length() + str2.length() && m385G(str, str2) && m378n(str, str3)) {
            String substring = str.substring(str2.length(), str.length() - str3.length());
            C10843j.m431e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: C */
    public static final void m389C(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C0235r.m12816a("Limit must be non-negative, but was ", i).toString());
    }

    /* renamed from: D */
    public static final List m388D(int i, CharSequence charSequence, String str, boolean z) {
        m389C(i);
        int i2 = 0;
        int m376p = m376p(0, charSequence, str, z);
        if (m376p == -1 || i == 1) {
            return C10752h.m486c(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, m376p).toString());
            i2 = str.length() + m376p;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            m376p = m376p(i2, charSequence, str, z);
        } while (m376p != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: E */
    public static List m387E(CharSequence charSequence, char[] cArr) {
        C10843j.m430f(charSequence, "<this>");
        if (cArr.length == 1) {
            return m388D(0, charSequence, String.valueOf(cArr[0]), false);
        }
        m389C(0);
        C10906h c10906h = new C10906h(new C10911c(charSequence, 0, 0, new C10926o(cArr, false)));
        ArrayList arrayList = new ArrayList(C10753i.m482g(c10906h));
        Iterator<Object> it = c10906h.iterator();
        while (it.hasNext()) {
            arrayList.add(m384H(charSequence, (C10878c) it.next()));
        }
        return arrayList;
    }

    /* renamed from: F */
    public static List m386F(CharSequence charSequence, String[] strArr) {
        C10843j.m430f(charSequence, "<this>");
        boolean z = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z = false;
            }
            if (!z) {
                return m388D(0, charSequence, str, false);
            }
        }
        C10906h c10906h = new C10906h(m368x(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(C10753i.m482g(c10906h));
        Iterator<Object> it = c10906h.iterator();
        while (it.hasNext()) {
            arrayList.add(m384H(charSequence, (C10878c) it.next()));
        }
        return arrayList;
    }

    /* renamed from: G */
    public static boolean m385G(CharSequence charSequence, String str) {
        C10843j.m430f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return C10925n.m392k((String) charSequence, str, false);
        }
        return m367y(charSequence, 0, str, 0, str.length(), false);
    }

    @NotNull
    /* renamed from: H */
    public static final String m384H(@NotNull CharSequence charSequence, @NotNull C10878c range) {
        C10843j.m430f(charSequence, "<this>");
        C10843j.m430f(range, "range");
        return charSequence.subSequence(Integer.valueOf(range.f21422a).intValue(), Integer.valueOf(range.f21423b).intValue() + 1).toString();
    }

    /* renamed from: I */
    public static String m383I(String str, String delimiter) {
        C10843j.m430f(delimiter, "delimiter");
        int m373s = m373s(str, delimiter, 0, false, 6);
        if (m373s != -1) {
            String substring = str.substring(delimiter.length() + m373s, str.length());
            C10843j.m431e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    @NotNull
    /* renamed from: J */
    public static final String m382J(@NotNull String str, @NotNull String missingDelimiterValue) {
        C10843j.m430f(str, "<this>");
        C10843j.m430f(missingDelimiterValue, "missingDelimiterValue");
        int m371u = m371u(str, '.', 0, 6);
        if (m371u == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(m371u + 1, str.length());
        C10843j.m431e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    /* renamed from: K */
    public static final CharSequence m381K(@NotNull CharSequence charSequence) {
        C10843j.m430f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean m405c = C10909a.m405c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!m405c) {
                    break;
                }
                length--;
            } else if (m405c) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: l */
    public static boolean m380l(CharSequence charSequence, char c) {
        C10843j.m430f(charSequence, "<this>");
        if (m374r(charSequence, c, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m379m(CharSequence charSequence, String str) {
        C10843j.m430f(charSequence, "<this>");
        if (m373s(charSequence, str, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m378n(CharSequence charSequence, String str) {
        C10843j.m430f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return C10925n.m399d((String) charSequence, str);
        }
        return m367y(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* renamed from: o */
    public static final int m377o(@NotNull CharSequence charSequence) {
        C10843j.m430f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: p */
    public static final int m376p(int i, @NotNull CharSequence charSequence, @NotNull String string, boolean z) {
        C10843j.m430f(charSequence, "<this>");
        C10843j.m430f(string, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i);
        }
        return m375q(charSequence, string, i, charSequence.length(), z, false);
    }

    /* renamed from: q */
    public static final int m375q(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C10876a c10876a;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c10876a = new C10878c(i, i2);
        } else {
            int m377o = m377o(charSequence);
            if (i > m377o) {
                i = m377o;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c10876a = new C10876a(i, i2, -1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = c10876a.f21422a;
        int i4 = c10876a.f21424c;
        int i5 = c10876a.f21423b;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i4 > 0 && i3 <= i5) || (i4 < 0 && i5 <= i3)) {
                while (!C10925n.m395h(0, i3, charSequence2.length(), (String) charSequence2, (String) charSequence, z)) {
                    if (i3 != i5) {
                        i3 += i4;
                    }
                }
                return i3;
            }
        } else if ((i4 > 0 && i3 <= i5) || (i4 < 0 && i5 <= i3)) {
            while (!m367y(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                if (i3 != i5) {
                    i3 += i4;
                }
            }
            return i3;
        }
        return -1;
    }

    /* renamed from: r */
    public static int m374r(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        C10843j.m430f(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m372t(i, charSequence, z, new char[]{c});
    }

    /* renamed from: s */
    public static /* synthetic */ int m373s(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m376p(i, charSequence, str, z);
    }

    /* renamed from: t */
    public static final int m372t(int i, @NotNull CharSequence charSequence, boolean z, @NotNull char[] chars) {
        boolean z2;
        C10843j.m430f(charSequence, "<this>");
        C10843j.m430f(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C10751g.m490f(chars), i);
        }
        if (i < 0) {
            i = 0;
        }
        C10878c c10878c = new C10878c(i, m377o(charSequence));
        C10877b c10877b = new C10877b(i, c10878c.f21423b, c10878c.f21424c);
        while (c10877b.f21427c) {
            int nextInt = c10877b.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length = chars.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (C10909a.m406b(chars[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    continue;
                    break;
                }
            }
            if (z2) {
                return nextInt;
            }
        }
        return -1;
    }

    /* renamed from: u */
    public static int m371u(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m377o(charSequence);
        }
        C10843j.m430f(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(C10751g.m490f(cArr), i);
            }
            int m377o = m377o(charSequence);
            if (i > m377o) {
                i = m377o;
            }
            while (-1 < i) {
                if (C10909a.m406b(cArr[0], charSequence.charAt(i), false)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    /* renamed from: v */
    public static int m370v(CharSequence charSequence, String string, int i) {
        int i2;
        if ((i & 2) != 0) {
            i2 = m377o(charSequence);
        } else {
            i2 = 0;
        }
        int i3 = i2;
        C10843j.m430f(charSequence, "<this>");
        C10843j.m430f(string, "string");
        if (!(charSequence instanceof String)) {
            return m375q(charSequence, string, i3, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(string, i3);
    }

    @NotNull
    /* renamed from: w */
    public static final List<String> m369w(@NotNull CharSequence charSequence) {
        C10843j.m430f(charSequence, "<this>");
        return C10903e.m408h(new C10907i(m368x(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new C10928q(charSequence)));
    }

    /* renamed from: x */
    public static C10911c m368x(CharSequence charSequence, String[] strArr, boolean z, int i) {
        m389C(i);
        List asList = Arrays.asList(strArr);
        C10843j.m431e(asList, "asList(this)");
        return new C10911c(charSequence, 0, i, new C10927p(asList, z));
    }

    /* renamed from: y */
    public static final boolean m367y(@NotNull CharSequence charSequence, int i, @NotNull CharSequence other, int i2, int i3, boolean z) {
        C10843j.m430f(charSequence, "<this>");
        C10843j.m430f(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C10909a.m406b(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* renamed from: z */
    public static final String m366z(@NotNull String str, @NotNull String str2) {
        C10843j.m430f(str2, "<this>");
        if (m385G(str2, str)) {
            String substring = str2.substring(str.length());
            C10843j.m431e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str2;
    }
}
