package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0504e;
import androidx.constraintlayout.core.widgets.C0540f;
import androidx.constraintlayout.core.widgets.C0541g;
import androidx.constraintlayout.core.widgets.C0544i;
import androidx.constraintlayout.core.widgets.analyzer.C0516b;
import com.google.android.gms.ads.AdRequest;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: p */
    public static C0583j f1910p;

    /* renamed from: a */
    public final SparseArray<View> f1911a;

    /* renamed from: b */
    public final ArrayList<AbstractC0566b> f1912b;

    /* renamed from: c */
    public final C0541g f1913c;

    /* renamed from: d */
    public int f1914d;

    /* renamed from: e */
    public int f1915e;

    /* renamed from: f */
    public int f1916f;

    /* renamed from: g */
    public int f1917g;

    /* renamed from: h */
    public boolean f1918h;

    /* renamed from: i */
    public int f1919i;

    /* renamed from: j */
    public C0570d f1920j;

    /* renamed from: k */
    public C0567c f1921k;

    /* renamed from: l */
    public int f1922l;

    /* renamed from: m */
    public HashMap<String, Integer> f1923m;

    /* renamed from: n */
    public final SparseArray<C0540f> f1924n;

    /* renamed from: o */
    public final C0564b f1925o;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: classes.dex */
    public static class C0562a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public int f1926A;

        /* renamed from: B */
        public int f1927B;

        /* renamed from: C */
        public final int f1928C;

        /* renamed from: D */
        public final int f1929D;

        /* renamed from: E */
        public float f1930E;

        /* renamed from: F */
        public float f1931F;

        /* renamed from: G */
        public String f1932G;

        /* renamed from: H */
        public float f1933H;

        /* renamed from: I */
        public float f1934I;

        /* renamed from: J */
        public int f1935J;

        /* renamed from: K */
        public int f1936K;

        /* renamed from: L */
        public int f1937L;

        /* renamed from: M */
        public int f1938M;

        /* renamed from: N */
        public int f1939N;

        /* renamed from: O */
        public int f1940O;

        /* renamed from: P */
        public int f1941P;

        /* renamed from: Q */
        public int f1942Q;

        /* renamed from: R */
        public float f1943R;

        /* renamed from: S */
        public float f1944S;

        /* renamed from: T */
        public int f1945T;

        /* renamed from: U */
        public int f1946U;

        /* renamed from: V */
        public int f1947V;

        /* renamed from: W */
        public boolean f1948W;

        /* renamed from: X */
        public boolean f1949X;

        /* renamed from: Y */
        public String f1950Y;

        /* renamed from: Z */
        public int f1951Z;

        /* renamed from: a */
        public int f1952a;

        /* renamed from: a0 */
        public boolean f1953a0;

        /* renamed from: b */
        public int f1954b;

        /* renamed from: b0 */
        public boolean f1955b0;

        /* renamed from: c */
        public float f1956c;

        /* renamed from: c0 */
        public boolean f1957c0;

        /* renamed from: d */
        public final boolean f1958d;

        /* renamed from: d0 */
        public boolean f1959d0;

        /* renamed from: e */
        public int f1960e;

        /* renamed from: e0 */
        public boolean f1961e0;

        /* renamed from: f */
        public int f1962f;

        /* renamed from: f0 */
        public boolean f1963f0;

        /* renamed from: g */
        public int f1964g;

        /* renamed from: g0 */
        public int f1965g0;

        /* renamed from: h */
        public int f1966h;

        /* renamed from: h0 */
        public int f1967h0;

        /* renamed from: i */
        public int f1968i;

        /* renamed from: i0 */
        public int f1969i0;

        /* renamed from: j */
        public int f1970j;

        /* renamed from: j0 */
        public int f1971j0;

        /* renamed from: k */
        public int f1972k;

        /* renamed from: k0 */
        public int f1973k0;

        /* renamed from: l */
        public int f1974l;

        /* renamed from: l0 */
        public int f1975l0;

        /* renamed from: m */
        public int f1976m;

        /* renamed from: m0 */
        public float f1977m0;

        /* renamed from: n */
        public int f1978n;

        /* renamed from: n0 */
        public int f1979n0;

        /* renamed from: o */
        public int f1980o;

        /* renamed from: o0 */
        public int f1981o0;

        /* renamed from: p */
        public int f1982p;

        /* renamed from: p0 */
        public float f1983p0;

        /* renamed from: q */
        public int f1984q;

        /* renamed from: q0 */
        public C0540f f1985q0;

        /* renamed from: r */
        public float f1986r;

        /* renamed from: s */
        public int f1987s;

        /* renamed from: t */
        public int f1988t;

        /* renamed from: u */
        public int f1989u;

        /* renamed from: v */
        public int f1990v;

        /* renamed from: w */
        public final int f1991w;

        /* renamed from: x */
        public int f1992x;

        /* renamed from: y */
        public int f1993y;

        /* renamed from: z */
        public int f1994z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        /* loaded from: classes.dex */
        public static class C0563a {

            /* renamed from: a */
            public static final SparseIntArray f1995a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1995a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public C0562a(int i, int i2) {
            super(i, i2);
            this.f1952a = -1;
            this.f1954b = -1;
            this.f1956c = -1.0f;
            this.f1958d = true;
            this.f1960e = -1;
            this.f1962f = -1;
            this.f1964g = -1;
            this.f1966h = -1;
            this.f1968i = -1;
            this.f1970j = -1;
            this.f1972k = -1;
            this.f1974l = -1;
            this.f1976m = -1;
            this.f1978n = -1;
            this.f1980o = -1;
            this.f1982p = -1;
            this.f1984q = 0;
            this.f1986r = 0.0f;
            this.f1987s = -1;
            this.f1988t = -1;
            this.f1989u = -1;
            this.f1990v = -1;
            this.f1991w = Integer.MIN_VALUE;
            this.f1992x = Integer.MIN_VALUE;
            this.f1993y = Integer.MIN_VALUE;
            this.f1994z = Integer.MIN_VALUE;
            this.f1926A = Integer.MIN_VALUE;
            this.f1927B = Integer.MIN_VALUE;
            this.f1928C = Integer.MIN_VALUE;
            this.f1929D = 0;
            this.f1930E = 0.5f;
            this.f1931F = 0.5f;
            this.f1932G = null;
            this.f1933H = -1.0f;
            this.f1934I = -1.0f;
            this.f1935J = 0;
            this.f1936K = 0;
            this.f1937L = 0;
            this.f1938M = 0;
            this.f1939N = 0;
            this.f1940O = 0;
            this.f1941P = 0;
            this.f1942Q = 0;
            this.f1943R = 1.0f;
            this.f1944S = 1.0f;
            this.f1945T = -1;
            this.f1946U = -1;
            this.f1947V = -1;
            this.f1948W = false;
            this.f1949X = false;
            this.f1950Y = null;
            this.f1951Z = 0;
            this.f1953a0 = true;
            this.f1955b0 = true;
            this.f1957c0 = false;
            this.f1959d0 = false;
            this.f1961e0 = false;
            this.f1963f0 = false;
            this.f1965g0 = -1;
            this.f1967h0 = -1;
            this.f1969i0 = -1;
            this.f1971j0 = -1;
            this.f1973k0 = Integer.MIN_VALUE;
            this.f1975l0 = Integer.MIN_VALUE;
            this.f1977m0 = 0.5f;
            this.f1985q0 = new C0540f();
        }

        public C0562a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            this.f1952a = -1;
            this.f1954b = -1;
            this.f1956c = -1.0f;
            this.f1958d = true;
            this.f1960e = -1;
            this.f1962f = -1;
            this.f1964g = -1;
            this.f1966h = -1;
            this.f1968i = -1;
            this.f1970j = -1;
            this.f1972k = -1;
            this.f1974l = -1;
            this.f1976m = -1;
            this.f1978n = -1;
            this.f1980o = -1;
            this.f1982p = -1;
            this.f1984q = 0;
            this.f1986r = 0.0f;
            this.f1987s = -1;
            this.f1988t = -1;
            this.f1989u = -1;
            this.f1990v = -1;
            this.f1991w = Integer.MIN_VALUE;
            this.f1992x = Integer.MIN_VALUE;
            this.f1993y = Integer.MIN_VALUE;
            this.f1994z = Integer.MIN_VALUE;
            this.f1926A = Integer.MIN_VALUE;
            this.f1927B = Integer.MIN_VALUE;
            this.f1928C = Integer.MIN_VALUE;
            this.f1929D = 0;
            this.f1930E = 0.5f;
            this.f1931F = 0.5f;
            this.f1932G = null;
            this.f1933H = -1.0f;
            this.f1934I = -1.0f;
            this.f1935J = 0;
            this.f1936K = 0;
            this.f1937L = 0;
            this.f1938M = 0;
            this.f1939N = 0;
            this.f1940O = 0;
            this.f1941P = 0;
            this.f1942Q = 0;
            this.f1943R = 1.0f;
            this.f1944S = 1.0f;
            this.f1945T = -1;
            this.f1946U = -1;
            this.f1947V = -1;
            this.f1948W = false;
            this.f1949X = false;
            this.f1950Y = null;
            this.f1951Z = 0;
            this.f1953a0 = true;
            this.f1955b0 = true;
            this.f1957c0 = false;
            this.f1959d0 = false;
            this.f1961e0 = false;
            this.f1963f0 = false;
            this.f1965g0 = -1;
            this.f1967h0 = -1;
            this.f1969i0 = -1;
            this.f1971j0 = -1;
            this.f1973k0 = Integer.MIN_VALUE;
            this.f1975l0 = Integer.MIN_VALUE;
            this.f1977m0 = 0.5f;
            this.f1985q0 = new C0540f();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0582i.f2174b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = C0563a.f1995a.get(index);
                switch (i2) {
                    case 1:
                        this.f1947V = obtainStyledAttributes.getInt(index, this.f1947V);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1982p);
                        this.f1982p = resourceId;
                        if (resourceId == -1) {
                            this.f1982p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f1984q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1984q);
                        continue;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f1986r) % 360.0f;
                        this.f1986r = f;
                        if (f < 0.0f) {
                            this.f1986r = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f1952a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1952a);
                        continue;
                    case 6:
                        this.f1954b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1954b);
                        continue;
                    case 7:
                        this.f1956c = obtainStyledAttributes.getFloat(index, this.f1956c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1960e);
                        this.f1960e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1960e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1962f);
                        this.f1962f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1962f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1964g);
                        this.f1964g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1964g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1966h);
                        this.f1966h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1966h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1968i);
                        this.f1968i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1968i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1970j);
                        this.f1970j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1970j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1972k);
                        this.f1972k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1972k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1974l);
                        this.f1974l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1974l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1976m);
                        this.f1976m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1976m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1987s);
                        this.f1987s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1987s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1988t);
                        this.f1988t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1988t = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1989u);
                        this.f1989u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1989u = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1990v);
                        this.f1990v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1990v = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f1991w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1991w);
                        continue;
                    case 22:
                        this.f1992x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1992x);
                        continue;
                    case 23:
                        this.f1993y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1993y);
                        continue;
                    case 24:
                        this.f1994z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1994z);
                        continue;
                    case 25:
                        this.f1926A = obtainStyledAttributes.getDimensionPixelSize(index, this.f1926A);
                        continue;
                    case 26:
                        this.f1927B = obtainStyledAttributes.getDimensionPixelSize(index, this.f1927B);
                        continue;
                    case 27:
                        this.f1948W = obtainStyledAttributes.getBoolean(index, this.f1948W);
                        continue;
                    case 28:
                        this.f1949X = obtainStyledAttributes.getBoolean(index, this.f1949X);
                        continue;
                    case 29:
                        this.f1930E = obtainStyledAttributes.getFloat(index, this.f1930E);
                        continue;
                    case 30:
                        this.f1931F = obtainStyledAttributes.getFloat(index, this.f1931F);
                        continue;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.f1937L = i3;
                        if (i3 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f1938M = i4;
                        if (i4 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.f1939N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1939N);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f1939N) == -2) {
                                this.f1939N = -2;
                            }
                        }
                    case 34:
                        try {
                            this.f1941P = obtainStyledAttributes.getDimensionPixelSize(index, this.f1941P);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f1941P) == -2) {
                                this.f1941P = -2;
                            }
                        }
                    case 35:
                        this.f1943R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1943R));
                        this.f1937L = 2;
                        continue;
                    case 36:
                        try {
                            this.f1940O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1940O);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f1940O) == -2) {
                                this.f1940O = -2;
                            }
                        }
                    case 37:
                        try {
                            this.f1942Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1942Q);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f1942Q) == -2) {
                                this.f1942Q = -2;
                            }
                        }
                    case 38:
                        this.f1944S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1944S));
                        this.f1938M = 2;
                        continue;
                    default:
                        switch (i2) {
                            case 44:
                                C0570d.m12146i(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.f1933H = obtainStyledAttributes.getFloat(index, this.f1933H);
                                continue;
                            case 46:
                                this.f1934I = obtainStyledAttributes.getFloat(index, this.f1934I);
                                continue;
                            case 47:
                                this.f1935J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f1936K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f1945T = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1945T);
                                continue;
                            case 50:
                                this.f1946U = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1946U);
                                continue;
                            case 51:
                                this.f1950Y = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1978n);
                                this.f1978n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1978n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1980o);
                                this.f1980o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1980o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.f1929D = obtainStyledAttributes.getDimensionPixelSize(index, this.f1929D);
                                continue;
                            case 55:
                                this.f1928C = obtainStyledAttributes.getDimensionPixelSize(index, this.f1928C);
                                continue;
                            default:
                                switch (i2) {
                                    case 64:
                                        C0570d.m12147h(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                        continue;
                                    case 65:
                                        C0570d.m12147h(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.f1951Z = obtainStyledAttributes.getInt(index, this.f1951Z);
                                        continue;
                                    case 67:
                                        this.f1958d = obtainStyledAttributes.getBoolean(index, this.f1958d);
                                        continue;
                                }
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            m12169a();
        }

        public C0562a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1952a = -1;
            this.f1954b = -1;
            this.f1956c = -1.0f;
            this.f1958d = true;
            this.f1960e = -1;
            this.f1962f = -1;
            this.f1964g = -1;
            this.f1966h = -1;
            this.f1968i = -1;
            this.f1970j = -1;
            this.f1972k = -1;
            this.f1974l = -1;
            this.f1976m = -1;
            this.f1978n = -1;
            this.f1980o = -1;
            this.f1982p = -1;
            this.f1984q = 0;
            this.f1986r = 0.0f;
            this.f1987s = -1;
            this.f1988t = -1;
            this.f1989u = -1;
            this.f1990v = -1;
            this.f1991w = Integer.MIN_VALUE;
            this.f1992x = Integer.MIN_VALUE;
            this.f1993y = Integer.MIN_VALUE;
            this.f1994z = Integer.MIN_VALUE;
            this.f1926A = Integer.MIN_VALUE;
            this.f1927B = Integer.MIN_VALUE;
            this.f1928C = Integer.MIN_VALUE;
            this.f1929D = 0;
            this.f1930E = 0.5f;
            this.f1931F = 0.5f;
            this.f1932G = null;
            this.f1933H = -1.0f;
            this.f1934I = -1.0f;
            this.f1935J = 0;
            this.f1936K = 0;
            this.f1937L = 0;
            this.f1938M = 0;
            this.f1939N = 0;
            this.f1940O = 0;
            this.f1941P = 0;
            this.f1942Q = 0;
            this.f1943R = 1.0f;
            this.f1944S = 1.0f;
            this.f1945T = -1;
            this.f1946U = -1;
            this.f1947V = -1;
            this.f1948W = false;
            this.f1949X = false;
            this.f1950Y = null;
            this.f1951Z = 0;
            this.f1953a0 = true;
            this.f1955b0 = true;
            this.f1957c0 = false;
            this.f1959d0 = false;
            this.f1961e0 = false;
            this.f1963f0 = false;
            this.f1965g0 = -1;
            this.f1967h0 = -1;
            this.f1969i0 = -1;
            this.f1971j0 = -1;
            this.f1973k0 = Integer.MIN_VALUE;
            this.f1975l0 = Integer.MIN_VALUE;
            this.f1977m0 = 0.5f;
            this.f1985q0 = new C0540f();
        }

        /* renamed from: a */
        public final void m12169a() {
            this.f1959d0 = false;
            this.f1953a0 = true;
            this.f1955b0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f1948W) {
                this.f1953a0 = false;
                if (this.f1937L == 0) {
                    this.f1937L = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f1949X) {
                this.f1955b0 = false;
                if (this.f1938M == 0) {
                    this.f1938M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f1953a0 = false;
                if (i == 0 && this.f1937L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1948W = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f1955b0 = false;
                if (i2 == 0 && this.f1938M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1949X = true;
                }
            }
            if (this.f1956c == -1.0f && this.f1952a == -1 && this.f1954b == -1) {
                return;
            }
            this.f1959d0 = true;
            this.f1953a0 = true;
            this.f1955b0 = true;
            if (!(this.f1985q0 instanceof C0544i)) {
                this.f1985q0 = new C0544i();
            }
            ((C0544i) this.f1985q0).m12212Q(this.f1947V);
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x00d0, code lost:
            if (r1 > 0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00d2, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r10).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x00df, code lost:
            if (r1 > 0) goto L52;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0562a.resolveLayoutDirection(int):void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    /* loaded from: classes.dex */
    public class C0564b implements C0516b.InterfaceC0518b {

        /* renamed from: a */
        public final ConstraintLayout f1996a;

        /* renamed from: b */
        public int f1997b;

        /* renamed from: c */
        public int f1998c;

        /* renamed from: d */
        public int f1999d;

        /* renamed from: e */
        public int f2000e;

        /* renamed from: f */
        public int f2001f;

        /* renamed from: g */
        public int f2002g;

        public C0564b(ConstraintLayout constraintLayout) {
            this.f1996a = constraintLayout;
        }

        /* renamed from: a */
        public static boolean m12168a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:122:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x01e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:155:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m12167b(androidx.constraintlayout.core.widgets.C0540f r19, androidx.constraintlayout.core.widgets.analyzer.C0516b.C0517a r20) {
            /*
                Method dump skipped, instructions count: 737
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0564b.m12167b(androidx.constraintlayout.core.widgets.f, androidx.constraintlayout.core.widgets.analyzer.b$a):void");
        }
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.f1911a = new SparseArray<>();
        this.f1912b = new ArrayList<>(4);
        this.f1913c = new C0541g();
        this.f1914d = 0;
        this.f1915e = 0;
        this.f1916f = Integer.MAX_VALUE;
        this.f1917g = Integer.MAX_VALUE;
        this.f1918h = true;
        this.f1919i = 257;
        this.f1920j = null;
        this.f1921k = null;
        this.f1922l = -1;
        this.f1923m = new HashMap<>();
        this.f1924n = new SparseArray<>();
        this.f1925o = new C0564b(this);
        m12174r(null, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1911a = new SparseArray<>();
        this.f1912b = new ArrayList<>(4);
        this.f1913c = new C0541g();
        this.f1914d = 0;
        this.f1915e = 0;
        this.f1916f = Integer.MAX_VALUE;
        this.f1917g = Integer.MAX_VALUE;
        this.f1918h = true;
        this.f1919i = 257;
        this.f1920j = null;
        this.f1921k = null;
        this.f1922l = -1;
        this.f1923m = new HashMap<>();
        this.f1924n = new SparseArray<>();
        this.f1925o = new C0564b(this);
        m12174r(attributeSet, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1911a = new SparseArray<>();
        this.f1912b = new ArrayList<>(4);
        this.f1913c = new C0541g();
        this.f1914d = 0;
        this.f1915e = 0;
        this.f1916f = Integer.MAX_VALUE;
        this.f1917g = Integer.MAX_VALUE;
        this.f1918h = true;
        this.f1919i = 257;
        this.f1920j = null;
        this.f1921k = null;
        this.f1922l = -1;
        this.f1923m = new HashMap<>();
        this.f1924n = new SparseArray<>();
        this.f1925o = new C0564b(this);
        m12174r(attributeSet, i);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static C0583j getSharedValues() {
        if (f1910p == null) {
            f1910p = new C0583j();
        }
        return f1910p;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0562a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC0566b> arrayList = this.f1912b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                arrayList.get(i).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final C0540f m12175f(View view) {
        if (view == this) {
            return this.f1913c;
        }
        if (view != null) {
            if (!(view.getLayoutParams() instanceof C0562a)) {
                view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
                if (!(view.getLayoutParams() instanceof C0562a)) {
                    return null;
                }
            }
            return ((C0562a) view.getLayoutParams()).f1985q0;
        }
        return null;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1918h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0562a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0562a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0562a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1917g;
    }

    public int getMaxWidth() {
        return this.f1916f;
    }

    public int getMinHeight() {
        return this.f1915e;
    }

    public int getMinWidth() {
        return this.f1914d;
    }

    public int getOptimizationLevel() {
        return this.f1913c.f1790F0;
    }

    public String getSceneString() {
        int id;
        String str;
        StringBuilder sb = new StringBuilder();
        C0541g c0541g = this.f1913c;
        if (c0541g.f1761k == null) {
            int id2 = getId();
            if (id2 != -1) {
                str = getContext().getResources().getResourceEntryName(id2);
            } else {
                str = "parent";
            }
            c0541g.f1761k = str;
        }
        if (c0541g.f1762k0 == null) {
            c0541g.f1762k0 = c0541g.f1761k;
            Log.v("ConstraintLayout", " setDebugName " + c0541g.f1762k0);
        }
        Iterator<C0540f> it = c0541g.f1870s0.iterator();
        while (it.hasNext()) {
            C0540f next = it.next();
            View view = (View) next.f1758i0;
            if (view != null) {
                if (next.f1761k == null && (id = view.getId()) != -1) {
                    next.f1761k = getContext().getResources().getResourceEntryName(id);
                }
                if (next.f1762k0 == null) {
                    next.f1762k0 = next.f1761k;
                    Log.v("ConstraintLayout", " setDebugName " + next.f1762k0);
                }
            }
        }
        c0541g.mo12224n(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0562a c0562a = (C0562a) childAt.getLayoutParams();
            C0540f c0540f = c0562a.f1985q0;
            if ((childAt.getVisibility() != 8 || c0562a.f1959d0 || c0562a.f1961e0 || isInEditMode) && !c0562a.f1963f0) {
                int m12239r = c0540f.m12239r();
                int m12238s = c0540f.m12238s();
                int m12240q = c0540f.m12240q() + m12239r;
                int m12244l = c0540f.m12244l() + m12238s;
                childAt.layout(m12239r, m12238s, m12240q, m12244l);
                if ((childAt instanceof C0580g) && (content = ((C0580g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m12239r, m12238s, m12240q, m12244l);
                }
            }
        }
        ArrayList<AbstractC0566b> arrayList = this.f1912b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C0540f m12175f = m12175f(view);
        if ((view instanceof Guideline) && !(m12175f instanceof C0544i)) {
            C0562a c0562a = (C0562a) view.getLayoutParams();
            C0544i c0544i = new C0544i();
            c0562a.f1985q0 = c0544i;
            c0562a.f1959d0 = true;
            c0544i.m12212Q(c0562a.f1947V);
        }
        if (view instanceof AbstractC0566b) {
            AbstractC0566b abstractC0566b = (AbstractC0566b) view;
            abstractC0566b.m12157k();
            ((C0562a) view.getLayoutParams()).f1961e0 = true;
            ArrayList<AbstractC0566b> arrayList = this.f1912b;
            if (!arrayList.contains(abstractC0566b)) {
                arrayList.add(abstractC0566b);
            }
        }
        this.f1911a.put(view.getId(), view);
        this.f1918h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1911a.remove(view.getId());
        C0540f m12175f = m12175f(view);
        this.f1913c.f1870s0.remove(m12175f);
        m12175f.mo12198C();
        this.f1912b.remove(view);
        this.f1918h = true;
    }

    /* renamed from: r */
    public final void m12174r(AttributeSet attributeSet, int i) {
        C0541g c0541g = this.f1913c;
        c0541g.f1758i0 = this;
        C0564b c0564b = this.f1925o;
        c0541g.f1802w0 = c0564b;
        c0541g.f1800u0.f1640f = c0564b;
        this.f1911a.put(getId(), this);
        this.f1920j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0582i.f2174b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f1914d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1914d);
                } else if (index == 17) {
                    this.f1915e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1915e);
                } else if (index == 14) {
                    this.f1916f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1916f);
                } else if (index == 15) {
                    this.f1917g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1917g);
                } else if (index == 113) {
                    this.f1919i = obtainStyledAttributes.getInt(index, this.f1919i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo12172t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1921k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0570d c0570d = new C0570d();
                        this.f1920j = c0570d;
                        c0570d.m12149f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1920j = null;
                    }
                    this.f1922l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0541g.f1790F0 = this.f1919i;
        C0504e.f1576p = c0541g.m12225V(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1918h = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final boolean m12173s() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void setConstraintSet(C0570d c0570d) {
        this.f1920j = c0570d;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray<View> sparseArray = this.f1911a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1917g) {
            return;
        }
        this.f1917g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1916f) {
            return;
        }
        this.f1916f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1915e) {
            return;
        }
        this.f1915e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f1914d) {
            return;
        }
        this.f1914d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0579f abstractC0579f) {
        C0567c c0567c = this.f1921k;
        if (c0567c != null) {
            c0567c.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1919i = i;
        C0541g c0541g = this.f1913c;
        c0541g.f1790F0 = i;
        C0504e.f1576p = c0541g.m12225V(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public void mo12172t(int i) {
        this.f1921k = new C0567c(getContext(), this, i);
    }

    /* renamed from: u */
    public final void m12171u(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f1923m == null) {
                this.f1923m = new HashMap<>();
            }
            int indexOf = str.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1923m.put(str, Integer.valueOf(num.intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d1  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m12170v() {
        /*
            Method dump skipped, instructions count: 1397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m12170v():boolean");
    }
}
