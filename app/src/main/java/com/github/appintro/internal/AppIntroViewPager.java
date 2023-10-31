package com.github.appintro.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.github.appintro.AppIntroBase;
import com.github.appintro.AppIntroPageTransformerType;
import com.github.appintro.AppIntroViewPagerListener;
import com.github.appintro.internal.viewpager.ViewPagerTransformer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001GB\u0017\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bR\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u000f\u0010\u0016\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eJ\b\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u000e\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006H"}, m508d2 = {"Lcom/github/appintro/internal/AppIntroViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/view/MotionEvent;", "event", "", "handleTouchEvent", "", "oldX", "newX", "isSwipeForward", "userIllegallyRequestNextPage", "Lcom/github/appintro/AppIntroBase$OnPageChangeListener;", "Lcom/github/appintro/AppIntroBase;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/p;", "addOnPageChangeListener$appintro_release", "(Lcom/github/appintro/AppIntroBase$OnPageChangeListener;)V", "addOnPageChangeListener", "goToNextSlide", "goToPreviousSlide", "reCenterCurrentSlide$appintro_release", "()V", "reCenterCurrentSlide", "", "size", "isFirstSlide", "isLastSlide", "getCurrentSlideNumber", "currentItem", "setCurrentItem", "", "factor", "setScrollDurationFactor", "performClick", "onInterceptTouchEvent", "onTouchEvent", "Lcom/github/appintro/AppIntroPageTransformerType;", "appIntroTransformer", "setAppIntroPageTransformer", "isFullPagingEnabled", "Z", "()Z", "setFullPagingEnabled", "(Z)V", "isPermissionSlide", "setPermissionSlide", "Lcom/github/appintro/AppIntroViewPagerListener;", "onNextPageRequestedListener", "Lcom/github/appintro/AppIntroViewPagerListener;", "getOnNextPageRequestedListener", "()Lcom/github/appintro/AppIntroViewPagerListener;", "setOnNextPageRequestedListener", "(Lcom/github/appintro/AppIntroViewPagerListener;)V", "currentTouchDownX", "F", "currentTouchDownY", "", "illegallyRequestedNextPageLastCalled", "J", "Lcom/github/appintro/internal/ScrollerCustomDuration;", "customScroller", "Lcom/github/appintro/internal/ScrollerCustomDuration;", "Landroidx/viewpager/widget/ViewPager$i;", "pageChangeListener", "Landroidx/viewpager/widget/ViewPager$i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class AppIntroViewPager extends ViewPager {
    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int ON_ILLEGALLY_REQUESTED_NEXT_PAGE_MAX_INTERVAL = 1000;
    private float currentTouchDownX;
    private float currentTouchDownY;
    private ScrollerCustomDuration customScroller;
    private long illegallyRequestedNextPageLastCalled;
    private boolean isFullPagingEnabled;
    private boolean isPermissionSlide;
    @Nullable
    private AppIntroViewPagerListener onNextPageRequestedListener;
    private ViewPager.InterfaceC1815i pageChangeListener;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m508d2 = {"Lcom/github/appintro/internal/AppIntroViewPager$Companion;", "", "()V", "ON_ILLEGALLY_REQUESTED_NEXT_PAGE_MAX_INTERVAL", "", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIntroViewPager(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        C10843j.m430f(context, "context");
        C10843j.m430f(attrs, "attrs");
        this.isFullPagingEnabled = true;
        try {
            Field scroller = ViewPager.class.getDeclaredField("mScroller");
            C10843j.m431e(scroller, "scroller");
            scroller.setAccessible(true);
            Field interpolator = ViewPager.class.getDeclaredField("sInterpolator");
            C10843j.m431e(interpolator, "interpolator");
            interpolator.setAccessible(true);
            Object obj = interpolator.get(null);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.animation.Interpolator");
            }
            ScrollerCustomDuration scrollerCustomDuration = new ScrollerCustomDuration(context, (Interpolator) obj);
            this.customScroller = scrollerCustomDuration;
            scroller.set(this, scrollerCustomDuration);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private final boolean handleTouchEvent(MotionEvent motionEvent) {
        AppIntroViewPagerListener appIntroViewPagerListener;
        AppIntroViewPagerListener appIntroViewPagerListener2;
        if (this.isFullPagingEnabled) {
            if (motionEvent.getAction() != 0) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                AppIntroViewPagerListener appIntroViewPagerListener3 = this.onNextPageRequestedListener;
                if (!(appIntroViewPagerListener3 != null ? appIntroViewPagerListener3.onCanRequestNextPage() : true) && isSwipeForward(this.currentTouchDownX, motionEvent.getX())) {
                    if (userIllegallyRequestNextPage() && (appIntroViewPagerListener2 = this.onNextPageRequestedListener) != null) {
                        appIntroViewPagerListener2.onIllegallyRequestedNextPage();
                    }
                    return false;
                } else if (this.isPermissionSlide && isSwipeForward(this.currentTouchDownX, motionEvent.getX()) && (appIntroViewPagerListener = this.onNextPageRequestedListener) != null) {
                    appIntroViewPagerListener.onUserRequestedPermissionsDialog();
                }
            } else {
                this.currentTouchDownX = motionEvent.getX();
                this.currentTouchDownY = motionEvent.getY();
            }
            return this.isFullPagingEnabled;
        }
        return false;
    }

    private final boolean isSwipeForward(float f, float f2) {
        Context context = getContext();
        C10843j.m431e(context, "context");
        if (LayoutUtil.isRtl(context)) {
            if (f2 > f) {
                return true;
            }
        } else if (f > f2) {
            return true;
        }
        return false;
    }

    private final boolean userIllegallyRequestNextPage() {
        if (System.currentTimeMillis() - this.illegallyRequestedNextPageLastCalled >= 1000) {
            this.illegallyRequestedNextPageLastCalled = System.currentTimeMillis();
            return true;
        }
        return false;
    }

    public final void addOnPageChangeListener$appintro_release(@NotNull AppIntroBase.OnPageChangeListener listener) {
        C10843j.m430f(listener, "listener");
        super.addOnPageChangeListener(listener);
        this.pageChangeListener = listener;
    }

    public final int getCurrentSlideNumber(int i) {
        Context context = getContext();
        C10843j.m431e(context, "context");
        return LayoutUtil.isRtl(context) ? i - getCurrentItem() : getCurrentItem() + 1;
    }

    @Nullable
    public final AppIntroViewPagerListener getOnNextPageRequestedListener() {
        return this.onNextPageRequestedListener;
    }

    public final void goToNextSlide() {
        int currentItem = getCurrentItem();
        Context context = getContext();
        C10843j.m431e(context, "context");
        setCurrentItem(currentItem + (!LayoutUtil.isRtl(context) ? 1 : -1));
    }

    public final void goToPreviousSlide() {
        int currentItem = getCurrentItem();
        Context context = getContext();
        C10843j.m431e(context, "context");
        setCurrentItem(currentItem + (!LayoutUtil.isRtl(context) ? -1 : 1));
    }

    public final boolean isFirstSlide(int i) {
        Context context = getContext();
        C10843j.m431e(context, "context");
        if (LayoutUtil.isRtl(context)) {
            if ((getCurrentItem() - i) + 1 != 0) {
                return false;
            }
        } else if (getCurrentItem() != 0) {
            return false;
        }
        return true;
    }

    public final boolean isFullPagingEnabled() {
        return this.isFullPagingEnabled;
    }

    public final boolean isLastSlide(int i) {
        Context context = getContext();
        C10843j.m431e(context, "context");
        if (LayoutUtil.isRtl(context)) {
            if (getCurrentItem() != 0) {
                return false;
            }
        } else if ((getCurrentItem() - i) + 1 != 0) {
            return false;
        }
        return true;
    }

    public final boolean isPermissionSlide() {
        return this.isPermissionSlide;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        C10843j.m430f(event, "event");
        if (handleTouchEvent(event)) {
            return super.onInterceptTouchEvent(event);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        C10843j.m430f(event, "event");
        if (handleTouchEvent(event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public final void reCenterCurrentSlide$appintro_release() {
        int currentItem = getCurrentItem();
        setCurrentItem(Math.max(currentItem - 1, 0), false);
        setCurrentItem(currentItem, false);
    }

    public final void setAppIntroPageTransformer(@NotNull AppIntroPageTransformerType appIntroTransformer) {
        C10843j.m430f(appIntroTransformer, "appIntroTransformer");
        setPageTransformer(true, new ViewPagerTransformer(appIntroTransformer));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        ViewPager.InterfaceC1815i interfaceC1815i;
        int currentItem = super.getCurrentItem();
        super.setCurrentItem(i);
        if (currentItem == 0 && i == 0 && (interfaceC1815i = this.pageChangeListener) != null) {
            interfaceC1815i.onPageSelected(0);
        }
    }

    public final void setFullPagingEnabled(boolean z) {
        this.isFullPagingEnabled = z;
    }

    public final void setOnNextPageRequestedListener(@Nullable AppIntroViewPagerListener appIntroViewPagerListener) {
        this.onNextPageRequestedListener = appIntroViewPagerListener;
    }

    public final void setPermissionSlide(boolean z) {
        this.isPermissionSlide = z;
    }

    public final void setScrollDurationFactor(double d) {
        ScrollerCustomDuration scrollerCustomDuration = this.customScroller;
        if (scrollerCustomDuration != null) {
            scrollerCustomDuration.setScrollDurationFactor(d);
        }
    }
}
