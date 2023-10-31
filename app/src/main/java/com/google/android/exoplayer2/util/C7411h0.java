package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.exoplayer2.util.h0 */
/* loaded from: classes.dex */
public final class C7411h0 {
    @Nullable
    /* renamed from: a */
    public static String m5075a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m5074b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        boolean z;
        if (xmlPullParser.getEventType() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m5073c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        boolean z;
        if (xmlPullParser.getEventType() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }
}
