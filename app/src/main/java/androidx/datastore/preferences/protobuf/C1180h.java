package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1183i;

/* renamed from: androidx.datastore.preferences.protobuf.h */
/* loaded from: classes.dex */
public final class C1180h extends AbstractC1183i.AbstractC1184a {

    /* renamed from: a */
    public int f2979a = 0;

    /* renamed from: b */
    public final int f2980b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC1183i f2981c;

    public C1180h(AbstractC1183i abstractC1183i) {
        this.f2981c = abstractC1183i;
        this.f2980b = abstractC1183i.size();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return this.f2979a < this.f2980b;
    }
}
