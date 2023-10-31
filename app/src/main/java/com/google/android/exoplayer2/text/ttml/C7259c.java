package com.google.android.exoplayer2.text.ttml;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.text.ttml.c */
/* loaded from: classes.dex */
public final class C7259c {
    @Nullable

    /* renamed from: a */
    public final String f13272a;
    @Nullable

    /* renamed from: b */
    public final String f13273b;

    /* renamed from: c */
    public final boolean f13274c;

    /* renamed from: d */
    public final long f13275d;

    /* renamed from: e */
    public final long f13276e;
    @Nullable

    /* renamed from: f */
    public final TtmlStyle f13277f;
    @Nullable

    /* renamed from: g */
    public final String[] f13278g;

    /* renamed from: h */
    public final String f13279h;
    @Nullable

    /* renamed from: i */
    public final String f13280i;
    @Nullable

    /* renamed from: j */
    public final C7259c f13281j;

    /* renamed from: k */
    public final HashMap<String, Integer> f13282k;

    /* renamed from: l */
    public final HashMap<String, Integer> f13283l;

    /* renamed from: m */
    public ArrayList f13284m;

    public C7259c(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable TtmlStyle ttmlStyle, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable C7259c c7259c) {
        boolean z;
        this.f13272a = str;
        this.f13273b = str2;
        this.f13280i = str4;
        this.f13277f = ttmlStyle;
        this.f13278g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f13274c = z;
        this.f13275d = j;
        this.f13276e = j2;
        str3.getClass();
        this.f13279h = str3;
        this.f13281j = c7259c;
        this.f13282k = new HashMap<>();
        this.f13283l = new HashMap<>();
    }

    /* renamed from: a */
    public static C7259c m5311a(String str) {
        return new C7259c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: e */
    public static SpannableStringBuilder m5307e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            Cue.C7206a c7206a = new Cue.C7206a();
            c7206a.f12986a = new SpannableStringBuilder();
            treeMap.put(str, c7206a);
        }
        CharSequence charSequence = ((Cue.C7206a) treeMap.get(str)).f12986a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* renamed from: b */
    public final C7259c m5310b(int i) {
        ArrayList arrayList = this.f13284m;
        if (arrayList != null) {
            return (C7259c) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: c */
    public final int m5309c() {
        ArrayList arrayList = this.f13284m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: d */
    public final void m5308d(TreeSet<Long> treeSet, boolean z) {
        String str = this.f13272a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.f13280i != null)) {
            long j = this.f13275d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f13276e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f13284m == null) {
            return;
        }
        for (int i = 0; i < this.f13284m.size(); i++) {
            ((C7259c) this.f13284m.get(i)).m5308d(treeSet, z || equals);
        }
    }

    /* renamed from: f */
    public final boolean m5306f(long j) {
        long j2 = this.f13275d;
        int i = (j2 > (-9223372036854775807L) ? 1 : (j2 == (-9223372036854775807L) ? 0 : -1));
        long j3 = this.f13276e;
        return (i == 0 && j3 == -9223372036854775807L) || (j2 <= j && j3 == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < j3) || (j2 <= j && j < j3));
    }

    /* renamed from: g */
    public final void m5305g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f13279h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m5306f(j) && "div".equals(this.f13272a) && (str2 = this.f13280i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m5309c(); i++) {
            m5310b(i).m5305g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0023 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5304h(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.C7259c.m5304h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    /* renamed from: i */
    public final void m5303i(long j, boolean z, String str, TreeMap treeMap) {
        String str2;
        boolean z2;
        HashMap<String, Integer> hashMap = this.f13282k;
        hashMap.clear();
        HashMap<String, Integer> hashMap2 = this.f13283l;
        hashMap2.clear();
        String str3 = this.f13272a;
        if ("metadata".equals(str3)) {
            return;
        }
        String str4 = this.f13279h;
        if ("".equals(str4)) {
            str2 = str;
        } else {
            str2 = str4;
        }
        if (this.f13274c && z) {
            SpannableStringBuilder m5307e = m5307e(str2, treeMap);
            String str5 = this.f13273b;
            str5.getClass();
            m5307e.append((CharSequence) str5);
        } else if ("br".equals(str3) && z) {
            m5307e(str2, treeMap).append('\n');
        } else if (m5306f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                CharSequence charSequence = ((Cue.C7206a) entry.getValue()).f12986a;
                charSequence.getClass();
                hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str3);
            for (int i = 0; i < m5309c(); i++) {
                C7259c m5310b = m5310b(i);
                if (!z && !equals) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                m5310b.m5303i(j, z2, str2, treeMap);
            }
            if (equals) {
                SpannableStringBuilder m5307e2 = m5307e(str2, treeMap);
                int length = m5307e2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (m5307e2.charAt(length) == ' ');
                if (length >= 0 && m5307e2.charAt(length) != '\n') {
                    m5307e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                CharSequence charSequence2 = ((Cue.C7206a) entry2.getValue()).f12986a;
                charSequence2.getClass();
                hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
