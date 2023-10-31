package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC1612a0 extends RecyclerView.AbstractC1581m {

    /* renamed from: a */
    public RecyclerView f3867a;

    /* renamed from: b */
    public final C1613a f3868b = new C1613a();

    /* renamed from: androidx.recyclerview.widget.a0$a */
    /* loaded from: classes.dex */
    public class C1613a extends RecyclerView.AbstractC1583o {

        /* renamed from: a */
        public boolean f3869a = false;

        public C1613a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1583o
        /* renamed from: a */
        public final void mo4583a(int i, RecyclerView recyclerView) {
            if (i == 0 && this.f3869a) {
                this.f3869a = false;
                AbstractC1612a0.this.m10169b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1583o
        /* renamed from: b */
        public final void mo4582b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f3869a = true;
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract int[] mo10108a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view);

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10169b() {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3867a
            if (r0 != 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            return
        Lc:
            r1 = r11
            androidx.recyclerview.widget.u r1 = (androidx.recyclerview.widget.C1647u) r1
            boolean r2 = r0.mo10230f()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L1c
            androidx.recyclerview.widget.s r1 = r1.m10105e(r0)
            goto L26
        L1c:
            boolean r2 = r0.mo10232e()
            if (r2 == 0) goto L59
            androidx.recyclerview.widget.s r1 = r1.m10106d(r0)
        L26:
            int r2 = r0.m10313w()
            if (r2 != 0) goto L2d
            goto L59
        L2d:
            int r5 = r1.mo10115k()
            int r6 = r1.mo10114l()
            int r6 = r6 / 2
            int r6 = r6 + r5
            r5 = 2147483647(0x7fffffff, float:NaN)
            r7 = r4
        L3c:
            if (r7 >= r2) goto L59
            android.view.View r8 = r0.m10315v(r7)
            int r9 = r1.mo10121e(r8)
            int r10 = r1.mo10123c(r8)
            int r10 = r10 / 2
            int r10 = r10 + r9
            int r10 = r10 - r6
            int r9 = java.lang.Math.abs(r10)
            if (r9 >= r5) goto L56
            r3 = r8
            r5 = r9
        L56:
            int r7 = r7 + 1
            goto L3c
        L59:
            if (r3 != 0) goto L5c
            return
        L5c:
            int[] r0 = r11.mo10108a(r0, r3)
            r1 = r0[r4]
            r2 = 1
            if (r1 != 0) goto L69
            r3 = r0[r2]
            if (r3 == 0) goto L70
        L69:
            androidx.recyclerview.widget.RecyclerView r3 = r11.f3867a
            r0 = r0[r2]
            r3.m10379b0(r1, r0, r4)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC1612a0.m10169b():void");
    }
}
