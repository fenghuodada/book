package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.extractor.flv.C6826b;
import com.google.android.exoplayer2.extractor.jpeg.C6836a;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ogg.C6891c;
import com.google.android.exoplayer2.extractor.p037ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.p037ts.C6914a;
import com.google.android.exoplayer2.extractor.p037ts.C6917c;
import com.google.android.exoplayer2.extractor.p037ts.C6942u;
import com.google.android.exoplayer2.extractor.p037ts.TsExtractor;
import com.google.android.exoplayer2.extractor.wav.C6956a;
import com.google.android.exoplayer2.util.FileTypes;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.f */
/* loaded from: classes.dex */
public final class C6821f implements InterfaceC6843k {

    /* renamed from: b */
    public static final int[] f11130b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    @Nullable

    /* renamed from: c */
    public static final Constructor<? extends Extractor> f11131c;

    static {
        Constructor<? extends Extractor> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f11131c = constructor;
    }

    /* renamed from: b */
    public static void m5944b(int i, ArrayList arrayList) {
        Extractor c6914a;
        switch (i) {
            case 0:
                c6914a = new C6914a();
                break;
            case 1:
                c6914a = new C6917c();
                break;
            case 2:
                c6914a = new AdtsExtractor();
                break;
            case 3:
                c6914a = new AmrExtractor();
                break;
            case 4:
                Constructor<? extends Extractor> constructor = f11131c;
                if (constructor == null) {
                    c6914a = new FlacExtractor();
                    break;
                } else {
                    try {
                        arrayList.add(constructor.newInstance(0));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                }
            case 5:
                c6914a = new C6826b();
                break;
            case 6:
                c6914a = new MatroskaExtractor();
                break;
            case 7:
                c6914a = new Mp3Extractor(0);
                break;
            case 8:
                arrayList.add(new FragmentedMp4Extractor());
                c6914a = new Mp4Extractor(0);
                break;
            case 9:
                c6914a = new C6891c();
                break;
            case 10:
                c6914a = new C6942u();
                break;
            case 11:
                c6914a = new TsExtractor();
                break;
            case 12:
                c6914a = new C6956a();
                break;
            case 13:
            default:
                return;
            case 14:
                c6914a = new C6836a();
                break;
        }
        arrayList.add(c6914a);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6843k
    /* renamed from: a */
    public final synchronized Extractor[] mo5492a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int m5136a = FileTypes.m5136a(map);
        if (m5136a != -1) {
            m5944b(m5136a, arrayList);
        }
        int m5135b = FileTypes.m5135b(uri);
        if (m5135b != -1 && m5135b != m5136a) {
            m5944b(m5135b, arrayList);
        }
        int[] iArr = f11130b;
        for (int i = 0; i < 14; i++) {
            int i2 = iArr[i];
            if (i2 != m5136a && i2 != m5135b) {
                m5944b(i2, arrayList);
            }
        }
        return (Extractor[]) arrayList.toArray(new Extractor[arrayList.size()]);
    }
}
