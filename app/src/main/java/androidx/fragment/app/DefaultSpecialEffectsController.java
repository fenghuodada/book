package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.AbstractC0476h;
import androidx.collection.C0470b;
import androidx.core.app.AbstractC0631l0;
import androidx.core.p003os.C0732c;
import androidx.core.view.C0902c2;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC0964l0;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.C10806j;
import kotlin.Metadata;
import kotlin.collections.C10752h;
import kotlin.collections.C10757m;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003+,-B\u000f\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J@\u0010\u000f\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\rH\u0002JL\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0002J&\u0010\u001b\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019H\u0002J(\u0010 \u001a\u00020\u00052\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001cj\b\u0012\u0004\u0012\u00020\u0018`\u001d2\u0006\u0010\u001f\u001a\u00020\u0018H\u0002J$\u0010#\u001a\u00020\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180!2\u0006\u0010\u001f\u001a\u00020\u0018H\u0002J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0003H\u0002J\u001e\u0010&\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¨\u0006."}, m508d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operations", "Lkotlin/p;", "syncAnimations", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animationInfos", "", "awaitingContainerChanges", "", "startedAnyTransition", "", "startedTransitions", "startAnimations", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "transitionInfos", "isPop", "firstOut", "lastIn", "startTransitions", "Landroidx/collection/b;", "", "Landroid/view/View;", "", "names", "retainMatchingViews", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "transitioningViews", "view", "captureTransitioningViews", "", "namedViews", "findNamedViews", "operation", "applyContainerChanges", "executeOperations", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "AnimationInfo", "SpecialEffectsInfo", "TransitionInfo", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,877:1\n288#2,2:878\n533#2,6:880\n819#2:886\n847#2,2:887\n766#2:889\n857#2,2:890\n1789#2,3:892\n819#2:895\n847#2,2:896\n1855#2,2:898\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n47#1:878,2\n53#1:880,6\n312#1:886\n312#1:887,2\n315#1:889\n315#1:890,2\n317#1:892,3\n629#1:895\n629#1:896,2\n632#1:898,2\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    @Metadata(m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m508d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "getAnimation", "", "isPop", "Z", "isAnimLoaded", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operation", "Landroidx/core/os/c;", "signal", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/c;Z)V", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class AnimationInfo extends SpecialEffectsInfo {
        @Nullable
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(@NotNull SpecialEffectsController.Operation operation, @NotNull C0732c signal, boolean z) {
            super(operation, signal);
            C10843j.m430f(operation, "operation");
            C10843j.m430f(signal, "signal");
            this.isPop = z;
        }

        @Nullable
        public final FragmentAnim.AnimationOrAnimator getAnimation(@NotNull Context context) {
            C10843j.m430f(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator loadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = loadAnimation;
            this.isAnimLoaded = true;
            return loadAnimation;
        }
    }

    @Metadata(m509d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m508d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "Lkotlin/p;", "completeSpecialEffect", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "Landroidx/core/os/c;", "signal", "Landroidx/core/os/c;", "getSignal", "()Landroidx/core/os/c;", "", "isVisibilityUnchanged", "()Z", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/c;)V", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static class SpecialEffectsInfo {
        @NotNull
        private final SpecialEffectsController.Operation operation;
        @NotNull
        private final C0732c signal;

        public SpecialEffectsInfo(@NotNull SpecialEffectsController.Operation operation, @NotNull C0732c signal) {
            C10843j.m430f(operation, "operation");
            C10843j.m430f(signal, "signal");
            this.operation = operation;
            this.signal = signal;
        }

        public final void completeSpecialEffect() {
            this.operation.completeSpecialEffect(this.signal);
        }

        @NotNull
        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        @NotNull
        public final C0732c getSignal() {
            return this.signal;
        }

        public final boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = this.operation.getFragment().mView;
            C10843j.m431e(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            return asOperationState == finalState || !(asOperationState == (state = SpecialEffectsController.Operation.State.VISIBLE) || finalState == state);
        }
    }

    @Metadata(m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\nR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u001a"}, m508d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "transition", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "", "hasSharedElementTransition", "Ljava/lang/Object;", "getTransition", "()Ljava/lang/Object;", "isOverlapAllowed", "Z", "()Z", "sharedElementTransition", "getSharedElementTransition", "()Landroidx/fragment/app/FragmentTransitionImpl;", "handlingImpl", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operation", "Landroidx/core/os/c;", "signal", "isPop", "providesSharedElementTransition", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/c;ZZ)V", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;
        @Nullable
        private final Object sharedElementTransition;
        @Nullable
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(@NotNull SpecialEffectsController.Operation operation, @NotNull C0732c signal, boolean z, boolean z2) {
            super(operation, signal);
            Object returnTransition;
            boolean z3;
            Object obj;
            C10843j.m430f(operation, "operation");
            C10843j.m430f(signal, "signal");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                returnTransition = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            if (operation.getFinalState() == state) {
                Fragment fragment3 = operation.getFragment();
                z3 = z ? fragment3.getAllowReturnTransitionOverlap() : fragment3.getAllowEnterTransitionOverlap();
            } else {
                z3 = true;
            }
            this.isOverlapAllowed = z3;
            if (z2) {
                Fragment fragment4 = operation.getFragment();
                obj = z ? fragment4.getSharedElementReturnTransition() : fragment4.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.sharedElementTransition = obj;
        }

        private final FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl == null || !fragmentTransitionImpl.canHandle(obj)) {
                FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
                if (fragmentTransitionImpl2 == null || !fragmentTransitionImpl2.canHandle(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
                }
                return fragmentTransitionImpl2;
            }
            return fragmentTransitionImpl;
        }

        @Nullable
        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        @Nullable
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        @Nullable
        public final Object getTransition() {
            return this.transition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        public final boolean isOverlapAllowed() {
            return this.isOverlapAllowed;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(@NotNull ViewGroup container) {
        super(container);
        C10843j.m430f(container, "container");
    }

    private final void applyContainerChanges(SpecialEffectsController.Operation operation) {
        View view = operation.getFragment().mView;
        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
        C10843j.m431e(view, "view");
        finalState.applyState(view);
    }

    private final void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0902c2.m11515b(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
            } else {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        captureTransitioningViews(arrayList, childAt);
                    }
                }
                return;
            }
        } else if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOperations$lambda$2(List awaitingContainerChanges, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController this$0) {
        C10843j.m430f(awaitingContainerChanges, "$awaitingContainerChanges");
        C10843j.m430f(operation, "$operation");
        C10843j.m430f(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.applyContainerChanges(operation);
        }
    }

    private final void findNamedViews(Map<String, View> map, View view) {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        String m11711k = ViewCompat.C0819i.m11711k(view);
        if (m11711k != null) {
            map.put(m11711k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(map, childAt);
                }
            }
        }
    }

    private final void retainMatchingViews(C0470b<String, View> c0470b, Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = c0470b.entrySet();
        C10843j.m431e(entries, "entries");
        DefaultSpecialEffectsController$retainMatchingViews$1 defaultSpecialEffectsController$retainMatchingViews$1 = new DefaultSpecialEffectsController$retainMatchingViews$1(collection);
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            if (!defaultSpecialEffectsController$retainMatchingViews$1.invoke((DefaultSpecialEffectsController$retainMatchingViews$1) it.next()).booleanValue()) {
                it.remove();
            }
        }
    }

    private final void startAnimations(List<AnimationInfo> list, List<SpecialEffectsController.Operation> list2, boolean z, Map<SpecialEffectsController.Operation, Boolean> map) {
        StringBuilder sb;
        String str;
        Context context = getContainer().getContext();
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        boolean z2 = false;
        for (final AnimationInfo animationInfo : list) {
            if (!animationInfo.isVisibilityUnchanged()) {
                C10843j.m431e(context, "context");
                FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
                if (animation != null) {
                    final Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(animationInfo);
                    } else {
                        final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        Fragment fragment = operation.getFragment();
                        if (C10843j.m435a(map.get(operation), Boolean.TRUE)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo.completeSpecialEffect();
                        } else {
                            final boolean z3 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                            if (z3) {
                                list2.remove(operation);
                            }
                            final View view = fragment.mView;
                            getContainer().startViewTransition(view);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(@NotNull Animator anim) {
                                    C10843j.m430f(anim, "anim");
                                    DefaultSpecialEffectsController.this.getContainer().endViewTransition(view);
                                    if (z3) {
                                        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                                        View viewToAnimate = view;
                                        C10843j.m431e(viewToAnimate, "viewToAnimate");
                                        finalState.applyState(viewToAnimate);
                                    }
                                    animationInfo.completeSpecialEffect();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has started.");
                            }
                            animationInfo.getSignal().m11862a(new C0732c.InterfaceC0733a() { // from class: androidx.fragment.app.f
                                @Override // androidx.core.p003os.C0732c.InterfaceC0733a
                                public final void onCancel() {
                                    DefaultSpecialEffectsController.startAnimations$lambda$3(animator, operation);
                                }
                            });
                            z2 = true;
                        }
                    }
                }
            }
            animationInfo.completeSpecialEffect();
        }
        for (final AnimationInfo animationInfo2 : arrayList) {
            final SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (z) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    sb = new StringBuilder("Ignoring Animation set on ");
                    sb.append(fragment2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v(FragmentManager.TAG, sb.toString());
                }
                animationInfo2.completeSpecialEffect();
            } else if (z2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    sb = new StringBuilder("Ignoring Animation set on ");
                    sb.append(fragment2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v(FragmentManager.TAG, sb.toString());
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                C10843j.m431e(context, "context");
                FragmentAnim.AnimationOrAnimator animation2 = animationInfo2.getAnimation(context);
                if (animation2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Animation animation3 = animation2.animation;
                if (animation3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation3);
                    animationInfo2.completeSpecialEffect();
                } else {
                    getContainer().startViewTransition(view2);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation3, getContainer(), view2);
                    endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$startAnimations$3(operation2, this, view2, animationInfo2));
                    view2.startAnimation(endViewTransitionAnimation);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Animation from operation " + operation2 + " has started.");
                    }
                }
                animationInfo2.getSignal().m11862a(new C0732c.InterfaceC0733a() { // from class: androidx.fragment.app.g
                    @Override // androidx.core.p003os.C0732c.InterfaceC0733a
                    public final void onCancel() {
                        DefaultSpecialEffectsController.startAnimations$lambda$4(view2, this, animationInfo2, operation2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$3(Animator animator, SpecialEffectsController.Operation operation) {
        C10843j.m430f(operation, "$operation");
        animator.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$4(View view, DefaultSpecialEffectsController this$0, AnimationInfo animationInfo, SpecialEffectsController.Operation operation) {
        C10843j.m430f(this$0, "this$0");
        C10843j.m430f(animationInfo, "$animationInfo");
        C10843j.m430f(operation, "$operation");
        view.clearAnimation();
        this$0.getContainer().endViewTransition(view);
        animationInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
        }
    }

    private final Map<SpecialEffectsController.Operation, Boolean> startTransitions(List<TransitionInfo> list, List<SpecialEffectsController.Operation> list2, final boolean z, final SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
        View view;
        View view2;
        boolean z2;
        SpecialEffectsController.Operation operation3;
        boolean z3;
        View view3;
        Object obj;
        View view4;
        Object obj2;
        ArrayList<View> arrayList;
        Object obj3;
        LinkedHashMap linkedHashMap;
        Object obj4;
        final ArrayList<View> arrayList2;
        View view5;
        Set m469t;
        final FragmentTransitionImpl fragmentTransitionImpl;
        C0470b c0470b;
        ArrayList<View> arrayList3;
        ArrayList<View> arrayList4;
        Rect rect;
        LinkedHashMap linkedHashMap2;
        C10806j c10806j;
        ArrayList<String> arrayList5;
        View view6;
        final Rect rect2;
        final View view7;
        TransitionInfo transitionInfo;
        boolean z4;
        boolean z5;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : list) {
            if (!((TransitionInfo) obj5).isVisibilityUnchanged()) {
                arrayList6.add(obj5);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it = arrayList6.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((TransitionInfo) next).getHandlingImpl() != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                arrayList7.add(next);
            }
        }
        Iterator it2 = arrayList7.iterator();
        FragmentTransitionImpl fragmentTransitionImpl2 = null;
        while (it2.hasNext()) {
            FragmentTransitionImpl handlingImpl = ((TransitionInfo) it2.next()).getHandlingImpl();
            if (fragmentTransitionImpl2 != null && handlingImpl != fragmentTransitionImpl2) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                fragmentTransitionImpl2 = handlingImpl;
            } else {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
        }
        if (fragmentTransitionImpl2 == null) {
            for (TransitionInfo transitionInfo2 : list) {
                linkedHashMap3.put(transitionInfo2.getOperation(), Boolean.FALSE);
                transitionInfo2.completeSpecialEffect();
            }
            return linkedHashMap3;
        }
        View view8 = new View(getContainer().getContext());
        Rect rect3 = new Rect();
        ArrayList<View> arrayList8 = new ArrayList<>();
        ArrayList<View> arrayList9 = new ArrayList<>();
        C0470b c0470b2 = new C0470b();
        Object obj6 = null;
        View view9 = null;
        boolean z6 = false;
        for (TransitionInfo transitionInfo3 : list) {
            if (transitionInfo3.hasSharedElementTransition() && operation != null && operation2 != null) {
                Object wrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(transitionInfo3.getSharedElementTransition()));
                ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                C10843j.m431e(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                View view10 = view9;
                C10843j.m431e(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                C10843j.m431e(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                View view11 = view8;
                Rect rect4 = rect3;
                int i = 0;
                while (i < size) {
                    int i2 = size;
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                    size = i2;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                C10843j.m431e(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                Fragment fragment = operation.getFragment();
                if (!z) {
                    c10806j = new C10806j(fragment.getExitTransitionCallback(), operation2.getFragment().getEnterTransitionCallback());
                } else {
                    c10806j = new C10806j(fragment.getEnterTransitionCallback(), operation2.getFragment().getExitTransitionCallback());
                }
                AbstractC0631l0 abstractC0631l0 = (AbstractC0631l0) c10806j.f21397a;
                AbstractC0631l0 abstractC0631l02 = (AbstractC0631l0) c10806j.f21398b;
                int size2 = sharedElementSourceNames.size();
                int i3 = 0;
                while (i3 < size2) {
                    c0470b2.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                    size2 = size2;
                    fragmentTransitionImpl2 = fragmentTransitionImpl2;
                }
                FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                    for (Iterator<String> it3 = sharedElementTargetNames2.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v(FragmentManager.TAG, "Name: " + it3.next());
                    }
                    Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                    for (Iterator<String> it4 = sharedElementSourceNames.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v(FragmentManager.TAG, "Name: " + it4.next());
                    }
                }
                C0470b c0470b3 = new C0470b();
                View view12 = operation.getFragment().mView;
                C10843j.m431e(view12, "firstOut.fragment.mView");
                defaultSpecialEffectsController.findNamedViews(c0470b3, view12);
                AbstractC0476h.m12407k(c0470b3, sharedElementSourceNames);
                if (abstractC0631l0 != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing exit callback for operation " + operation);
                    }
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i4 = size3 - 1;
                            String str = sharedElementSourceNames.get(size3);
                            View view13 = (View) c0470b3.getOrDefault(str, null);
                            if (view13 == null) {
                                c0470b2.remove(str);
                            } else {
                                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                                if (!C10843j.m435a(str, ViewCompat.C0819i.m11711k(view13))) {
                                    c0470b2.put(ViewCompat.C0819i.m11711k(view13), (String) c0470b2.remove(str));
                                }
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size3 = i4;
                        }
                    }
                } else {
                    AbstractC0476h.m12407k(c0470b2, c0470b3.keySet());
                }
                final C0470b c0470b4 = new C0470b();
                View view14 = operation2.getFragment().mView;
                C10843j.m431e(view14, "lastIn.fragment.mView");
                defaultSpecialEffectsController.findNamedViews(c0470b4, view14);
                AbstractC0476h.m12407k(c0470b4, sharedElementTargetNames2);
                AbstractC0476h.m12407k(c0470b4, c0470b2.values());
                if (abstractC0631l02 != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing enter callback for operation " + operation2);
                    }
                    int size4 = sharedElementTargetNames2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i5 = size4 - 1;
                            String name = sharedElementTargetNames2.get(size4);
                            View view15 = (View) c0470b4.getOrDefault(name, null);
                            if (view15 == null) {
                                C10843j.m431e(name, "name");
                                String findKeyForValue = FragmentTransition.findKeyForValue(c0470b2, name);
                                if (findKeyForValue != null) {
                                    c0470b2.remove(findKeyForValue);
                                }
                                arrayList5 = sharedElementTargetNames2;
                            } else {
                                WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                                arrayList5 = sharedElementTargetNames2;
                                if (!C10843j.m435a(name, ViewCompat.C0819i.m11711k(view15))) {
                                    C10843j.m431e(name, "name");
                                    String findKeyForValue2 = FragmentTransition.findKeyForValue(c0470b2, name);
                                    if (findKeyForValue2 != null) {
                                        c0470b2.put(findKeyForValue2, ViewCompat.C0819i.m11711k(view15));
                                    }
                                }
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size4 = i5;
                            sharedElementTargetNames2 = arrayList5;
                        }
                    } else {
                        arrayList5 = sharedElementTargetNames2;
                    }
                } else {
                    arrayList5 = sharedElementTargetNames2;
                    FragmentTransition.retainValues(c0470b2, c0470b4);
                }
                Set keySet = c0470b2.keySet();
                C10843j.m431e(keySet, "sharedElementNameMapping.keys");
                defaultSpecialEffectsController.retainMatchingViews(c0470b3, keySet);
                Collection values = c0470b2.values();
                C10843j.m431e(values, "sharedElementNameMapping.values");
                defaultSpecialEffectsController.retainMatchingViews(c0470b4, values);
                if (c0470b2.isEmpty()) {
                    arrayList8.clear();
                    arrayList9.clear();
                    view9 = view10;
                    rect3 = rect4;
                    linkedHashMap3 = linkedHashMap4;
                    view8 = view11;
                    fragmentTransitionImpl2 = fragmentTransitionImpl3;
                    obj6 = null;
                } else {
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z, c0470b3, true);
                    ViewTreeObserver$OnPreDrawListenerC0964l0.m11415a(getContainer(), new Runnable() { // from class: androidx.fragment.app.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$9(SpecialEffectsController.Operation.this, operation, z, c0470b4);
                        }
                    });
                    arrayList8.addAll(c0470b3.values());
                    if (!sharedElementSourceNames.isEmpty()) {
                        View view16 = (View) c0470b3.getOrDefault(sharedElementSourceNames.get(0), null);
                        fragmentTransitionImpl = fragmentTransitionImpl3;
                        fragmentTransitionImpl.setEpicenter(wrapTransitionInSet, view16);
                        view6 = view16;
                    } else {
                        fragmentTransitionImpl = fragmentTransitionImpl3;
                        view6 = view10;
                    }
                    arrayList9.addAll(c0470b4.values());
                    if ((!arrayList5.isEmpty()) && (view7 = (View) c0470b4.getOrDefault(arrayList5.get(0), null)) != null) {
                        rect2 = rect4;
                        ViewTreeObserver$OnPreDrawListenerC0964l0.m11415a(getContainer(), new Runnable() { // from class: androidx.fragment.app.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                DefaultSpecialEffectsController.startTransitions$lambda$10(FragmentTransitionImpl.this, view7, rect2);
                            }
                        });
                        z6 = true;
                    } else {
                        rect2 = rect4;
                    }
                    view8 = view11;
                    fragmentTransitionImpl.setSharedElementTargets(wrapTransitionInSet, view8, arrayList8);
                    c0470b = c0470b2;
                    arrayList3 = arrayList9;
                    arrayList4 = arrayList8;
                    rect = rect2;
                    fragmentTransitionImpl.scheduleRemoveTargets(wrapTransitionInSet, null, null, null, null, wrapTransitionInSet, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap2 = linkedHashMap4;
                    linkedHashMap2.put(operation, bool);
                    linkedHashMap2.put(operation2, bool);
                    view9 = view6;
                    obj6 = wrapTransitionInSet;
                }
            } else {
                fragmentTransitionImpl = fragmentTransitionImpl2;
                c0470b = c0470b2;
                arrayList3 = arrayList9;
                arrayList4 = arrayList8;
                rect = rect3;
                linkedHashMap2 = linkedHashMap3;
                view9 = view9;
            }
            arrayList9 = arrayList3;
            arrayList8 = arrayList4;
            linkedHashMap3 = linkedHashMap2;
            c0470b2 = c0470b;
            fragmentTransitionImpl2 = fragmentTransitionImpl;
            rect3 = rect;
        }
        FragmentTransitionImpl fragmentTransitionImpl4 = fragmentTransitionImpl2;
        View view17 = view9;
        C0470b c0470b5 = c0470b2;
        ArrayList<View> arrayList10 = arrayList9;
        Rect rect5 = rect3;
        LinkedHashMap linkedHashMap5 = linkedHashMap3;
        ArrayList<View> arrayList11 = arrayList8;
        ArrayList arrayList12 = new ArrayList();
        Object obj7 = null;
        Object obj8 = null;
        for (TransitionInfo transitionInfo4 : list) {
            if (transitionInfo4.isVisibilityUnchanged()) {
                operation3 = transitionInfo4.getOperation();
            } else {
                Object cloneTransition = fragmentTransitionImpl4.cloneTransition(transitionInfo4.getTransition());
                operation3 = transitionInfo4.getOperation();
                if (obj6 != null && (operation3 == operation || operation3 == operation2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (cloneTransition == null) {
                    if (!z3) {
                    }
                } else {
                    LinkedHashMap linkedHashMap6 = linkedHashMap5;
                    ArrayList<View> arrayList13 = new ArrayList<>();
                    Object obj9 = obj6;
                    View view18 = operation3.getFragment().mView;
                    Object obj10 = obj7;
                    C10843j.m431e(view18, "operation.fragment.mView");
                    defaultSpecialEffectsController.captureTransitioningViews(arrayList13, view18);
                    if (z3) {
                        if (operation3 == operation) {
                            m469t = C10757m.m469t(arrayList11);
                        } else {
                            m469t = C10757m.m469t(arrayList10);
                        }
                        arrayList13.removeAll(m469t);
                    }
                    if (arrayList13.isEmpty()) {
                        fragmentTransitionImpl4.addTarget(cloneTransition, view8);
                        obj = obj10;
                        arrayList = arrayList11;
                        view4 = view8;
                        obj3 = obj8;
                        arrayList2 = arrayList13;
                        view3 = view17;
                        linkedHashMap = linkedHashMap6;
                        obj2 = obj9;
                        obj4 = cloneTransition;
                    } else {
                        fragmentTransitionImpl4.addTargets(cloneTransition, arrayList13);
                        view3 = view17;
                        obj = obj10;
                        view4 = view8;
                        obj2 = obj9;
                        arrayList = arrayList11;
                        obj3 = obj8;
                        linkedHashMap = linkedHashMap6;
                        fragmentTransitionImpl4.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList13, null, null, null, null);
                        if (operation3.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation3 = operation3;
                            list2.remove(operation3);
                            arrayList2 = arrayList13;
                            ArrayList<View> arrayList14 = new ArrayList<>(arrayList2);
                            arrayList14.remove(operation3.getFragment().mView);
                            obj4 = cloneTransition;
                            fragmentTransitionImpl4.scheduleHideFragmentView(obj4, operation3.getFragment().mView, arrayList14);
                            ViewTreeObserver$OnPreDrawListenerC0964l0.m11415a(getContainer(), new Runnable() { // from class: androidx.fragment.app.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.startTransitions$lambda$11(arrayList2);
                                }
                            });
                        } else {
                            operation3 = operation3;
                            obj4 = cloneTransition;
                            arrayList2 = arrayList13;
                        }
                    }
                    if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList12.addAll(arrayList2);
                        if (z6) {
                            fragmentTransitionImpl4.setEpicenter(obj4, rect5);
                        }
                        view5 = view3;
                    } else {
                        view5 = view3;
                        fragmentTransitionImpl4.setEpicenter(obj4, view5);
                    }
                    LinkedHashMap linkedHashMap7 = linkedHashMap;
                    linkedHashMap7.put(operation3, Boolean.TRUE);
                    if (transitionInfo4.isOverlapAllowed()) {
                        obj = fragmentTransitionImpl4.mergeTransitionsTogether(obj, obj4, null);
                    } else {
                        obj3 = fragmentTransitionImpl4.mergeTransitionsTogether(obj3, obj4, null);
                    }
                    obj7 = obj;
                    defaultSpecialEffectsController = this;
                    obj6 = obj2;
                    view17 = view5;
                    linkedHashMap5 = linkedHashMap7;
                    view8 = view4;
                    obj8 = obj3;
                    arrayList11 = arrayList;
                }
            }
            linkedHashMap5.put(operation3, Boolean.FALSE);
            transitionInfo4.completeSpecialEffect();
        }
        ArrayList<View> arrayList15 = arrayList11;
        Object obj11 = obj6;
        Object obj12 = obj8;
        LinkedHashMap linkedHashMap8 = linkedHashMap5;
        Object mergeTransitionsInSequence = fragmentTransitionImpl4.mergeTransitionsInSequence(obj7, obj12, obj11);
        if (mergeTransitionsInSequence == null) {
            return linkedHashMap8;
        }
        ArrayList arrayList16 = new ArrayList();
        for (Object obj13 : list) {
            if (!((TransitionInfo) obj13).isVisibilityUnchanged()) {
                arrayList16.add(obj13);
            }
        }
        Iterator it5 = arrayList16.iterator();
        while (it5.hasNext()) {
            final TransitionInfo transitionInfo5 = (TransitionInfo) it5.next();
            Object transition = transitionInfo5.getTransition();
            final SpecialEffectsController.Operation operation4 = transitionInfo5.getOperation();
            if (obj11 != null && (operation4 == operation || operation4 == operation2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (transition != null || z2) {
                ViewGroup container = getContainer();
                WeakHashMap<View, C0922g2> weakHashMap3 = ViewCompat.f2518a;
                if (!ViewCompat.C0817g.m11729c(container)) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation4);
                    }
                    transitionInfo5.completeSpecialEffect();
                } else {
                    fragmentTransitionImpl4.setListenerForTransitionEnd(transitionInfo5.getOperation().getFragment(), mergeTransitionsInSequence, transitionInfo5.getSignal(), new Runnable() { // from class: androidx.fragment.app.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$14$lambda$13(DefaultSpecialEffectsController.TransitionInfo.this, operation4);
                        }
                    });
                }
            }
        }
        ViewGroup container2 = getContainer();
        WeakHashMap<View, C0922g2> weakHashMap4 = ViewCompat.f2518a;
        if (!ViewCompat.C0817g.m11729c(container2)) {
            return linkedHashMap8;
        }
        FragmentTransition.setViewVisibility(arrayList12, 4);
        ArrayList<String> prepareSetNameOverridesReordered = fragmentTransitionImpl4.prepareSetNameOverridesReordered(arrayList10);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, ">>>>> Beginning transition <<<<<");
            Log.v(FragmentManager.TAG, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator<View> it6 = arrayList15.iterator();
            while (it6.hasNext()) {
                View sharedElementFirstOutViews = it6.next();
                C10843j.m431e(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                Log.v(FragmentManager.TAG, "View: " + sharedElementFirstOutViews + " Name: " + ViewCompat.C0819i.m11711k(view2));
            }
            Log.v(FragmentManager.TAG, ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it7 = arrayList10.iterator();
            while (it7.hasNext()) {
                View sharedElementLastInViews = it7.next();
                C10843j.m431e(sharedElementLastInViews, "sharedElementLastInViews");
                Log.v(FragmentManager.TAG, "View: " + sharedElementLastInViews + " Name: " + ViewCompat.C0819i.m11711k(view));
            }
        }
        fragmentTransitionImpl4.beginDelayedTransition(getContainer(), mergeTransitionsInSequence);
        fragmentTransitionImpl4.setNameOverridesReordered(getContainer(), arrayList15, arrayList10, prepareSetNameOverridesReordered, c0470b5);
        FragmentTransition.setViewVisibility(arrayList12, 0);
        fragmentTransitionImpl4.swapSharedElementTargets(obj11, arrayList15, arrayList10);
        return linkedHashMap8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$10(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
        C10843j.m430f(impl, "$impl");
        C10843j.m430f(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.getBoundsOnScreen(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$11(ArrayList transitioningViews) {
        C10843j.m430f(transitioningViews, "$transitioningViews");
        FragmentTransition.setViewVisibility(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$14$lambda$13(TransitionInfo transitionInfo, SpecialEffectsController.Operation operation) {
        C10843j.m430f(transitionInfo, "$transitionInfo");
        C10843j.m430f(operation, "$operation");
        transitionInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$9(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, C0470b lastInViews) {
        C10843j.m430f(lastInViews, "$lastInViews");
        FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), z, lastInViews, false);
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> list) {
        C10843j.m430f(list, "<this>");
        if (!list.isEmpty()) {
            Fragment fragment = list.get(C10752h.m487b(list)).getFragment();
            for (SpecialEffectsController.Operation operation : list) {
                operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
                operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
                operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
                operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
            }
            return;
        }
        throw new NoSuchElementException("List is empty.");
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void executeOperations(@NotNull List<? extends SpecialEffectsController.Operation> operations, boolean z) {
        SpecialEffectsController.Operation operation;
        Object obj;
        boolean z2;
        boolean z3;
        C10843j.m430f(operations, "operations");
        Iterator<T> it = operations.iterator();
        while (true) {
            operation = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = operation2.getFragment().mView;
            C10843j.m431e(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (asOperationState != state || operation2.getFinalState() == state) {
                z3 = false;
                continue;
            } else {
                z3 = true;
                continue;
            }
            if (z3) {
                break;
            }
        }
        SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) obj;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            SpecialEffectsController.Operation previous = listIterator.previous();
            SpecialEffectsController.Operation operation4 = previous;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation4.getFragment().mView;
            C10843j.m431e(view2, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState2 = companion2.asOperationState(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (asOperationState2 == state2 || operation4.getFinalState() != state2) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                operation = previous;
                break;
            }
        }
        SpecialEffectsController.Operation operation5 = operation;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Executing operations from " + operation3 + " to " + operation5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList m470s = C10757m.m470s(operations);
        syncAnimations(operations);
        Iterator<? extends SpecialEffectsController.Operation> it2 = operations.iterator();
        while (it2.hasNext()) {
            final SpecialEffectsController.Operation next = it2.next();
            C0732c c0732c = new C0732c();
            next.markStartedSpecialEffect(c0732c);
            arrayList.add(new AnimationInfo(next, c0732c, z));
            C0732c c0732c2 = new C0732c();
            next.markStartedSpecialEffect(c0732c2);
            arrayList2.add(new TransitionInfo(next, c0732c2, z, !z ? next != operation5 : next != operation3));
            next.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.executeOperations$lambda$2(m470s, next, this);
                }
            });
        }
        Map<SpecialEffectsController.Operation, Boolean> startTransitions = startTransitions(arrayList2, m470s, z, operation3, operation5);
        startAnimations(arrayList, m470s, startTransitions.containsValue(Boolean.TRUE), startTransitions);
        Iterator it3 = m470s.iterator();
        while (it3.hasNext()) {
            applyContainerChanges((SpecialEffectsController.Operation) it3.next());
        }
        m470s.clear();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Completed executing operations from " + operation3 + " to " + operation5);
        }
    }
}
