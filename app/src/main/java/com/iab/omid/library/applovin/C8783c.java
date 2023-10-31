package com.iab.omid.library.applovin;

import androidx.core.content.C0663f;
import com.iab.omid.library.applovin.p048d.C8794e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.applovin.c */
/* loaded from: classes3.dex */
class C8783c {

    /* renamed from: a */
    private static final Pattern f16716a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b */
    private static final Pattern f16717b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c */
    private static final Pattern f16718c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d */
    private static final Pattern f16719d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e */
    private static final Pattern f16720e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f */
    private static final Pattern f16721f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g */
    private static final Pattern f16722g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* renamed from: a */
    public static String m3077a(String str, String str2) {
        return m3075b(str2, C0663f.m12005a("<script type=\"text/javascript\">", str, "</script>"));
    }

    /* renamed from: a */
    private static boolean m3079a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3076a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m3079a(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    /* renamed from: a */
    private static int[][] m3078a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf = str.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance(Integer.TYPE, 0, 2));
    }

    /* renamed from: b */
    public static String m3075b(String str, String str2) {
        C8794e.m3036a(str, "HTML is null or empty");
        int[][] m3078a = m3078a(str);
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 16);
        if (!m3074b(str, sb, f16717b, str2, m3078a) && !m3076a(str, sb, f16716a, str2, m3078a) && !m3074b(str, sb, f16719d, str2, m3078a) && !m3076a(str, sb, f16718c, str2, m3078a) && !m3074b(str, sb, f16721f, str2, m3078a) && !m3076a(str, sb, f16720e, str2, m3078a) && !m3076a(str, sb, f16722g, str2, m3078a)) {
            return str2.concat(str);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m3074b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m3079a(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }
}
