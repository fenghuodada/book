package androidx.core.view;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.view.k */
/* loaded from: classes.dex */
public final class C0957k {

    /* renamed from: a */
    public static boolean f2649a = false;

    /* renamed from: b */
    public static Method f2650b = null;

    /* renamed from: c */
    public static boolean f2651c = false;

    /* renamed from: d */
    public static Field f2652d;

    /* renamed from: androidx.core.view.k$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0958a {
        boolean superDispatchKeyEvent(@NonNull KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m11427a(@NonNull View view, @NonNull KeyEvent keyEvent) {
        WeakReference<View> weakReference;
        int indexOfKey;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = ViewCompat.C0829r.f2533d;
            ViewCompat.C0829r c0829r = (ViewCompat.C0829r) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (c0829r == null) {
                c0829r = new ViewCompat.C0829r();
                view.setTag(R.id.tag_unhandled_key_event_manager, c0829r);
            }
            WeakReference<KeyEvent> weakReference2 = c0829r.f2536c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                c0829r.f2536c = new WeakReference<>(keyEvent);
                if (c0829r.f2535b == null) {
                    c0829r.f2535b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = c0829r.f2535b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                } else {
                    weakReference = null;
                }
                if (weakReference == null) {
                    weakReference = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = weakReference.get();
                    if (view2 == null || !ViewCompat.C0817g.m11730b(view2)) {
                        return true;
                    }
                    ViewCompat.C0829r.m11656b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"LambdaLast"})
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m11426b(@androidx.annotation.NonNull androidx.core.view.C0957k.InterfaceC0958a r7, @androidx.annotation.Nullable android.view.View r8, @androidx.annotation.Nullable android.view.Window.Callback r9, @androidx.annotation.NonNull android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.superDispatchKeyEvent(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L81
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L64
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L64
            if (r8 == 0) goto L64
            boolean r1 = androidx.core.view.C0957k.f2649a
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            androidx.core.view.C0957k.f2650b = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            androidx.core.view.C0957k.f2649a = r3
        L4c:
            java.lang.reflect.Method r1 = androidx.core.view.C0957k.f2650b
            if (r1 == 0) goto L61
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L61
            r4[r0] = r10     // Catch: java.lang.Throwable -> L61
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L61
            if (r8 != 0) goto L5b
            goto L61
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L61
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L61
        L61:
            if (r0 == 0) goto L64
            goto L80
        L64:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6b
            goto L80
        L6b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = androidx.core.view.ViewCompat.m11782c(r7, r10)
            if (r8 == 0) goto L76
            goto L80
        L76:
            if (r7 == 0) goto L7c
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7c:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L80:
            return r3
        L81:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = androidx.core.view.C0957k.f2651c
            if (r7 != 0) goto L9a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L98
            androidx.core.view.C0957k.f2652d = r7     // Catch: java.lang.NoSuchFieldException -> L98
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L98
        L98:
            androidx.core.view.C0957k.f2651c = r3
        L9a:
            java.lang.reflect.Field r7 = androidx.core.view.C0957k.f2652d
            if (r7 == 0) goto La5
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La5
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La5
            goto La6
        La5:
            r7 = r2
        La6:
            if (r7 == 0) goto Lb3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb3
            goto Ld3
        Lb3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbe
            goto Ld3
        Lbe:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = androidx.core.view.ViewCompat.m11782c(r7, r10)
            if (r8 == 0) goto Lc9
            goto Ld3
        Lc9:
            if (r7 == 0) goto Lcf
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lcf:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld3:
            return r3
        Ld4:
            if (r8 == 0) goto Ldc
            boolean r8 = androidx.core.view.ViewCompat.m11782c(r8, r10)
            if (r8 != 0) goto Le2
        Ldc:
            boolean r7 = r7.superDispatchKeyEvent(r10)
            if (r7 == 0) goto Le3
        Le2:
            r0 = r3
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C0957k.m11426b(androidx.core.view.k$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
