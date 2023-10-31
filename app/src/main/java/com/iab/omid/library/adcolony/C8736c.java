package com.iab.omid.library.adcolony;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.adcolony.c */
/* loaded from: classes3.dex */
public final class C8736c {

    /* renamed from: a */
    public static final Pattern f16612a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b */
    public static final Pattern f16613b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c */
    public static final Pattern f16614c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d */
    public static final Pattern f16615d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e */
    public static final Pattern f16616e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f */
    public static final Pattern f16617f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g */
    public static final Pattern f16618g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* renamed from: a */
    public static boolean m3180a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        boolean z;
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (iArr != null) {
                for (int[] iArr2 : iArr) {
                    if (start >= iArr2[0] && start <= iArr2[1]) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3179b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        boolean z;
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (iArr != null) {
                for (int[] iArr2 : iArr) {
                    if (start >= iArr2[0] && start <= iArr2[1]) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
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
