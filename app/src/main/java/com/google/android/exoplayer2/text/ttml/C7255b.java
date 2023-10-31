package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.AbstractC7207a;
import com.google.android.exoplayer2.text.C7234e;
import com.google.android.exoplayer2.text.InterfaceC7209c;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7411h0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.common.base.C7929b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.android.exoplayer2.text.ttml.b */
/* loaded from: classes.dex */
public final class C7255b extends AbstractC7207a {

    /* renamed from: n */
    public static final Pattern f13256n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o */
    public static final Pattern f13257o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p */
    public static final Pattern f13258p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q */
    public static final Pattern f13259q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r */
    public static final Pattern f13260r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s */
    public static final Pattern f13261s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t */
    public static final Pattern f13262t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u */
    public static final C7257b f13263u = new C7257b(1, 30.0f, 1);

    /* renamed from: v */
    public static final C7256a f13264v = new C7256a(15);

    /* renamed from: m */
    public final XmlPullParserFactory f13265m;

    /* renamed from: com.google.android.exoplayer2.text.ttml.b$a */
    /* loaded from: classes.dex */
    public static final class C7256a {

        /* renamed from: a */
        public final int f13266a;

        public C7256a(int i) {
            this.f13266a = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.ttml.b$b */
    /* loaded from: classes.dex */
    public static final class C7257b {

        /* renamed from: a */
        public final float f13267a;

        /* renamed from: b */
        public final int f13268b;

        /* renamed from: c */
        public final int f13269c;

        public C7257b(int i, float f, int i2) {
            this.f13267a = f;
            this.f13268b = i;
            this.f13269c = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.ttml.b$c */
    /* loaded from: classes.dex */
    public static final class C7258c {

        /* renamed from: a */
        public final int f13270a;

        /* renamed from: b */
        public final int f13271b;

        public C7258c(int i, int i2) {
            this.f13270a = i;
            this.f13271b = i2;
        }
    }

    public C7255b() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f13265m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: i */
    public static TtmlStyle m5322i(@Nullable TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    /* renamed from: j */
    public static boolean m5321j(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    @Nullable
    /* renamed from: k */
    public static Layout.Alignment m5320k(String str) {
        String m4294a = C7929b.m4294a(str);
        m4294a.getClass();
        char c = 65535;
        switch (m4294a.hashCode()) {
            case -1364013995:
                if (m4294a.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (m4294a.equals("end")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (m4294a.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (m4294a.equals("right")) {
                    c = 3;
                    break;
                }
                break;
            case 109757538:
                if (m4294a.equals("start")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* renamed from: l */
    public static C7256a m5319l(XmlPullParser xmlPullParser, C7256a c7256a) throws C7234e {
        String str;
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c7256a;
        }
        Matcher matcher = f13262t.matcher(attributeValue);
        if (!matcher.matches()) {
            if (attributeValue.length() != 0) {
                str2 = "Ignoring malformed cell resolution: ".concat(attributeValue);
            } else {
                str2 = new String("Ignoring malformed cell resolution: ");
            }
            Log.w("TtmlDecoder", str2);
            return c7256a;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new C7256a(parseInt2);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(parseInt);
            sb.append(" ");
            sb.append(parseInt2);
            throw new C7234e(sb.toString());
        } catch (NumberFormatException unused) {
            if (attributeValue.length() != 0) {
                str = "Ignoring malformed cell resolution: ".concat(attributeValue);
            } else {
                str = new String("Ignoring malformed cell resolution: ");
            }
            Log.w("TtmlDecoder", str);
            return c7256a;
        }
    }

    /* renamed from: m */
    public static void m5318m(String str, TtmlStyle ttmlStyle) throws C7234e {
        Matcher matcher;
        int i = C7408g0.f13905a;
        char c = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f13258p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            int length2 = split.length;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Invalid number of entries for fontSize: ");
            sb.append(length2);
            sb.append(".");
            throw new C7234e(sb.toString());
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    ttmlStyle.f13246j = 3;
                    break;
                case 1:
                    ttmlStyle.f13246j = 2;
                    break;
                case 2:
                    ttmlStyle.f13246j = 1;
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder(group.length() + 30);
                    sb2.append("Invalid unit for fontSize: '");
                    sb2.append(group);
                    sb2.append("'.");
                    throw new C7234e(sb2.toString());
            }
            String group2 = matcher.group(1);
            group2.getClass();
            ttmlStyle.f13247k = Float.parseFloat(group2);
            return;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 36);
        sb3.append("Invalid expression for fontSize: '");
        sb3.append(str);
        sb3.append("'.");
        throw new C7234e(sb3.toString());
    }

    /* renamed from: n */
    public static C7257b m5317n(XmlPullParser xmlPullParser) throws C7234e {
        int i;
        float f;
        int i2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i3 = C7408g0.f13905a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
            } else {
                throw new C7234e("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        C7257b c7257b = f13263u;
        int i4 = c7257b.f13268b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i4 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        } else {
            i2 = c7257b.f13269c;
        }
        return new C7257b(i4, i * f, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01af  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m5316o(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, com.google.android.exoplayer2.text.ttml.C7255b.C7256a r22, @androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.C7255b.C7258c r23, java.util.HashMap r24, java.util.HashMap r25) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.C7255b.m5316o(org.xmlpull.v1.XmlPullParser, java.util.HashMap, com.google.android.exoplayer2.text.ttml.b$a, com.google.android.exoplayer2.text.ttml.b$c, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: p */
    public static C7259c m5315p(XmlPullParser xmlPullParser, @Nullable C7259c c7259c, HashMap hashMap, C7257b c7257b) throws C7234e {
        long j;
        long j2;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle m5314q = m5314q(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c == 5 && attributeValue.startsWith("#")) {
                                    str = attributeValue.substring(1);
                                }
                            } else {
                                String trim = attributeValue.trim();
                                if (trim.isEmpty()) {
                                    split = new String[0];
                                } else {
                                    int i2 = C7408g0.f13905a;
                                    split = trim.split("\\s+", -1);
                                }
                                if (split.length > 0) {
                                    strArr = split;
                                }
                            }
                        } else {
                            j3 = m5313r(attributeValue, c7257b);
                        }
                    } else {
                        j4 = m5313r(attributeValue, c7257b);
                    }
                } else {
                    j5 = m5313r(attributeValue, c7257b);
                }
            } else if (hashMap.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
        }
        if (c7259c != null) {
            long j6 = c7259c.f13275d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (j4 == j) {
            if (j5 != j) {
                j2 = j3 + j5;
            } else if (c7259c != null) {
                long j7 = c7259c.f13276e;
                if (j7 != j) {
                    j2 = j7;
                }
            }
            return new C7259c(xmlPullParser.getName(), null, j3, j2, m5314q, strArr, str2, str, c7259c);
        }
        j2 = j4;
        return new C7259c(xmlPullParser.getName(), null, j3, j2, m5314q, strArr, str2, str, c7259c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0204, code lost:
        if (r5.equals(libv2ray.V2rayConfig.DEFAULT_SECURITY) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0444, code lost:
        if (r5.equals("linethrough") == false) goto L209;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02b8  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.text.ttml.TtmlStyle m5314q(org.xmlpull.v1.XmlPullParser r16, com.google.android.exoplayer2.text.ttml.TtmlStyle r17) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.C7255b.m5314q(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlStyle):com.google.android.exoplayer2.text.ttml.TtmlStyle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m5313r(java.lang.String r13, com.google.android.exoplayer2.text.ttml.C7255b.C7257b r14) throws com.google.android.exoplayer2.text.C7234e {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.C7255b.m5313r(java.lang.String, com.google.android.exoplayer2.text.ttml.b$b):long");
    }

    @Nullable
    /* renamed from: s */
    public static C7258c m5312s(XmlPullParser xmlPullParser) {
        String str;
        String str2;
        String m5075a = C7411h0.m5075a(xmlPullParser, "extent");
        if (m5075a == null) {
            return null;
        }
        Matcher matcher = f13261s.matcher(m5075a);
        if (!matcher.matches()) {
            if (m5075a.length() != 0) {
                str2 = "Ignoring non-pixel tts extent: ".concat(m5075a);
            } else {
                str2 = new String("Ignoring non-pixel tts extent: ");
            }
            Log.w("TtmlDecoder", str2);
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C7258c(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            if (m5075a.length() != 0) {
                str = "Ignoring malformed tts extent: ".concat(m5075a);
            } else {
                str = new String("Ignoring malformed tts extent: ");
            }
            Log.w("TtmlDecoder", str);
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.text.AbstractC7207a
    /* renamed from: h */
    public final InterfaceC7209c mo5287h(byte[] bArr, int i, boolean z) throws C7234e {
        C7256a c7256a;
        C7257b c7257b;
        String str;
        try {
            XmlPullParser newPullParser = this.f13265m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C7260d("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C7258c c7258c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C7257b c7257b2 = f13263u;
            C7256a c7256a2 = f13264v;
            int i2 = 0;
            C7262f c7262f = null;
            C7256a c7256a3 = c7256a2;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C7259c c7259c = (C7259c) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c7257b2 = m5317n(newPullParser);
                            c7256a3 = m5319l(newPullParser, c7256a2);
                            c7258c = m5312s(newPullParser);
                        }
                        C7256a c7256a4 = c7256a3;
                        C7258c c7258c2 = c7258c;
                        C7257b c7257b3 = c7257b2;
                        if (!m5321j(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            if (valueOf.length() != 0) {
                                str = "Ignoring unsupported tag: ".concat(valueOf);
                            } else {
                                str = new String("Ignoring unsupported tag: ");
                            }
                            Log.i("TtmlDecoder", str);
                            i2++;
                            c7256a = c7256a4;
                            c7257b = c7257b3;
                        } else if ("head".equals(name)) {
                            c7256a = c7256a4;
                            c7257b = c7257b3;
                            m5316o(newPullParser, hashMap, c7256a4, c7258c2, hashMap2, hashMap3);
                        } else {
                            c7256a = c7256a4;
                            c7257b = c7257b3;
                            try {
                                C7259c m5315p = m5315p(newPullParser, c7259c, hashMap2, c7257b);
                                arrayDeque.push(m5315p);
                                if (c7259c != null) {
                                    if (c7259c.f13284m == null) {
                                        c7259c.f13284m = new ArrayList();
                                    }
                                    c7259c.f13284m.add(m5315p);
                                }
                            } catch (C7234e e) {
                                C7421n.m5055c("TtmlDecoder", "Suppressing parser error", e);
                                i2++;
                            }
                        }
                        c7256a3 = c7256a;
                        c7257b2 = c7257b;
                        c7258c = c7258c2;
                    } else if (eventType == 4) {
                        c7259c.getClass();
                        C7259c m5311a = C7259c.m5311a(newPullParser.getText());
                        if (c7259c.f13284m == null) {
                            c7259c.f13284m = new ArrayList();
                        }
                        c7259c.f13284m.add(m5311a);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            C7259c c7259c2 = (C7259c) arrayDeque.peek();
                            c7259c2.getClass();
                            c7262f = new C7262f(c7259c2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (c7262f != null) {
                return c7262f;
            }
            throw new C7234e("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new C7234e("Unable to decode source", e3);
        }
    }
}
