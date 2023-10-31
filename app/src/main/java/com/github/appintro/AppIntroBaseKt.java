package com.github.appintro;

import android.view.View;
import kotlin.Metadata;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m508d2 = {"value", "", "isVisible", "Landroid/view/View;", "(Landroid/view/View;)Z", "setVisible", "(Landroid/view/View;Z)V", "appintro_release"}, m507k = 2, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class AppIntroBaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(View view) {
        return view.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVisible(View view, boolean z) {
        view.setVisibility(z ? 0 : 4);
    }
}
