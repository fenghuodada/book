package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.InterfaceC7167g0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.c1 */
/* loaded from: classes.dex */
public final class C6737c1 extends AbstractC6631a {

    /* renamed from: f */
    public final int f10891f;

    /* renamed from: g */
    public final int f10892g;

    /* renamed from: h */
    public final int[] f10893h;

    /* renamed from: i */
    public final int[] f10894i;

    /* renamed from: j */
    public final AbstractC6984j1[] f10895j;

    /* renamed from: k */
    public final Object[] f10896k;

    /* renamed from: l */
    public final HashMap<Object, Integer> f10897l;

    public C6737c1(List list, InterfaceC7167g0 interfaceC7167g0) {
        super(interfaceC7167g0);
        int size = list.size();
        this.f10893h = new int[size];
        this.f10894i = new int[size];
        this.f10895j = new AbstractC6984j1[size];
        this.f10896k = new Object[size];
        this.f10897l = new HashMap<>();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            InterfaceC7443v0 interfaceC7443v0 = (InterfaceC7443v0) it.next();
            this.f10895j[i3] = interfaceC7443v0.mo4870b();
            this.f10894i[i3] = i;
            this.f10893h[i3] = i2;
            i += this.f10895j[i3].mo5409o();
            i2 += this.f10895j[i3].mo5412h();
            this.f10896k[i3] = interfaceC7443v0.mo4871a();
            this.f10897l.put(this.f10896k[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f10891f = i;
        this.f10892g = i2;
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: h */
    public final int mo5412h() {
        return this.f10892g;
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: o */
    public final int mo5409o() {
        return this.f10891f;
    }
}
