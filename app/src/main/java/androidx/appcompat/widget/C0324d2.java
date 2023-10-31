package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.appcompat.widget.d2 */
/* loaded from: classes.dex */
public final class C0324d2 {

    @RequiresApi(26)
    /* renamed from: androidx.appcompat.widget.d2$a */
    /* loaded from: classes.dex */
    public static class C0325a {
        @DoNotInline
        /* renamed from: a */
        public static void m12688a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m12689a(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0325a.m12688a(view, charSequence);
            return;
        }
        View$OnLongClickListenerC0346f2 view$OnLongClickListenerC0346f2 = View$OnLongClickListenerC0346f2.f1235k;
        if (view$OnLongClickListenerC0346f2 != null && view$OnLongClickListenerC0346f2.f1237a == view) {
            View$OnLongClickListenerC0346f2.m12636b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnLongClickListenerC0346f2 view$OnLongClickListenerC0346f22 = View$OnLongClickListenerC0346f2.f1236l;
            if (view$OnLongClickListenerC0346f22 != null && view$OnLongClickListenerC0346f22.f1237a == view) {
                view$OnLongClickListenerC0346f22.m12637a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerC0346f2(view, charSequence);
    }
}
