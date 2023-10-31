package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7209c;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.ssa.c */
/* loaded from: classes.dex */
public final class C7251c implements InterfaceC7209c {

    /* renamed from: a */
    public final List<List<Cue>> f13221a;

    /* renamed from: b */
    public final List<Long> f13222b;

    public C7251c(ArrayList arrayList, ArrayList arrayList2) {
        this.f13221a = arrayList;
        this.f13222b = arrayList2;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: a */
    public final int mo5283a(long j) {
        int i;
        Long valueOf = Long.valueOf(j);
        int i2 = C7408g0.f13905a;
        List<Long> list = this.f13222b;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i = binarySearch;
        }
        if (i >= list.size()) {
            return -1;
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: b */
    public final long mo5282b(int i) {
        C7394a.m5134a(i >= 0);
        List<Long> list = this.f13222b;
        C7394a.m5134a(i < list.size());
        return list.get(i).longValue();
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: c */
    public final List<Cue> mo5281c(long j) {
        int i;
        Long valueOf = Long.valueOf(j);
        int i2 = C7408g0.f13905a;
        List<Long> list = this.f13222b;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i = binarySearch + 1;
        }
        if (i == -1) {
            return Collections.emptyList();
        }
        return this.f13221a.get(i);
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: d */
    public final int mo5280d() {
        return this.f13222b.size();
    }
}
