package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.p003os.C0732c;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC0964l0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class FragmentTransitionImpl {
    public static void bfsAddViewChildren(List<View> list, View view) {
        int size = list.size();
        if (containedBeforeIndex(list, view, size)) {
            return;
        }
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0819i.m11711k(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!containedBeforeIndex(list, childAt, size) && ViewCompat.C0819i.m11711k(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean containedBeforeIndex(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNullOrEmpty(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void addTarget(@NonNull Object obj, @NonNull View view);

    public abstract void addTargets(@NonNull Object obj, @NonNull ArrayList<View> arrayList);

    public abstract void beginDelayedTransition(@NonNull ViewGroup viewGroup, @Nullable Object obj);

    public abstract boolean canHandle(@NonNull Object obj);

    public abstract Object cloneTransition(@Nullable Object obj);

    public void getBoundsOnScreen(View view, Rect rect) {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (!ViewCompat.C0817g.m11730b(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        int[] iArr = new int[2];
        view.getRootView().getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public abstract Object mergeTransitionsInSequence(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3);

    public abstract Object mergeTransitionsTogether(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3);

    public ArrayList<String> prepareSetNameOverridesReordered(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            arrayList2.add(ViewCompat.C0819i.m11711k(view));
            ViewCompat.C0819i.m11700v(view, null);
        }
        return arrayList2;
    }

    public abstract void removeTarget(@NonNull Object obj, @NonNull View view);

    public abstract void replaceTargets(@NonNull Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2);

    public abstract void scheduleHideFragmentView(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void scheduleRemoveTargets(@NonNull Object obj, @Nullable Object obj2, @Nullable ArrayList<View> arrayList, @Nullable Object obj3, @Nullable ArrayList<View> arrayList2, @Nullable Object obj4, @Nullable ArrayList<View> arrayList3);

    public abstract void setEpicenter(@NonNull Object obj, @NonNull Rect rect);

    public abstract void setEpicenter(@NonNull Object obj, @Nullable View view);

    public void setListenerForTransitionEnd(@NonNull Fragment fragment, @NonNull Object obj, @NonNull C0732c c0732c, @NonNull Runnable runnable) {
        runnable.run();
    }

    public void setNameOverridesReordered(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            String m11711k = ViewCompat.C0819i.m11711k(view2);
            arrayList4.add(m11711k);
            if (m11711k != null) {
                ViewCompat.C0819i.m11700v(view2, null);
                String str = map.get(m11711k);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        ViewCompat.C0819i.m11700v(arrayList2.get(i2), m11711k);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC0964l0.m11415a(view, new Runnable() { // from class: androidx.fragment.app.FragmentTransitionImpl.1
            @Override // java.lang.Runnable
            public void run() {
                for (int i3 = 0; i3 < size; i3++) {
                    WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                    ViewCompat.C0819i.m11700v((View) arrayList2.get(i3), (String) arrayList3.get(i3));
                    ViewCompat.C0819i.m11700v((View) arrayList.get(i3), (String) arrayList4.get(i3));
                }
            }
        });
    }

    public abstract void setSharedElementTargets(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void swapSharedElementTargets(@Nullable Object obj, @Nullable ArrayList<View> arrayList, @Nullable ArrayList<View> arrayList2);

    public abstract Object wrapTransitionInSet(@Nullable Object obj);
}
