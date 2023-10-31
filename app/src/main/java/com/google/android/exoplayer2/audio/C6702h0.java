package com.google.android.exoplayer2.audio;

import android.os.Trace;
import com.google.android.exoplayer2.util.C7408g0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.audio.h0 */
/* loaded from: classes.dex */
public final class C6702h0 {
    /* renamed from: a */
    public static void m6062a(String str) {
        if (C7408g0.f13905a >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static ArrayList m6061b(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* renamed from: c */
    public static void m6060c() {
        if (C7408g0.f13905a >= 18) {
            Trace.endSection();
        }
    }
}
