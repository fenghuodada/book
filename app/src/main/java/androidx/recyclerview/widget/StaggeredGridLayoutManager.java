package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC1635m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.AbstractC1591u.InterfaceC1593b {

    /* renamed from: B */
    public final C1601d f3795B;

    /* renamed from: C */
    public final int f3796C;

    /* renamed from: D */
    public boolean f3797D;

    /* renamed from: E */
    public boolean f3798E;

    /* renamed from: F */
    public C1604e f3799F;

    /* renamed from: G */
    public int f3800G;

    /* renamed from: H */
    public final Rect f3801H;

    /* renamed from: I */
    public final C1599b f3802I;

    /* renamed from: J */
    public boolean f3803J;

    /* renamed from: K */
    public final boolean f3804K;

    /* renamed from: L */
    public int[] f3805L;

    /* renamed from: M */
    public final RunnableC1598a f3806M;

    /* renamed from: p */
    public int f3807p;

    /* renamed from: q */
    public C1606f[] f3808q;
    @NonNull

    /* renamed from: r */
    public AbstractC1645s f3809r;
    @NonNull

    /* renamed from: s */
    public AbstractC1645s f3810s;

    /* renamed from: t */
    public int f3811t;

    /* renamed from: u */
    public int f3812u;
    @NonNull

    /* renamed from: v */
    public final C1639n f3813v;

    /* renamed from: w */
    public boolean f3814w;

    /* renamed from: y */
    public BitSet f3816y;

    /* renamed from: x */
    public boolean f3815x = false;

    /* renamed from: z */
    public int f3817z = -1;

    /* renamed from: A */
    public int f3794A = Integer.MIN_VALUE;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes.dex */
    public class RunnableC1598a implements Runnable {
        public RunnableC1598a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.m10271E0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes.dex */
    public class C1599b {

        /* renamed from: a */
        public int f3819a;

        /* renamed from: b */
        public int f3820b;

        /* renamed from: c */
        public boolean f3821c;

        /* renamed from: d */
        public boolean f3822d;

        /* renamed from: e */
        public boolean f3823e;

        /* renamed from: f */
        public int[] f3824f;

        public C1599b() {
            m10214a();
        }

        /* renamed from: a */
        public final void m10214a() {
            this.f3819a = -1;
            this.f3820b = Integer.MIN_VALUE;
            this.f3821c = false;
            this.f3822d = false;
            this.f3823e = false;
            int[] iArr = this.f3824f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C1600c extends RecyclerView.C1579k {

        /* renamed from: e */
        public C1606f f3826e;

        /* renamed from: f */
        public boolean f3827f;

        public C1600c(int i, int i2) {
            super(i, i2);
        }

        public C1600c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1600c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1600c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes.dex */
    public static class C1601d {

        /* renamed from: a */
        public int[] f3828a;

        /* renamed from: b */
        public List<C1602a> f3829b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        /* loaded from: classes.dex */
        public static class C1602a implements Parcelable {
            public static final Parcelable.Creator<C1602a> CREATOR = new C1603a();

            /* renamed from: a */
            public int f3830a;

            /* renamed from: b */
            public int f3831b;

            /* renamed from: c */
            public int[] f3832c;

            /* renamed from: d */
            public boolean f3833d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: classes.dex */
            public class C1603a implements Parcelable.Creator<C1602a> {
                @Override // android.os.Parcelable.Creator
                public final C1602a createFromParcel(Parcel parcel) {
                    return new C1602a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final C1602a[] newArray(int i) {
                    return new C1602a[i];
                }
            }

            public C1602a() {
            }

            public C1602a(Parcel parcel) {
                this.f3830a = parcel.readInt();
                this.f3831b = parcel.readInt();
                this.f3833d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3832c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f3830a + ", mGapDir=" + this.f3831b + ", mHasUnwantedGapAfter=" + this.f3833d + ", mGapPerSpan=" + Arrays.toString(this.f3832c) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3830a);
                parcel.writeInt(this.f3831b);
                parcel.writeInt(this.f3833d ? 1 : 0);
                int[] iArr = this.f3832c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3832c);
            }
        }

        /* renamed from: a */
        public final void m10213a(C1602a c1602a) {
            if (this.f3829b == null) {
                this.f3829b = new ArrayList();
            }
            int size = this.f3829b.size();
            for (int i = 0; i < size; i++) {
                C1602a c1602a2 = this.f3829b.get(i);
                if (c1602a2.f3830a == c1602a.f3830a) {
                    this.f3829b.remove(i);
                }
                if (c1602a2.f3830a >= c1602a.f3830a) {
                    this.f3829b.add(i, c1602a);
                    return;
                }
            }
            this.f3829b.add(c1602a);
        }

        /* renamed from: b */
        public final void m10212b() {
            int[] iArr = this.f3828a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3829b = null;
        }

        /* renamed from: c */
        public final void m10211c(int i) {
            int[] iArr = this.f3828a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f3828a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f3828a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3828a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        public final void m10210d(int i) {
            List<C1602a> list = this.f3829b;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (this.f3829b.get(size).f3830a >= i) {
                        this.f3829b.remove(size);
                    }
                }
            }
            m10207g(i);
        }

        /* renamed from: e */
        public final C1602a m10209e(int i, int i2, int i3) {
            List<C1602a> list = this.f3829b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1602a c1602a = this.f3829b.get(i4);
                int i5 = c1602a.f3830a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || c1602a.f3831b == i3 || c1602a.f3833d)) {
                    return c1602a;
                }
            }
            return null;
        }

        /* renamed from: f */
        public final C1602a m10208f(int i) {
            List<C1602a> list = this.f3829b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1602a c1602a = this.f3829b.get(size);
                if (c1602a.f3830a == i) {
                    return c1602a;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m10207g(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f3828a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r5 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3829b
                if (r0 != 0) goto L10
            Le:
                r0 = r1
                goto L46
            L10:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.m10208f(r5)
                if (r0 == 0) goto L1b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f3829b
                r2.remove(r0)
            L1b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3829b
                int r0 = r0.size()
                r2 = 0
            L22:
                if (r2 >= r0) goto L34
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f3829b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1601d.C1602a) r3
                int r3 = r3.f3830a
                if (r3 < r5) goto L31
                goto L35
            L31:
                int r2 = r2 + 1
                goto L22
            L34:
                r2 = r1
            L35:
                if (r2 == r1) goto Le
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3829b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1601d.C1602a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f3829b
                r3.remove(r2)
                int r0 = r0.f3830a
            L46:
                if (r0 != r1) goto L52
                int[] r0 = r4.f3828a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f3828a
                int r5 = r5.length
                return r5
            L52:
                int r0 = r0 + 1
                int[] r2 = r4.f3828a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r4.f3828a
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C1601d.m10207g(int):int");
        }

        /* renamed from: h */
        public final void m10206h(int i, int i2) {
            int[] iArr = this.f3828a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m10211c(i3);
                int[] iArr2 = this.f3828a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f3828a, i, i3, -1);
                List<C1602a> list = this.f3829b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C1602a c1602a = this.f3829b.get(size);
                        int i4 = c1602a.f3830a;
                        if (i4 >= i) {
                            c1602a.f3830a = i4 + i2;
                        }
                    }
                }
            }
        }

        /* renamed from: i */
        public final void m10205i(int i, int i2) {
            int[] iArr = this.f3828a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m10211c(i3);
                int[] iArr2 = this.f3828a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f3828a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<C1602a> list = this.f3829b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C1602a c1602a = this.f3829b.get(size);
                        int i4 = c1602a.f3830a;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.f3829b.remove(size);
                            } else {
                                c1602a.f3830a = i4 - i2;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    /* loaded from: classes.dex */
    public static class C1604e implements Parcelable {
        public static final Parcelable.Creator<C1604e> CREATOR = new C1605a();

        /* renamed from: a */
        public int f3834a;

        /* renamed from: b */
        public int f3835b;

        /* renamed from: c */
        public int f3836c;

        /* renamed from: d */
        public int[] f3837d;

        /* renamed from: e */
        public int f3838e;

        /* renamed from: f */
        public int[] f3839f;

        /* renamed from: g */
        public List<C1601d.C1602a> f3840g;

        /* renamed from: h */
        public boolean f3841h;

        /* renamed from: i */
        public boolean f3842i;

        /* renamed from: j */
        public boolean f3843j;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        /* loaded from: classes.dex */
        public class C1605a implements Parcelable.Creator<C1604e> {
            @Override // android.os.Parcelable.Creator
            public final C1604e createFromParcel(Parcel parcel) {
                return new C1604e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C1604e[] newArray(int i) {
                return new C1604e[i];
            }
        }

        public C1604e() {
        }

        public C1604e(Parcel parcel) {
            this.f3834a = parcel.readInt();
            this.f3835b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3836c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3837d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3838e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3839f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3841h = parcel.readInt() == 1;
            this.f3842i = parcel.readInt() == 1;
            this.f3843j = parcel.readInt() == 1;
            this.f3840g = parcel.readArrayList(C1601d.C1602a.class.getClassLoader());
        }

        public C1604e(C1604e c1604e) {
            this.f3836c = c1604e.f3836c;
            this.f3834a = c1604e.f3834a;
            this.f3835b = c1604e.f3835b;
            this.f3837d = c1604e.f3837d;
            this.f3838e = c1604e.f3838e;
            this.f3839f = c1604e.f3839f;
            this.f3841h = c1604e.f3841h;
            this.f3842i = c1604e.f3842i;
            this.f3843j = c1604e.f3843j;
            this.f3840g = c1604e.f3840g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3834a);
            parcel.writeInt(this.f3835b);
            parcel.writeInt(this.f3836c);
            if (this.f3836c > 0) {
                parcel.writeIntArray(this.f3837d);
            }
            parcel.writeInt(this.f3838e);
            if (this.f3838e > 0) {
                parcel.writeIntArray(this.f3839f);
            }
            parcel.writeInt(this.f3841h ? 1 : 0);
            parcel.writeInt(this.f3842i ? 1 : 0);
            parcel.writeInt(this.f3843j ? 1 : 0);
            parcel.writeList(this.f3840g);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    /* loaded from: classes.dex */
    public class C1606f {

        /* renamed from: a */
        public final ArrayList<View> f3844a = new ArrayList<>();

        /* renamed from: b */
        public int f3845b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f3846c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f3847d = 0;

        /* renamed from: e */
        public final int f3848e;

        public C1606f(int i) {
            this.f3848e = i;
        }

        /* renamed from: j */
        public static C1600c m10195j(View view) {
            return (C1600c) view.getLayoutParams();
        }

        /* renamed from: a */
        public final void m10204a(View view) {
            C1600c c1600c = (C1600c) view.getLayoutParams();
            c1600c.f3826e = this;
            ArrayList<View> arrayList = this.f3844a;
            arrayList.add(view);
            this.f3846c = Integer.MIN_VALUE;
            if (arrayList.size() == 1) {
                this.f3845b = Integer.MIN_VALUE;
            }
            if (c1600c.m10296c() || c1600c.m10297b()) {
                this.f3847d = StaggeredGridLayoutManager.this.f3809r.mo10123c(view) + this.f3847d;
            }
        }

        /* renamed from: b */
        public final void m10203b() {
            C1601d.C1602a m10208f;
            int i;
            ArrayList<View> arrayList = this.f3844a;
            View view = arrayList.get(arrayList.size() - 1);
            C1600c m10195j = m10195j(view);
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.f3846c = staggeredGridLayoutManager.f3809r.mo10124b(view);
            if (m10195j.f3827f && (m10208f = staggeredGridLayoutManager.f3795B.m10208f(m10195j.m10298a())) != null && m10208f.f3831b == 1) {
                int i2 = this.f3846c;
                int[] iArr = m10208f.f3832c;
                if (iArr == null) {
                    i = 0;
                } else {
                    i = iArr[this.f3848e];
                }
                this.f3846c = i + i2;
            }
        }

        /* renamed from: c */
        public final void m10202c() {
            C1601d.C1602a m10208f;
            int i = 0;
            View view = this.f3844a.get(0);
            C1600c m10195j = m10195j(view);
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.f3845b = staggeredGridLayoutManager.f3809r.mo10121e(view);
            if (m10195j.f3827f && (m10208f = staggeredGridLayoutManager.f3795B.m10208f(m10195j.m10298a())) != null && m10208f.f3831b == -1) {
                int i2 = this.f3845b;
                int[] iArr = m10208f.f3832c;
                if (iArr != null) {
                    i = iArr[this.f3848e];
                }
                this.f3845b = i2 - i;
            }
        }

        /* renamed from: d */
        public final void m10201d() {
            this.f3844a.clear();
            this.f3845b = Integer.MIN_VALUE;
            this.f3846c = Integer.MIN_VALUE;
            this.f3847d = 0;
        }

        /* renamed from: e */
        public final int m10200e() {
            int size;
            int i;
            boolean z = StaggeredGridLayoutManager.this.f3814w;
            ArrayList<View> arrayList = this.f3844a;
            if (z) {
                i = arrayList.size() - 1;
                size = -1;
            } else {
                size = arrayList.size();
                i = 0;
            }
            return m10198g(i, size, false, false, true);
        }

        /* renamed from: f */
        public final int m10199f() {
            boolean z = StaggeredGridLayoutManager.this.f3814w;
            ArrayList<View> arrayList = this.f3844a;
            if (z) {
                return m10198g(0, arrayList.size(), false, false, true);
            }
            return m10198g(arrayList.size() - 1, -1, false, false, true);
        }

        /* renamed from: g */
        public final int m10198g(int i, int i2, boolean z, boolean z2, boolean z3) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int mo10115k = staggeredGridLayoutManager.f3809r.mo10115k();
            int mo10119g = staggeredGridLayoutManager.f3809r.mo10119g();
            int i3 = i;
            int i4 = i2 > i3 ? 1 : -1;
            while (i3 != i2) {
                View view = this.f3844a.get(i3);
                int mo10121e = staggeredGridLayoutManager.f3809r.mo10121e(view);
                int mo10124b = staggeredGridLayoutManager.f3809r.mo10124b(view);
                boolean z4 = false;
                boolean z5 = !z3 ? mo10121e >= mo10119g : mo10121e > mo10119g;
                if (!z3 ? mo10124b > mo10115k : mo10124b >= mo10115k) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (mo10121e >= mo10115k && mo10124b <= mo10119g) {
                            return RecyclerView.LayoutManager.m10336K(view);
                        }
                    } else if (z2) {
                        return RecyclerView.LayoutManager.m10336K(view);
                    } else {
                        if (mo10121e < mo10115k || mo10124b > mo10119g) {
                            return RecyclerView.LayoutManager.m10336K(view);
                        }
                    }
                }
                i3 += i4;
            }
            return -1;
        }

        /* renamed from: h */
        public final int m10197h(int i) {
            int i2 = this.f3846c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3844a.size() == 0) {
                return i;
            }
            m10203b();
            return this.f3846c;
        }

        /* renamed from: i */
        public final View m10196i(int i, int i2) {
            ArrayList<View> arrayList = this.f3844a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f3814w && RecyclerView.LayoutManager.m10336K(view2) >= i) || ((!staggeredGridLayoutManager.f3814w && RecyclerView.LayoutManager.m10336K(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = arrayList.get(i3);
                    if ((staggeredGridLayoutManager.f3814w && RecyclerView.LayoutManager.m10336K(view3) <= i) || ((!staggeredGridLayoutManager.f3814w && RecyclerView.LayoutManager.m10336K(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: k */
        public final int m10194k(int i) {
            int i2 = this.f3845b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3844a.size() == 0) {
                return i;
            }
            m10202c();
            return this.f3845b;
        }

        /* renamed from: l */
        public final void m10193l() {
            ArrayList<View> arrayList = this.f3844a;
            int size = arrayList.size();
            View remove = arrayList.remove(size - 1);
            C1600c m10195j = m10195j(remove);
            m10195j.f3826e = null;
            if (m10195j.m10296c() || m10195j.m10297b()) {
                this.f3847d -= StaggeredGridLayoutManager.this.f3809r.mo10123c(remove);
            }
            if (size == 1) {
                this.f3845b = Integer.MIN_VALUE;
            }
            this.f3846c = Integer.MIN_VALUE;
        }

        /* renamed from: m */
        public final void m10192m() {
            ArrayList<View> arrayList = this.f3844a;
            View remove = arrayList.remove(0);
            C1600c m10195j = m10195j(remove);
            m10195j.f3826e = null;
            if (arrayList.size() == 0) {
                this.f3846c = Integer.MIN_VALUE;
            }
            if (m10195j.m10296c() || m10195j.m10297b()) {
                this.f3847d -= StaggeredGridLayoutManager.this.f3809r.mo10123c(remove);
            }
            this.f3845b = Integer.MIN_VALUE;
        }

        /* renamed from: n */
        public final void m10191n(View view) {
            C1600c c1600c = (C1600c) view.getLayoutParams();
            c1600c.f3826e = this;
            ArrayList<View> arrayList = this.f3844a;
            arrayList.add(0, view);
            this.f3845b = Integer.MIN_VALUE;
            if (arrayList.size() == 1) {
                this.f3846c = Integer.MIN_VALUE;
            }
            if (c1600c.m10296c() || c1600c.m10297b()) {
                this.f3847d = StaggeredGridLayoutManager.this.f3809r.mo10123c(view) + this.f3847d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3807p = -1;
        this.f3814w = false;
        C1601d c1601d = new C1601d();
        this.f3795B = c1601d;
        this.f3796C = 2;
        this.f3801H = new Rect();
        this.f3802I = new C1599b();
        this.f3803J = false;
        this.f3804K = true;
        this.f3806M = new RunnableC1598a();
        RecyclerView.LayoutManager.Properties m10335L = RecyclerView.LayoutManager.m10335L(context, attributeSet, i, i2);
        int i3 = m10335L.orientation;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo10237c(null);
        if (i3 != this.f3811t) {
            this.f3811t = i3;
            AbstractC1645s abstractC1645s = this.f3809r;
            this.f3809r = this.f3810s;
            this.f3810s = abstractC1645s;
            m10320o0();
        }
        int i4 = m10335L.spanCount;
        mo10237c(null);
        if (i4 != this.f3807p) {
            c1601d.m10212b();
            m10320o0();
            this.f3807p = i4;
            this.f3816y = new BitSet(this.f3807p);
            this.f3808q = new C1606f[this.f3807p];
            for (int i5 = 0; i5 < this.f3807p; i5++) {
                this.f3808q[i5] = new C1606f(i5);
            }
            m10320o0();
        }
        boolean z = m10335L.reverseLayout;
        mo10237c(null);
        C1604e c1604e = this.f3799F;
        if (c1604e != null && c1604e.f3841h != z) {
            c1604e.f3841h = z;
        }
        this.f3814w = z;
        m10320o0();
        this.f3813v = new C1639n();
        this.f3809r = AbstractC1645s.m10125a(this.f3811t, this);
        this.f3810s = AbstractC1645s.m10125a(1 - this.f3811t, this);
    }

    /* renamed from: h1 */
    public static int m10224h1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: A0 */
    public final void mo4606A0(RecyclerView recyclerView, int i) {
        C1640o c1640o = new C1640o(recyclerView.getContext());
        c1640o.f3758a = i;
        m10345B0(c1640o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C0 */
    public final boolean mo10273C0() {
        return this.f3799F == null;
    }

    /* renamed from: D0 */
    public final int m10272D0(int i) {
        if (m10313w() == 0) {
            return this.f3815x ? 1 : -1;
        }
        return (i < m10262N0()) != this.f3815x ? -1 : 1;
    }

    /* renamed from: E0 */
    public final boolean m10271E0() {
        int m10262N0;
        int m10260O0;
        int i;
        int i2;
        if (m10313w() == 0 || this.f3796C == 0 || !this.f3721g) {
            return false;
        }
        if (this.f3815x) {
            m10262N0 = m10260O0();
            m10260O0 = m10262N0();
        } else {
            m10262N0 = m10262N0();
            m10260O0 = m10260O0();
        }
        C1601d c1601d = this.f3795B;
        if (m10262N0 == 0 && m10254S0() != null) {
            c1601d.m10212b();
        } else if (!this.f3803J) {
            return false;
        } else {
            if (this.f3815x) {
                i = -1;
            } else {
                i = 1;
            }
            int i3 = m10260O0 + 1;
            C1601d.C1602a m10209e = c1601d.m10209e(m10262N0, i3, i);
            if (m10209e == null) {
                this.f3803J = false;
                c1601d.m10210d(i3);
                return false;
            }
            C1601d.C1602a m10209e2 = c1601d.m10209e(m10262N0, m10209e.f3830a, i * (-1));
            if (m10209e2 == null) {
                i2 = m10209e.f3830a;
            } else {
                i2 = m10209e2.f3830a + 1;
            }
            c1601d.m10210d(i2);
        }
        this.f3720f = true;
        m10320o0();
        return true;
    }

    /* renamed from: F0 */
    public final int m10270F0(RecyclerView.C1594v c1594v) {
        if (m10313w() == 0) {
            return 0;
        }
        AbstractC1645s abstractC1645s = this.f3809r;
        boolean z = this.f3804K;
        return C1652y.m10092a(c1594v, abstractC1645s, m10265K0(!z), m10266J0(!z), this, this.f3804K);
    }

    /* renamed from: G0 */
    public final int m10269G0(RecyclerView.C1594v c1594v) {
        if (m10313w() == 0) {
            return 0;
        }
        AbstractC1645s abstractC1645s = this.f3809r;
        boolean z = this.f3804K;
        return C1652y.m10091b(c1594v, abstractC1645s, m10265K0(!z), m10266J0(!z), this, this.f3804K, this.f3815x);
    }

    /* renamed from: H0 */
    public final int m10268H0(RecyclerView.C1594v c1594v) {
        if (m10313w() == 0) {
            return 0;
        }
        AbstractC1645s abstractC1645s = this.f3809r;
        boolean z = this.f3804K;
        return C1652y.m10090c(c1594v, abstractC1645s, m10265K0(!z), m10266J0(!z), this, this.f3804K);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d0  */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m10267I0(androidx.recyclerview.widget.RecyclerView.C1586q r22, androidx.recyclerview.widget.C1639n r23, androidx.recyclerview.widget.RecyclerView.C1594v r24) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m10267I0(androidx.recyclerview.widget.RecyclerView$q, androidx.recyclerview.widget.n, androidx.recyclerview.widget.RecyclerView$v):int");
    }

    /* renamed from: J0 */
    public final View m10266J0(boolean z) {
        int mo10115k = this.f3809r.mo10115k();
        int mo10119g = this.f3809r.mo10119g();
        View view = null;
        for (int m10313w = m10313w() - 1; m10313w >= 0; m10313w--) {
            View m10315v = m10315v(m10313w);
            int mo10121e = this.f3809r.mo10121e(m10315v);
            int mo10124b = this.f3809r.mo10124b(m10315v);
            if (mo10124b > mo10115k && mo10121e < mo10119g) {
                if (mo10124b <= mo10119g || !z) {
                    return m10315v;
                }
                if (view == null) {
                    view = m10315v;
                }
            }
        }
        return view;
    }

    /* renamed from: K0 */
    public final View m10265K0(boolean z) {
        int mo10115k = this.f3809r.mo10115k();
        int mo10119g = this.f3809r.mo10119g();
        int m10313w = m10313w();
        View view = null;
        for (int i = 0; i < m10313w; i++) {
            View m10315v = m10315v(i);
            int mo10121e = this.f3809r.mo10121e(m10315v);
            if (this.f3809r.mo10124b(m10315v) > mo10115k && mo10121e < mo10119g) {
                if (mo10121e >= mo10115k || !z) {
                    return m10315v;
                }
                if (view == null) {
                    view = m10315v;
                }
            }
        }
        return view;
    }

    /* renamed from: L0 */
    public final void m10264L0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v, boolean z) {
        int mo10119g;
        int m10259P0 = m10259P0(Integer.MIN_VALUE);
        if (m10259P0 != Integer.MIN_VALUE && (mo10119g = this.f3809r.mo10119g() - m10259P0) > 0) {
            int i = mo10119g - (-m10235c1(-mo10119g, c1586q, c1594v));
            if (!z || i <= 0) {
                return;
            }
            this.f3809r.mo10111o(i);
        }
    }

    /* renamed from: M0 */
    public final void m10263M0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v, boolean z) {
        int mo10115k;
        int m10258Q0 = m10258Q0(Integer.MAX_VALUE);
        if (m10258Q0 != Integer.MAX_VALUE && (mo10115k = m10258Q0 - this.f3809r.mo10115k()) > 0) {
            int m10235c1 = mo10115k - m10235c1(mo10115k, c1586q, c1594v);
            if (!z || m10235c1 <= 0) {
                return;
            }
            this.f3809r.mo10111o(-m10235c1);
        }
    }

    /* renamed from: N0 */
    public final int m10262N0() {
        if (m10313w() == 0) {
            return 0;
        }
        return RecyclerView.LayoutManager.m10336K(m10315v(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public final boolean mo10261O() {
        return this.f3796C != 0;
    }

    /* renamed from: O0 */
    public final int m10260O0() {
        int m10313w = m10313w();
        if (m10313w == 0) {
            return 0;
        }
        return RecyclerView.LayoutManager.m10336K(m10315v(m10313w - 1));
    }

    /* renamed from: P0 */
    public final int m10259P0(int i) {
        int m10197h = this.f3808q[0].m10197h(i);
        for (int i2 = 1; i2 < this.f3807p; i2++) {
            int m10197h2 = this.f3808q[i2].m10197h(i);
            if (m10197h2 > m10197h) {
                m10197h = m10197h2;
            }
        }
        return m10197h;
    }

    /* renamed from: Q0 */
    public final int m10258Q0(int i) {
        int m10194k = this.f3808q[0].m10194k(i);
        for (int i2 = 1; i2 < this.f3807p; i2++) {
            int m10194k2 = this.f3808q[i2].m10194k(i);
            if (m10194k2 < m10194k) {
                m10194k = m10194k2;
            }
        }
        return m10194k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R */
    public final void mo10257R(int i) {
        super.mo10257R(i);
        for (int i2 = 0; i2 < this.f3807p; i2++) {
            C1606f c1606f = this.f3808q[i2];
            int i3 = c1606f.f3845b;
            if (i3 != Integer.MIN_VALUE) {
                c1606f.f3845b = i3 + i;
            }
            int i4 = c1606f.f3846c;
            if (i4 != Integer.MIN_VALUE) {
                c1606f.f3846c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10256R0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f3815x
            if (r0 == 0) goto L9
            int r0 = r7.m10260O0()
            goto Ld
        L9:
            int r0 = r7.m10262N0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r7.f3795B
            r4.m10207g(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.m10205i(r8, r5)
            r4.m10206h(r9, r5)
            goto L39
        L32:
            r4.m10205i(r8, r9)
            goto L39
        L36:
            r4.m10206h(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.f3815x
            if (r8 == 0) goto L45
            int r8 = r7.m10262N0()
            goto L49
        L45:
            int r8 = r7.m10260O0()
        L49:
            if (r3 > r8) goto L4e
            r7.m10320o0()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m10256R0(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: S */
    public final void mo10255S(int i) {
        super.mo10255S(i);
        for (int i2 = 0; i2 < this.f3807p; i2++) {
            C1606f c1606f = this.f3808q[i2];
            int i3 = c1606f.f3845b;
            if (i3 != Integer.MIN_VALUE) {
                c1606f.f3845b = i3 + i;
            }
            int i4 = c1606f.f3846c;
            if (i4 != Integer.MIN_VALUE) {
                c1606f.f3846c = i4 + i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
        if (r11 == r12) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if (r11 == r12) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
        r11 = false;
     */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m10254S0() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m10254S0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: T */
    public final void mo10253T() {
        this.f3795B.m10212b();
        for (int i = 0; i < this.f3807p; i++) {
            this.f3808q[i].m10201d();
        }
    }

    /* renamed from: T0 */
    public final boolean m10252T0() {
        return m10341F() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U */
    public final void mo10251U(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3716b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f3806M);
        }
        for (int i = 0; i < this.f3807p; i++) {
            this.f3808q[i].m10201d();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: U0 */
    public final void m10250U0(View view, int i, int i2, boolean z) {
        Rect rect = this.f3801H;
        m10327d(view, rect);
        C1600c c1600c = (C1600c) view.getLayoutParams();
        int m10224h1 = m10224h1(i, ((ViewGroup.MarginLayoutParams) c1600c).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1600c).rightMargin + rect.right);
        int m10224h12 = m10224h1(i2, ((ViewGroup.MarginLayoutParams) c1600c).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1600c).bottomMargin + rect.bottom);
        if (m10310x0(view, m10224h1, m10224h12, c1600c)) {
            view.measure(m10224h1, m10224h12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004a, code lost:
        if (r9.f3811t == 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004f, code lost:
        if (r9.f3811t == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005d, code lost:
        if (m10252T0() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0069, code lost:
        if (m10252T0() == false) goto L118;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @androidx.annotation.Nullable
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo10249V(android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView.C1586q r12, androidx.recyclerview.widget.RecyclerView.C1594v r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo10249V(android.view.View, int, androidx.recyclerview.widget.RecyclerView$q, androidx.recyclerview.widget.RecyclerView$v):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0401, code lost:
        if (m10271E0() != false) goto L272;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /* renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10248V0(androidx.recyclerview.widget.RecyclerView.C1586q r17, androidx.recyclerview.widget.RecyclerView.C1594v r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m10248V0(androidx.recyclerview.widget.RecyclerView$q, androidx.recyclerview.widget.RecyclerView$v, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: W */
    public final void mo4696W(AccessibilityEvent accessibilityEvent) {
        super.mo4696W(accessibilityEvent);
        if (m10313w() > 0) {
            View m10265K0 = m10265K0(false);
            View m10266J0 = m10266J0(false);
            if (m10265K0 == null || m10266J0 == null) {
                return;
            }
            int m10336K = RecyclerView.LayoutManager.m10336K(m10265K0);
            int m10336K2 = RecyclerView.LayoutManager.m10336K(m10266J0);
            if (m10336K < m10336K2) {
                accessibilityEvent.setFromIndex(m10336K);
                accessibilityEvent.setToIndex(m10336K2);
                return;
            }
            accessibilityEvent.setFromIndex(m10336K2);
            accessibilityEvent.setToIndex(m10336K);
        }
    }

    /* renamed from: W0 */
    public final boolean m10247W0(int i) {
        if (this.f3811t == 0) {
            return (i == -1) != this.f3815x;
        }
        return ((i == -1) == this.f3815x) == m10252T0();
    }

    /* renamed from: X0 */
    public final void m10246X0(int i, RecyclerView.C1594v c1594v) {
        int m10262N0;
        int i2;
        if (i > 0) {
            m10262N0 = m10260O0();
            i2 = 1;
        } else {
            m10262N0 = m10262N0();
            i2 = -1;
        }
        C1639n c1639n = this.f3813v;
        c1639n.f3983a = true;
        m10229f1(m10262N0, c1594v);
        m10233d1(i2);
        c1639n.f3985c = m10262N0 + c1639n.f3986d;
        c1639n.f3984b = Math.abs(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r6.f3987e == (-1)) goto L9;
     */
    /* renamed from: Y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10245Y0(androidx.recyclerview.widget.RecyclerView.C1586q r5, androidx.recyclerview.widget.C1639n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f3983a
            if (r0 == 0) goto L7c
            boolean r0 = r6.f3991i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f3984b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f3987e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f3989g
        L15:
            r4.m10243Z0(r6, r5)
            goto L7c
        L19:
            int r6 = r6.f3988f
        L1b:
            r4.m10240a1(r6, r5)
            goto L7c
        L1f:
            int r0 = r6.f3987e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f3988f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3808q
            r1 = r1[r2]
            int r1 = r1.m10194k(r0)
        L2f:
            int r2 = r4.f3807p
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f3808q
            r2 = r2[r3]
            int r2 = r2.m10194k(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f3989g
            int r6 = r6.f3984b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f3989g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3808q
            r1 = r1[r2]
            int r1 = r1.m10197h(r0)
        L5a:
            int r2 = r4.f3807p
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f3808q
            r2 = r2[r3]
            int r2 = r2.m10197h(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f3989g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f3988f
            int r6 = r6.f3984b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m10245Y0(androidx.recyclerview.widget.RecyclerView$q, androidx.recyclerview.widget.n):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Z */
    public final void mo10244Z(int i, int i2) {
        m10256R0(i, i2, 1);
    }

    /* renamed from: Z0 */
    public final void m10243Z0(int i, RecyclerView.C1586q c1586q) {
        for (int m10313w = m10313w() - 1; m10313w >= 0; m10313w--) {
            View m10315v = m10315v(m10313w);
            if (this.f3809r.mo10121e(m10315v) < i || this.f3809r.mo10112n(m10315v) < i) {
                return;
            }
            C1600c c1600c = (C1600c) m10315v.getLayoutParams();
            if (c1600c.f3827f) {
                for (int i2 = 0; i2 < this.f3807p; i2++) {
                    if (this.f3808q[i2].f3844a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f3807p; i3++) {
                    this.f3808q[i3].m10193l();
                }
            } else if (c1600c.f3826e.f3844a.size() == 1) {
                return;
            } else {
                c1600c.f3826e.m10193l();
            }
            m10322l0(m10315v, c1586q);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1591u.InterfaceC1593b
    /* renamed from: a */
    public final PointF mo10242a(int i) {
        int m10272D0 = m10272D0(i);
        PointF pointF = new PointF();
        if (m10272D0 == 0) {
            return null;
        }
        if (this.f3811t == 0) {
            pointF.x = m10272D0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m10272D0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: a0 */
    public final void mo10241a0() {
        this.f3795B.m10212b();
        m10320o0();
    }

    /* renamed from: a1 */
    public final void m10240a1(int i, RecyclerView.C1586q c1586q) {
        while (m10313w() > 0) {
            View m10315v = m10315v(0);
            if (this.f3809r.mo10124b(m10315v) > i || this.f3809r.mo10113m(m10315v) > i) {
                return;
            }
            C1600c c1600c = (C1600c) m10315v.getLayoutParams();
            if (c1600c.f3827f) {
                for (int i2 = 0; i2 < this.f3807p; i2++) {
                    if (this.f3808q[i2].f3844a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f3807p; i3++) {
                    this.f3808q[i3].m10192m();
                }
            } else if (c1600c.f3826e.f3844a.size() == 1) {
                return;
            } else {
                c1600c.f3826e.m10192m();
            }
            m10322l0(m10315v, c1586q);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: b0 */
    public final void mo10239b0(int i, int i2) {
        m10256R0(i, i2, 8);
    }

    /* renamed from: b1 */
    public final void m10238b1() {
        this.f3815x = (this.f3811t == 1 || !m10252T0()) ? this.f3814w : !this.f3814w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: c */
    public final void mo10237c(String str) {
        if (this.f3799F == null) {
            super.mo10237c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: c0 */
    public final void mo10236c0(int i, int i2) {
        m10256R0(i, i2, 2);
    }

    /* renamed from: c1 */
    public final int m10235c1(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        if (m10313w() == 0 || i == 0) {
            return 0;
        }
        m10246X0(i, c1594v);
        C1639n c1639n = this.f3813v;
        int m10267I0 = m10267I0(c1586q, c1639n, c1594v);
        if (c1639n.f3984b >= m10267I0) {
            i = i < 0 ? -m10267I0 : m10267I0;
        }
        this.f3809r.mo10111o(-i);
        this.f3797D = this.f3815x;
        c1639n.f3984b = 0;
        m10245Y0(c1586q, c1639n);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: d0 */
    public final void mo10234d0(int i, int i2) {
        m10256R0(i, i2, 4);
    }

    /* renamed from: d1 */
    public final void m10233d1(int i) {
        C1639n c1639n = this.f3813v;
        c1639n.f3987e = i;
        c1639n.f3986d = this.f3815x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e */
    public final boolean mo10232e() {
        return this.f3811t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e0 */
    public final void mo4695e0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        m10248V0(c1586q, c1594v, true);
    }

    /* renamed from: e1 */
    public final void m10231e1(int i, int i2) {
        for (int i3 = 0; i3 < this.f3807p; i3++) {
            if (!this.f3808q[i3].f3844a.isEmpty()) {
                m10226g1(this.f3808q[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f */
    public final boolean mo10230f() {
        return this.f3811t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f0 */
    public final void mo4694f0(RecyclerView.C1594v c1594v) {
        this.f3817z = -1;
        this.f3794A = Integer.MIN_VALUE;
        this.f3799F = null;
        this.f3802I.m10214a();
    }

    /* renamed from: f1 */
    public final void m10229f1(int i, RecyclerView.C1594v c1594v) {
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        C1639n c1639n = this.f3813v;
        boolean z4 = false;
        c1639n.f3984b = 0;
        c1639n.f3985c = i;
        RecyclerView.AbstractC1591u abstractC1591u = this.f3719e;
        if (abstractC1591u != null && abstractC1591u.f3762e) {
            z = true;
        } else {
            z = false;
        }
        if (z && (i4 = c1594v.f3773a) != -1) {
            boolean z5 = this.f3815x;
            if (i4 < i) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z5 == z3) {
                i2 = this.f3809r.mo10114l();
                i3 = 0;
            } else {
                i3 = this.f3809r.mo10114l();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        RecyclerView recyclerView = this.f3716b;
        if (recyclerView != null && recyclerView.f3667g) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c1639n.f3988f = this.f3809r.mo10115k() - i3;
            c1639n.f3989g = this.f3809r.mo10119g() + i2;
        } else {
            c1639n.f3989g = this.f3809r.mo10120f() + i2;
            c1639n.f3988f = -i3;
        }
        c1639n.f3990h = false;
        c1639n.f3983a = true;
        if (this.f3809r.mo10117i() == 0 && this.f3809r.mo10120f() == 0) {
            z4 = true;
        }
        c1639n.f3991i = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g */
    public final boolean mo10228g(RecyclerView.C1579k c1579k) {
        return c1579k instanceof C1600c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g0 */
    public final void mo10227g0(Parcelable parcelable) {
        if (parcelable instanceof C1604e) {
            C1604e c1604e = (C1604e) parcelable;
            this.f3799F = c1604e;
            if (this.f3817z != -1) {
                c1604e.f3837d = null;
                c1604e.f3836c = 0;
                c1604e.f3834a = -1;
                c1604e.f3835b = -1;
                c1604e.f3837d = null;
                c1604e.f3836c = 0;
                c1604e.f3838e = 0;
                c1604e.f3839f = null;
                c1604e.f3840g = null;
            }
            m10320o0();
        }
    }

    /* renamed from: g1 */
    public final void m10226g1(C1606f c1606f, int i, int i2) {
        int i3 = c1606f.f3847d;
        if (i == -1) {
            int i4 = c1606f.f3845b;
            if (i4 == Integer.MIN_VALUE) {
                c1606f.m10202c();
                i4 = c1606f.f3845b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = c1606f.f3846c;
            if (i5 == Integer.MIN_VALUE) {
                c1606f.m10203b();
                i5 = c1606f.f3846c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.f3816y.set(c1606f.f3848e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: h0 */
    public final Parcelable mo10225h0() {
        int m10262N0;
        View m10265K0;
        int m10194k;
        int mo10115k;
        int[] iArr;
        C1604e c1604e = this.f3799F;
        if (c1604e != null) {
            return new C1604e(c1604e);
        }
        C1604e c1604e2 = new C1604e();
        c1604e2.f3841h = this.f3814w;
        c1604e2.f3842i = this.f3797D;
        c1604e2.f3843j = this.f3798E;
        C1601d c1601d = this.f3795B;
        if (c1601d != null && (iArr = c1601d.f3828a) != null) {
            c1604e2.f3839f = iArr;
            c1604e2.f3838e = iArr.length;
            c1604e2.f3840g = c1601d.f3829b;
        } else {
            c1604e2.f3838e = 0;
        }
        int i = -1;
        if (m10313w() > 0) {
            if (this.f3797D) {
                m10262N0 = m10260O0();
            } else {
                m10262N0 = m10262N0();
            }
            c1604e2.f3834a = m10262N0;
            if (this.f3815x) {
                m10265K0 = m10266J0(true);
            } else {
                m10265K0 = m10265K0(true);
            }
            if (m10265K0 != null) {
                i = RecyclerView.LayoutManager.m10336K(m10265K0);
            }
            c1604e2.f3835b = i;
            int i2 = this.f3807p;
            c1604e2.f3836c = i2;
            c1604e2.f3837d = new int[i2];
            for (int i3 = 0; i3 < this.f3807p; i3++) {
                if (this.f3797D) {
                    m10194k = this.f3808q[i3].m10197h(Integer.MIN_VALUE);
                    if (m10194k != Integer.MIN_VALUE) {
                        mo10115k = this.f3809r.mo10119g();
                        m10194k -= mo10115k;
                        c1604e2.f3837d[i3] = m10194k;
                    } else {
                        c1604e2.f3837d[i3] = m10194k;
                    }
                } else {
                    m10194k = this.f3808q[i3].m10194k(Integer.MIN_VALUE);
                    if (m10194k != Integer.MIN_VALUE) {
                        mo10115k = this.f3809r.mo10115k();
                        m10194k -= mo10115k;
                        c1604e2.f3837d[i3] = m10194k;
                    } else {
                        c1604e2.f3837d[i3] = m10194k;
                    }
                }
            }
        } else {
            c1604e2.f3834a = -1;
            c1604e2.f3835b = -1;
            c1604e2.f3836c = 0;
        }
        return c1604e2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: i */
    public final void mo10223i(int i, int i2, RecyclerView.C1594v c1594v, RecyclerView.LayoutManager.InterfaceC1567c interfaceC1567c) {
        C1639n c1639n;
        boolean z;
        int m10197h;
        int i3;
        if (this.f3811t != 0) {
            i = i2;
        }
        if (m10313w() != 0 && i != 0) {
            m10246X0(i, c1594v);
            int[] iArr = this.f3805L;
            if (iArr == null || iArr.length < this.f3807p) {
                this.f3805L = new int[this.f3807p];
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = this.f3807p;
                c1639n = this.f3813v;
                if (i4 >= i6) {
                    break;
                }
                if (c1639n.f3986d == -1) {
                    m10197h = c1639n.f3988f;
                    i3 = this.f3808q[i4].m10194k(m10197h);
                } else {
                    m10197h = this.f3808q[i4].m10197h(c1639n.f3989g);
                    i3 = c1639n.f3989g;
                }
                int i7 = m10197h - i3;
                if (i7 >= 0) {
                    this.f3805L[i5] = i7;
                    i5++;
                }
                i4++;
            }
            Arrays.sort(this.f3805L, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = c1639n.f3985c;
                if (i9 >= 0 && i9 < c1594v.m10276b()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((RunnableC1635m.C1637b) interfaceC1567c).m10127a(c1639n.f3985c, this.f3805L[i8]);
                    c1639n.f3985c += c1639n.f3986d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: i0 */
    public final void mo10222i0(int i) {
        if (i == 0) {
            m10271E0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: k */
    public final int mo4693k(RecyclerView.C1594v c1594v) {
        return m10270F0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: l */
    public final int mo4692l(RecyclerView.C1594v c1594v) {
        return m10269G0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: m */
    public final int mo4691m(RecyclerView.C1594v c1594v) {
        return m10268H0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: n */
    public final int mo10221n(RecyclerView.C1594v c1594v) {
        return m10270F0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: o */
    public final int mo10220o(RecyclerView.C1594v c1594v) {
        return m10269G0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: p */
    public final int mo10219p(RecyclerView.C1594v c1594v) {
        return m10268H0(c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: p0 */
    public final int mo4689p0(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        return m10235c1(i, c1586q, c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: q0 */
    public final void mo4688q0(int i) {
        C1604e c1604e = this.f3799F;
        if (c1604e != null && c1604e.f3834a != i) {
            c1604e.f3837d = null;
            c1604e.f3836c = 0;
            c1604e.f3834a = -1;
            c1604e.f3835b = -1;
        }
        this.f3817z = i;
        this.f3794A = Integer.MIN_VALUE;
        m10320o0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: r0 */
    public final int mo10218r0(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        return m10235c1(i, c1586q, c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: s */
    public final RecyclerView.C1579k mo4687s() {
        return this.f3811t == 0 ? new C1600c(-2, -1) : new C1600c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: t */
    public final RecyclerView.C1579k mo10217t(Context context, AttributeSet attributeSet) {
        return new C1600c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: u */
    public final RecyclerView.C1579k mo10216u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1600c((ViewGroup.MarginLayoutParams) layoutParams) : new C1600c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: u0 */
    public final void mo10215u0(Rect rect, int i, int i2) {
        int m10326h;
        int m10326h2;
        int m10338I = m10338I() + m10339H();
        int m10340G = m10340G() + m10337J();
        if (this.f3811t == 1) {
            int height = rect.height() + m10340G;
            RecyclerView recyclerView = this.f3716b;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            m10326h2 = RecyclerView.LayoutManager.m10326h(i2, height, ViewCompat.C0814d.m11761d(recyclerView));
            m10326h = RecyclerView.LayoutManager.m10326h(i, (this.f3812u * this.f3807p) + m10338I, ViewCompat.C0814d.m11760e(this.f3716b));
        } else {
            int width = rect.width() + m10338I;
            RecyclerView recyclerView2 = this.f3716b;
            WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
            m10326h = RecyclerView.LayoutManager.m10326h(i, width, ViewCompat.C0814d.m11760e(recyclerView2));
            m10326h2 = RecyclerView.LayoutManager.m10326h(i2, (this.f3812u * this.f3807p) + m10340G, ViewCompat.C0814d.m11761d(this.f3716b));
        }
        this.f3716b.setMeasuredDimension(m10326h, m10326h2);
    }
}
