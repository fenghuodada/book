package com.google.android.exoplayer2.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7209c;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.text.ttml.f */
/* loaded from: classes.dex */
public final class C7262f implements InterfaceC7209c {

    /* renamed from: a */
    public final C7259c f13295a;

    /* renamed from: b */
    public final long[] f13296b;

    /* renamed from: c */
    public final Map<String, TtmlStyle> f13297c;

    /* renamed from: d */
    public final Map<String, C7260d> f13298d;

    /* renamed from: e */
    public final Map<String, String> f13299e;

    public C7262f(C7259c c7259c, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f13295a = c7259c;
        this.f13298d = hashMap2;
        this.f13299e = hashMap3;
        this.f13297c = Collections.unmodifiableMap(hashMap);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        c7259c.m5308d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.f13296b = jArr;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: a */
    public final int mo5283a(long j) {
        long[] jArr = this.f13296b;
        int m5104b = C7408g0.m5104b(jArr, j, false);
        if (m5104b < jArr.length) {
            return m5104b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: b */
    public final long mo5282b(int i) {
        return this.f13296b[i];
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: c */
    public final List<Cue> mo5281c(long j) {
        C7254a[] c7254aArr;
        Map<String, TtmlStyle> map = this.f13297c;
        Map<String, C7260d> map2 = this.f13298d;
        C7259c c7259c = this.f13295a;
        c7259c.getClass();
        ArrayList arrayList = new ArrayList();
        c7259c.m5305g(j, c7259c.f13279h, arrayList);
        TreeMap treeMap = new TreeMap();
        c7259c.m5303i(j, false, c7259c.f13279h, treeMap);
        c7259c.m5304h(j, map, map2, c7259c.f13279h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = this.f13299e.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C7260d c7260d = map2.get(pair.first);
                c7260d.getClass();
                Cue.C7206a c7206a = new Cue.C7206a();
                c7206a.f12987b = decodeByteArray;
                c7206a.f12993h = c7260d.f13286b;
                c7206a.f12994i = 0;
                c7206a.f12990e = c7260d.f13287c;
                c7206a.f12991f = 0;
                c7206a.f12992g = c7260d.f13289e;
                c7206a.f12997l = c7260d.f13290f;
                c7206a.f12998m = c7260d.f13291g;
                c7206a.f13001p = c7260d.f13294j;
                arrayList2.add(c7206a.m5372a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C7260d c7260d2 = map2.get(entry.getKey());
            c7260d2.getClass();
            Cue.C7206a c7206a2 = (Cue.C7206a) entry.getValue();
            CharSequence charSequence = c7206a2.f12986a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C7254a c7254a : (C7254a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C7254a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c7254a), spannableStringBuilder.getSpanEnd(c7254a), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c7206a2.f12990e = c7260d2.f13287c;
            c7206a2.f12991f = c7260d2.f13288d;
            c7206a2.f12992g = c7260d2.f13289e;
            c7206a2.f12993h = c7260d2.f13286b;
            c7206a2.f12997l = c7260d2.f13290f;
            c7206a2.f12996k = c7260d2.f13293i;
            c7206a2.f12995j = c7260d2.f13292h;
            c7206a2.f13001p = c7260d2.f13294j;
            arrayList2.add(c7206a2.m5372a());
        }
        return arrayList2;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: d */
    public final int mo5280d() {
        return this.f13296b.length;
    }
}
