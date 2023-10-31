package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7209c;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.webvtt.j */
/* loaded from: classes.dex */
public final class C7278j implements InterfaceC7209c {

    /* renamed from: a */
    public final List<C7268d> f13361a;

    /* renamed from: b */
    public final long[] f13362b;

    /* renamed from: c */
    public final long[] f13363c;

    public C7278j(ArrayList arrayList) {
        this.f13361a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f13362b = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            C7268d c7268d = (C7268d) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f13362b;
            jArr[i2] = c7268d.f13333b;
            jArr[i2 + 1] = c7268d.f13334c;
        }
        long[] jArr2 = this.f13362b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f13363c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: a */
    public final int mo5283a(long j) {
        long[] jArr = this.f13363c;
        int m5104b = C7408g0.m5104b(jArr, j, false);
        if (m5104b < jArr.length) {
            return m5104b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: b */
    public final long mo5282b(int i) {
        C7394a.m5134a(i >= 0);
        long[] jArr = this.f13363c;
        C7394a.m5134a(i < jArr.length);
        return jArr[i];
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: c */
    public final List<Cue> mo5281c(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List<C7268d> list = this.f13361a;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.f13362b;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C7268d c7268d = list.get(i);
                Cue cue = c7268d.f13332a;
                if (cue.f12973e == -3.4028235E38f) {
                    arrayList2.add(c7268d);
                } else {
                    arrayList.add(cue);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((C7268d) obj).f13333b, ((C7268d) obj2).f13333b);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            Cue cue2 = ((C7268d) arrayList2.get(i3)).f13332a;
            cue2.getClass();
            arrayList.add(new Cue(cue2.f12969a, cue2.f12970b, cue2.f12971c, cue2.f12972d, (-1) - i3, 1, cue2.f12975g, cue2.f12976h, cue2.f12977i, cue2.f12982n, cue2.f12983o, cue2.f12978j, cue2.f12979k, cue2.f12980l, cue2.f12981m, cue2.f12984p, cue2.f12985q));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: d */
    public final int mo5280d() {
        return this.f13363c.length;
    }
}
