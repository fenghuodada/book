package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.C0172e;
import androidx.core.graphics.drawable.C0700a;

/* renamed from: androidx.appcompat.graphics.drawable.b */
/* loaded from: classes.dex */
public class C0166b extends Drawable implements Drawable.Callback {

    /* renamed from: m */
    public static final /* synthetic */ int f450m = 0;

    /* renamed from: a */
    public AbstractC0169c f451a;

    /* renamed from: b */
    public Rect f452b;

    /* renamed from: c */
    public Drawable f453c;

    /* renamed from: d */
    public Drawable f454d;

    /* renamed from: f */
    public boolean f456f;

    /* renamed from: h */
    public boolean f458h;

    /* renamed from: i */
    public RunnableC0167a f459i;

    /* renamed from: j */
    public long f460j;

    /* renamed from: k */
    public long f461k;

    /* renamed from: l */
    public C0168b f462l;

    /* renamed from: e */
    public int f455e = 255;

    /* renamed from: g */
    public int f457g = -1;

    /* renamed from: androidx.appcompat.graphics.drawable.b$a */
    /* loaded from: classes.dex */
    public class RunnableC0167a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0166b f463a;

        public RunnableC0167a(C0172e c0172e) {
            this.f463a = c0172e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0166b c0166b = this.f463a;
            c0166b.m12914a(true);
            c0166b.invalidateSelf();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.b$b */
    /* loaded from: classes.dex */
    public static class C0168b implements Drawable.Callback {

        /* renamed from: a */
        public Drawable.Callback f464a;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(@NonNull Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
            Drawable.Callback callback = this.f464a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            Drawable.Callback callback = this.f464a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.b$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0169c extends Drawable.ConstantState {

        /* renamed from: A */
        public boolean f465A;

        /* renamed from: B */
        public ColorFilter f466B;

        /* renamed from: C */
        public boolean f467C;

        /* renamed from: D */
        public ColorStateList f468D;

        /* renamed from: E */
        public PorterDuff.Mode f469E;

        /* renamed from: F */
        public boolean f470F;

        /* renamed from: G */
        public boolean f471G;

        /* renamed from: a */
        public final C0166b f472a;

        /* renamed from: b */
        public Resources f473b;

        /* renamed from: c */
        public int f474c;

        /* renamed from: d */
        public int f475d;

        /* renamed from: e */
        public int f476e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f477f;

        /* renamed from: g */
        public Drawable[] f478g;

        /* renamed from: h */
        public int f479h;

        /* renamed from: i */
        public boolean f480i;

        /* renamed from: j */
        public boolean f481j;

        /* renamed from: k */
        public Rect f482k;

        /* renamed from: l */
        public boolean f483l;

        /* renamed from: m */
        public boolean f484m;

        /* renamed from: n */
        public int f485n;

        /* renamed from: o */
        public int f486o;

        /* renamed from: p */
        public int f487p;

        /* renamed from: q */
        public int f488q;

        /* renamed from: r */
        public boolean f489r;

        /* renamed from: s */
        public int f490s;

        /* renamed from: t */
        public boolean f491t;

        /* renamed from: u */
        public boolean f492u;

        /* renamed from: v */
        public boolean f493v;

        /* renamed from: w */
        public boolean f494w;

        /* renamed from: x */
        public int f495x;

        /* renamed from: y */
        public int f496y;

        /* renamed from: z */
        public int f497z;

        public AbstractC0169c(AbstractC0169c abstractC0169c, C0166b c0166b, Resources resources) {
            Resources resources2;
            int i;
            SparseArray<Drawable.ConstantState> sparseArray;
            this.f480i = false;
            this.f483l = false;
            this.f494w = true;
            this.f496y = 0;
            this.f497z = 0;
            this.f472a = c0166b;
            if (resources != null) {
                resources2 = resources;
            } else if (abstractC0169c != null) {
                resources2 = abstractC0169c.f473b;
            } else {
                resources2 = null;
            }
            this.f473b = resources2;
            if (abstractC0169c != null) {
                i = abstractC0169c.f474c;
            } else {
                i = 0;
            }
            int i2 = C0166b.f450m;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            i = i == 0 ? 160 : i;
            this.f474c = i;
            if (abstractC0169c != null) {
                this.f475d = abstractC0169c.f475d;
                this.f476e = abstractC0169c.f476e;
                this.f492u = true;
                this.f493v = true;
                this.f480i = abstractC0169c.f480i;
                this.f483l = abstractC0169c.f483l;
                this.f494w = abstractC0169c.f494w;
                this.f495x = abstractC0169c.f495x;
                this.f496y = abstractC0169c.f496y;
                this.f497z = abstractC0169c.f497z;
                this.f465A = abstractC0169c.f465A;
                this.f466B = abstractC0169c.f466B;
                this.f467C = abstractC0169c.f467C;
                this.f468D = abstractC0169c.f468D;
                this.f469E = abstractC0169c.f469E;
                this.f470F = abstractC0169c.f470F;
                this.f471G = abstractC0169c.f471G;
                if (abstractC0169c.f474c == i) {
                    if (abstractC0169c.f481j) {
                        this.f482k = abstractC0169c.f482k != null ? new Rect(abstractC0169c.f482k) : null;
                        this.f481j = true;
                    }
                    if (abstractC0169c.f484m) {
                        this.f485n = abstractC0169c.f485n;
                        this.f486o = abstractC0169c.f486o;
                        this.f487p = abstractC0169c.f487p;
                        this.f488q = abstractC0169c.f488q;
                        this.f484m = true;
                    }
                }
                if (abstractC0169c.f489r) {
                    this.f490s = abstractC0169c.f490s;
                    this.f489r = true;
                }
                if (abstractC0169c.f491t) {
                    this.f491t = true;
                }
                Drawable[] drawableArr = abstractC0169c.f478g;
                this.f478g = new Drawable[drawableArr.length];
                this.f479h = abstractC0169c.f479h;
                SparseArray<Drawable.ConstantState> sparseArray2 = abstractC0169c.f477f;
                if (sparseArray2 != null) {
                    sparseArray = sparseArray2.clone();
                } else {
                    sparseArray = new SparseArray<>(this.f479h);
                }
                this.f477f = sparseArray;
                int i3 = this.f479h;
                for (int i4 = 0; i4 < i3; i4++) {
                    Drawable drawable = drawableArr[i4];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f477f.put(i4, constantState);
                        } else {
                            this.f478g[i4] = drawableArr[i4];
                        }
                    }
                }
                return;
            }
            this.f478g = new Drawable[10];
            this.f479h = 0;
        }

        /* renamed from: a */
        public final int m12911a(Drawable drawable) {
            int i = this.f479h;
            if (i >= this.f478g.length) {
                int i2 = i + 10;
                C0172e.C0173a c0173a = (C0172e.C0173a) this;
                Drawable[] drawableArr = new Drawable[i2];
                Drawable[] drawableArr2 = c0173a.f478g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
                }
                c0173a.f478g = drawableArr;
                int[][] iArr = new int[i2];
                System.arraycopy(c0173a.f501H, 0, iArr, 0, i);
                c0173a.f501H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f472a);
            this.f478g[i] = drawable;
            this.f479h++;
            this.f476e = drawable.getChangingConfigurations() | this.f476e;
            this.f489r = false;
            this.f491t = false;
            this.f482k = null;
            this.f481j = false;
            this.f484m = false;
            this.f492u = false;
            return i;
        }

        /* renamed from: b */
        public final void m12910b() {
            this.f484m = true;
            m12909c();
            int i = this.f479h;
            Drawable[] drawableArr = this.f478g;
            this.f486o = -1;
            this.f485n = -1;
            this.f488q = 0;
            this.f487p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f485n) {
                    this.f485n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f486o) {
                    this.f486o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f487p) {
                    this.f487p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f488q) {
                    this.f488q = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void m12909c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f477f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = this.f477f.keyAt(i);
                    Drawable[] drawableArr = this.f478g;
                    Drawable newDrawable = this.f477f.valueAt(i).newDrawable(this.f473b);
                    C0700a.C0703c.m11921b(newDrawable, this.f495x);
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f472a);
                    drawableArr[keyAt] = mutate;
                }
                this.f477f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @RequiresApi(21)
        public final boolean canApplyTheme() {
            int i = this.f479h;
            Drawable[] drawableArr = this.f478g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    if (C0700a.C0702b.m11930b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f477f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        public final Drawable m12908d(int i) {
            int indexOfKey;
            Drawable drawable = this.f478g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f477f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f477f.valueAt(indexOfKey).newDrawable(this.f473b);
            C0700a.C0703c.m11921b(newDrawable, this.f495x);
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f472a);
            this.f478g[i] = mutate;
            this.f477f.removeAt(indexOfKey);
            if (this.f477f.size() == 0) {
                this.f477f = null;
            }
            return mutate;
        }

        /* renamed from: e */
        public abstract void mo12903e();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f475d | this.f476e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12914a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f456f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f453c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L34
            long r9 = r13.f460j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f455e
            r3.setAlpha(r9)
            goto L34
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            androidx.appcompat.graphics.drawable.b$c r10 = r13.f451a
            int r10 = r10.f496y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f455e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L34:
            r13.f460j = r6
        L36:
            r3 = r8
        L37:
            android.graphics.drawable.Drawable r9 = r13.f454d
            if (r9 == 0) goto L5d
            long r10 = r13.f461k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4c
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f454d = r0
            goto L5d
        L4c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.b$c r4 = r13.f451a
            int r4 = r4.f497z
            int r3 = r3 / r4
            int r4 = r13.f455e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5d:
            r13.f461k = r6
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            androidx.appcompat.graphics.drawable.b$a r14 = r13.f459i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0166b.m12914a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        AbstractC0169c abstractC0169c = this.f451a;
        if (theme != null) {
            abstractC0169c.m12909c();
            int i = abstractC0169c.f479h;
            Drawable[] drawableArr = abstractC0169c.f478g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && C0700a.C0702b.m11930b(drawable)) {
                    C0700a.C0702b.m11931a(drawableArr[i2], theme);
                    abstractC0169c.f476e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                abstractC0169c.f473b = resources;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = abstractC0169c.f474c;
                abstractC0169c.f474c = i3;
                if (i4 != i3) {
                    abstractC0169c.f484m = false;
                    abstractC0169c.f481j = false;
                    return;
                }
                return;
            }
            return;
        }
        abstractC0169c.getClass();
    }

    /* renamed from: b */
    public AbstractC0169c mo12906b() {
        throw null;
    }

    /* renamed from: c */
    public final void m12913c(Drawable drawable) {
        if (this.f462l == null) {
            this.f462l = new C0168b();
        }
        C0168b c0168b = this.f462l;
        c0168b.f464a = drawable.getCallback();
        drawable.setCallback(c0168b);
        try {
            if (this.f451a.f496y <= 0 && this.f456f) {
                drawable.setAlpha(this.f455e);
            }
            AbstractC0169c abstractC0169c = this.f451a;
            if (abstractC0169c.f467C) {
                drawable.setColorFilter(abstractC0169c.f466B);
            } else {
                if (abstractC0169c.f470F) {
                    C0700a.C0702b.m11924h(drawable, abstractC0169c.f468D);
                }
                AbstractC0169c abstractC0169c2 = this.f451a;
                if (abstractC0169c2.f471G) {
                    C0700a.C0702b.m11923i(drawable, abstractC0169c2.f469E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f451a.f494w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            C0700a.C0703c.m11921b(drawable, C0700a.C0703c.m11922a(this));
            C0700a.C0701a.m11932e(drawable, this.f451a.f465A);
            Rect rect = this.f452b;
            if (rect != null) {
                C0700a.C0702b.m11926f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0168b c0168b2 = this.f462l;
            Drawable.Callback callback = c0168b2.f464a;
            c0168b2.f464a = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final boolean canApplyTheme() {
        return this.f451a.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m12912d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f457g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.b$c r0 = r9.f451a
            int r0 = r0.f497z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f454d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f453c
            if (r0 == 0) goto L29
            r9.f454d = r0
            androidx.appcompat.graphics.drawable.b$c r0 = r9.f451a
            int r0 = r0.f497z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f461k = r0
            goto L35
        L29:
            r9.f454d = r4
            r9.f461k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f453c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.b$c r0 = r9.f451a
            int r1 = r0.f479h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m12908d(r10)
            r9.f453c = r0
            r9.f457g = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.b$c r10 = r9.f451a
            int r10 = r10.f496y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f460j = r2
        L51:
            r9.m12913c(r0)
            goto L5a
        L55:
            r9.f453c = r4
            r10 = -1
            r9.f457g = r10
        L5a:
            long r0 = r9.f460j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f461k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7c
        L67:
            androidx.appcompat.graphics.drawable.b$a r10 = r9.f459i
            if (r10 != 0) goto L76
            androidx.appcompat.graphics.drawable.b$a r10 = new androidx.appcompat.graphics.drawable.b$a
            r1 = r9
            androidx.appcompat.graphics.drawable.e r1 = (androidx.appcompat.graphics.drawable.C0172e) r1
            r10.<init>(r1)
            r9.f459i = r10
            goto L79
        L76:
            r9.unscheduleSelf(r10)
        L79:
            r9.m12914a(r0)
        L7c:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0166b.m12912d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f453c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f454d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo12905e(AbstractC0169c abstractC0169c) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f455e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        AbstractC0169c abstractC0169c = this.f451a;
        return changingConfigurations | abstractC0169c.f476e | abstractC0169c.f475d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        AbstractC0169c abstractC0169c = this.f451a;
        if (abstractC0169c.f492u) {
            z = abstractC0169c.f493v;
        } else {
            abstractC0169c.m12909c();
            abstractC0169c.f492u = true;
            int i = abstractC0169c.f479h;
            Drawable[] drawableArr = abstractC0169c.f478g;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (drawableArr[i2].getConstantState() == null) {
                        abstractC0169c.f493v = false;
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    abstractC0169c.f493v = true;
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.f451a.f475d = getChangingConfigurations();
            return this.f451a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final Drawable getCurrent() {
        return this.f453c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f452b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        AbstractC0169c abstractC0169c = this.f451a;
        if (abstractC0169c.f483l) {
            if (!abstractC0169c.f484m) {
                abstractC0169c.m12910b();
            }
            return abstractC0169c.f486o;
        }
        Drawable drawable = this.f453c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        AbstractC0169c abstractC0169c = this.f451a;
        if (abstractC0169c.f483l) {
            if (!abstractC0169c.f484m) {
                abstractC0169c.m12910b();
            }
            return abstractC0169c.f485n;
        }
        Drawable drawable = this.f453c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        AbstractC0169c abstractC0169c = this.f451a;
        if (abstractC0169c.f483l) {
            if (!abstractC0169c.f484m) {
                abstractC0169c.m12910b();
            }
            return abstractC0169c.f488q;
        }
        Drawable drawable = this.f453c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        AbstractC0169c abstractC0169c = this.f451a;
        if (abstractC0169c.f483l) {
            if (!abstractC0169c.f484m) {
                abstractC0169c.m12910b();
            }
            return abstractC0169c.f487p;
        }
        Drawable drawable = this.f453c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f453c;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        AbstractC0169c abstractC0169c = this.f451a;
        if (abstractC0169c.f489r) {
            return abstractC0169c.f490s;
        }
        abstractC0169c.m12909c();
        int i2 = abstractC0169c.f479h;
        Drawable[] drawableArr = abstractC0169c.f478g;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        abstractC0169c.f490s = i;
        abstractC0169c.f489r = true;
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f453c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        boolean padding;
        AbstractC0169c abstractC0169c = this.f451a;
        boolean z = false;
        Rect rect2 = null;
        if (!abstractC0169c.f480i) {
            Rect rect3 = abstractC0169c.f482k;
            if (rect3 == null && !abstractC0169c.f481j) {
                abstractC0169c.m12909c();
                Rect rect4 = new Rect();
                int i = abstractC0169c.f479h;
                Drawable[] drawableArr = abstractC0169c.f478g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                abstractC0169c.f481j = true;
                abstractC0169c.f482k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f453c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (this.f451a.f465A && C0700a.C0703c.m11922a(this) == 1) {
            z = true;
        }
        if (z) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        AbstractC0169c abstractC0169c = this.f451a;
        if (abstractC0169c != null) {
            abstractC0169c.f489r = false;
            abstractC0169c.f491t = false;
        }
        if (drawable == this.f453c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f451a.f465A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f454d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f454d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f453c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f456f) {
                this.f453c.setAlpha(this.f455e);
            }
        }
        if (this.f461k != 0) {
            this.f461k = 0L;
            z = true;
        }
        if (this.f460j != 0) {
            this.f460j = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f458h && super.mutate() == this) {
            AbstractC0169c mo12906b = mo12906b();
            mo12906b.mo12903e();
            mo12905e(mo12906b);
            this.f458h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f454d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f453c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        AbstractC0169c abstractC0169c = this.f451a;
        int i2 = this.f457g;
        int i3 = abstractC0169c.f479h;
        Drawable[] drawableArr = abstractC0169c.f478g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean m11921b = C0700a.C0703c.m11921b(drawable, i);
                if (i4 == i2) {
                    z = m11921b;
                }
            }
        }
        abstractC0169c.f495x = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f454d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f453c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        Drawable drawable = this.f454d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f453c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        if (drawable != this.f453c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f456f && this.f455e == i) {
            return;
        }
        this.f456f = true;
        this.f455e = i;
        Drawable drawable = this.f453c;
        if (drawable != null) {
            if (this.f460j == 0) {
                drawable.setAlpha(i);
            } else {
                m12914a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        AbstractC0169c abstractC0169c = this.f451a;
        if (abstractC0169c.f465A != z) {
            abstractC0169c.f465A = z;
            Drawable drawable = this.f453c;
            if (drawable != null) {
                C0700a.C0701a.m11932e(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC0169c abstractC0169c = this.f451a;
        abstractC0169c.f467C = true;
        if (abstractC0169c.f466B != colorFilter) {
            abstractC0169c.f466B = colorFilter;
            Drawable drawable = this.f453c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        AbstractC0169c abstractC0169c = this.f451a;
        if (abstractC0169c.f494w != z) {
            abstractC0169c.f494w = z;
            Drawable drawable = this.f453c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f453c;
        if (drawable != null) {
            C0700a.C0702b.m11927e(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f452b;
        if (rect == null) {
            this.f452b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f453c;
        if (drawable != null) {
            C0700a.C0702b.m11926f(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        AbstractC0169c abstractC0169c = this.f451a;
        abstractC0169c.f470F = true;
        if (abstractC0169c.f468D != colorStateList) {
            abstractC0169c.f468D = colorStateList;
            C0700a.m11938b(this.f453c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        AbstractC0169c abstractC0169c = this.f451a;
        abstractC0169c.f471G = true;
        if (abstractC0169c.f469E != mode) {
            abstractC0169c.f469E = mode;
            C0700a.m11937c(this.f453c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f454d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f453c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable != this.f453c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
