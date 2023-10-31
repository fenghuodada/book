package com.applovin.impl.sdk.utils;

import android.util.Xml;
import androidx.core.content.C0663f;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* renamed from: com.applovin.impl.sdk.utils.s */
/* loaded from: classes.dex */
public class C3344s {

    /* renamed from: a */
    private final C3349v f8819a;

    /* renamed from: b */
    private Stack<C3346a> f8820b;

    /* renamed from: c */
    private StringBuilder f8821c;

    /* renamed from: d */
    private long f8822d;

    /* renamed from: e */
    private C3346a f8823e;

    /* renamed from: com.applovin.impl.sdk.utils.s$a */
    /* loaded from: classes.dex */
    public static class C3346a extends C3343r {
        public C3346a(String str, Map<String, String> map, C3343r c3343r) {
            super(str, map, c3343r);
        }

        /* renamed from: a */
        public void m6866a(C3343r c3343r) {
            if (c3343r == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f8815c.add(c3343r);
        }

        /* renamed from: d */
        public void m6865d(String str) {
            this.f8814b = str;
        }
    }

    public C3344s(C3214m c3214m) {
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f8819a = c3214m.m7487A();
    }

    /* renamed from: a */
    public static C3343r m6872a(String str, C3214m c3214m) throws SAXException {
        return new C3344s(c3214m).m6873a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m6871a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap hashMap = new HashMap(length);
            for (int i = 0; i < length; i++) {
                hashMap.put(attributes.getQName(i), attributes.getValue(i));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    /* renamed from: a */
    public C3343r m6873a(String str) throws SAXException {
        if (str != null) {
            this.f8821c = new StringBuilder();
            this.f8820b = new Stack<>();
            this.f8823e = null;
            Xml.parse(str, new ContentHandler() { // from class: com.applovin.impl.sdk.utils.s.1
                @Override // org.xml.sax.ContentHandler
                public void characters(char[] cArr, int i, int i2) {
                    String trim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
                    if (StringUtils.isValidString(trim)) {
                        C3344s.this.f8821c.append(trim);
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void endDocument() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - C3344s.this.f8822d;
                    if (C3349v.m6862a()) {
                        C3349v c3349v = C3344s.this.f8819a;
                        c3349v.m6855b("XmlParser", "Finished parsing in " + seconds + " seconds");
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void endElement(String str2, String str3, String str4) {
                    C3344s c3344s = C3344s.this;
                    c3344s.f8823e = (C3346a) c3344s.f8820b.pop();
                    C3344s.this.f8823e.m6865d(C3344s.this.f8821c.toString().trim());
                    C3344s.this.f8821c.setLength(0);
                }

                @Override // org.xml.sax.ContentHandler
                public void endPrefixMapping(String str2) {
                }

                @Override // org.xml.sax.ContentHandler
                public void ignorableWhitespace(char[] cArr, int i, int i2) {
                }

                @Override // org.xml.sax.ContentHandler
                public void processingInstruction(String str2, String str3) {
                }

                @Override // org.xml.sax.ContentHandler
                public void setDocumentLocator(Locator locator) {
                }

                @Override // org.xml.sax.ContentHandler
                public void skippedEntity(String str2) {
                }

                @Override // org.xml.sax.ContentHandler
                public void startDocument() {
                    if (C3349v.m6862a()) {
                        C3344s.this.f8819a.m6855b("XmlParser", "Begin parsing...");
                    }
                    C3344s.this.f8822d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                }

                @Override // org.xml.sax.ContentHandler
                public void startElement(String str2, String str3, String str4, Attributes attributes) throws SAXException {
                    C3346a c3346a;
                    try {
                        if (!C3344s.this.f8820b.isEmpty()) {
                            c3346a = (C3346a) C3344s.this.f8820b.peek();
                        } else {
                            c3346a = null;
                        }
                        C3346a c3346a2 = new C3346a(str3, C3344s.this.m6871a(attributes), c3346a);
                        if (c3346a != null) {
                            c3346a.m6866a(c3346a2);
                        }
                        C3344s.this.f8820b.push(c3346a2);
                    } catch (Exception e) {
                        if (C3349v.m6862a()) {
                            C3344s.this.f8819a.m6854b("XmlParser", C0663f.m12005a("Unable to process element <", str3, ">"), e);
                        }
                        throw new SAXException("Failed to start element", e);
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void startPrefixMapping(String str2, String str3) {
                }
            });
            C3346a c3346a = this.f8823e;
            if (c3346a != null) {
                return c3346a;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }
}
