package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.ambrose.overwall.R;
import com.facebook.ads.AdError;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.g2 */
/* loaded from: classes.dex */
public final class C0350g2 {

    /* renamed from: a */
    public final Context f1251a;

    /* renamed from: b */
    public final View f1252b;

    /* renamed from: c */
    public final TextView f1253c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f1254d;

    /* renamed from: e */
    public final Rect f1255e;

    /* renamed from: f */
    public final int[] f1256f;

    /* renamed from: g */
    public final int[] f1257g;

    public C0350g2(@NonNull Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1254d = layoutParams;
        this.f1255e = new Rect();
        this.f1256f = new int[2];
        this.f1257g = new int[2];
        this.f1251a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1252b = inflate;
        this.f1253c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(C0350g2.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132017156;
        layoutParams.flags = 24;
    }
}
