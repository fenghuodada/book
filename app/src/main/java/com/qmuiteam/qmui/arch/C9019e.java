package com.qmuiteam.qmui.arch;

import android.view.View;
import android.view.ViewGroup;
import androidx.arch.core.util.InterfaceC0457a;
import androidx.fragment.app.Fragment;
import com.qmuiteam.qmui.arch.AbstractC9008b;
import java.lang.reflect.Field;

/* renamed from: com.qmuiteam.qmui.arch.e */
/* loaded from: classes3.dex */
public final class C9019e implements InterfaceC0457a<View, Void> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC9008b.C9013e f17236a;

    public C9019e(AbstractC9008b.C9013e c9013e) {
        this.f17236a = c9013e;
    }

    @Override // androidx.arch.core.util.InterfaceC0457a
    public final Void apply(View view) {
        View view2 = view;
        AbstractC9008b abstractC9008b = this.f17236a.f17223a;
        if (abstractC9008b != null && (view2 instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view2;
            try {
                int i = 0;
                for (Fragment fragment : abstractC9008b.getChildFragmentManager().getFragments()) {
                    if (fragment instanceof AbstractC9008b) {
                        Field declaredField = Fragment.class.getDeclaredField("mContainerId");
                        declaredField.setAccessible(true);
                        int i2 = declaredField.getInt((AbstractC9008b) fragment);
                        if (i2 != 0 && i != i2) {
                            AbstractC9008b.C9013e.m2801f((ViewGroup) viewGroup.findViewById(i2), null);
                            i = i2;
                        }
                    }
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
