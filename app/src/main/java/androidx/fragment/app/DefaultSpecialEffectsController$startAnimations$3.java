package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m508d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$startAnimations$3", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Lkotlin/p;", "onAnimationStart", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultSpecialEffectsController$startAnimations$3 implements Animation.AnimationListener {
    final /* synthetic */ DefaultSpecialEffectsController.AnimationInfo $animationInfo;
    final /* synthetic */ SpecialEffectsController.Operation $operation;
    final /* synthetic */ View $viewToAnimate;
    final /* synthetic */ DefaultSpecialEffectsController this$0;

    public DefaultSpecialEffectsController$startAnimations$3(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController, View view, DefaultSpecialEffectsController.AnimationInfo animationInfo) {
        this.$operation = operation;
        this.this$0 = defaultSpecialEffectsController;
        this.$viewToAnimate = view;
        this.$animationInfo = animationInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd$lambda$0(DefaultSpecialEffectsController this$0, View view, DefaultSpecialEffectsController.AnimationInfo animationInfo) {
        C10843j.m430f(this$0, "this$0");
        C10843j.m430f(animationInfo, "$animationInfo");
        this$0.getContainer().endViewTransition(view);
        animationInfo.completeSpecialEffect();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(@NotNull Animation animation) {
        C10843j.m430f(animation, "animation");
        ViewGroup container = this.this$0.getContainer();
        final DefaultSpecialEffectsController defaultSpecialEffectsController = this.this$0;
        final View view = this.$viewToAnimate;
        final DefaultSpecialEffectsController.AnimationInfo animationInfo = this.$animationInfo;
        container.post(new Runnable() { // from class: androidx.fragment.app.h
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSpecialEffectsController$startAnimations$3.onAnimationEnd$lambda$0(DefaultSpecialEffectsController.this, view, animationInfo);
            }
        });
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + this.$operation + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(@NotNull Animation animation) {
        C10843j.m430f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(@NotNull Animation animation) {
        C10843j.m430f(animation, "animation");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + this.$operation + " has reached onAnimationStart.");
        }
    }
}
