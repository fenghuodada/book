package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.p003os.C0749q;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public final class RunnableC1635m implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal<RunnableC1635m> f3968e = new ThreadLocal<>();

    /* renamed from: f */
    public static final C1636a f3969f = new C1636a();

    /* renamed from: b */
    public long f3971b;

    /* renamed from: c */
    public long f3972c;

    /* renamed from: a */
    public final ArrayList<RecyclerView> f3970a = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<C1638c> f3973d = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.m$a */
    /* loaded from: classes.dex */
    public class C1636a implements Comparator<C1638c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r0 == null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
            if (r0 != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(androidx.recyclerview.widget.RunnableC1635m.C1638c r7, androidx.recyclerview.widget.RunnableC1635m.C1638c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.m$c r7 = (androidx.recyclerview.widget.RunnableC1635m.C1638c) r7
                androidx.recyclerview.widget.m$c r8 = (androidx.recyclerview.widget.RunnableC1635m.C1638c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f3981d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f3981d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f3978a
                boolean r3 = r8.f3978a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f3979b
                int r2 = r7.f3979b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f3980c
                int r8 = r8.f3980c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RunnableC1635m.C1636a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.m$b */
    /* loaded from: classes.dex */
    public static class C1637b implements RecyclerView.LayoutManager.InterfaceC1567c {

        /* renamed from: a */
        public int f3974a;

        /* renamed from: b */
        public int f3975b;

        /* renamed from: c */
        public int[] f3976c;

        /* renamed from: d */
        public int f3977d;

        /* renamed from: a */
        public final void m10127a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f3977d * 2;
            int[] iArr = this.f3976c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3976c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f3976c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3976c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f3977d++;
        }

        /* renamed from: b */
        public final void m10126b(RecyclerView recyclerView, boolean z) {
            boolean z2 = false;
            this.f3977d = 0;
            int[] iArr = this.f3976c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.f3679m;
            if (recyclerView.f3677l != null && layoutManager != null && layoutManager.f3723i) {
                if (z) {
                    if (!recyclerView.f3661d.m10176g()) {
                        layoutManager.mo10325j(recyclerView.f3677l.getItemCount(), this);
                    }
                } else {
                    if (!((!recyclerView.f3695u || recyclerView.f3638D || recyclerView.f3661d.m10176g()) ? true : true)) {
                        layoutManager.mo10223i(this.f3974a, this.f3975b, recyclerView.f3676k0, this);
                    }
                }
                int i = this.f3977d;
                if (i > layoutManager.f3724j) {
                    layoutManager.f3724j = i;
                    layoutManager.f3725k = z;
                    recyclerView.f3659b.m10283l();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$c */
    /* loaded from: classes.dex */
    public static class C1638c {

        /* renamed from: a */
        public boolean f3978a;

        /* renamed from: b */
        public int f3979b;

        /* renamed from: c */
        public int f3980c;

        /* renamed from: d */
        public RecyclerView f3981d;

        /* renamed from: e */
        public int f3982e;
    }

    /* renamed from: c */
    public static RecyclerView.AbstractC1597y m10128c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int m10161h = recyclerView.f3663e.m10161h();
        int i2 = 0;
        while (true) {
            if (i2 < m10161h) {
                RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(recyclerView.f3663e.m10162g(i2));
                if (m10398J.mPosition == i && !m10398J.isInvalid()) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return null;
        }
        RecyclerView.C1586q c1586q = recyclerView.f3659b;
        try {
            recyclerView.m10392P();
            RecyclerView.AbstractC1597y m10285j = c1586q.m10285j(j, i);
            if (m10285j != null) {
                if (m10285j.isBound() && !m10285j.isInvalid()) {
                    c1586q.m10288g(m10285j.itemView);
                } else {
                    c1586q.m10294a(m10285j, false);
                }
            }
            return m10285j;
        } finally {
            recyclerView.m10391Q(false);
        }
    }

    /* renamed from: a */
    public final void m10130a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3971b == 0) {
            this.f3971b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C1637b c1637b = recyclerView.f3674j0;
        c1637b.f3974a = i;
        c1637b.f3975b = i2;
    }

    /* renamed from: b */
    public final void m10129b(long j) {
        C1638c c1638c;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        C1638c c1638c2;
        boolean z;
        ArrayList<RecyclerView> arrayList = this.f3970a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C1637b c1637b = recyclerView3.f3674j0;
                c1637b.m10126b(recyclerView3, false);
                i += c1637b.f3977d;
            }
        }
        ArrayList<C1638c> arrayList2 = this.f3973d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C1637b c1637b2 = recyclerView4.f3674j0;
                int abs = Math.abs(c1637b2.f3975b) + Math.abs(c1637b2.f3974a);
                for (int i5 = 0; i5 < c1637b2.f3977d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c1638c2 = new C1638c();
                        arrayList2.add(c1638c2);
                    } else {
                        c1638c2 = arrayList2.get(i3);
                    }
                    int[] iArr = c1637b2.f3976c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1638c2.f3978a = z;
                    c1638c2.f3979b = abs;
                    c1638c2.f3980c = i6;
                    c1638c2.f3981d = recyclerView4;
                    c1638c2.f3982e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f3969f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c1638c = arrayList2.get(i7)).f3981d) != null; i7++) {
            if (c1638c.f3978a) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            RecyclerView.AbstractC1597y m10128c = m10128c(recyclerView, c1638c.f3982e, j2);
            if (m10128c != null && m10128c.mNestedRecyclerView != null && m10128c.isBound() && !m10128c.isInvalid() && (recyclerView2 = m10128c.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.f3638D && recyclerView2.f3663e.m10161h() != 0) {
                    RecyclerView.ItemAnimator itemAnimator = recyclerView2.f3647M;
                    if (itemAnimator != null) {
                        itemAnimator.mo10144e();
                    }
                    RecyclerView.LayoutManager layoutManager = recyclerView2.f3679m;
                    RecyclerView.C1586q c1586q = recyclerView2.f3659b;
                    if (layoutManager != null) {
                        layoutManager.m10324j0(c1586q);
                        recyclerView2.f3679m.m10323k0(c1586q);
                    }
                    c1586q.f3748a.clear();
                    c1586q.m10290e();
                }
                C1637b c1637b3 = recyclerView2.f3674j0;
                c1637b3.m10126b(recyclerView2, true);
                if (c1637b3.f3977d != 0) {
                    try {
                        int i8 = C0749q.f2431a;
                        C0749q.C0750a.m11833a("RV Nested Prefetch");
                        RecyclerView.C1594v c1594v = recyclerView2.f3676k0;
                        RecyclerView.AbstractC1572e abstractC1572e = recyclerView2.f3677l;
                        c1594v.f3776d = 1;
                        c1594v.f3777e = abstractC1572e.getItemCount();
                        c1594v.f3779g = false;
                        c1594v.f3780h = false;
                        c1594v.f3781i = false;
                        for (int i9 = 0; i9 < c1637b3.f3977d * 2; i9 += 2) {
                            m10128c(recyclerView2, c1637b3.f3976c[i9], j);
                        }
                        C0749q.C0750a.m11832b();
                        c1638c.f3978a = false;
                        c1638c.f3979b = 0;
                        c1638c.f3980c = 0;
                        c1638c.f3981d = null;
                        c1638c.f3982e = 0;
                    } catch (Throwable th) {
                        int i10 = C0749q.f2431a;
                        C0749q.C0750a.m11832b();
                        throw th;
                    }
                }
            }
            c1638c.f3978a = false;
            c1638c.f3979b = 0;
            c1638c.f3980c = 0;
            c1638c.f3981d = null;
            c1638c.f3982e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = C0749q.f2431a;
            C0749q.C0750a.m11833a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f3970a;
            if (arrayList.isEmpty()) {
                this.f3971b = 0L;
                C0749q.C0750a.m11832b();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f3971b = 0L;
                C0749q.C0750a.m11832b();
                return;
            }
            m10129b(TimeUnit.MILLISECONDS.toNanos(j) + this.f3972c);
            this.f3971b = 0L;
            C0749q.C0750a.m11832b();
        } catch (Throwable th) {
            this.f3971b = 0L;
            int i3 = C0749q.f2431a;
            C0749q.C0750a.m11832b();
            throw th;
        }
    }
}
