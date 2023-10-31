package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0158a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: a */
    public static final int[] f865a = {16842964};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f865a);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = C0158a.m12920a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }
}
