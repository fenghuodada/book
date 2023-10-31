package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Comparator;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: com.google.android.material.internal.m */
/* loaded from: classes3.dex */
public final class C7759m {

    /* renamed from: a */
    public static final C7760a f15122a = new C7760a();

    /* renamed from: com.google.android.material.internal.m$a */
    /* loaded from: classes3.dex */
    public class C7760a implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    @Nullable
    /* renamed from: a */
    public static ImageButton m4507a(@NonNull Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ArrayList m4506b(@NonNull Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
