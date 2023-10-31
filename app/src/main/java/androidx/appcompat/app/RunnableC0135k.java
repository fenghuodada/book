package androidx.appcompat.app;

import androidx.core.view.C0934i2;

/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes.dex */
public final class RunnableC0135k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LayoutInflater$Factory2C0114h f381a;

    /* renamed from: androidx.appcompat.app.k$a */
    /* loaded from: classes.dex */
    public class C0136a extends C0934i2 {
        public C0136a() {
        }

        @Override // androidx.core.view.C0934i2, androidx.core.view.InterfaceC0928h2
        /* renamed from: b */
        public final void mo11451b() {
            RunnableC0135k.this.f381a.f339v.setVisibility(0);
        }

        @Override // androidx.core.view.InterfaceC0928h2
        /* renamed from: c */
        public final void mo11463c() {
            RunnableC0135k runnableC0135k = RunnableC0135k.this;
            runnableC0135k.f381a.f339v.setAlpha(1.0f);
            LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = runnableC0135k.f381a;
            layoutInflater$Factory2C0114h.f342y.m11470d(null);
            layoutInflater$Factory2C0114h.f342y = null;
        }
    }

    public RunnableC0135k(LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h) {
        this.f381a = layoutInflater$Factory2C0114h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            androidx.appcompat.app.h r0 = r5.f381a
            android.widget.PopupWindow r1 = r0.f340w
            androidx.appcompat.widget.ActionBarContextView r2 = r0.f339v
            r3 = 55
            r4 = 0
            r1.showAtLocation(r2, r3, r4, r4)
            androidx.core.view.g2 r1 = r0.f342y
            if (r1 == 0) goto L13
            r1.m11472b()
        L13:
            boolean r1 = r0.f293A
            if (r1 == 0) goto L25
            android.view.ViewGroup r1 = r0.f294B
            if (r1 == 0) goto L25
            java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r2 = androidx.core.view.ViewCompat.f2518a
            boolean r1 = androidx.core.view.ViewCompat.C0817g.m11729c(r1)
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = r4
        L26:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L44
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f339v
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f339v
            androidx.core.view.g2 r1 = androidx.core.view.ViewCompat.m11784a(r1)
            r1.m11473a(r2)
            r0.f342y = r1
            androidx.appcompat.app.k$a r0 = new androidx.appcompat.app.k$a
            r0.<init>()
            r1.m11470d(r0)
            goto L4e
        L44:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f339v
            r1.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f339v
            r0.setVisibility(r4)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.RunnableC0135k.run():void");
    }
}
