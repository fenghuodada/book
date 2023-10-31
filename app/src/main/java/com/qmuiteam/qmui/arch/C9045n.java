package com.qmuiteam.qmui.arch;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.qmuiteam.qmui.arch.n */
/* loaded from: classes3.dex */
public final class C9045n extends View {

    /* renamed from: a */
    public ArrayList<C9046a> f17291a;

    /* renamed from: b */
    public boolean f17292b;

    /* renamed from: com.qmuiteam.qmui.arch.n$a */
    /* loaded from: classes3.dex */
    public static class C9046a {

        /* renamed from: a */
        public final WeakReference<View> f17293a;

        /* renamed from: b */
        public final WindowManager.LayoutParams f17294b;

        /* renamed from: c */
        public final boolean f17295c;

        /* renamed from: d */
        public final int[] f17296d = new int[2];

        public C9046a(@NonNull View view, @Nullable WindowManager.LayoutParams layoutParams, boolean z) {
            this.f17293a = new WeakReference<>(view);
            this.f17294b = layoutParams;
            this.f17295c = z;
        }
    }

    public C9045n(Context context) {
        super(context);
        this.f17292b = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        WindowManager.LayoutParams layoutParams;
        int[] iArr;
        super.onDraw(canvas);
        ArrayList<C9046a> arrayList = this.f17291a;
        if (arrayList != null && arrayList.size() > 0) {
            if (this.f17292b) {
                canvas.translate(0.0f, getHeight());
                canvas.rotate(-90.0f, 0.0f, 0.0f);
            }
            for (int size = this.f17291a.size() - 1; size >= 0; size--) {
                C9046a c9046a = this.f17291a.get(size);
                View view = c9046a.f17293a.get();
                if (view != null) {
                    if (!c9046a.f17295c && (layoutParams = c9046a.f17294b) != null) {
                        canvas.drawColor((((int) (layoutParams.dimAmount * 255)) << 24) | 0);
                        view.getLocationOnScreen(c9046a.f17296d);
                        canvas.translate(iArr[0], iArr[1]);
                        view.draw(canvas);
                        canvas.translate(-iArr[0], -iArr[1]);
                    } else {
                        view.draw(canvas);
                    }
                }
            }
        }
    }
}
