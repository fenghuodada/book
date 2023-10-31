package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.C0170c;
import androidx.core.widget.C1053h;
import com.ambrose.overwall.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.z0 */
/* loaded from: classes.dex */
public class C0435z0 extends ListView {

    /* renamed from: a */
    public final Rect f1417a;

    /* renamed from: b */
    public int f1418b;

    /* renamed from: c */
    public int f1419c;

    /* renamed from: d */
    public int f1420d;

    /* renamed from: e */
    public int f1421e;

    /* renamed from: f */
    public int f1422f;

    /* renamed from: g */
    public C0439d f1423g;

    /* renamed from: h */
    public boolean f1424h;

    /* renamed from: i */
    public final boolean f1425i;

    /* renamed from: j */
    public boolean f1426j;

    /* renamed from: k */
    public C1053h f1427k;

    /* renamed from: l */
    public RunnableC0441f f1428l;

    @RequiresApi(21)
    /* renamed from: androidx.appcompat.widget.z0$a */
    /* loaded from: classes.dex */
    public static class C0436a {
        @DoNotInline
        /* renamed from: a */
        public static void m12453a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    @RequiresApi(30)
    /* renamed from: androidx.appcompat.widget.z0$b */
    /* loaded from: classes.dex */
    public static class C0437b {

        /* renamed from: a */
        public static final Method f1429a;

        /* renamed from: b */
        public static final Method f1430b;

        /* renamed from: c */
        public static final Method f1431c;

        /* renamed from: d */
        public static final boolean f1432d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1429a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1430b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1431c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1432d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    @RequiresApi(33)
    /* renamed from: androidx.appcompat.widget.z0$c */
    /* loaded from: classes.dex */
    public static class C0438c {
        @DoNotInline
        /* renamed from: a */
        public static boolean m12452a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12451b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$d */
    /* loaded from: classes.dex */
    public static class C0439d extends C0170c {

        /* renamed from: b */
        public boolean f1433b;

        public C0439d(Drawable drawable) {
            super(drawable);
            this.f1433b = true;
        }

        @Override // androidx.appcompat.graphics.drawable.C0170c, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f1433b) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.C0170c, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.f1433b) {
                super.setHotspot(f, f2);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.C0170c, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1433b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.C0170c, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f1433b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.C0170c, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f1433b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$e */
    /* loaded from: classes.dex */
    public static class C0440e {

        /* renamed from: a */
        public static final Field f1434a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f1434a = field;
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$f */
    /* loaded from: classes.dex */
    public class RunnableC0441f implements Runnable {
        public RunnableC0441f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0435z0 c0435z0 = C0435z0.this;
            c0435z0.f1428l = null;
            c0435z0.drawableStateChanged();
        }
    }

    public C0435z0(@NonNull Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1417a = new Rect();
        this.f1418b = 0;
        this.f1419c = 0;
        this.f1420d = 0;
        this.f1421e = 0;
        this.f1425i = z;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z) {
        C0439d c0439d = this.f1423g;
        if (c0439d != null) {
            c0439d.f1433b = z;
        }
    }

    /* renamed from: a */
    public final int m12455a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m12454b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0435z0.m12454b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1417a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f1428l != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f1426j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f1425i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f1425i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f1425i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f1425i && this.f1424h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f1428l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1428l == null) {
            RunnableC0441f runnableC0441f = new RunnableC0441f();
            this.f1428l = runnableC0441f;
            post(runnableC0441f);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && C0437b.f1432d) {
                        try {
                            C0437b.f1429a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            C0437b.f1430b.invoke(this, Integer.valueOf(pointToPosition));
                            C0437b.f1431c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f1426j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1422f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0441f runnableC0441f = this.f1428l;
        if (runnableC0441f != null) {
            C0435z0 c0435z0 = C0435z0.this;
            c0435z0.f1428l = null;
            c0435z0.removeCallbacks(runnableC0441f);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1424h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0439d c0439d = drawable != null ? new C0439d(drawable) : null;
        this.f1423g = c0439d;
        super.setSelector(c0439d);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1418b = rect.left;
        this.f1419c = rect.top;
        this.f1420d = rect.right;
        this.f1421e = rect.bottom;
    }
}
