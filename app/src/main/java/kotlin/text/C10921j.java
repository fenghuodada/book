package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10752h;
import kotlin.collections.C10757m;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,123:1\n113#1,2:125\n115#1,4:140\n120#1,2:153\n113#1,2:162\n115#1,4:177\n120#1,2:184\n1#2:124\n1#2:150\n1#2:181\n1#2:205\n1569#3,11:127\n1864#3,2:138\n1866#3:151\n1580#3:152\n766#3:155\n857#3,2:156\n1549#3:158\n1620#3,3:159\n1569#3,11:164\n1864#3,2:175\n1866#3:182\n1580#3:183\n1569#3,11:192\n1864#3,2:203\n1866#3:206\n1580#3:207\n151#4,6:144\n151#4,6:186\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n38#1:125,2\n38#1:140,4\n38#1:153,2\n78#1:162,2\n78#1:177,4\n78#1:184,2\n38#1:150\n78#1:181\n114#1:205\n38#1:127,11\n38#1:138,2\n38#1:151\n38#1:152\n74#1:155\n74#1:156,2\n75#1:158\n75#1:159,3\n78#1:164,11\n78#1:175,2\n78#1:182\n78#1:183\n114#1:192,11\n114#1:203,2\n114#1:206\n114#1:207\n39#1:144,6\n101#1:186,6\n*E\n"})
/* renamed from: kotlin.text.j */
/* loaded from: classes3.dex */
public class C10921j extends C10919h {
    /* renamed from: b */
    public static String m401b(String str) {
        C10843j.m430f(str, "<this>");
        if (!C10925n.m396g("|")) {
            List<String> m369w = C10929r.m369w(str);
            int size = (m369w.size() * 0) + str.length();
            int m487b = C10752h.m487b(m369w);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : m369w) {
                int i2 = i + 1;
                String str2 = null;
                if (i >= 0) {
                    String str3 = (String) obj;
                    if ((i != 0 && i != m487b) || !C10925n.m396g(str3)) {
                        int length = str3.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (!C10909a.m405c(str3.charAt(i3))) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 != -1 && C10925n.m393j(str3, "|", i3, false)) {
                            str2 = str3.substring("|".length() + i3);
                            C10843j.m431e(str2, "this as java.lang.String).substring(startIndex)");
                        }
                        if (str2 == null || (str2 = C10920i.f21471a.invoke(str2)) == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i = i2;
                } else {
                    C10752h.m483f();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(size);
            C10757m.m476m(arrayList, sb);
            String sb2 = sb.toString();
            C10843j.m431e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
}
