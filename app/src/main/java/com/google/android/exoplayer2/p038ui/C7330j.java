package com.google.android.exoplayer2.p038ui;

import android.text.Html;
import com.google.android.exoplayer2.p038ui.C7330j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.ui.j */
/* loaded from: classes.dex */
public final class C7330j {

    /* renamed from: a */
    public static final Pattern f13658a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: com.google.android.exoplayer2.ui.j$a */
    /* loaded from: classes.dex */
    public static class C7331a {

        /* renamed from: a */
        public final String f13659a;

        public C7331a(String str) {
            this.f13659a = str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.j$b */
    /* loaded from: classes.dex */
    public static final class C7332b {

        /* renamed from: e */
        public static final C7334k f13660e = new Comparator() { // from class: com.google.android.exoplayer2.ui.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C7330j.C7332b c7332b = (C7330j.C7332b) obj;
                C7330j.C7332b c7332b2 = (C7330j.C7332b) obj2;
                int compare = Integer.compare(c7332b2.f13663b, c7332b.f13663b);
                if (compare == 0) {
                    int compareTo = c7332b.f13664c.compareTo(c7332b2.f13664c);
                    if (compareTo == 0) {
                        return c7332b.f13665d.compareTo(c7332b2.f13665d);
                    }
                    return compareTo;
                }
                return compare;
            }
        };

        /* renamed from: f */
        public static final C7335l f13661f = new Comparator() { // from class: com.google.android.exoplayer2.ui.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C7330j.C7332b c7332b = (C7330j.C7332b) obj;
                C7330j.C7332b c7332b2 = (C7330j.C7332b) obj2;
                int compare = Integer.compare(c7332b2.f13662a, c7332b.f13662a);
                if (compare == 0) {
                    int compareTo = c7332b2.f13664c.compareTo(c7332b.f13664c);
                    if (compareTo == 0) {
                        return c7332b2.f13665d.compareTo(c7332b.f13665d);
                    }
                    return compareTo;
                }
                return compare;
            }
        };

        /* renamed from: a */
        public final int f13662a;

        /* renamed from: b */
        public final int f13663b;

        /* renamed from: c */
        public final String f13664c;

        /* renamed from: d */
        public final String f13665d;

        public C7332b(int i, int i2, String str, String str2) {
            this.f13662a = i;
            this.f13663b = i2;
            this.f13664c = str;
            this.f13665d = str2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.j$c */
    /* loaded from: classes.dex */
    public static final class C7333c {

        /* renamed from: a */
        public final ArrayList f13666a = new ArrayList();

        /* renamed from: b */
        public final ArrayList f13667b = new ArrayList();
    }

    /* renamed from: a */
    public static String m5190a(CharSequence charSequence) {
        return f13658a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
