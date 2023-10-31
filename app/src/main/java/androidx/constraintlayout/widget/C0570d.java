package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.C0513a;
import androidx.constraintlayout.motion.widget.C0550a;
import androidx.constraintlayout.motion.widget.C0554e;
import androidx.constraintlayout.widget.C0577e;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes.dex */
public final class C0570d {

    /* renamed from: d */
    public static final int[] f2036d = {0, 4, 8};

    /* renamed from: e */
    public static final SparseIntArray f2037e;

    /* renamed from: f */
    public static final SparseIntArray f2038f;

    /* renamed from: a */
    public final HashMap<String, C0565a> f2039a = new HashMap<>();

    /* renamed from: b */
    public final boolean f2040b = true;

    /* renamed from: c */
    public final HashMap<Integer, C0571a> f2041c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* loaded from: classes.dex */
    public static class C0571a {

        /* renamed from: a */
        public int f2042a;

        /* renamed from: b */
        public final C0575d f2043b = new C0575d();

        /* renamed from: c */
        public final C0574c f2044c = new C0574c();

        /* renamed from: d */
        public final C0573b f2045d = new C0573b();

        /* renamed from: e */
        public final C0576e f2046e = new C0576e();

        /* renamed from: f */
        public HashMap<String, C0565a> f2047f = new HashMap<>();

        /* renamed from: androidx.constraintlayout.widget.d$a$a */
        /* loaded from: classes.dex */
        public static class C0572a {

            /* renamed from: a */
            public int[] f2048a = new int[10];

            /* renamed from: b */
            public int[] f2049b = new int[10];

            /* renamed from: c */
            public int f2050c = 0;

            /* renamed from: d */
            public int[] f2051d = new int[10];

            /* renamed from: e */
            public float[] f2052e = new float[10];

            /* renamed from: f */
            public int f2053f = 0;

            /* renamed from: g */
            public int[] f2054g = new int[5];

            /* renamed from: h */
            public String[] f2055h = new String[5];

            /* renamed from: i */
            public int f2056i = 0;

            /* renamed from: j */
            public int[] f2057j = new int[4];

            /* renamed from: k */
            public boolean[] f2058k = new boolean[4];

            /* renamed from: l */
            public int f2059l = 0;

            /* renamed from: a */
            public final void m12142a(float f, int i) {
                int i2 = this.f2053f;
                int[] iArr = this.f2051d;
                if (i2 >= iArr.length) {
                    this.f2051d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2052e;
                    this.f2052e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2051d;
                int i3 = this.f2053f;
                iArr2[i3] = i;
                float[] fArr2 = this.f2052e;
                this.f2053f = i3 + 1;
                fArr2[i3] = f;
            }

            /* renamed from: b */
            public final void m12141b(int i, int i2) {
                int i3 = this.f2050c;
                int[] iArr = this.f2048a;
                if (i3 >= iArr.length) {
                    this.f2048a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2049b;
                    this.f2049b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2048a;
                int i4 = this.f2050c;
                iArr3[i4] = i;
                int[] iArr4 = this.f2049b;
                this.f2050c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* renamed from: c */
            public final void m12140c(int i, String str) {
                int i2 = this.f2056i;
                int[] iArr = this.f2054g;
                if (i2 >= iArr.length) {
                    this.f2054g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2055h;
                    this.f2055h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2054g;
                int i3 = this.f2056i;
                iArr2[i3] = i;
                String[] strArr2 = this.f2055h;
                this.f2056i = i3 + 1;
                strArr2[i3] = str;
            }

            /* renamed from: d */
            public final void m12139d(int i, boolean z) {
                int i2 = this.f2059l;
                int[] iArr = this.f2057j;
                if (i2 >= iArr.length) {
                    this.f2057j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2058k;
                    this.f2058k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2057j;
                int i3 = this.f2059l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f2058k;
                this.f2059l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        /* renamed from: a */
        public final void m12145a(ConstraintLayout.C0562a c0562a) {
            C0573b c0573b = this.f2045d;
            c0562a.f1960e = c0573b.f2101h;
            c0562a.f1962f = c0573b.f2103i;
            c0562a.f1964g = c0573b.f2105j;
            c0562a.f1966h = c0573b.f2107k;
            c0562a.f1968i = c0573b.f2109l;
            c0562a.f1970j = c0573b.f2111m;
            c0562a.f1972k = c0573b.f2113n;
            c0562a.f1974l = c0573b.f2115o;
            c0562a.f1976m = c0573b.f2117p;
            c0562a.f1978n = c0573b.f2118q;
            c0562a.f1980o = c0573b.f2119r;
            c0562a.f1987s = c0573b.f2120s;
            c0562a.f1988t = c0573b.f2121t;
            c0562a.f1989u = c0573b.f2122u;
            c0562a.f1990v = c0573b.f2123v;
            ((ViewGroup.MarginLayoutParams) c0562a).leftMargin = c0573b.f2066F;
            ((ViewGroup.MarginLayoutParams) c0562a).rightMargin = c0573b.f2067G;
            ((ViewGroup.MarginLayoutParams) c0562a).topMargin = c0573b.f2068H;
            ((ViewGroup.MarginLayoutParams) c0562a).bottomMargin = c0573b.f2069I;
            c0562a.f1926A = c0573b.f2078R;
            c0562a.f1927B = c0573b.f2077Q;
            c0562a.f1992x = c0573b.f2074N;
            c0562a.f1994z = c0573b.f2076P;
            c0562a.f1930E = c0573b.f2124w;
            c0562a.f1931F = c0573b.f2125x;
            c0562a.f1982p = c0573b.f2127z;
            c0562a.f1984q = c0573b.f2061A;
            c0562a.f1986r = c0573b.f2062B;
            c0562a.f1932G = c0573b.f2126y;
            c0562a.f1945T = c0573b.f2063C;
            c0562a.f1946U = c0573b.f2064D;
            c0562a.f1934I = c0573b.f2080T;
            c0562a.f1933H = c0573b.f2081U;
            c0562a.f1936K = c0573b.f2083W;
            c0562a.f1935J = c0573b.f2082V;
            c0562a.f1948W = c0573b.f2110l0;
            c0562a.f1949X = c0573b.f2112m0;
            c0562a.f1937L = c0573b.f2084X;
            c0562a.f1938M = c0573b.f2085Y;
            c0562a.f1941P = c0573b.f2086Z;
            c0562a.f1942Q = c0573b.f2088a0;
            c0562a.f1939N = c0573b.f2090b0;
            c0562a.f1940O = c0573b.f2092c0;
            c0562a.f1943R = c0573b.f2094d0;
            c0562a.f1944S = c0573b.f2096e0;
            c0562a.f1947V = c0573b.f2065E;
            c0562a.f1956c = c0573b.f2097f;
            c0562a.f1952a = c0573b.f2093d;
            c0562a.f1954b = c0573b.f2095e;
            ((ViewGroup.MarginLayoutParams) c0562a).width = c0573b.f2089b;
            ((ViewGroup.MarginLayoutParams) c0562a).height = c0573b.f2091c;
            String str = c0573b.f2108k0;
            if (str != null) {
                c0562a.f1950Y = str;
            }
            c0562a.f1951Z = c0573b.f2116o0;
            c0562a.setMarginStart(c0573b.f2071K);
            c0562a.setMarginEnd(c0573b.f2070J);
            c0562a.m12169a();
        }

        /* renamed from: b */
        public final void m12144b(int i, ConstraintLayout.C0562a c0562a) {
            this.f2042a = i;
            int i2 = c0562a.f1960e;
            C0573b c0573b = this.f2045d;
            c0573b.f2101h = i2;
            c0573b.f2103i = c0562a.f1962f;
            c0573b.f2105j = c0562a.f1964g;
            c0573b.f2107k = c0562a.f1966h;
            c0573b.f2109l = c0562a.f1968i;
            c0573b.f2111m = c0562a.f1970j;
            c0573b.f2113n = c0562a.f1972k;
            c0573b.f2115o = c0562a.f1974l;
            c0573b.f2117p = c0562a.f1976m;
            c0573b.f2118q = c0562a.f1978n;
            c0573b.f2119r = c0562a.f1980o;
            c0573b.f2120s = c0562a.f1987s;
            c0573b.f2121t = c0562a.f1988t;
            c0573b.f2122u = c0562a.f1989u;
            c0573b.f2123v = c0562a.f1990v;
            c0573b.f2124w = c0562a.f1930E;
            c0573b.f2125x = c0562a.f1931F;
            c0573b.f2126y = c0562a.f1932G;
            c0573b.f2127z = c0562a.f1982p;
            c0573b.f2061A = c0562a.f1984q;
            c0573b.f2062B = c0562a.f1986r;
            c0573b.f2063C = c0562a.f1945T;
            c0573b.f2064D = c0562a.f1946U;
            c0573b.f2065E = c0562a.f1947V;
            c0573b.f2097f = c0562a.f1956c;
            c0573b.f2093d = c0562a.f1952a;
            c0573b.f2095e = c0562a.f1954b;
            c0573b.f2089b = ((ViewGroup.MarginLayoutParams) c0562a).width;
            c0573b.f2091c = ((ViewGroup.MarginLayoutParams) c0562a).height;
            c0573b.f2066F = ((ViewGroup.MarginLayoutParams) c0562a).leftMargin;
            c0573b.f2067G = ((ViewGroup.MarginLayoutParams) c0562a).rightMargin;
            c0573b.f2068H = ((ViewGroup.MarginLayoutParams) c0562a).topMargin;
            c0573b.f2069I = ((ViewGroup.MarginLayoutParams) c0562a).bottomMargin;
            c0573b.f2072L = c0562a.f1929D;
            c0573b.f2080T = c0562a.f1934I;
            c0573b.f2081U = c0562a.f1933H;
            c0573b.f2083W = c0562a.f1936K;
            c0573b.f2082V = c0562a.f1935J;
            c0573b.f2110l0 = c0562a.f1948W;
            c0573b.f2112m0 = c0562a.f1949X;
            c0573b.f2084X = c0562a.f1937L;
            c0573b.f2085Y = c0562a.f1938M;
            c0573b.f2086Z = c0562a.f1941P;
            c0573b.f2088a0 = c0562a.f1942Q;
            c0573b.f2090b0 = c0562a.f1939N;
            c0573b.f2092c0 = c0562a.f1940O;
            c0573b.f2094d0 = c0562a.f1943R;
            c0573b.f2096e0 = c0562a.f1944S;
            c0573b.f2108k0 = c0562a.f1950Y;
            c0573b.f2074N = c0562a.f1992x;
            c0573b.f2076P = c0562a.f1994z;
            c0573b.f2073M = c0562a.f1991w;
            c0573b.f2075O = c0562a.f1993y;
            c0573b.f2078R = c0562a.f1926A;
            c0573b.f2077Q = c0562a.f1927B;
            c0573b.f2079S = c0562a.f1928C;
            c0573b.f2116o0 = c0562a.f1951Z;
            c0573b.f2070J = c0562a.getMarginEnd();
            c0573b.f2071K = c0562a.getMarginStart();
        }

        /* renamed from: c */
        public final void m12143c(int i, C0577e.C0578a c0578a) {
            m12144b(i, c0578a);
            this.f2043b.f2140c = c0578a.f2161r0;
            float f = c0578a.f2164u0;
            C0576e c0576e = this.f2046e;
            c0576e.f2143a = f;
            c0576e.f2144b = c0578a.f2165v0;
            c0576e.f2145c = c0578a.f2166w0;
            c0576e.f2146d = c0578a.f2167x0;
            c0576e.f2147e = c0578a.f2168y0;
            c0576e.f2148f = c0578a.f2169z0;
            c0576e.f2149g = c0578a.f2157A0;
            c0576e.f2151i = c0578a.f2158B0;
            c0576e.f2152j = c0578a.f2159C0;
            c0576e.f2153k = c0578a.f2160D0;
            c0576e.f2155m = c0578a.f2163t0;
            c0576e.f2154l = c0578a.f2162s0;
        }

        public final Object clone() throws CloneNotSupportedException {
            C0571a c0571a = new C0571a();
            C0573b c0573b = c0571a.f2045d;
            c0573b.getClass();
            C0573b c0573b2 = this.f2045d;
            c0573b.f2087a = c0573b2.f2087a;
            c0573b.f2089b = c0573b2.f2089b;
            c0573b.f2091c = c0573b2.f2091c;
            c0573b.f2093d = c0573b2.f2093d;
            c0573b.f2095e = c0573b2.f2095e;
            c0573b.f2097f = c0573b2.f2097f;
            c0573b.f2099g = c0573b2.f2099g;
            c0573b.f2101h = c0573b2.f2101h;
            c0573b.f2103i = c0573b2.f2103i;
            c0573b.f2105j = c0573b2.f2105j;
            c0573b.f2107k = c0573b2.f2107k;
            c0573b.f2109l = c0573b2.f2109l;
            c0573b.f2111m = c0573b2.f2111m;
            c0573b.f2113n = c0573b2.f2113n;
            c0573b.f2115o = c0573b2.f2115o;
            c0573b.f2117p = c0573b2.f2117p;
            c0573b.f2118q = c0573b2.f2118q;
            c0573b.f2119r = c0573b2.f2119r;
            c0573b.f2120s = c0573b2.f2120s;
            c0573b.f2121t = c0573b2.f2121t;
            c0573b.f2122u = c0573b2.f2122u;
            c0573b.f2123v = c0573b2.f2123v;
            c0573b.f2124w = c0573b2.f2124w;
            c0573b.f2125x = c0573b2.f2125x;
            c0573b.f2126y = c0573b2.f2126y;
            c0573b.f2127z = c0573b2.f2127z;
            c0573b.f2061A = c0573b2.f2061A;
            c0573b.f2062B = c0573b2.f2062B;
            c0573b.f2063C = c0573b2.f2063C;
            c0573b.f2064D = c0573b2.f2064D;
            c0573b.f2065E = c0573b2.f2065E;
            c0573b.f2066F = c0573b2.f2066F;
            c0573b.f2067G = c0573b2.f2067G;
            c0573b.f2068H = c0573b2.f2068H;
            c0573b.f2069I = c0573b2.f2069I;
            c0573b.f2070J = c0573b2.f2070J;
            c0573b.f2071K = c0573b2.f2071K;
            c0573b.f2072L = c0573b2.f2072L;
            c0573b.f2073M = c0573b2.f2073M;
            c0573b.f2074N = c0573b2.f2074N;
            c0573b.f2075O = c0573b2.f2075O;
            c0573b.f2076P = c0573b2.f2076P;
            c0573b.f2077Q = c0573b2.f2077Q;
            c0573b.f2078R = c0573b2.f2078R;
            c0573b.f2079S = c0573b2.f2079S;
            c0573b.f2080T = c0573b2.f2080T;
            c0573b.f2081U = c0573b2.f2081U;
            c0573b.f2082V = c0573b2.f2082V;
            c0573b.f2083W = c0573b2.f2083W;
            c0573b.f2084X = c0573b2.f2084X;
            c0573b.f2085Y = c0573b2.f2085Y;
            c0573b.f2086Z = c0573b2.f2086Z;
            c0573b.f2088a0 = c0573b2.f2088a0;
            c0573b.f2090b0 = c0573b2.f2090b0;
            c0573b.f2092c0 = c0573b2.f2092c0;
            c0573b.f2094d0 = c0573b2.f2094d0;
            c0573b.f2096e0 = c0573b2.f2096e0;
            c0573b.f2098f0 = c0573b2.f2098f0;
            c0573b.f2100g0 = c0573b2.f2100g0;
            c0573b.f2102h0 = c0573b2.f2102h0;
            c0573b.f2108k0 = c0573b2.f2108k0;
            int[] iArr = c0573b2.f2104i0;
            if (iArr != null && c0573b2.f2106j0 == null) {
                c0573b.f2104i0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                c0573b.f2104i0 = null;
            }
            c0573b.f2106j0 = c0573b2.f2106j0;
            c0573b.f2110l0 = c0573b2.f2110l0;
            c0573b.f2112m0 = c0573b2.f2112m0;
            c0573b.f2114n0 = c0573b2.f2114n0;
            c0573b.f2116o0 = c0573b2.f2116o0;
            C0574c c0574c = c0571a.f2044c;
            c0574c.getClass();
            C0574c c0574c2 = this.f2044c;
            c0574c2.getClass();
            c0574c.f2129a = c0574c2.f2129a;
            c0574c.f2131c = c0574c2.f2131c;
            c0574c.f2133e = c0574c2.f2133e;
            c0574c.f2132d = c0574c2.f2132d;
            C0575d c0575d = c0571a.f2043b;
            c0575d.getClass();
            C0575d c0575d2 = this.f2043b;
            c0575d2.getClass();
            c0575d.f2138a = c0575d2.f2138a;
            c0575d.f2140c = c0575d2.f2140c;
            c0575d.f2141d = c0575d2.f2141d;
            c0575d.f2139b = c0575d2.f2139b;
            C0576e c0576e = c0571a.f2046e;
            c0576e.getClass();
            C0576e c0576e2 = this.f2046e;
            c0576e2.getClass();
            c0576e.f2143a = c0576e2.f2143a;
            c0576e.f2144b = c0576e2.f2144b;
            c0576e.f2145c = c0576e2.f2145c;
            c0576e.f2146d = c0576e2.f2146d;
            c0576e.f2147e = c0576e2.f2147e;
            c0576e.f2148f = c0576e2.f2148f;
            c0576e.f2149g = c0576e2.f2149g;
            c0576e.f2150h = c0576e2.f2150h;
            c0576e.f2151i = c0576e2.f2151i;
            c0576e.f2152j = c0576e2.f2152j;
            c0576e.f2153k = c0576e2.f2153k;
            c0576e.f2154l = c0576e2.f2154l;
            c0576e.f2155m = c0576e2.f2155m;
            c0571a.f2042a = this.f2042a;
            return c0571a;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    /* loaded from: classes.dex */
    public static class C0573b {

        /* renamed from: p0 */
        public static final SparseIntArray f2060p0;

        /* renamed from: b */
        public int f2089b;

        /* renamed from: c */
        public int f2091c;

        /* renamed from: i0 */
        public int[] f2104i0;

        /* renamed from: j0 */
        public String f2106j0;

        /* renamed from: k0 */
        public String f2108k0;

        /* renamed from: a */
        public boolean f2087a = false;

        /* renamed from: d */
        public int f2093d = -1;

        /* renamed from: e */
        public int f2095e = -1;

        /* renamed from: f */
        public float f2097f = -1.0f;

        /* renamed from: g */
        public boolean f2099g = true;

        /* renamed from: h */
        public int f2101h = -1;

        /* renamed from: i */
        public int f2103i = -1;

        /* renamed from: j */
        public int f2105j = -1;

        /* renamed from: k */
        public int f2107k = -1;

        /* renamed from: l */
        public int f2109l = -1;

        /* renamed from: m */
        public int f2111m = -1;

        /* renamed from: n */
        public int f2113n = -1;

        /* renamed from: o */
        public int f2115o = -1;

        /* renamed from: p */
        public int f2117p = -1;

        /* renamed from: q */
        public int f2118q = -1;

        /* renamed from: r */
        public int f2119r = -1;

        /* renamed from: s */
        public int f2120s = -1;

        /* renamed from: t */
        public int f2121t = -1;

        /* renamed from: u */
        public int f2122u = -1;

        /* renamed from: v */
        public int f2123v = -1;

        /* renamed from: w */
        public float f2124w = 0.5f;

        /* renamed from: x */
        public float f2125x = 0.5f;

        /* renamed from: y */
        public String f2126y = null;

        /* renamed from: z */
        public int f2127z = -1;

        /* renamed from: A */
        public int f2061A = 0;

        /* renamed from: B */
        public float f2062B = 0.0f;

        /* renamed from: C */
        public int f2063C = -1;

        /* renamed from: D */
        public int f2064D = -1;

        /* renamed from: E */
        public int f2065E = -1;

        /* renamed from: F */
        public int f2066F = 0;

        /* renamed from: G */
        public int f2067G = 0;

        /* renamed from: H */
        public int f2068H = 0;

        /* renamed from: I */
        public int f2069I = 0;

        /* renamed from: J */
        public int f2070J = 0;

        /* renamed from: K */
        public int f2071K = 0;

        /* renamed from: L */
        public int f2072L = 0;

        /* renamed from: M */
        public int f2073M = Integer.MIN_VALUE;

        /* renamed from: N */
        public int f2074N = Integer.MIN_VALUE;

        /* renamed from: O */
        public int f2075O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f2076P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f2077Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f2078R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f2079S = Integer.MIN_VALUE;

        /* renamed from: T */
        public float f2080T = -1.0f;

        /* renamed from: U */
        public float f2081U = -1.0f;

        /* renamed from: V */
        public int f2082V = 0;

        /* renamed from: W */
        public int f2083W = 0;

        /* renamed from: X */
        public int f2084X = 0;

        /* renamed from: Y */
        public int f2085Y = 0;

        /* renamed from: Z */
        public int f2086Z = 0;

        /* renamed from: a0 */
        public int f2088a0 = 0;

        /* renamed from: b0 */
        public int f2090b0 = 0;

        /* renamed from: c0 */
        public int f2092c0 = 0;

        /* renamed from: d0 */
        public float f2094d0 = 1.0f;

        /* renamed from: e0 */
        public float f2096e0 = 1.0f;

        /* renamed from: f0 */
        public int f2098f0 = -1;

        /* renamed from: g0 */
        public int f2100g0 = 0;

        /* renamed from: h0 */
        public int f2102h0 = -1;

        /* renamed from: l0 */
        public boolean f2110l0 = false;

        /* renamed from: m0 */
        public boolean f2112m0 = false;

        /* renamed from: n0 */
        public boolean f2114n0 = true;

        /* renamed from: o0 */
        public int f2116o0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2060p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        /* renamed from: a */
        public final void m12138a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0582i.f2178f);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = f2060p0;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.f2117p = C0570d.m12148g(obtainStyledAttributes, index, this.f2117p);
                        break;
                    case 2:
                        this.f2069I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2069I);
                        break;
                    case 3:
                        this.f2115o = C0570d.m12148g(obtainStyledAttributes, index, this.f2115o);
                        break;
                    case 4:
                        this.f2113n = C0570d.m12148g(obtainStyledAttributes, index, this.f2113n);
                        break;
                    case 5:
                        this.f2126y = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f2063C = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2063C);
                        break;
                    case 7:
                        this.f2064D = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2064D);
                        break;
                    case 8:
                        this.f2070J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2070J);
                        break;
                    case 9:
                        this.f2123v = C0570d.m12148g(obtainStyledAttributes, index, this.f2123v);
                        break;
                    case 10:
                        this.f2122u = C0570d.m12148g(obtainStyledAttributes, index, this.f2122u);
                        break;
                    case 11:
                        this.f2076P = obtainStyledAttributes.getDimensionPixelSize(index, this.f2076P);
                        break;
                    case 12:
                        this.f2077Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2077Q);
                        break;
                    case 13:
                        this.f2073M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2073M);
                        break;
                    case 14:
                        this.f2075O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2075O);
                        break;
                    case 15:
                        this.f2078R = obtainStyledAttributes.getDimensionPixelSize(index, this.f2078R);
                        break;
                    case 16:
                        this.f2074N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2074N);
                        break;
                    case 17:
                        this.f2093d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2093d);
                        break;
                    case 18:
                        this.f2095e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2095e);
                        break;
                    case 19:
                        this.f2097f = obtainStyledAttributes.getFloat(index, this.f2097f);
                        break;
                    case 20:
                        this.f2124w = obtainStyledAttributes.getFloat(index, this.f2124w);
                        break;
                    case 21:
                        this.f2091c = obtainStyledAttributes.getLayoutDimension(index, this.f2091c);
                        break;
                    case 22:
                        this.f2089b = obtainStyledAttributes.getLayoutDimension(index, this.f2089b);
                        break;
                    case 23:
                        this.f2066F = obtainStyledAttributes.getDimensionPixelSize(index, this.f2066F);
                        break;
                    case 24:
                        this.f2101h = C0570d.m12148g(obtainStyledAttributes, index, this.f2101h);
                        break;
                    case 25:
                        this.f2103i = C0570d.m12148g(obtainStyledAttributes, index, this.f2103i);
                        break;
                    case 26:
                        this.f2065E = obtainStyledAttributes.getInt(index, this.f2065E);
                        break;
                    case 27:
                        this.f2067G = obtainStyledAttributes.getDimensionPixelSize(index, this.f2067G);
                        break;
                    case 28:
                        this.f2105j = C0570d.m12148g(obtainStyledAttributes, index, this.f2105j);
                        break;
                    case 29:
                        this.f2107k = C0570d.m12148g(obtainStyledAttributes, index, this.f2107k);
                        break;
                    case 30:
                        this.f2071K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2071K);
                        break;
                    case 31:
                        this.f2120s = C0570d.m12148g(obtainStyledAttributes, index, this.f2120s);
                        break;
                    case 32:
                        this.f2121t = C0570d.m12148g(obtainStyledAttributes, index, this.f2121t);
                        break;
                    case 33:
                        this.f2068H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2068H);
                        break;
                    case 34:
                        this.f2111m = C0570d.m12148g(obtainStyledAttributes, index, this.f2111m);
                        break;
                    case 35:
                        this.f2109l = C0570d.m12148g(obtainStyledAttributes, index, this.f2109l);
                        break;
                    case 36:
                        this.f2125x = obtainStyledAttributes.getFloat(index, this.f2125x);
                        break;
                    case 37:
                        this.f2081U = obtainStyledAttributes.getFloat(index, this.f2081U);
                        break;
                    case 38:
                        this.f2080T = obtainStyledAttributes.getFloat(index, this.f2080T);
                        break;
                    case 39:
                        this.f2082V = obtainStyledAttributes.getInt(index, this.f2082V);
                        break;
                    case 40:
                        this.f2083W = obtainStyledAttributes.getInt(index, this.f2083W);
                        break;
                    case 41:
                        C0570d.m12147h(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C0570d.m12147h(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f2127z = C0570d.m12148g(obtainStyledAttributes, index, this.f2127z);
                                continue;
                            case 62:
                                this.f2061A = obtainStyledAttributes.getDimensionPixelSize(index, this.f2061A);
                                continue;
                            case 63:
                                this.f2062B = obtainStyledAttributes.getFloat(index, this.f2062B);
                                continue;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f2094d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f2096e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f2098f0 = obtainStyledAttributes.getInt(index, this.f2098f0);
                                        break;
                                    case 73:
                                        this.f2100g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2100g0);
                                        break;
                                    case 74:
                                        this.f2106j0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f2114n0 = obtainStyledAttributes.getBoolean(index, this.f2114n0);
                                        break;
                                    case 76:
                                        this.f2116o0 = obtainStyledAttributes.getInt(index, this.f2116o0);
                                        break;
                                    case 77:
                                        this.f2118q = C0570d.m12148g(obtainStyledAttributes, index, this.f2118q);
                                        break;
                                    case 78:
                                        this.f2119r = C0570d.m12148g(obtainStyledAttributes, index, this.f2119r);
                                        break;
                                    case 79:
                                        this.f2079S = obtainStyledAttributes.getDimensionPixelSize(index, this.f2079S);
                                        break;
                                    case 80:
                                        this.f2072L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2072L);
                                        break;
                                    case 81:
                                        this.f2084X = obtainStyledAttributes.getInt(index, this.f2084X);
                                        break;
                                    case 82:
                                        this.f2085Y = obtainStyledAttributes.getInt(index, this.f2085Y);
                                        break;
                                    case 83:
                                        this.f2088a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2088a0);
                                        break;
                                    case 84:
                                        this.f2086Z = obtainStyledAttributes.getDimensionPixelSize(index, this.f2086Z);
                                        break;
                                    case 85:
                                        this.f2092c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2092c0);
                                        break;
                                    case 86:
                                        this.f2090b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2090b0);
                                        break;
                                    case 87:
                                        this.f2110l0 = obtainStyledAttributes.getBoolean(index, this.f2110l0);
                                        break;
                                    case 88:
                                        this.f2112m0 = obtainStyledAttributes.getBoolean(index, this.f2112m0);
                                        break;
                                    case 89:
                                        this.f2108k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f2099g = obtainStyledAttributes.getBoolean(index, this.f2099g);
                                        break;
                                    case 91:
                                        sb = new StringBuilder("unused attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(sparseIntArray.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        continue;
                                    default:
                                        sb = new StringBuilder("Unknown attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(sparseIntArray.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$c */
    /* loaded from: classes.dex */
    public static class C0574c {

        /* renamed from: j */
        public static final SparseIntArray f2128j;

        /* renamed from: a */
        public int f2129a = -1;

        /* renamed from: b */
        public int f2130b = 0;

        /* renamed from: c */
        public int f2131c = -1;

        /* renamed from: d */
        public float f2132d = Float.NaN;

        /* renamed from: e */
        public float f2133e = Float.NaN;

        /* renamed from: f */
        public float f2134f = Float.NaN;

        /* renamed from: g */
        public int f2135g = -1;

        /* renamed from: h */
        public String f2136h = null;

        /* renamed from: i */
        public int f2137i = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2128j = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        /* renamed from: a */
        public final void m12137a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0582i.f2179g);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2128j.get(index)) {
                    case 1:
                        this.f2133e = obtainStyledAttributes.getFloat(index, this.f2133e);
                        break;
                    case 2:
                        this.f2131c = obtainStyledAttributes.getInt(index, this.f2131c);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            String str = C0513a.f1614b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2129a = C0570d.m12148g(obtainStyledAttributes, index, this.f2129a);
                        break;
                    case 6:
                        this.f2130b = obtainStyledAttributes.getInteger(index, this.f2130b);
                        break;
                    case 7:
                        this.f2132d = obtainStyledAttributes.getFloat(index, this.f2132d);
                        break;
                    case 8:
                        this.f2135g = obtainStyledAttributes.getInteger(index, this.f2135g);
                        break;
                    case 9:
                        this.f2134f = obtainStyledAttributes.getFloat(index, this.f2134f);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 != 1) {
                            if (i2 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                this.f2136h = string;
                                if (string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) <= 0) {
                                    break;
                                }
                            } else {
                                obtainStyledAttributes.getInteger(index, this.f2137i);
                                break;
                            }
                        }
                        this.f2137i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    /* loaded from: classes.dex */
    public static class C0575d {

        /* renamed from: a */
        public int f2138a = 0;

        /* renamed from: b */
        public int f2139b = 0;

        /* renamed from: c */
        public float f2140c = 1.0f;

        /* renamed from: d */
        public float f2141d = Float.NaN;

        /* renamed from: a */
        public final void m12136a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0582i.f2181i);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f2140c = obtainStyledAttributes.getFloat(index, this.f2140c);
                } else if (index == 0) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f2138a);
                    this.f2138a = i2;
                    this.f2138a = C0570d.f2036d[i2];
                } else if (index == 4) {
                    this.f2139b = obtainStyledAttributes.getInt(index, this.f2139b);
                } else if (index == 3) {
                    this.f2141d = obtainStyledAttributes.getFloat(index, this.f2141d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$e */
    /* loaded from: classes.dex */
    public static class C0576e {

        /* renamed from: n */
        public static final SparseIntArray f2142n;

        /* renamed from: a */
        public float f2143a = 0.0f;

        /* renamed from: b */
        public float f2144b = 0.0f;

        /* renamed from: c */
        public float f2145c = 0.0f;

        /* renamed from: d */
        public float f2146d = 1.0f;

        /* renamed from: e */
        public float f2147e = 1.0f;

        /* renamed from: f */
        public float f2148f = Float.NaN;

        /* renamed from: g */
        public float f2149g = Float.NaN;

        /* renamed from: h */
        public int f2150h = -1;

        /* renamed from: i */
        public float f2151i = 0.0f;

        /* renamed from: j */
        public float f2152j = 0.0f;

        /* renamed from: k */
        public float f2153k = 0.0f;

        /* renamed from: l */
        public boolean f2154l = false;

        /* renamed from: m */
        public float f2155m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2142n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        /* renamed from: a */
        public final void m12135a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0582i.f2183k);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2142n.get(index)) {
                    case 1:
                        this.f2143a = obtainStyledAttributes.getFloat(index, this.f2143a);
                        break;
                    case 2:
                        this.f2144b = obtainStyledAttributes.getFloat(index, this.f2144b);
                        break;
                    case 3:
                        this.f2145c = obtainStyledAttributes.getFloat(index, this.f2145c);
                        break;
                    case 4:
                        this.f2146d = obtainStyledAttributes.getFloat(index, this.f2146d);
                        break;
                    case 5:
                        this.f2147e = obtainStyledAttributes.getFloat(index, this.f2147e);
                        break;
                    case 6:
                        this.f2148f = obtainStyledAttributes.getDimension(index, this.f2148f);
                        break;
                    case 7:
                        this.f2149g = obtainStyledAttributes.getDimension(index, this.f2149g);
                        break;
                    case 8:
                        this.f2151i = obtainStyledAttributes.getDimension(index, this.f2151i);
                        break;
                    case 9:
                        this.f2152j = obtainStyledAttributes.getDimension(index, this.f2152j);
                        break;
                    case 10:
                        this.f2153k = obtainStyledAttributes.getDimension(index, this.f2153k);
                        break;
                    case 11:
                        this.f2154l = true;
                        this.f2155m = obtainStyledAttributes.getDimension(index, this.f2155m);
                        break;
                    case 12:
                        this.f2150h = C0570d.m12148g(obtainStyledAttributes, index, this.f2150h);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2037e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f2038f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* renamed from: d */
    public static int[] m12151d(Barrier barrier, String str) {
        int i;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Integer num = null;
            try {
                i = C0581h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, FacebookAdapter.KEY_ID, context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1923m) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.f1923m.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i = num.intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: e */
    public static C0571a m12150e(Context context, AttributeSet attributeSet, boolean z) {
        String str;
        int i;
        String[] strArr;
        int dimensionPixelSize;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        String str2;
        C0571a.C0572a c0572a;
        C0571a c0571a = new C0571a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? C0582i.f2175c : C0582i.f2173a);
        String[] strArr2 = C0513a.f1614b;
        int[] iArr = f2036d;
        SparseIntArray sparseIntArray = f2037e;
        C0575d c0575d = c0571a.f2043b;
        C0576e c0576e = c0571a.f2046e;
        C0574c c0574c = c0571a.f2044c;
        C0573b c0573b = c0571a.f2045d;
        String str3 = "unused attribute 0x";
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            String str4 = "Unknown attribute 0x";
            C0571a.C0572a c0572a2 = new C0571a.C0572a();
            c0574c.getClass();
            c0573b.getClass();
            c0575d.getClass();
            c0576e.getClass();
            int i8 = 0;
            while (i8 < indexCount) {
                int i9 = indexCount;
                int index = obtainStyledAttributes.getIndex(i8);
                int i10 = i8;
                switch (f2038f.get(index)) {
                    case 2:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2069I);
                        i2 = 2;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        strArr = strArr2;
                        str2 = str4;
                        StringBuilder sb = new StringBuilder(str2);
                        c0572a = c0572a2;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        continue;
                        indexCount = i9;
                        c0572a2 = c0572a;
                        str4 = str2;
                        i8 = i10 + 1;
                        strArr2 = strArr;
                    case 5:
                        strArr = strArr2;
                        i3 = 5;
                        c0572a2.m12140c(i3, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0573b.f2063C);
                        i2 = 6;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 7:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0573b.f2064D);
                        i2 = 7;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 8:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2070J);
                        i2 = 8;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 11:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2076P);
                        i2 = 11;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 12:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2077Q);
                        i2 = 12;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 13:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2073M);
                        i2 = 13;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 14:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2075O);
                        i2 = 14;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 15:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2078R);
                        i2 = 15;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 16:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2074N);
                        i2 = 16;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 17:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0573b.f2093d);
                        i2 = 17;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 18:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0573b.f2095e);
                        i2 = 18;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 19:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0573b.f2097f);
                        i4 = 19;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 20:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0573b.f2124w);
                        i4 = 20;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 21:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getLayoutDimension(index, c0573b.f2091c);
                        i2 = 21;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 22:
                        strArr = strArr2;
                        dimensionPixelSize = iArr[obtainStyledAttributes.getInt(index, c0575d.f2138a)];
                        i2 = 22;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 23:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getLayoutDimension(index, c0573b.f2089b);
                        i2 = 23;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 24:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2066F);
                        i2 = 24;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 27:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0573b.f2065E);
                        i2 = 27;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 28:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2067G);
                        i2 = 28;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 31:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2071K);
                        i2 = 31;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 34:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2068H);
                        i2 = 34;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 37:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0573b.f2125x);
                        i4 = 37;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 38:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getResourceId(index, c0571a.f2042a);
                        c0571a.f2042a = dimensionPixelSize;
                        i2 = 38;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 39:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0573b.f2081U);
                        i4 = 39;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 40:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0573b.f2080T);
                        i4 = 40;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 41:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0573b.f2082V);
                        i2 = 41;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 42:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0573b.f2083W);
                        i2 = 42;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 43:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0575d.f2140c);
                        i4 = 43;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 44:
                        strArr = strArr2;
                        c0572a2.m12139d(44, true);
                        c0572a2.m12142a(obtainStyledAttributes.getDimension(index, c0576e.f2155m), 44);
                        break;
                    case 45:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0576e.f2144b);
                        i4 = 45;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 46:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0576e.f2145c);
                        i4 = 46;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 47:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0576e.f2146d);
                        i4 = 47;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 48:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0576e.f2147e);
                        i4 = 48;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 49:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getDimension(index, c0576e.f2148f);
                        i4 = 49;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 50:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getDimension(index, c0576e.f2149g);
                        i4 = 50;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 51:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getDimension(index, c0576e.f2151i);
                        i4 = 51;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 52:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getDimension(index, c0576e.f2152j);
                        i4 = 52;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 53:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getDimension(index, c0576e.f2153k);
                        i4 = 53;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 54:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0573b.f2084X);
                        i2 = 54;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 55:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0573b.f2085Y);
                        i2 = 55;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 56:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2086Z);
                        i2 = 56;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 57:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2088a0);
                        i2 = 57;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 58:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2090b0);
                        i2 = 58;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 59:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2092c0);
                        i2 = 59;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 60:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0576e.f2143a);
                        i4 = 60;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 62:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2061A);
                        i2 = 62;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 63:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0573b.f2062B);
                        i4 = 63;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 64:
                        strArr = strArr2;
                        dimensionPixelSize = m12148g(obtainStyledAttributes, index, c0574c.f2129a);
                        i2 = 64;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 65:
                        strArr = strArr2;
                        c0572a2.m12140c(65, obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : strArr[obtainStyledAttributes.getInteger(index, 0)]);
                        break;
                    case 66:
                        strArr = strArr2;
                        c0572a2.m12141b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0574c.f2133e);
                        i4 = 67;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 68:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0575d.f2141d);
                        i4 = 68;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 69:
                        strArr = strArr2;
                        i5 = 69;
                        c0572a2.m12142a(obtainStyledAttributes.getFloat(index, 1.0f), i5);
                        break;
                    case 70:
                        strArr = strArr2;
                        i5 = 70;
                        c0572a2.m12142a(obtainStyledAttributes.getFloat(index, 1.0f), i5);
                        break;
                    case 71:
                        strArr = strArr2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0573b.f2098f0);
                        i2 = 72;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 73:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2100g0);
                        i2 = 73;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 74:
                        strArr = strArr2;
                        i3 = 74;
                        c0572a2.m12140c(i3, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        strArr = strArr2;
                        z2 = obtainStyledAttributes.getBoolean(index, c0573b.f2114n0);
                        i6 = 75;
                        c0572a2.m12139d(i6, z2);
                        break;
                    case 76:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0574c.f2131c);
                        i2 = 76;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 77:
                        strArr = strArr2;
                        i3 = 77;
                        c0572a2.m12140c(i3, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0575d.f2139b);
                        i2 = 78;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 79:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0574c.f2132d);
                        i4 = 79;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 80:
                        strArr = strArr2;
                        z2 = obtainStyledAttributes.getBoolean(index, c0573b.f2110l0);
                        i6 = 80;
                        c0572a2.m12139d(i6, z2);
                        break;
                    case 81:
                        strArr = strArr2;
                        z2 = obtainStyledAttributes.getBoolean(index, c0573b.f2112m0);
                        i6 = 81;
                        c0572a2.m12139d(i6, z2);
                        break;
                    case 82:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInteger(index, c0574c.f2130b);
                        i2 = 82;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 83:
                        strArr = strArr2;
                        dimensionPixelSize = m12148g(obtainStyledAttributes, index, c0576e.f2150h);
                        i2 = 83;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 84:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInteger(index, c0574c.f2135g);
                        i2 = 84;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 85:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0574c.f2134f);
                        i4 = 85;
                        c0572a2.m12142a(f, i4);
                        break;
                    case 86:
                        strArr = strArr2;
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                c0572a2.m12141b(88, obtainStyledAttributes.getInteger(index, c0574c.f2137i));
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                c0574c.f2136h = string;
                                c0572a2.m12140c(90, string);
                                if (c0574c.f2136h.indexOf(RemoteSettings.FORWARD_SLASH_STRING) <= 0) {
                                    c0572a2.m12141b(88, -1);
                                    break;
                                } else {
                                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                    c0574c.f2137i = resourceId;
                                    c0572a2.m12141b(89, resourceId);
                                    c0572a2.m12141b(88, -2);
                                }
                            }
                        } else {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            c0574c.f2137i = resourceId2;
                            c0572a2.m12141b(89, resourceId2);
                            if (c0574c.f2137i != -1) {
                                c0572a2.m12141b(88, -2);
                                break;
                            }
                        }
                        indexCount = i9;
                        c0572a2 = c0572a;
                        str4 = str2;
                        i8 = i10 + 1;
                        strArr2 = strArr;
                        break;
                    case 87:
                        strArr = strArr2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2072L);
                        i2 = 93;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 94:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0573b.f2079S);
                        i2 = 94;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 95:
                        strArr = strArr2;
                        i7 = 0;
                        m12147h(c0572a2, obtainStyledAttributes, index, i7);
                        break;
                    case 96:
                        strArr = strArr2;
                        i7 = 1;
                        m12147h(c0572a2, obtainStyledAttributes, index, i7);
                        break;
                    case 97:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0573b.f2116o0);
                        i2 = 97;
                        c0572a2.m12141b(i2, dimensionPixelSize);
                        break;
                    case 98:
                        int i12 = C0554e.f1876K;
                        strArr = strArr2;
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            c0571a.f2042a = obtainStyledAttributes.getResourceId(index, c0571a.f2042a);
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        z2 = obtainStyledAttributes.getBoolean(index, c0573b.f2099g);
                        i6 = 99;
                        strArr = strArr2;
                        c0572a2.m12139d(i6, z2);
                        break;
                }
                str2 = str4;
                c0572a = c0572a2;
                indexCount = i9;
                c0572a2 = c0572a;
                str4 = str2;
                i8 = i10 + 1;
                strArr2 = strArr;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i13 = 0;
            while (i13 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i13);
                int i14 = indexCount2;
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        c0574c.getClass();
                        c0573b.getClass();
                        c0575d.getClass();
                        c0576e.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str3;
                        c0573b.f2117p = m12148g(obtainStyledAttributes, index2, c0573b.f2117p);
                        break;
                    case 2:
                        str = str3;
                        c0573b.f2069I = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2069I);
                        break;
                    case 3:
                        str = str3;
                        c0573b.f2115o = m12148g(obtainStyledAttributes, index2, c0573b.f2115o);
                        break;
                    case 4:
                        str = str3;
                        c0573b.f2113n = m12148g(obtainStyledAttributes, index2, c0573b.f2113n);
                        break;
                    case 5:
                        str = str3;
                        c0573b.f2126y = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str3;
                        c0573b.f2063C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0573b.f2063C);
                        break;
                    case 7:
                        str = str3;
                        c0573b.f2064D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0573b.f2064D);
                        break;
                    case 8:
                        str = str3;
                        c0573b.f2070J = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2070J);
                        break;
                    case 9:
                        str = str3;
                        c0573b.f2123v = m12148g(obtainStyledAttributes, index2, c0573b.f2123v);
                        break;
                    case 10:
                        str = str3;
                        c0573b.f2122u = m12148g(obtainStyledAttributes, index2, c0573b.f2122u);
                        break;
                    case 11:
                        str = str3;
                        c0573b.f2076P = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2076P);
                        break;
                    case 12:
                        str = str3;
                        c0573b.f2077Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2077Q);
                        break;
                    case 13:
                        str = str3;
                        c0573b.f2073M = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2073M);
                        break;
                    case 14:
                        str = str3;
                        c0573b.f2075O = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2075O);
                        break;
                    case 15:
                        str = str3;
                        c0573b.f2078R = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2078R);
                        break;
                    case 16:
                        str = str3;
                        c0573b.f2074N = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2074N);
                        break;
                    case 17:
                        str = str3;
                        c0573b.f2093d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0573b.f2093d);
                        break;
                    case 18:
                        str = str3;
                        c0573b.f2095e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0573b.f2095e);
                        break;
                    case 19:
                        str = str3;
                        c0573b.f2097f = obtainStyledAttributes.getFloat(index2, c0573b.f2097f);
                        break;
                    case 20:
                        str = str3;
                        c0573b.f2124w = obtainStyledAttributes.getFloat(index2, c0573b.f2124w);
                        break;
                    case 21:
                        str = str3;
                        c0573b.f2091c = obtainStyledAttributes.getLayoutDimension(index2, c0573b.f2091c);
                        break;
                    case 22:
                        str = str3;
                        c0575d.f2138a = iArr[obtainStyledAttributes.getInt(index2, c0575d.f2138a)];
                        break;
                    case 23:
                        str = str3;
                        c0573b.f2089b = obtainStyledAttributes.getLayoutDimension(index2, c0573b.f2089b);
                        break;
                    case 24:
                        str = str3;
                        c0573b.f2066F = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2066F);
                        break;
                    case 25:
                        str = str3;
                        c0573b.f2101h = m12148g(obtainStyledAttributes, index2, c0573b.f2101h);
                        break;
                    case 26:
                        str = str3;
                        c0573b.f2103i = m12148g(obtainStyledAttributes, index2, c0573b.f2103i);
                        break;
                    case 27:
                        str = str3;
                        c0573b.f2065E = obtainStyledAttributes.getInt(index2, c0573b.f2065E);
                        break;
                    case 28:
                        str = str3;
                        c0573b.f2067G = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2067G);
                        break;
                    case 29:
                        str = str3;
                        c0573b.f2105j = m12148g(obtainStyledAttributes, index2, c0573b.f2105j);
                        break;
                    case 30:
                        str = str3;
                        c0573b.f2107k = m12148g(obtainStyledAttributes, index2, c0573b.f2107k);
                        break;
                    case 31:
                        str = str3;
                        c0573b.f2071K = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2071K);
                        break;
                    case 32:
                        str = str3;
                        c0573b.f2120s = m12148g(obtainStyledAttributes, index2, c0573b.f2120s);
                        break;
                    case 33:
                        str = str3;
                        c0573b.f2121t = m12148g(obtainStyledAttributes, index2, c0573b.f2121t);
                        break;
                    case 34:
                        str = str3;
                        c0573b.f2068H = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2068H);
                        break;
                    case 35:
                        str = str3;
                        c0573b.f2111m = m12148g(obtainStyledAttributes, index2, c0573b.f2111m);
                        break;
                    case 36:
                        str = str3;
                        c0573b.f2109l = m12148g(obtainStyledAttributes, index2, c0573b.f2109l);
                        break;
                    case 37:
                        str = str3;
                        c0573b.f2125x = obtainStyledAttributes.getFloat(index2, c0573b.f2125x);
                        break;
                    case 38:
                        str = str3;
                        c0571a.f2042a = obtainStyledAttributes.getResourceId(index2, c0571a.f2042a);
                        break;
                    case 39:
                        str = str3;
                        c0573b.f2081U = obtainStyledAttributes.getFloat(index2, c0573b.f2081U);
                        break;
                    case 40:
                        str = str3;
                        c0573b.f2080T = obtainStyledAttributes.getFloat(index2, c0573b.f2080T);
                        break;
                    case 41:
                        str = str3;
                        c0573b.f2082V = obtainStyledAttributes.getInt(index2, c0573b.f2082V);
                        break;
                    case 42:
                        str = str3;
                        c0573b.f2083W = obtainStyledAttributes.getInt(index2, c0573b.f2083W);
                        break;
                    case 43:
                        str = str3;
                        c0575d.f2140c = obtainStyledAttributes.getFloat(index2, c0575d.f2140c);
                        break;
                    case 44:
                        str = str3;
                        c0576e.f2154l = true;
                        c0576e.f2155m = obtainStyledAttributes.getDimension(index2, c0576e.f2155m);
                        break;
                    case 45:
                        str = str3;
                        c0576e.f2144b = obtainStyledAttributes.getFloat(index2, c0576e.f2144b);
                        break;
                    case 46:
                        str = str3;
                        c0576e.f2145c = obtainStyledAttributes.getFloat(index2, c0576e.f2145c);
                        break;
                    case 47:
                        str = str3;
                        c0576e.f2146d = obtainStyledAttributes.getFloat(index2, c0576e.f2146d);
                        break;
                    case 48:
                        str = str3;
                        c0576e.f2147e = obtainStyledAttributes.getFloat(index2, c0576e.f2147e);
                        break;
                    case 49:
                        str = str3;
                        c0576e.f2148f = obtainStyledAttributes.getDimension(index2, c0576e.f2148f);
                        break;
                    case 50:
                        str = str3;
                        c0576e.f2149g = obtainStyledAttributes.getDimension(index2, c0576e.f2149g);
                        break;
                    case 51:
                        str = str3;
                        c0576e.f2151i = obtainStyledAttributes.getDimension(index2, c0576e.f2151i);
                        break;
                    case 52:
                        str = str3;
                        c0576e.f2152j = obtainStyledAttributes.getDimension(index2, c0576e.f2152j);
                        break;
                    case 53:
                        str = str3;
                        c0576e.f2153k = obtainStyledAttributes.getDimension(index2, c0576e.f2153k);
                        break;
                    case 54:
                        str = str3;
                        c0573b.f2084X = obtainStyledAttributes.getInt(index2, c0573b.f2084X);
                        break;
                    case 55:
                        str = str3;
                        c0573b.f2085Y = obtainStyledAttributes.getInt(index2, c0573b.f2085Y);
                        break;
                    case 56:
                        str = str3;
                        c0573b.f2086Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2086Z);
                        break;
                    case 57:
                        str = str3;
                        c0573b.f2088a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2088a0);
                        break;
                    case 58:
                        str = str3;
                        c0573b.f2090b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2090b0);
                        break;
                    case 59:
                        str = str3;
                        c0573b.f2092c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2092c0);
                        break;
                    case 60:
                        str = str3;
                        c0576e.f2143a = obtainStyledAttributes.getFloat(index2, c0576e.f2143a);
                        break;
                    case 61:
                        str = str3;
                        c0573b.f2127z = m12148g(obtainStyledAttributes, index2, c0573b.f2127z);
                        break;
                    case 62:
                        str = str3;
                        c0573b.f2061A = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2061A);
                        break;
                    case 63:
                        str = str3;
                        c0573b.f2062B = obtainStyledAttributes.getFloat(index2, c0573b.f2062B);
                        break;
                    case 64:
                        str = str3;
                        c0574c.f2129a = m12148g(obtainStyledAttributes, index2, c0574c.f2129a);
                        break;
                    case 65:
                        str = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                        } else {
                            String str5 = strArr2[obtainStyledAttributes.getInteger(index2, 0)];
                        }
                        c0574c.getClass();
                        break;
                    case 66:
                        str = str3;
                        obtainStyledAttributes.getInt(index2, 0);
                        c0574c.getClass();
                        break;
                    case 67:
                        str = str3;
                        c0574c.f2133e = obtainStyledAttributes.getFloat(index2, c0574c.f2133e);
                        break;
                    case 68:
                        str = str3;
                        c0575d.f2141d = obtainStyledAttributes.getFloat(index2, c0575d.f2141d);
                        break;
                    case 69:
                        str = str3;
                        c0573b.f2094d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str3;
                        c0573b.f2096e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str3;
                        c0573b.f2098f0 = obtainStyledAttributes.getInt(index2, c0573b.f2098f0);
                        break;
                    case 73:
                        str = str3;
                        c0573b.f2100g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2100g0);
                        break;
                    case 74:
                        str = str3;
                        c0573b.f2106j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str3;
                        c0573b.f2114n0 = obtainStyledAttributes.getBoolean(index2, c0573b.f2114n0);
                        break;
                    case 76:
                        str = str3;
                        c0574c.f2131c = obtainStyledAttributes.getInt(index2, c0574c.f2131c);
                        break;
                    case 77:
                        str = str3;
                        c0573b.f2108k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str3;
                        c0575d.f2139b = obtainStyledAttributes.getInt(index2, c0575d.f2139b);
                        break;
                    case 79:
                        str = str3;
                        c0574c.f2132d = obtainStyledAttributes.getFloat(index2, c0574c.f2132d);
                        break;
                    case 80:
                        str = str3;
                        c0573b.f2110l0 = obtainStyledAttributes.getBoolean(index2, c0573b.f2110l0);
                        break;
                    case 81:
                        str = str3;
                        c0573b.f2112m0 = obtainStyledAttributes.getBoolean(index2, c0573b.f2112m0);
                        break;
                    case 82:
                        str = str3;
                        c0574c.f2130b = obtainStyledAttributes.getInteger(index2, c0574c.f2130b);
                        break;
                    case 83:
                        str = str3;
                        c0576e.f2150h = m12148g(obtainStyledAttributes, index2, c0576e.f2150h);
                        break;
                    case 84:
                        str = str3;
                        c0574c.f2135g = obtainStyledAttributes.getInteger(index2, c0574c.f2135g);
                        break;
                    case 85:
                        str = str3;
                        c0574c.f2134f = obtainStyledAttributes.getFloat(index2, c0574c.f2134f);
                        break;
                    case 86:
                        str = str3;
                        int i15 = obtainStyledAttributes.peekValue(index2).type;
                        if (i15 != 1) {
                            if (i15 == 3) {
                                String string2 = obtainStyledAttributes.getString(index2);
                                c0574c.f2136h = string2;
                                if (string2.indexOf(RemoteSettings.FORWARD_SLASH_STRING) <= 0) {
                                    break;
                                } else {
                                    c0574c.f2137i = obtainStyledAttributes.getResourceId(index2, -1);
                                }
                            } else {
                                obtainStyledAttributes.getInteger(index2, c0574c.f2137i);
                            }
                            c0574c.getClass();
                            break;
                        } else {
                            c0574c.f2137i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        }
                    case 87:
                        StringBuilder sb2 = new StringBuilder(str3);
                        str = str3;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str3;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        c0573b.f2118q = m12148g(obtainStyledAttributes, index2, c0573b.f2118q);
                        str = str3;
                        break;
                    case 92:
                        c0573b.f2119r = m12148g(obtainStyledAttributes, index2, c0573b.f2119r);
                        str = str3;
                        break;
                    case 93:
                        c0573b.f2072L = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2072L);
                        str = str3;
                        break;
                    case 94:
                        c0573b.f2079S = obtainStyledAttributes.getDimensionPixelSize(index2, c0573b.f2079S);
                        str = str3;
                        break;
                    case 95:
                        i = 0;
                        m12147h(c0573b, obtainStyledAttributes, index2, i);
                        str = str3;
                        break;
                    case 96:
                        i = 1;
                        m12147h(c0573b, obtainStyledAttributes, index2, i);
                        str = str3;
                        break;
                    case 97:
                        c0573b.f2116o0 = obtainStyledAttributes.getInt(index2, c0573b.f2116o0);
                        str = str3;
                        break;
                }
                i13++;
                indexCount2 = i14;
                str3 = str;
            }
            if (c0573b.f2106j0 != null) {
                c0573b.f2104i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0571a;
    }

    /* renamed from: g */
    public static int m12148g(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m12147h(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0570d.m12147h(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: i */
    public static void m12146i(ConstraintLayout.C0562a c0562a, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0562a.f1932G = str;
    }

    /* renamed from: a */
    public final void m12154a(ConstraintLayout constraintLayout) {
        m12153b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: b */
    public final void m12153b(ConstraintLayout constraintLayout) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, C0571a> hashMap = this.f2041c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C0550a.m12194b(childAt));
            } else if (this.f2040b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0571a c0571a = hashMap.get(Integer.valueOf(id));
                        if (c0571a != null) {
                            if (childAt instanceof Barrier) {
                                C0573b c0573b = c0571a.f2045d;
                                c0573b.f2102h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c0573b.f2098f0);
                                barrier.setMargin(c0573b.f2100g0);
                                barrier.setAllowsGoneWidget(c0573b.f2114n0);
                                int[] iArr = c0573b.f2104i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c0573b.f2106j0;
                                    if (str != null) {
                                        int[] m12151d = m12151d(barrier, str);
                                        c0573b.f2104i0 = m12151d;
                                        barrier.setReferencedIds(m12151d);
                                    }
                                }
                            }
                            ConstraintLayout.C0562a c0562a = (ConstraintLayout.C0562a) childAt.getLayoutParams();
                            c0562a.m12169a();
                            c0571a.m12145a(c0562a);
                            C0565a.m12165b(childAt, c0571a.f2047f);
                            childAt.setLayoutParams(c0562a);
                            C0575d c0575d = c0571a.f2043b;
                            if (c0575d.f2139b == 0) {
                                childAt.setVisibility(c0575d.f2138a);
                            }
                            childAt.setAlpha(c0575d.f2140c);
                            C0576e c0576e = c0571a.f2046e;
                            childAt.setRotation(c0576e.f2143a);
                            childAt.setRotationX(c0576e.f2144b);
                            childAt.setRotationY(c0576e.f2145c);
                            childAt.setScaleX(c0576e.f2146d);
                            childAt.setScaleY(c0576e.f2147e);
                            if (c0576e.f2150h != -1) {
                                if (((View) childAt.getParent()).findViewById(c0576e.f2150h) != null) {
                                    float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                    float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0576e.f2148f)) {
                                    childAt.setPivotX(c0576e.f2148f);
                                }
                                if (!Float.isNaN(c0576e.f2149g)) {
                                    childAt.setPivotY(c0576e.f2149g);
                                }
                            }
                            childAt.setTranslationX(c0576e.f2151i);
                            childAt.setTranslationY(c0576e.f2152j);
                            childAt.setTranslationZ(c0576e.f2153k);
                            if (c0576e.f2154l) {
                                childAt.setElevation(c0576e.f2155m);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0571a c0571a2 = hashMap.get(num);
            if (c0571a2 != null) {
                C0573b c0573b2 = c0571a2.f2045d;
                if (c0573b2.f2102h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0573b2.f2104i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0573b2.f2106j0;
                        if (str2 != null) {
                            int[] m12151d2 = m12151d(barrier2, str2);
                            c0573b2.f2104i0 = m12151d2;
                            barrier2.setReferencedIds(m12151d2);
                        }
                    }
                    barrier2.setType(c0573b2.f2098f0);
                    barrier2.setMargin(c0573b2.f2100g0);
                    C0583j c0583j = ConstraintLayout.f1910p;
                    ConstraintLayout.C0562a c0562a2 = new ConstraintLayout.C0562a(-2, -2);
                    barrier2.m12157k();
                    c0571a2.m12145a(c0562a2);
                    constraintLayout.addView(barrier2, c0562a2);
                }
                if (c0573b2.f2087a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C0583j c0583j2 = ConstraintLayout.f1910p;
                    ConstraintLayout.C0562a c0562a3 = new ConstraintLayout.C0562a(-2, -2);
                    c0571a2.m12145a(c0562a3);
                    constraintLayout.addView(guideline, c0562a3);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof AbstractC0566b) {
                ((AbstractC0566b) childAt2).mo12134g(constraintLayout);
            }
        }
    }

    /* renamed from: c */
    public final void m12152c(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        C0565a c0565a;
        C0570d c0570d = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, C0571a> hashMap = c0570d.f2041c;
        hashMap.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ConstraintLayout.C0562a c0562a = (ConstraintLayout.C0562a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0570d.f2040b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0571a());
            }
            C0571a c0571a = hashMap.get(Integer.valueOf(id));
            if (c0571a == null) {
                i = childCount;
            } else {
                HashMap<String, C0565a> hashMap2 = c0570d.f2039a;
                HashMap<String, C0565a> hashMap3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0565a c0565a2 = hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            c0565a = new C0565a(c0565a2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                            i2 = childCount;
                        } else {
                            i2 = childCount;
                            try {
                                c0565a = new C0565a(c0565a2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (IllegalAccessException e) {
                                e = e;
                                e.printStackTrace();
                                childCount = i2;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                e.printStackTrace();
                                childCount = i2;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                e.printStackTrace();
                                childCount = i2;
                            }
                        }
                        hashMap3.put(str, c0565a);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                        e = e4;
                        i2 = childCount;
                    }
                    childCount = i2;
                }
                i = childCount;
                c0571a.f2047f = hashMap3;
                c0571a.m12144b(id, c0562a);
                int visibility = childAt.getVisibility();
                C0575d c0575d = c0571a.f2043b;
                c0575d.f2138a = visibility;
                c0575d.f2140c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C0576e c0576e = c0571a.f2046e;
                c0576e.f2143a = rotation;
                c0576e.f2144b = childAt.getRotationX();
                c0576e.f2145c = childAt.getRotationY();
                c0576e.f2146d = childAt.getScaleX();
                c0576e.f2147e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c0576e.f2148f = pivotX;
                    c0576e.f2149g = pivotY;
                }
                c0576e.f2151i = childAt.getTranslationX();
                c0576e.f2152j = childAt.getTranslationY();
                c0576e.f2153k = childAt.getTranslationZ();
                if (c0576e.f2154l) {
                    c0576e.f2155m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    C0573b c0573b = c0571a.f2045d;
                    c0573b.f2114n0 = allowsGoneWidget;
                    c0573b.f2104i0 = barrier.getReferencedIds();
                    c0573b.f2098f0 = barrier.getType();
                    c0573b.f2100g0 = barrier.getMargin();
                }
            }
            i3++;
            c0570d = this;
            childCount = i;
        }
    }

    /* renamed from: f */
    public final void m12149f(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    C0571a m12150e = m12150e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m12150e.f2045d.f2087a = true;
                    }
                    this.f2041c.put(Integer.valueOf(m12150e.f2042a), m12150e);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
