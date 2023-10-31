package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.view.c0 */
/* loaded from: classes.dex */
public final class C0900c0 {
    /* renamed from: a */
    public static boolean m11519a(@NonNull MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
