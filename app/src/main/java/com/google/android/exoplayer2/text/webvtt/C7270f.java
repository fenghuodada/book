package com.google.android.exoplayer2.text.webvtt;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.webvtt.C7270f;
import com.google.android.exoplayer2.util.C7436v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.webvtt.f */
/* loaded from: classes.dex */
public final class C7270f {

    /* renamed from: a */
    public static final Pattern f13335a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final Pattern f13336b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final Map<String, Integer> f13337c;

    /* renamed from: d */
    public static final Map<String, Integer> f13338d;

    /* renamed from: com.google.android.exoplayer2.text.webvtt.f$a */
    /* loaded from: classes.dex */
    public static class C7271a {

        /* renamed from: c */
        public static final C7269e f13339c = new Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((C7270f.C7271a) obj).f13340a.f13343b, ((C7270f.C7271a) obj2).f13340a.f13343b);
            }
        };

        /* renamed from: a */
        public final C7272b f13340a;

        /* renamed from: b */
        public final int f13341b;

        public C7271a(C7272b c7272b, int i) {
            this.f13340a = c7272b;
            this.f13341b = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.webvtt.f$b */
    /* loaded from: classes.dex */
    public static final class C7272b {

        /* renamed from: a */
        public final String f13342a;

        /* renamed from: b */
        public final int f13343b;

        /* renamed from: c */
        public final String f13344c;

        /* renamed from: d */
        public final Set<String> f13345d;

        public C7272b(String str, int i, String str2, Set<String> set) {
            this.f13343b = i;
            this.f13342a = str;
            this.f13344c = str2;
            this.f13345d = set;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.webvtt.f$c */
    /* loaded from: classes.dex */
    public static final class C7273c implements Comparable<C7273c> {

        /* renamed from: a */
        public final int f13346a;

        /* renamed from: b */
        public final WebvttCssStyle f13347b;

        public C7273c(int i, WebvttCssStyle webvttCssStyle) {
            this.f13346a = i;
            this.f13347b = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public final int compareTo(C7273c c7273c) {
            return Integer.compare(this.f13346a, c7273c.f13346a);
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.webvtt.f$d */
    /* loaded from: classes.dex */
    public static final class C7274d {

        /* renamed from: c */
        public CharSequence f13350c;

        /* renamed from: a */
        public long f13348a = 0;

        /* renamed from: b */
        public long f13349b = 0;

        /* renamed from: d */
        public int f13351d = 2;

        /* renamed from: e */
        public float f13352e = -3.4028235E38f;

        /* renamed from: f */
        public int f13353f = 1;

        /* renamed from: g */
        public int f13354g = 0;

        /* renamed from: h */
        public float f13355h = -3.4028235E38f;

        /* renamed from: i */
        public int f13356i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f13357j = 1.0f;

        /* renamed from: k */
        public int f13358k = Integer.MIN_VALUE;

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0072, code lost:
            if (r7 == 0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.android.exoplayer2.text.Cue.C7206a m5288a() {
            /*
                Method dump skipped, instructions count: 179
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.C7270f.C7274d.m5288a():com.google.android.exoplayer2.text.Cue$a");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f13337c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f13338d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x025c A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m5296a(android.text.SpannableStringBuilder r19, com.google.android.exoplayer2.text.webvtt.C7270f.C7272b r20, @androidx.annotation.Nullable java.lang.String r21, java.util.List r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.C7270f.m5296a(android.text.SpannableStringBuilder, com.google.android.exoplayer2.text.webvtt.f$b, java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static ArrayList m5295b(List list, @Nullable String str, C7272b c7272b) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            WebvttCssStyle webvttCssStyle = (WebvttCssStyle) list.get(i2);
            String str2 = c7272b.f13342a;
            if (webvttCssStyle.f13309a.isEmpty() && webvttCssStyle.f13310b.isEmpty() && webvttCssStyle.f13311c.isEmpty() && webvttCssStyle.f13312d.isEmpty()) {
                i = TextUtils.isEmpty(str2);
            } else {
                int m5300a = WebvttCssStyle.m5300a(WebvttCssStyle.m5300a(WebvttCssStyle.m5300a(0, 1073741824, webvttCssStyle.f13309a, str), 2, webvttCssStyle.f13310b, str2), 4, webvttCssStyle.f13312d, c7272b.f13344c);
                if (m5300a != -1) {
                    if (c7272b.f13345d.containsAll(webvttCssStyle.f13311c)) {
                        i = m5300a + (webvttCssStyle.f13311c.size() * 4);
                    }
                }
                i = 0;
            }
            if (i > 0) {
                arrayList.add(new C7273c(i, webvttCssStyle));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static int m5294c(List<WebvttCssStyle> list, @Nullable String str, C7272b c7272b) {
        ArrayList m5295b = m5295b(list, str, c7272b);
        for (int i = 0; i < m5295b.size(); i++) {
            int i2 = ((C7273c) m5295b.get(i)).f13347b.f13324p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    @Nullable
    /* renamed from: d */
    public static C7268d m5293d(@Nullable String str, Matcher matcher, C7436v c7436v, ArrayList arrayList) {
        String str2;
        C7274d c7274d = new C7274d();
        try {
            String group = matcher.group(1);
            group.getClass();
            c7274d.f13348a = C7276h.m5285b(group);
            String group2 = matcher.group(2);
            group2.getClass();
            c7274d.f13349b = C7276h.m5285b(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            m5292e(group3, c7274d);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String m5014d = c7436v.m5014d();
                if (!TextUtils.isEmpty(m5014d)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(m5014d.trim());
                } else {
                    c7274d.f13350c = m5291f(str, sb.toString(), arrayList);
                    return new C7268d(c7274d.m5288a().m5372a(), c7274d.f13348a, c7274d.f13349b);
                }
            }
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            if (valueOf.length() != 0) {
                str2 = "Skipping cue with bad header: ".concat(valueOf);
            } else {
                str2 = new String("Skipping cue with bad header: ");
            }
            Log.w("WebvttCueParser", str2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    public static void m5292e(String str, C7274d c7274d) {
        String str2;
        String str3;
        String str4;
        Matcher matcher = f13336b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    m5290g(group2, c7274d);
                } else if ("align".equals(group)) {
                    char c = 65535;
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            break;
                        default:
                            if (group2.length() != 0) {
                                str3 = "Invalid alignment value: ".concat(group2);
                            } else {
                                str3 = new String("Invalid alignment value: ");
                            }
                            Log.w("WebvttCueParser", str3);
                            i = 2;
                            break;
                    }
                    c7274d.f13351d = i;
                } else if ("position".equals(group)) {
                    m5289h(group2, c7274d);
                } else if ("size".equals(group)) {
                    c7274d.f13357j = C7276h.m5286a(group2);
                } else if ("vertical".equals(group)) {
                    if (!group2.equals("lr")) {
                        if (!group2.equals("rl")) {
                            if (group2.length() != 0) {
                                str4 = "Invalid 'vertical' value: ".concat(group2);
                            } else {
                                str4 = new String("Invalid 'vertical' value: ");
                            }
                            Log.w("WebvttCueParser", str4);
                            i = Integer.MIN_VALUE;
                        }
                    } else {
                        i = 2;
                    }
                    c7274d.f13358k = i;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    Log.w("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(matcher.group());
                if (valueOf.length() != 0) {
                    str2 = "Skipping bad cue setting: ".concat(valueOf);
                } else {
                    str2 = new String("Skipping bad cue setting: ");
                }
                Log.w("WebvttCueParser", str2);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString m5291f(@androidx.annotation.Nullable java.lang.String r16, java.lang.String r17, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> r18) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.C7270f.m5291f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* renamed from: g */
    public static void m5290g(String str, C7274d c7274d) {
        String str2;
        int indexOf = str.indexOf(44);
        char c = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    if (substring.length() != 0) {
                        str2 = "Invalid anchor value: ".concat(substring);
                    } else {
                        str2 = new String("Invalid anchor value: ");
                    }
                    Log.w("WebvttCueParser", str2);
                    i = Integer.MIN_VALUE;
                    break;
            }
            c7274d.f13354g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c7274d.f13352e = C7276h.m5286a(str);
            c7274d.f13353f = 0;
            return;
        }
        c7274d.f13352e = Integer.parseInt(str);
        c7274d.f13353f = 1;
    }

    /* renamed from: h */
    public static void m5289h(String str, C7274d c7274d) {
        String str2;
        int indexOf = str.indexOf(44);
        char c = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i = 2;
            switch (substring.hashCode()) {
                case -1842484672:
                    if (substring.equals("line-left")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1364013995:
                    if (substring.equals("center")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1276788989:
                    if (substring.equals("line-right")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c = 3;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c = 4;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 5:
                    i = 0;
                    break;
                case 1:
                case 3:
                    i = 1;
                    break;
                case 2:
                case 4:
                    break;
                default:
                    if (substring.length() != 0) {
                        str2 = "Invalid anchor value: ".concat(substring);
                    } else {
                        str2 = new String("Invalid anchor value: ");
                    }
                    Log.w("WebvttCueParser", str2);
                    i = Integer.MIN_VALUE;
                    break;
            }
            c7274d.f13356i = i;
            str = str.substring(0, indexOf);
        }
        c7274d.f13355h = C7276h.m5286a(str);
    }
}
