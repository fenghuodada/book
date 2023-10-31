package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.h */
/* loaded from: classes.dex */
public class Window$CallbackC0191h implements Window.Callback {

    /* renamed from: a */
    public final Window.Callback f575a;

    @RequiresApi(23)
    /* renamed from: androidx.appcompat.view.h$a */
    /* loaded from: classes.dex */
    public static class C0192a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m12869a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        @DoNotInline
        /* renamed from: b */
        public static ActionMode m12868b(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.appcompat.view.h$b */
    /* loaded from: classes.dex */
    public static class C0193b {
        @DoNotInline
        /* renamed from: a */
        public static void m12867a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @RequiresApi(26)
    /* renamed from: androidx.appcompat.view.h$c */
    /* loaded from: classes.dex */
    public static class C0194c {
        @DoNotInline
        /* renamed from: a */
        public static void m12866a(Window.Callback callback, boolean z) {
            callback.onPointerCaptureChanged(z);
        }
    }

    public Window$CallbackC0191h(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f575a = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f575a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f575a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f575a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f575a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f575a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f575a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f575a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f575a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f575a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f575a.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.f575a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f575a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f575a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.f575a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f575a.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    @RequiresApi(26)
    public final void onPointerCaptureChanged(boolean z) {
        C0194c.m12866a(this.f575a, z);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f575a.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    @RequiresApi(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C0193b.m12867a(this.f575a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f575a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @RequiresApi(23)
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return C0192a.m12869a(this.f575a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f575a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f575a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    @RequiresApi(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C0192a.m12868b(this.f575a, callback, i);
    }
}
