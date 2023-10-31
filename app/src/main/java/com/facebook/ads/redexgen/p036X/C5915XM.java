package com.facebook.ads.redexgen.p036X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.XM */
/* loaded from: assets/audience_network.dex */
public class C5915XM implements InterfaceC44979q {
    public final List<C45029v> A00 = new ArrayList();
    public final boolean A01;
    public final /* synthetic */ C5914XL A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public C5915XM(C5914XL c5914xl, List<C44939m> list, boolean z) throws IOException {
        this.A02 = c5914xl;
        this.A01 = z;
        for (C44939m c44939m : list) {
            C44929l A01 = c44939m.A01();
            this.A00.add(new C45029v(new C44909j(c44939m.A00(), A01.A01()), A01.A00() - A01.A01(), A01.A00()));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C45029v A00() {
        return this.A00.get(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C45029v A01() {
        List<C45029v> list = this.A00;
        return list.get(list.size() - 1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44979q
    public final void A4i() throws C4507A0 {
        this.A02.A03(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44979q
    public final synchronized int A5N() {
        int i;
        i = 0;
        for (C45029v location : this.A00) {
            i += location.A01;
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44979q
    public final boolean A9V() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.A06(this);
    }
}
