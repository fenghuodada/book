package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.C0874o;
import androidx.customview.widget.AbstractC1071a;
import java.util.Comparator;

/* renamed from: androidx.customview.widget.b */
/* loaded from: classes.dex */
public final class C1075b {

    /* renamed from: androidx.customview.widget.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1076a<T> {
    }

    /* renamed from: androidx.customview.widget.b$b */
    /* loaded from: classes.dex */
    public static class C1077b<T> implements Comparator<T> {

        /* renamed from: a */
        public final Rect f2762a = new Rect();

        /* renamed from: b */
        public final Rect f2763b = new Rect();

        /* renamed from: c */
        public final boolean f2764c;

        /* renamed from: d */
        public final InterfaceC1076a<T> f2765d;

        public C1077b(boolean z, AbstractC1071a.C1072a c1072a) {
            this.f2764c = z;
            this.f2765d = c1072a;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            AbstractC1071a.C1072a c1072a = (AbstractC1071a.C1072a) this.f2765d;
            c1072a.getClass();
            Rect rect = this.f2762a;
            ((C0874o) t).m11554d(rect);
            c1072a.getClass();
            Rect rect2 = this.f2763b;
            ((C0874o) t2).m11554d(rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            boolean z = this.f2764c;
            if (i3 < i4) {
                if (!z) {
                    return -1;
                }
                return 1;
            } else if (i3 > i4) {
                if (z) {
                    return -1;
                }
                return 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (!z) {
                        return -1;
                    }
                    return 1;
                } else if (i7 > i8) {
                    if (z) {
                        return -1;
                    }
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r10.right <= r12.left) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r10.left >= r12.right) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        r7 = false;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m11228a(int r9, @androidx.annotation.NonNull android.graphics.Rect r10, @androidx.annotation.NonNull android.graphics.Rect r11, @androidx.annotation.NonNull android.graphics.Rect r12) {
        /*
            boolean r0 = m11227b(r9, r10, r11)
            boolean r1 = m11227b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7d
            if (r0 != 0) goto Lf
            goto L7d
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L45
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L45
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L45
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L45
        L43:
            r7 = r6
            goto L46
        L45:
            r7 = r2
        L46:
            if (r7 != 0) goto L49
            return r6
        L49:
            if (r9 == r5) goto L7c
            if (r9 != r4) goto L4e
            goto L7c
        L4e:
            int r11 = m11225d(r9, r10, r11)
            if (r9 == r5) goto L6f
            if (r9 == r3) goto L6a
            if (r9 == r4) goto L65
            if (r9 != r1) goto L5f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L73
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L65:
            int r9 = r12.right
            int r10 = r10.right
            goto L73
        L6a:
            int r9 = r10.top
            int r10 = r12.top
            goto L73
        L6f:
            int r9 = r10.left
            int r10 = r12.left
        L73:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L7b
            r2 = r6
        L7b:
            return r2
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.C1075b.m11228a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: b */
    public static boolean m11227b(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static boolean m11226c(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: d */
    public static int m11225d(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return Math.max(0, i2 - i3);
    }

    /* renamed from: e */
    public static int m11224e(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / 2) + rect.left;
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / 2) + i2));
        }
        height = (rect.height() / 2) + rect.top;
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / 2) + i2));
    }
}
