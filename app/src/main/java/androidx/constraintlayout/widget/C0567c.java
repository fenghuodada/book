package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public final class C0567c {

    /* renamed from: a */
    public final ConstraintLayout f2021a;

    /* renamed from: b */
    public int f2022b = -1;

    /* renamed from: c */
    public int f2023c = -1;

    /* renamed from: d */
    public final SparseArray<C0568a> f2024d = new SparseArray<>();

    /* renamed from: e */
    public final SparseArray<C0570d> f2025e = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* loaded from: classes.dex */
    public static class C0568a {

        /* renamed from: a */
        public final int f2026a;

        /* renamed from: b */
        public final ArrayList<C0569b> f2027b = new ArrayList<>();

        /* renamed from: c */
        public final int f2028c;

        /* renamed from: d */
        public final C0570d f2029d;

        public C0568a(Context context, XmlResourceParser xmlResourceParser) {
            this.f2028c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0582i.f2182j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2026a = obtainStyledAttributes.getResourceId(index, this.f2026a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f2028c);
                    this.f2028c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        C0570d c0570d = new C0570d();
                        this.f2029d = c0570d;
                        c0570d.m12152c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* loaded from: classes.dex */
    public static class C0569b {

        /* renamed from: a */
        public final float f2030a;

        /* renamed from: b */
        public final float f2031b;

        /* renamed from: c */
        public final float f2032c;

        /* renamed from: d */
        public final float f2033d;

        /* renamed from: e */
        public final int f2034e;

        /* renamed from: f */
        public final C0570d f2035f;

        public C0569b(Context context, XmlResourceParser xmlResourceParser) {
            this.f2030a = Float.NaN;
            this.f2031b = Float.NaN;
            this.f2032c = Float.NaN;
            this.f2033d = Float.NaN;
            this.f2034e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0582i.f2184l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f2034e);
                    this.f2034e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        C0570d c0570d = new C0570d();
                        this.f2035f = c0570d;
                        c0570d.m12152c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f2033d = obtainStyledAttributes.getDimension(index, this.f2033d);
                } else if (index == 2) {
                    this.f2031b = obtainStyledAttributes.getDimension(index, this.f2031b);
                } else if (index == 3) {
                    this.f2032c = obtainStyledAttributes.getDimension(index, this.f2032c);
                } else if (index == 4) {
                    this.f2030a = obtainStyledAttributes.getDimension(index, this.f2030a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final boolean m12155a(float f, float f2) {
            float f3 = this.f2030a;
            if (Float.isNaN(f3) || f >= f3) {
                float f4 = this.f2031b;
                if (Float.isNaN(f4) || f2 >= f4) {
                    float f5 = this.f2032c;
                    if (Float.isNaN(f5) || f <= f5) {
                        float f6 = this.f2033d;
                        return Float.isNaN(f6) || f2 <= f6;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public C0567c(Context context, ConstraintLayout constraintLayout, int i) {
        this.f2021a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C0568a c0568a = null;
            while (true) {
                boolean z = true;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        z = false;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                default:
                                    z = true;
                                    break;
                            }
                            if (!z) {
                                if (!z) {
                                    if (!z) {
                                        continue;
                                    } else {
                                        m12156a(context, xml);
                                        continue;
                                    }
                                } else {
                                    C0569b c0569b = new C0569b(context, xml);
                                    if (c0568a != null) {
                                        c0568a.f2027b.add(c0569b);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                C0568a c0568a2 = new C0568a(context, xml);
                                this.f2024d.put(c0568a2.f2026a, c0568a2);
                                c0568a = c0568a2;
                                continue;
                            }
                        }
                    } else {
                        xml.getName();
                        continue;
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0226, code lost:
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12156a(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0567c.m12156a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
