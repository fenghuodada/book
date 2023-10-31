package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.datatransport.runtime.scheduling.persistence.C6567a0;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6843k;
import com.google.android.exoplayer2.extractor.wav.C6956a;
import com.google.android.exoplayer2.util.C7409h;
import com.google.android.exoplayer2.util.C7417m;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.y */
/* loaded from: classes.dex */
public final /* synthetic */ class C6605y implements C6567a0.InterfaceC6568a, C7417m.InterfaceC7419b, InterfaceC6843k, C7417m.InterfaceC7418a {
    public /* synthetic */ C6605y() {
    }

    public /* synthetic */ C6605y(AnalyticsListener.C6634a c6634a) {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6843k
    /* renamed from: a */
    public Extractor[] mo5492a(Uri uri, Map map) {
        return m6228c();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7419b
    /* renamed from: b */
    public void mo5058b(Object obj, C7409h c7409h) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
    }

    /* renamed from: c */
    public Extractor[] m6228c() {
        return new Extractor[]{new C6956a()};
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6202H();
    }
}
