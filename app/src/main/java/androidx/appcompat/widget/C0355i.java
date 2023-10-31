package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.widget.C1046c;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
public final class C0355i {
    @NonNull

    /* renamed from: a */
    public final CompoundButton f1265a;

    /* renamed from: b */
    public ColorStateList f1266b = null;

    /* renamed from: c */
    public PorterDuff.Mode f1267c = null;

    /* renamed from: d */
    public boolean f1268d = false;

    /* renamed from: e */
    public boolean f1269e = false;

    /* renamed from: f */
    public boolean f1270f;

    public C0355i(@NonNull CompoundButton compoundButton) {
        this.f1265a = compoundButton;
    }

    /* renamed from: a */
    public final void m12626a() {
        CompoundButton compoundButton = this.f1265a;
        Drawable m11264a = C1046c.m11264a(compoundButton);
        if (m11264a != null) {
            if (this.f1268d || this.f1269e) {
                Drawable mutate = m11264a.mutate();
                if (this.f1268d) {
                    C0700a.C0702b.m11924h(mutate, this.f1266b);
                }
                if (this.f1269e) {
                    C0700a.C0702b.m11923i(mutate, this.f1267c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0019, B:5:0x0020, B:7:0x0026, B:11:0x0035, B:13:0x003b, B:15:0x0041, B:16:0x004c, B:18:0x0053, B:19:0x005a, B:21:0x0061), top: B:28:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0019, B:5:0x0020, B:7:0x0026, B:11:0x0035, B:13:0x003b, B:15:0x0041, B:16:0x004c, B:18:0x0053, B:19:0x005a, B:21:0x0061), top: B:28:0x0019 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12625b(@androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.widget.CompoundButton r6 = r8.f1265a
            android.content.Context r0 = r6.getContext()
            int[] r2 = androidx.appcompat.C0157c.f422m
            androidx.appcompat.widget.x1 r7 = androidx.appcompat.widget.C0430x1.m12465m(r0, r9, r2, r10)
            android.content.Context r1 = r6.getContext()
            android.content.res.TypedArray r4 = r7.f1406b
            r0 = r6
            r3 = r9
            r5 = r10
            androidx.core.view.ViewCompat.m11772m(r0, r1, r2, r3, r4, r5)
            r9 = 1
            boolean r10 = r7.m12466l(r9)     // Catch: java.lang.Throwable -> L72
            r0 = 0
            if (r10 == 0) goto L32
            int r10 = r7.m12469i(r9, r0)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L32
            android.content.Context r1 = r6.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.C0158a.m12920a(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            r6.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            goto L33
        L32:
            r9 = r0
        L33:
            if (r9 != 0) goto L4c
            boolean r9 = r7.m12466l(r0)     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L4c
            int r9 = r7.m12469i(r0, r0)     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L4c
            android.content.Context r10 = r6.getContext()     // Catch: java.lang.Throwable -> L72
            android.graphics.drawable.Drawable r9 = androidx.appcompat.content.res.C0158a.m12920a(r10, r9)     // Catch: java.lang.Throwable -> L72
            r6.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L72
        L4c:
            r9 = 2
            boolean r10 = r7.m12466l(r9)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L5a
            android.content.res.ColorStateList r9 = r7.m12476b(r9)     // Catch: java.lang.Throwable -> L72
            androidx.core.widget.C1045b.m11266c(r6, r9)     // Catch: java.lang.Throwable -> L72
        L5a:
            r9 = 3
            boolean r10 = r7.m12466l(r9)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L6e
            r10 = -1
            int r9 = r7.m12470h(r9, r10)     // Catch: java.lang.Throwable -> L72
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.C0427x0.m12479c(r9, r10)     // Catch: java.lang.Throwable -> L72
            androidx.core.widget.C1045b.m11265d(r6, r9)     // Catch: java.lang.Throwable -> L72
        L6e:
            r7.m12464n()
            return
        L72:
            r9 = move-exception
            r7.m12464n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0355i.m12625b(android.util.AttributeSet, int):void");
    }
}
