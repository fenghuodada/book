package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.e */
/* loaded from: classes.dex */
public abstract class AbstractC7358e implements InterfaceC7363i {

    /* renamed from: a */
    public final boolean f13757a;

    /* renamed from: b */
    public final ArrayList<InterfaceC7351c0> f13758b = new ArrayList<>(1);

    /* renamed from: c */
    public int f13759c;
    @Nullable

    /* renamed from: d */
    public DataSpec f13760d;

    public AbstractC7358e(boolean z) {
        this.f13757a = z;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: c */
    public final void mo5158c(InterfaceC7351c0 interfaceC7351c0) {
        interfaceC7351c0.getClass();
        ArrayList<InterfaceC7351c0> arrayList = this.f13758b;
        if (!arrayList.contains(interfaceC7351c0)) {
            arrayList.add(interfaceC7351c0);
            this.f13759c++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: h */
    public Map mo5154h() {
        return Collections.emptyMap();
    }

    /* renamed from: l */
    public final void m5175l(int i) {
        DataSpec dataSpec = this.f13760d;
        int i2 = C7408g0.f13905a;
        for (int i3 = 0; i3 < this.f13759c; i3++) {
            this.f13758b.get(i3).mo5168a(dataSpec, this.f13757a, i);
        }
    }

    /* renamed from: m */
    public final void m5174m() {
        DataSpec dataSpec = this.f13760d;
        int i = C7408g0.f13905a;
        for (int i2 = 0; i2 < this.f13759c; i2++) {
            this.f13758b.get(i2).mo5167b(dataSpec, this.f13757a);
        }
        this.f13760d = null;
    }

    /* renamed from: n */
    public final void m5173n(DataSpec dataSpec) {
        for (int i = 0; i < this.f13759c; i++) {
            this.f13758b.get(i).mo5166c();
        }
    }

    /* renamed from: o */
    public final void m5172o(DataSpec dataSpec) {
        this.f13760d = dataSpec;
        for (int i = 0; i < this.f13759c; i++) {
            this.f13758b.get(i).mo5163f(dataSpec, this.f13757a);
        }
    }
}
