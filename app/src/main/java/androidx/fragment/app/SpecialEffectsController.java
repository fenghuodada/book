package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.result.C0063d;
import androidx.annotation.CallSuper;
import androidx.appcompat.view.menu.C0235r;
import androidx.core.p003os.C0732c;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.collections.C10757m;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\f\b \u0018\u0000 .2\u00020\u0001:\u0003./0B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\rJ\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\rJ\u0006\u0010\u001b\u001a\u00020\rJ#\u0010\u001f\u001a\u00020\r2\u0011\u0010\u001e\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u001d0\u001c2\u0006\u0010\u0016\u001a\u00020\u0015H&R\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010)\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*¨\u00061"}, m508d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "findPendingOperation", "findRunningOperation", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "Landroidx/fragment/app/FragmentStateManager;", "fragmentStateManager", "Lkotlin/p;", "enqueue", "updateFinalState", "getAwaitingCompletionLifecycleImpact", "enqueueAdd", "enqueueShow", "enqueueHide", "enqueueRemove", "", "isPop", "updateOperationDirection", "markPostponedState", "forcePostponedExecutePendingOperations", "executePendingOperations", "forceCompleteAllOperations", "", "Lkotlin/jvm/JvmSuppressWildcards;", "operations", "executeOperations", "Landroid/view/ViewGroup;", "container", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "", "pendingOperations", "Ljava/util/List;", "runningOperations", "operationDirectionIsPop", "Z", "isContainerPostponed", "<init>", "(Landroid/view/ViewGroup;)V", "Companion", "FragmentStateManagerOperation", "Operation", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
/* loaded from: classes.dex */
public abstract class SpecialEffectsController {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final ViewGroup container;
    private boolean isContainerPostponed;
    private boolean operationDirectionIsPop;
    @NotNull
    private final List<Operation> pendingOperations;
    @NotNull
    private final List<Operation> runningOperations;

    @Metadata(m509d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m508d2 = {"Landroidx/fragment/app/SpecialEffectsController$Companion;", "", "()V", "getOrCreateController", "Landroidx/fragment/app/SpecialEffectsController;", "container", "Landroid/view/ViewGroup;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "factory", "Landroidx/fragment/app/SpecialEffectsControllerFactory;", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SpecialEffectsController getOrCreateController(@NotNull ViewGroup container, @NotNull FragmentManager fragmentManager) {
            C10843j.m430f(container, "container");
            C10843j.m430f(fragmentManager, "fragmentManager");
            SpecialEffectsControllerFactory specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
            C10843j.m431e(specialEffectsControllerFactory, "fragmentManager.specialEffectsControllerFactory");
            return getOrCreateController(container, specialEffectsControllerFactory);
        }

        @JvmStatic
        @NotNull
        public final SpecialEffectsController getOrCreateController(@NotNull ViewGroup container, @NotNull SpecialEffectsControllerFactory factory) {
            C10843j.m430f(container, "container");
            C10843j.m430f(factory, "factory");
            Object tag = container.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController createController = factory.createController(container);
            C10843j.m431e(createController, "factory.createController(container)");
            container.setTag(R.id.special_effects_controller_view_tag, createController);
            return createController;
        }
    }

    @Metadata(m509d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m508d2 = {"Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "Lkotlin/p;", "onStart", "complete", "Landroidx/fragment/app/FragmentStateManager;", "fragmentStateManager", "Landroidx/fragment/app/FragmentStateManager;", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "Landroidx/core/os/c;", "cancellationSignal", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;Landroidx/core/os/c;)V", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class FragmentStateManagerOperation extends Operation {
        @NotNull
        private final FragmentStateManager fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public FragmentStateManagerOperation(@org.jetbrains.annotations.NotNull androidx.fragment.app.SpecialEffectsController.Operation.State r3, @org.jetbrains.annotations.NotNull androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r4, @org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentStateManager r5, @org.jetbrains.annotations.NotNull androidx.core.p003os.C0732c r6) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.C10843j.m430f(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.C10843j.m430f(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.C10843j.m430f(r5, r0)
                java.lang.String r0 = "cancellationSignal"
                kotlin.jvm.internal.C10843j.m430f(r6, r0)
                androidx.fragment.app.Fragment r0 = r5.getFragment()
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.C10843j.m431e(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.fragmentStateManager = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation.<init>(androidx.fragment.app.SpecialEffectsController$Operation$State, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact, androidx.fragment.app.FragmentStateManager, androidx.core.os.c):void");
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
            super.complete();
            this.fragmentStateManager.moveToExpectedState();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
            if (getLifecycleImpact() != Operation.LifecycleImpact.ADDING) {
                if (getLifecycleImpact() == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragment = this.fragmentStateManager.getFragment();
                    C10843j.m431e(fragment, "fragmentStateManager.fragment");
                    View requireView = fragment.requireView();
                    C10843j.m431e(requireView, "fragment.requireView()");
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + fragment);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = this.fragmentStateManager.getFragment();
            C10843j.m431e(fragment2, "fragmentStateManager.fragment");
            View findFocus = fragment2.mView.findFocus();
            if (findFocus != null) {
                fragment2.setFocusedView(findFocus);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment2);
                }
            }
            View requireView2 = getFragment().requireView();
            C10843j.m431e(requireView2, "this.fragment.requireView()");
            if (requireView2.getParent() == null) {
                this.fragmentStateManager.addViewToContainer();
                requireView2.setAlpha(0.0f);
            }
            if ((requireView2.getAlpha() == 0.0f) && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    @Metadata(m509d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001:\u000223B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010/\u001a\u00020\u000f¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u00020\u0004H\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R$\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b.\u0010-¨\u00064"}, m508d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "", "toString", "Lkotlin/p;", "cancel", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "mergeWith", "Ljava/lang/Runnable;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addCompletionListener", "onStart", "Landroidx/core/os/c;", "signal", "markStartedSpecialEffect", "completeSpecialEffect", "complete", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "getFinalState", "()Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "setFinalState", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;)V", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "getLifecycleImpact", "()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "setLifecycleImpact", "(Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "", "completionListeners", "Ljava/util/List;", "", "specialEffectsSignals", "Ljava/util/Set;", "", "<set-?>", "isCanceled", "Z", "()Z", "isComplete", "cancellationSignal", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/Fragment;Landroidx/core/os/c;)V", "LifecycleImpact", "State", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    /* loaded from: classes.dex */
    public static class Operation {
        @NotNull
        private final List<Runnable> completionListeners;
        @NotNull
        private State finalState;
        @NotNull
        private final Fragment fragment;
        private boolean isCanceled;
        private boolean isComplete;
        @NotNull
        private LifecycleImpact lifecycleImpact;
        @NotNull
        private final Set<C0732c> specialEffectsSignals;

        @Metadata(m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m508d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "(Ljava/lang/String;I)V", "NONE", "ADDING", "REMOVING", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
        /* loaded from: classes.dex */
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        @Metadata(m509d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m508d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "Landroid/view/View;", "view", "Lkotlin/p;", "applyState", "<init>", "(Ljava/lang/String;I)V", "Companion", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;
            
            @NotNull
            public static final Companion Companion = new Companion(null);

            @Metadata(m509d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\n\u0010\u0007\u001a\u00020\u0004*\u00020\b¨\u0006\t"}, m508d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;", "", "()V", "from", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "visibility", "", "asOperationState", "Landroid/view/View;", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(C10839f c10839f) {
                    this();
                }

                @NotNull
                public final State asOperationState(@NotNull View view) {
                    C10843j.m430f(view, "<this>");
                    return (((view.getAlpha() > 0.0f ? 1 : (view.getAlpha() == 0.0f ? 0 : -1)) == 0) && view.getVisibility() == 0) ? State.INVISIBLE : from(view.getVisibility());
                }

                @JvmStatic
                @NotNull
                public final State from(int i) {
                    if (i != 0) {
                        if (i != 4) {
                            if (i == 8) {
                                return State.GONE;
                            }
                            throw new IllegalArgumentException(C0235r.m12816a("Unknown visibility ", i));
                        }
                        return State.INVISIBLE;
                    }
                    return State.VISIBLE;
                }
            }

            @Metadata(m507k = 3, m506mv = {1, 8, 0}, m504xi = 48)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @JvmStatic
            @NotNull
            public static final State from(int i) {
                return Companion.from(i);
            }

            public final void applyState(@NotNull View view) {
                int i;
                C10843j.m430f(view, "view");
                int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i2 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i = 0;
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                    return;
                } else {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i = 8;
                }
                view.setVisibility(i);
            }
        }

        @Metadata(m507k = 3, m506mv = {1, 8, 0}, m504xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Operation(@NotNull State finalState, @NotNull LifecycleImpact lifecycleImpact, @NotNull Fragment fragment, @NotNull C0732c cancellationSignal) {
            C10843j.m430f(finalState, "finalState");
            C10843j.m430f(lifecycleImpact, "lifecycleImpact");
            C10843j.m430f(fragment, "fragment");
            C10843j.m430f(cancellationSignal, "cancellationSignal");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.specialEffectsSignals = new LinkedHashSet();
            cancellationSignal.m11862a(new C1434w(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(Operation this$0) {
            C10843j.m430f(this$0, "this$0");
            this$0.cancel();
        }

        public final void addCompletionListener(@NotNull Runnable listener) {
            C10843j.m430f(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void cancel() {
            LinkedHashSet<C0732c> linkedHashSet;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this.specialEffectsSignals.isEmpty()) {
                complete();
                return;
            }
            Set<C0732c> set = this.specialEffectsSignals;
            C10843j.m430f(set, "<this>");
            if (set instanceof Collection) {
                linkedHashSet = new LinkedHashSet(set);
            } else {
                linkedHashSet = new LinkedHashSet();
                C10757m.m472q(set, linkedHashSet);
            }
            for (C0732c c0732c : linkedHashSet) {
                synchronized (c0732c) {
                    if (!c0732c.f2421a) {
                        c0732c.f2421a = true;
                        c0732c.f2423c = true;
                        C0732c.InterfaceC0733a interfaceC0733a = c0732c.f2422b;
                        if (interfaceC0733a != null) {
                            try {
                                interfaceC0733a.onCancel();
                            } catch (Throwable th) {
                                synchronized (c0732c) {
                                    c0732c.f2423c = false;
                                    c0732c.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0732c) {
                            c0732c.f2423c = false;
                            c0732c.notifyAll();
                        }
                    }
                }
            }
        }

        @CallSuper
        public void complete() {
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            for (Runnable runnable : this.completionListeners) {
                runnable.run();
            }
        }

        public final void completeSpecialEffect(@NotNull C0732c signal) {
            C10843j.m430f(signal, "signal");
            if (this.specialEffectsSignals.remove(signal) && this.specialEffectsSignals.isEmpty()) {
                complete();
            }
        }

        @NotNull
        public final State getFinalState() {
            return this.finalState;
        }

        @NotNull
        public final Fragment getFragment() {
            return this.fragment;
        }

        @NotNull
        public final LifecycleImpact getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        public final boolean isCanceled() {
            return this.isCanceled;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final void markStartedSpecialEffect(@NotNull C0732c signal) {
            C10843j.m430f(signal, "signal");
            onStart();
            this.specialEffectsSignals.add(signal);
        }

        public final void mergeWith(@NotNull State finalState, @NotNull LifecycleImpact lifecycleImpact) {
            LifecycleImpact lifecycleImpact2;
            C10843j.m430f(finalState, "finalState");
            C10843j.m430f(lifecycleImpact, "lifecycleImpact");
            int i = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.finalState != State.REMOVED) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + '.');
                        }
                        this.finalState = finalState;
                        return;
                    }
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = State.REMOVED;
                lifecycleImpact2 = LifecycleImpact.REMOVING;
            } else if (this.finalState != State.REMOVED) {
                return;
            } else {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                }
                this.finalState = State.VISIBLE;
                lifecycleImpact2 = LifecycleImpact.ADDING;
            }
            this.lifecycleImpact = lifecycleImpact2;
        }

        public void onStart() {
        }

        public final void setFinalState(@NotNull State state) {
            C10843j.m430f(state, "<set-?>");
            this.finalState = state;
        }

        public final void setLifecycleImpact(@NotNull LifecycleImpact lifecycleImpact) {
            C10843j.m430f(lifecycleImpact, "<set-?>");
            this.lifecycleImpact = lifecycleImpact;
        }

        @NotNull
        public String toString() {
            StringBuilder m13052b = C0063d.m13052b("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            m13052b.append(this.finalState);
            m13052b.append(" lifecycleImpact = ");
            m13052b.append(this.lifecycleImpact);
            m13052b.append(" fragment = ");
            m13052b.append(this.fragment);
            m13052b.append('}');
            return m13052b.toString();
        }
    }

    @Metadata(m507k = 3, m506mv = {1, 8, 0}, m504xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SpecialEffectsController(@NotNull ViewGroup container) {
        C10843j.m430f(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    private final void enqueue(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.pendingOperations) {
            C0732c c0732c = new C0732c();
            Fragment fragment = fragmentStateManager.getFragment();
            C10843j.m431e(fragment, "fragmentStateManager.fragment");
            Operation findPendingOperation = findPendingOperation(fragment);
            if (findPendingOperation != null) {
                findPendingOperation.mergeWith(state, lifecycleImpact);
                return;
            }
            final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager, c0732c);
            this.pendingOperations.add(fragmentStateManagerOperation);
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.u
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.enqueue$lambda$4$lambda$2(SpecialEffectsController.this, fragmentStateManagerOperation);
                }
            });
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.v
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.enqueue$lambda$4$lambda$3(SpecialEffectsController.this, fragmentStateManagerOperation);
                }
            });
            C10868p c10868p = C10868p.f21418a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$2(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        C10843j.m430f(this$0, "this$0");
        C10843j.m430f(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            Operation.State finalState = operation.getFinalState();
            View view = operation.getFragment().mView;
            C10843j.m431e(view, "operation.fragment.mView");
            finalState.applyState(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$3(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        C10843j.m430f(this$0, "this$0");
        C10843j.m430f(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    private final Operation findPendingOperation(Fragment fragment) {
        Object obj;
        boolean z;
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (!C10843j.m435a(operation.getFragment(), fragment) || operation.isCanceled()) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (Operation) obj;
    }

    private final Operation findRunningOperation(Fragment fragment) {
        Object obj;
        boolean z;
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (!C10843j.m435a(operation.getFragment(), fragment) || operation.isCanceled()) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (Operation) obj;
    }

    @JvmStatic
    @NotNull
    public static final SpecialEffectsController getOrCreateController(@NotNull ViewGroup viewGroup, @NotNull FragmentManager fragmentManager) {
        return Companion.getOrCreateController(viewGroup, fragmentManager);
    }

    @JvmStatic
    @NotNull
    public static final SpecialEffectsController getOrCreateController(@NotNull ViewGroup viewGroup, @NotNull SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        return Companion.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }

    private final void updateFinalState() {
        for (Operation operation : this.pendingOperations) {
            if (operation.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                View requireView = operation.getFragment().requireView();
                C10843j.m431e(requireView, "fragment.requireView()");
                operation.mergeWith(Operation.State.Companion.from(requireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public final void enqueueAdd(@NotNull Operation.State finalState, @NotNull FragmentStateManager fragmentStateManager) {
        C10843j.m430f(finalState, "finalState");
        C10843j.m430f(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueHide(@NotNull FragmentStateManager fragmentStateManager) {
        C10843j.m430f(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(@NotNull FragmentStateManager fragmentStateManager) {
        C10843j.m430f(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public final void enqueueShow(@NotNull FragmentStateManager fragmentStateManager) {
        C10843j.m430f(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public abstract void executeOperations(@NotNull List<Operation> list, boolean z);

    public final void executePendingOperations() {
        if (this.isContainerPostponed) {
            return;
        }
        ViewGroup viewGroup = this.container;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (!ViewCompat.C0817g.m11730b(viewGroup)) {
            forceCompleteAllOperations();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            if (!this.pendingOperations.isEmpty()) {
                ArrayList m470s = C10757m.m470s(this.runningOperations);
                this.runningOperations.clear();
                Iterator it = m470s.iterator();
                while (it.hasNext()) {
                    Operation operation = (Operation) it.next();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Cancelling operation " + operation);
                    }
                    operation.cancel();
                    if (!operation.isComplete()) {
                        this.runningOperations.add(operation);
                    }
                }
                updateFinalState();
                ArrayList m470s2 = C10757m.m470s(this.pendingOperations);
                this.pendingOperations.clear();
                this.runningOperations.addAll(m470s2);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = m470s2.iterator();
                while (it2.hasNext()) {
                    ((Operation) it2.next()).onStart();
                }
                executeOperations(m470s2, this.operationDirectionIsPop);
                this.operationDirectionIsPop = false;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Finished executing pending operations");
                }
            }
            C10868p c10868p = C10868p.f21418a;
        }
    }

    public final void forceCompleteAllOperations() {
        String str;
        String str2;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.container;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        boolean m11730b = ViewCompat.C0817g.m11730b(viewGroup);
        synchronized (this.pendingOperations) {
            updateFinalState();
            for (Operation operation : this.pendingOperations) {
                operation.onStart();
            }
            Iterator it = C10757m.m470s(this.runningOperations).iterator();
            while (it.hasNext()) {
                Operation operation2 = (Operation) it.next();
                if (FragmentManager.isLoggingEnabled(2)) {
                    if (m11730b) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.container + " is not attached to window. ";
                    }
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str2 + "Cancelling running operation " + operation2);
                }
                operation2.cancel();
            }
            Iterator it2 = C10757m.m470s(this.pendingOperations).iterator();
            while (it2.hasNext()) {
                Operation operation3 = (Operation) it2.next();
                if (FragmentManager.isLoggingEnabled(2)) {
                    if (m11730b) {
                        str = "";
                    } else {
                        str = "Container " + this.container + " is not attached to window. ";
                    }
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str + "Cancelling pending operation " + operation3);
                }
                operation3.cancel();
            }
            C10868p c10868p = C10868p.f21418a;
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.isContainerPostponed) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            executePendingOperations();
        }
    }

    @Nullable
    public final Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(@NotNull FragmentStateManager fragmentStateManager) {
        C10843j.m430f(fragmentStateManager, "fragmentStateManager");
        Fragment fragment = fragmentStateManager.getFragment();
        C10843j.m431e(fragment, "fragmentStateManager.fragment");
        Operation findPendingOperation = findPendingOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact = findPendingOperation != null ? findPendingOperation.getLifecycleImpact() : null;
        Operation findRunningOperation = findRunningOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact2 = findRunningOperation != null ? findRunningOperation.getLifecycleImpact() : null;
        int i = lifecycleImpact == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        return (i == -1 || i == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    @NotNull
    public final ViewGroup getContainer() {
        return this.container;
    }

    public final void markPostponedState() {
        Operation operation;
        boolean z;
        synchronized (this.pendingOperations) {
            updateFinalState();
            List<Operation> list = this.pendingOperations;
            ListIterator<Operation> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    operation = null;
                    break;
                }
                operation = listIterator.previous();
                Operation operation2 = operation;
                Operation.State.Companion companion = Operation.State.Companion;
                View view = operation2.getFragment().mView;
                C10843j.m431e(view, "operation.fragment.mView");
                Operation.State asOperationState = companion.asOperationState(view);
                Operation.State finalState = operation2.getFinalState();
                Operation.State state = Operation.State.VISIBLE;
                if (finalState != state || asOperationState == state) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            Operation operation3 = operation;
            Fragment fragment = operation3 != null ? operation3.getFragment() : null;
            this.isContainerPostponed = fragment != null ? fragment.isPostponed() : false;
            C10868p c10868p = C10868p.f21418a;
        }
    }

    public final void updateOperationDirection(boolean z) {
        this.operationDirectionIsPop = z;
    }
}
