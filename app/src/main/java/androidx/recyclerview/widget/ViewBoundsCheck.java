package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class ViewBoundsCheck {

    /* renamed from: a */
    public final InterfaceC1608b f3850a;

    /* renamed from: b */
    public final C1607a f3851b = new C1607a();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ViewBounds {
    }

    /* renamed from: androidx.recyclerview.widget.ViewBoundsCheck$a */
    /* loaded from: classes.dex */
    public static class C1607a {

        /* renamed from: a */
        public int f3852a = 0;

        /* renamed from: b */
        public int f3853b;

        /* renamed from: c */
        public int f3854c;

        /* renamed from: d */
        public int f3855d;

        /* renamed from: e */
        public int f3856e;

        /* renamed from: a */
        public final boolean m10188a() {
            int i = this.f3852a;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.f3855d;
                int i4 = this.f3853b;
                if ((((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) << 0) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i5 = this.f3855d;
                int i6 = this.f3854c;
                if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i7 = this.f3856e;
                int i8 = this.f3853b;
                if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i9 = this.f3856e;
                int i10 = this.f3854c;
                if (i9 > i10) {
                    i2 = 1;
                } else if (i9 != i10) {
                    i2 = 4;
                }
                if ((i & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.ViewBoundsCheck$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1608b {
        /* renamed from: a */
        int mo10187a(View view);

        /* renamed from: b */
        int mo10186b();

        /* renamed from: c */
        int mo10185c();

        /* renamed from: d */
        View mo10184d(int i);

        /* renamed from: e */
        int mo10183e(View view);
    }

    public ViewBoundsCheck(InterfaceC1608b interfaceC1608b) {
        this.f3850a = interfaceC1608b;
    }

    /* renamed from: a */
    public final View m10190a(int i, int i2, int i3, int i4) {
        int i5;
        InterfaceC1608b interfaceC1608b = this.f3850a;
        int mo10186b = interfaceC1608b.mo10186b();
        int mo10185c = interfaceC1608b.mo10185c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View mo10184d = interfaceC1608b.mo10184d(i);
            int mo10187a = interfaceC1608b.mo10187a(mo10184d);
            int mo10183e = interfaceC1608b.mo10183e(mo10184d);
            C1607a c1607a = this.f3851b;
            c1607a.f3853b = mo10186b;
            c1607a.f3854c = mo10185c;
            c1607a.f3855d = mo10187a;
            c1607a.f3856e = mo10183e;
            if (i3 != 0) {
                c1607a.f3852a = i3 | 0;
                if (c1607a.m10188a()) {
                    return mo10184d;
                }
            }
            if (i4 != 0) {
                c1607a.f3852a = i4 | 0;
                if (c1607a.m10188a()) {
                    view = mo10184d;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public final boolean m10189b(View view) {
        InterfaceC1608b interfaceC1608b = this.f3850a;
        int mo10186b = interfaceC1608b.mo10186b();
        int mo10185c = interfaceC1608b.mo10185c();
        int mo10187a = interfaceC1608b.mo10187a(view);
        int mo10183e = interfaceC1608b.mo10183e(view);
        C1607a c1607a = this.f3851b;
        c1607a.f3853b = mo10186b;
        c1607a.f3854c = mo10185c;
        c1607a.f3855d = mo10187a;
        c1607a.f3856e = mo10183e;
        c1607a.f3852a = 24579 | 0;
        return c1607a.m10188a();
    }
}
