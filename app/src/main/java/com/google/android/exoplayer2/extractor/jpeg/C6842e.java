package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.jpeg.C6837b;
import com.google.android.exoplayer2.util.C7411h0;
import com.google.common.collect.AbstractC8013s;
import com.google.common.collect.C7998n0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.exoplayer2.extractor.jpeg.e */
/* loaded from: classes.dex */
public final class C6842e {

    /* renamed from: a */
    public static final String[] f11203a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f11204b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f11205c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r9 == (-1)) goto L45;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.extractor.jpeg.C6837b m5923a(java.lang.String r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.jpeg.C6842e.m5923a(java.lang.String):com.google.android.exoplayer2.extractor.jpeg.b");
    }

    /* renamed from: b */
    public static C7998n0 m5922b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        long j2;
        AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
        AbstractC8013s.C8014a c8014a = new AbstractC8013s.C8014a();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (C7411h0.m5073c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String m5075a = C7411h0.m5075a(xmlPullParser, concat3);
                String m5075a2 = C7411h0.m5075a(xmlPullParser, concat4);
                String m5075a3 = C7411h0.m5075a(xmlPullParser, concat5);
                String m5075a4 = C7411h0.m5075a(xmlPullParser, concat6);
                if (m5075a != null && m5075a2 != null) {
                    if (m5075a3 != null) {
                        j = Long.parseLong(m5075a3);
                    } else {
                        j = 0;
                    }
                    if (m5075a4 != null) {
                        j2 = Long.parseLong(m5075a4);
                    } else {
                        j2 = 0;
                    }
                    c8014a.m4242b(new C6837b.C6838a(m5075a, j, j2));
                } else {
                    return C7998n0.f15785e;
                }
            }
        } while (!C7411h0.m5074b(xmlPullParser, concat2));
        return c8014a.m4241c();
    }
}
