package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.util.Base64;
import com.google.android.datatransport.runtime.AbstractC6522n;
import com.google.android.datatransport.runtime.C6496d;
import com.google.android.datatransport.runtime.scheduling.persistence.C6567a0;
import com.google.android.datatransport.runtime.util.C6619a;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.C7417m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.C10940a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C6595o implements C6567a0.InterfaceC6568a, C7417m.InterfaceC7418a {
    public /* synthetic */ C6595o() {
    }

    public /* synthetic */ C6595o(AnalyticsListener.C6634a c6634a, C7003m0 c7003m0, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    /* renamed from: a */
    public static /* synthetic */ Iterator m6229a() {
        try {
            return Arrays.asList(new C10940a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
    public Object apply(Object obj) {
        byte[] decode;
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C6496d.C6497a m6278a = AbstractC6522n.m6278a();
            m6278a.m6300b(cursor.getString(1));
            m6278a.m6299c(C6619a.m6224b(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string == null) {
                decode = null;
            } else {
                decode = Base64.decode(string, 0);
            }
            m6278a.f10232b = decode;
            arrayList.add(m6278a.m6301a());
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.m6178d();
        analyticsListener.m6191S();
        analyticsListener.m6209A();
    }
}
