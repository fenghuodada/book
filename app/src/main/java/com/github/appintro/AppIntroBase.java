package com.github.appintro;

import android.animation.ArgbEvaluator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.ActivityC0101d;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.C0153z;
import androidx.appcompat.view.menu.C0235r;
import androidx.appcompat.widget.C0324d2;
import androidx.appcompat.widget.C0354h2;
import androidx.core.app.C0601b;
import androidx.core.content.ContextCompat;
import androidx.core.p003os.BuildCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.github.appintro.indicator.DotIndicatorController;
import com.github.appintro.indicator.IndicatorController;
import com.github.appintro.indicator.ProgressIndicatorController;
import com.github.appintro.internal.AppIntroViewPager;
import com.github.appintro.internal.LayoutUtil;
import com.github.appintro.internal.LogHelper;
import com.github.appintro.internal.PermissionWrapper;
import com.github.appintro.internal.viewpager.PagerAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C10806j;
import kotlin.Deprecated;
import kotlin.EnumC10735a;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.C10753i;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 ¥\u00012\u00020\u00012\u00020\u0002:\u0006¥\u0001¦\u0001§\u0001B\t¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0004J/\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0004J\u0012\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0004J\b\u0010\u0013\u001a\u00020\u0005H\u0004J\u0012\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\nH\u0004J\u0012\u0010\u0016\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\nH\u0004J\u0012\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\nH\u0004J\u0012\u0010\u0018\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\nH\u0004J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\fH\u0004J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\fH\u0005J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\fH\u0004J\b\u0010\u001e\u001a\u00020\u0005H\u0004J\u001c\u0010!\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\n2\b\b\u0001\u0010 \u001a\u00020\nH\u0004J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\nH\u0004J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0004J\u0012\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'H\u0004J\b\u0010*\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\bH\u0014J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\bH\u0014J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\nH\u0014J\u0012\u00101\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u00102\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u00103\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u00104\u001a\u00020\u0005H\u0014J\b\u00105\u001a\u00020\u0005H\u0014J\u001c\u00108\u001a\u00020\u00052\b\u00106\u001a\u0004\u0018\u00010\u00032\b\u00107\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010;\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u000109H\u0014J\u0012\u0010<\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u000109H\u0014J\u0010\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u000209H\u0014J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010:\u001a\u000209H\u0014J\u0018\u0010C\u001a\u00020\f2\u0006\u0010@\u001a\u00020\n2\u0006\u0010B\u001a\u00020AH\u0016J\b\u0010D\u001a\u00020\u0005H\u0016J\b\u0010E\u001a\u00020\fH\u0016J\b\u0010F\u001a\u00020\u0005H\u0016J-\u0010J\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\b\u0010L\u001a\u00020\u0005H\u0002J\b\u0010M\u001a\u00020\u0005H\u0002J\b\u0010N\u001a\u00020\fH\u0002J\b\u0010O\u001a\u00020\u0005H\u0002J\u0010\u0010Q\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\bH\u0002J\b\u0010R\u001a\u00020\u0005H\u0003J\u001c\u0010S\u001a\u00020\u00052\b\u00106\u001a\u0004\u0018\u00010\u00032\b\u00107\u001a\u0004\u0018\u00010\u0003H\u0002J$\u0010X\u001a\u00020\u00052\b\u0010T\u001a\u0004\u0018\u00010\u00032\b\u0010U\u001a\u0004\u0018\u00010\u00032\u0006\u0010W\u001a\u00020VH\u0002R$\u0010Z\u001a\u0004\u0018\u00010Y8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R*\u0010a\u001a\u00020\f2\u0006\u0010`\u001a\u00020\f8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\ba\u0010c\"\u0004\bd\u0010eR*\u0010f\u001a\u00020\f2\u0006\u0010`\u001a\u00020\f8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\bf\u0010b\u001a\u0004\bf\u0010c\"\u0004\bg\u0010eR*\u0010h\u001a\u00020\f2\u0006\u0010`\u001a\u00020\f8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\bh\u0010b\u001a\u0004\bh\u0010c\"\u0004\bi\u0010eR*\u0010j\u001a\u00020\f2\u0006\u0010`\u001a\u00020\f8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\bj\u0010b\u001a\u0004\bj\u0010c\"\u0004\bk\u0010eR\"\u0010l\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bl\u0010b\u001a\u0004\bl\u0010c\"\u0004\bm\u0010eR\"\u0010n\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bn\u0010b\u001a\u0004\bn\u0010c\"\u0004\bo\u0010eR\"\u0010q\u001a\u00020p8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010w\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bw\u0010b\u001a\u0004\bw\u0010c\"\u0004\bx\u0010eR\u0016\u0010z\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u007f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0080\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0080\u0001R\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R\u001a\u0010\u008a\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0088\u0001R\u001a\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R9\u0010\u0092\u0001\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u0001j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0005\u0012\u00030\u0090\u0001`\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010bR\u001a\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009d\u0001\u001a\u00020\n8eX¤\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u009f\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010cR\u0017\u0010¡\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010\u009c\u0001R\u0016\u0010¢\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010c¨\u0006¨\u0001"}, m508d2 = {"Lcom/github/appintro/AppIntroBase;", "Landroidx/appcompat/app/d;", "Lcom/github/appintro/AppIntroViewPagerListener;", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/p;", "addSlide", "", "", "permissions", "", "slideNumber", "", "required", "askForPermissions", "([Ljava/lang/String;IZ)V", "goToPreviousSlide", "isLastSlide", "goToNextSlide", "setImmersiveMode", "color", "setStatusBarColor", "setStatusBarColorRes", "setNavBarColor", "setNavBarColorRes", "show", "showStatusBar", "lock", "setNextPageSwipeLock", "setSwipeLock", "setProgressIndicator", "selectedIndicatorColor", "unselectedIndicatorColor", "setIndicatorColor", "factor", "setScrollDurationFactor", "Lcom/github/appintro/AppIntroPageTransformerType;", "appIntroTransformer", "setTransformer", "Landroidx/viewpager/widget/ViewPager$j;", "transformer", "setCustomTransformer", "onUserRequestedPermissionsDialog", "permissionName", "onUserDisabledPermission", "onUserDeniedPermission", "position", "onPageSelected", "currentFragment", "onDonePressed", "onNextPressed", "onSkipPressed", "onNextSlide", "onIntroFinished", "oldFragment", "newFragment", "onSlideChanged", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPostCreate", "outState", "onSaveInstanceState", "onRestoreInstanceState", "code", "Landroid/view/KeyEvent;", "event", "onKeyDown", "onBackPressed", "onCanRequestNextPage", "onIllegallyRequestedNextPage", "requestCode", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "initializeIndicator", "updateButtonsVisibility", "shouldRequestPermission", "requestPermissions", "permission", "handleDeniedPermission", "dispatchVibration", "dispatchSlideChangedCallbacks", "currentSlide", "nextSlide", "", "positionOffset", "performColorTransition", "Lcom/github/appintro/indicator/IndicatorController;", "indicatorController", "Lcom/github/appintro/indicator/IndicatorController;", "getIndicatorController", "()Lcom/github/appintro/indicator/IndicatorController;", "setIndicatorController", "(Lcom/github/appintro/indicator/IndicatorController;)V", "value", AppIntroBase.ARG_BUNDLE_IS_BUTTONS_ENABLED, "Z", "()Z", "setButtonsEnabled", "(Z)V", "isSkipButtonEnabled", "setSkipButtonEnabled", "isWizardMode", "setWizardMode", AppIntroBase.ARG_BUNDLE_IS_INDICATOR_ENABLED, "setIndicatorEnabled", "isSystemBackButtonLocked", "setSystemBackButtonLocked", "isColorTransitionsEnabled", "setColorTransitionsEnabled", "", "vibrateDuration", "J", "getVibrateDuration", "()J", "setVibrateDuration", "(J)V", "isVibrate", "setVibrate", "Lcom/github/appintro/internal/viewpager/PagerAdapter;", "pagerAdapter", "Lcom/github/appintro/internal/viewpager/PagerAdapter;", "Lcom/github/appintro/internal/AppIntroViewPager;", "pager", "Lcom/github/appintro/internal/AppIntroViewPager;", AppIntroBase.ARG_BUNDLE_SLIDES_NUMBER, "I", "savedCurrentItem", "currentlySelectedItem", "", "fragments", "Ljava/util/List;", "Landroid/view/View;", "nextButton", "Landroid/view/View;", "doneButton", "skipButton", "backButton", "Landroid/view/ViewGroup;", "indicatorContainer", "Landroid/view/ViewGroup;", "Ljava/util/HashMap;", "Lcom/github/appintro/internal/PermissionWrapper;", "Lkotlin/collections/HashMap;", "permissionsMap", "Ljava/util/HashMap;", AppIntroBase.ARG_BUNDLE_RETAIN_IS_BUTTONS_ENABLED, "Landroid/os/Vibrator;", "vibrator", "Landroid/os/Vibrator;", "Landroid/animation/ArgbEvaluator;", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "getLayoutId", "()I", "layoutId", "isRtl$appintro_release", "isRtl", "getCurrentSlideNumber", "currentSlideNumber", "isPermissionSlide", "<init>", "()V", "Companion", "NextSlideOnClickListener", "OnPageChangeListener", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public abstract class AppIntroBase extends ActivityC0101d implements AppIntroViewPagerListener {
    private static final String ARG_BUNDLE_COLOR_TRANSITIONS_ENABLED = "colorTransitionEnabled";
    private static final String ARG_BUNDLE_CURRENT_ITEM = "currentItem";
    private static final String ARG_BUNDLE_IS_BUTTONS_ENABLED = "isButtonsEnabled";
    private static final String ARG_BUNDLE_IS_FULL_PAGING_ENABLED = "isFullPagingEnabled";
    private static final String ARG_BUNDLE_IS_INDICATOR_ENABLED = "isIndicatorEnabled";
    private static final String ARG_BUNDLE_IS_SKIP_BUTTON_ENABLED = "isSkipButtonsEnabled";
    private static final String ARG_BUNDLE_PERMISSION_MAP = "permissionMap";
    private static final String ARG_BUNDLE_RETAIN_IS_BUTTONS_ENABLED = "retainIsButtonsEnabled";
    private static final String ARG_BUNDLE_SLIDES_NUMBER = "slidesNumber";
    private static final int DEFAULT_SCROLL_DURATION_FACTOR = 1;
    private static final long DEFAULT_VIBRATE_DURATION = 20;
    private static final int PERMISSIONS_REQUEST_ALL_PERMISSIONS = 1;
    private View backButton;
    private View doneButton;
    private ViewGroup indicatorContainer;
    @Nullable
    private IndicatorController indicatorController;
    private boolean isColorTransitionsEnabled;
    private boolean isSystemBackButtonLocked;
    private boolean isVibrate;
    private boolean isWizardMode;
    private View nextButton;
    private AppIntroViewPager pager;
    private PagerAdapter pagerAdapter;
    private int savedCurrentItem;
    private View skipButton;
    private int slidesNumber;
    private Vibrator vibrator;
    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final String TAG = LogHelper.makeLogTag(AppIntroBase.class);
    private boolean isButtonsEnabled = true;
    private boolean isSkipButtonEnabled = true;
    private boolean isIndicatorEnabled = true;
    private long vibrateDuration = DEFAULT_VIBRATE_DURATION;
    private int currentlySelectedItem = -1;
    private final List<Fragment> fragments = new ArrayList();
    private HashMap<Integer, PermissionWrapper> permissionsMap = new HashMap<>();
    private boolean retainIsButtonsEnabled = true;
    private final ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m508d2 = {"Lcom/github/appintro/AppIntroBase$Companion;", "", "()V", "ARG_BUNDLE_COLOR_TRANSITIONS_ENABLED", "", "ARG_BUNDLE_CURRENT_ITEM", "ARG_BUNDLE_IS_BUTTONS_ENABLED", "ARG_BUNDLE_IS_FULL_PAGING_ENABLED", "ARG_BUNDLE_IS_INDICATOR_ENABLED", "ARG_BUNDLE_IS_SKIP_BUTTON_ENABLED", "ARG_BUNDLE_PERMISSION_MAP", "ARG_BUNDLE_RETAIN_IS_BUTTONS_ENABLED", "ARG_BUNDLE_SLIDES_NUMBER", "DEFAULT_SCROLL_DURATION_FACTOR", "", "DEFAULT_VIBRATE_DURATION", "", "PERMISSIONS_REQUEST_ALL_PERMISSIONS", "TAG", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    @Metadata(m509d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m508d2 = {"Lcom/github/appintro/AppIntroBase$NextSlideOnClickListener;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "Lkotlin/p;", "onClick", "", "isLastSlide", "Z", "()Z", "setLastSlide", "(Z)V", "<init>", "(Lcom/github/appintro/AppIntroBase;Z)V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public final class NextSlideOnClickListener implements View.OnClickListener {
        private boolean isLastSlide;

        public NextSlideOnClickListener(boolean z) {
            this.isLastSlide = z;
        }

        public final boolean isLastSlide() {
            return this.isLastSlide;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            C10843j.m430f(view, "view");
            AppIntroBase.this.dispatchVibration();
            if (!AppIntroBase.this.onCanRequestNextPage()) {
                AppIntroBase.this.onIllegallyRequestedNextPage();
            } else if (AppIntroBase.this.shouldRequestPermission()) {
                AppIntroBase.this.requestPermissions();
            } else {
                Fragment item = AppIntroBase.access$getPagerAdapter$p(AppIntroBase.this).getItem(AppIntroBase.access$getPager$p(AppIntroBase.this).getCurrentItem());
                if (this.isLastSlide) {
                    AppIntroBase.this.onDonePressed(item);
                } else {
                    AppIntroBase.this.onNextPressed(item);
                }
                AppIntroBase.this.goToNextSlide(this.isLastSlide);
            }
        }

        public final void setLastSlide(boolean z) {
            this.isLastSlide = z;
        }
    }

    @Metadata(m509d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, m508d2 = {"Lcom/github/appintro/AppIntroBase$OnPageChangeListener;", "Landroidx/viewpager/widget/ViewPager$i;", "", "position", "", "positionOffset", "positionOffsetPixels", "Lkotlin/p;", "onPageScrolled", "onPageSelected", "state", "onPageScrollStateChanged", "<init>", "(Lcom/github/appintro/AppIntroBase;)V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public final class OnPageChangeListener implements ViewPager.InterfaceC1815i {
        public OnPageChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1815i
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1815i
        public void onPageScrolled(int i, float f, int i2) {
            if (!AppIntroBase.this.isColorTransitionsEnabled() || i >= AppIntroBase.access$getPagerAdapter$p(AppIntroBase.this).getCount() - 1) {
                return;
            }
            AppIntroBase.this.performColorTransition(AppIntroBase.access$getPagerAdapter$p(AppIntroBase.this).getItem(i), AppIntroBase.access$getPagerAdapter$p(AppIntroBase.this).getItem(i + 1), f);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1815i
        public void onPageSelected(int i) {
            IndicatorController indicatorController;
            if (AppIntroBase.this.slidesNumber >= 1 && (indicatorController = AppIntroBase.this.getIndicatorController()) != null) {
                indicatorController.selectPosition(i);
            }
            AppIntroBase.this.updateButtonsVisibility();
            AppIntroBase.access$getPager$p(AppIntroBase.this).setPermissionSlide(AppIntroBase.this.isPermissionSlide());
            AppIntroBase.this.onPageSelected(i);
            if (AppIntroBase.this.slidesNumber > 0) {
                if (AppIntroBase.this.currentlySelectedItem == -1) {
                    AppIntroBase appIntroBase = AppIntroBase.this;
                    appIntroBase.dispatchSlideChangedCallbacks(null, AppIntroBase.access$getPagerAdapter$p(appIntroBase).getItem(i));
                } else {
                    AppIntroBase appIntroBase2 = AppIntroBase.this;
                    appIntroBase2.dispatchSlideChangedCallbacks(AppIntroBase.access$getPagerAdapter$p(appIntroBase2).getItem(AppIntroBase.this.currentlySelectedItem), AppIntroBase.access$getPagerAdapter$p(AppIntroBase.this).getItem(AppIntroBase.access$getPager$p(AppIntroBase.this).getCurrentItem()));
                }
            }
            AppIntroBase.this.currentlySelectedItem = i;
        }
    }

    public static final /* synthetic */ AppIntroViewPager access$getPager$p(AppIntroBase appIntroBase) {
        AppIntroViewPager appIntroViewPager = appIntroBase.pager;
        if (appIntroViewPager != null) {
            return appIntroViewPager;
        }
        C10843j.m424l("pager");
        throw null;
    }

    public static final /* synthetic */ PagerAdapter access$getPagerAdapter$p(AppIntroBase appIntroBase) {
        PagerAdapter pagerAdapter = appIntroBase.pagerAdapter;
        if (pagerAdapter != null) {
            return pagerAdapter;
        }
        C10843j.m424l("pagerAdapter");
        throw null;
    }

    public static /* synthetic */ void askForPermissions$default(AppIntroBase appIntroBase, String[] strArr, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: askForPermissions");
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        appIntroBase.askForPermissions(strArr, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchSlideChangedCallbacks(Fragment fragment, Fragment fragment2) {
        if (fragment instanceof SlideSelectionListener) {
            ((SlideSelectionListener) fragment).onSlideDeselected();
        }
        if (fragment2 instanceof SlideSelectionListener) {
            ((SlideSelectionListener) fragment2).onSlideSelected();
        }
        onSlideChanged(fragment, fragment2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void dispatchVibration() {
        if (this.isVibrate) {
            Vibrator vibrator = this.vibrator;
            if (vibrator != null) {
                vibrator.vibrate(this.vibrateDuration);
            } else {
                C10843j.m424l("vibrator");
                throw null;
            }
        }
    }

    private final int getCurrentSlideNumber() {
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            return appIntroViewPager.getCurrentSlideNumber(this.fragments.size());
        }
        C10843j.m424l("pager");
        throw null;
    }

    public static /* synthetic */ void goToNextSlide$default(AppIntroBase appIntroBase, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToNextSlide");
        }
        if ((i & 1) != 0) {
            AppIntroViewPager appIntroViewPager = appIntroBase.pager;
            if (appIntroViewPager == null) {
                C10843j.m424l("pager");
                throw null;
            }
            z = appIntroViewPager.isLastSlide(appIntroBase.fragments.size());
        }
        appIntroBase.goToNextSlide(z);
    }

    private final void handleDeniedPermission(String str) {
        boolean m12091c;
        int i = C0601b.f2263b;
        if (!BuildCompat.m11866c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            m12091c = false;
        } else {
            m12091c = C0601b.C0604c.m12091c(this, str);
        }
        if (m12091c) {
            onUserDeniedPermission(str);
            PermissionWrapper permissionWrapper = this.permissionsMap.get(Integer.valueOf(getCurrentSlideNumber()));
            if (permissionWrapper != null && !permissionWrapper.getRequired()) {
                this.permissionsMap.remove(Integer.valueOf(permissionWrapper.getPosition()));
                goToNextSlide$default(this, false, 1, null);
                return;
            }
            return;
        }
        onUserDisabledPermission(str);
    }

    private final void initializeIndicator() {
        ViewGroup viewGroup = this.indicatorContainer;
        if (viewGroup == null) {
            C10843j.m424l("indicatorContainer");
            throw null;
        }
        IndicatorController indicatorController = this.indicatorController;
        viewGroup.addView(indicatorController != null ? indicatorController.newInstance(this) : null);
        IndicatorController indicatorController2 = this.indicatorController;
        if (indicatorController2 != null) {
            indicatorController2.initialize(this.slidesNumber);
        }
        IndicatorController indicatorController3 = this.indicatorController;
        if (indicatorController3 != null) {
            indicatorController3.selectPosition(this.currentlySelectedItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPermissionSlide() {
        HashMap<Integer, PermissionWrapper> hashMap = this.permissionsMap;
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            return hashMap.containsKey(Integer.valueOf(appIntroViewPager.getCurrentSlideNumber(this.fragments.size())));
        }
        C10843j.m424l("pager");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performColorTransition(Fragment fragment, Fragment fragment2, float f) {
        if (!(fragment instanceof SlideBackgroundColorHolder) || !(fragment2 instanceof SlideBackgroundColorHolder)) {
            throw new IllegalStateException("Color transitions are only available if all slides implement SlideBackgroundColorHolder.".toString());
        }
        if (fragment.isAdded() && fragment2.isAdded()) {
            SlideBackgroundColorHolder slideBackgroundColorHolder = (SlideBackgroundColorHolder) fragment;
            SlideBackgroundColorHolder slideBackgroundColorHolder2 = (SlideBackgroundColorHolder) fragment2;
            Object evaluate = this.argbEvaluator.evaluate(f, Integer.valueOf(slideBackgroundColorHolder.getDefaultBackgroundColor()), Integer.valueOf(slideBackgroundColorHolder2.getDefaultBackgroundColor()));
            if (evaluate == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            int intValue = ((Integer) evaluate).intValue();
            slideBackgroundColorHolder.setBackgroundColor(intValue);
            slideBackgroundColorHolder2.setBackgroundColor(intValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestPermissions() {
        setSwipeLock(true);
        PermissionWrapper permissionWrapper = this.permissionsMap.get(Integer.valueOf(getCurrentSlideNumber()));
        if (permissionWrapper != null) {
            C0601b.m12102c(this, permissionWrapper.getPermissions(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRequestPermission() {
        return this.permissionsMap.containsKey(Integer.valueOf(getCurrentSlideNumber()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonsVisibility() {
        View view;
        boolean z = false;
        if (this.isButtonsEnabled) {
            AppIntroViewPager appIntroViewPager = this.pager;
            if (appIntroViewPager == null) {
                C10843j.m424l("pager");
                throw null;
            }
            boolean isLastSlide = appIntroViewPager.isLastSlide(this.fragments.size());
            AppIntroViewPager appIntroViewPager2 = this.pager;
            if (appIntroViewPager2 == null) {
                C10843j.m424l("pager");
                throw null;
            }
            boolean isFirstSlide = appIntroViewPager2.isFirstSlide(this.fragments.size());
            View view2 = this.nextButton;
            if (view2 == null) {
                C10843j.m424l("nextButton");
                throw null;
            }
            AppIntroBaseKt.setVisible(view2, !isLastSlide);
            View view3 = this.doneButton;
            if (view3 == null) {
                C10843j.m424l("doneButton");
                throw null;
            }
            AppIntroBaseKt.setVisible(view3, isLastSlide);
            View view4 = this.skipButton;
            if (view4 == null) {
                C10843j.m424l("skipButton");
                throw null;
            }
            AppIntroBaseKt.setVisible(view4, this.isSkipButtonEnabled && !isLastSlide);
            view = this.backButton;
            if (view == null) {
                C10843j.m424l("backButton");
                throw null;
            } else if (this.isWizardMode && !isFirstSlide) {
                z = true;
            }
        } else {
            View view5 = this.nextButton;
            if (view5 == null) {
                C10843j.m424l("nextButton");
                throw null;
            }
            AppIntroBaseKt.setVisible(view5, false);
            View view6 = this.doneButton;
            if (view6 == null) {
                C10843j.m424l("doneButton");
                throw null;
            }
            AppIntroBaseKt.setVisible(view6, false);
            View view7 = this.backButton;
            if (view7 == null) {
                C10843j.m424l("backButton");
                throw null;
            }
            AppIntroBaseKt.setVisible(view7, false);
            view = this.skipButton;
            if (view == null) {
                C10843j.m424l("skipButton");
                throw null;
            }
        }
        AppIntroBaseKt.setVisible(view, z);
    }

    public final void addSlide(@NotNull Fragment fragment) {
        C10843j.m430f(fragment, "fragment");
        if (isRtl$appintro_release()) {
            this.fragments.add(0, fragment);
        } else {
            this.fragments.add(fragment);
        }
        if (this.isWizardMode) {
            AppIntroViewPager appIntroViewPager = this.pager;
            if (appIntroViewPager == null) {
                C10843j.m424l("pager");
                throw null;
            }
            appIntroViewPager.setOffscreenPageLimit(this.fragments.size());
        }
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.notifyDataSetChanged();
        } else {
            C10843j.m424l("pagerAdapter");
            throw null;
        }
    }

    @JvmOverloads
    public final void askForPermissions(@NotNull String[] strArr, int i) {
        askForPermissions$default(this, strArr, i, false, 4, null);
    }

    @JvmOverloads
    public final void askForPermissions(@NotNull String[] permissions, int i, boolean z) {
        C10843j.m430f(permissions, "permissions");
        if (i > 0) {
            this.permissionsMap.put(Integer.valueOf(i), new PermissionWrapper(permissions, i, z));
            return;
        }
        throw new IllegalStateException(C0235r.m12816a("Invalid Slide Number: ", i).toString());
    }

    @Nullable
    public final IndicatorController getIndicatorController() {
        return this.indicatorController;
    }

    @LayoutRes
    public abstract int getLayoutId();

    public final long getVibrateDuration() {
        return this.vibrateDuration;
    }

    public final void goToNextSlide(boolean z) {
        if (z) {
            onIntroFinished();
            return;
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            C10843j.m424l("pager");
            throw null;
        }
        appIntroViewPager.goToNextSlide();
        onNextSlide();
    }

    public final void goToPreviousSlide() {
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.goToPreviousSlide();
        } else {
            C10843j.m424l("pager");
            throw null;
        }
    }

    public final boolean isButtonsEnabled() {
        return this.isButtonsEnabled;
    }

    public final boolean isColorTransitionsEnabled() {
        return this.isColorTransitionsEnabled;
    }

    public final boolean isIndicatorEnabled() {
        return this.isIndicatorEnabled;
    }

    public final boolean isRtl$appintro_release() {
        Context applicationContext = getApplicationContext();
        C10843j.m431e(applicationContext, "applicationContext");
        return LayoutUtil.isRtl(applicationContext);
    }

    public final boolean isSkipButtonEnabled() {
        return this.isSkipButtonEnabled;
    }

    public final boolean isSystemBackButtonLocked() {
        return this.isSystemBackButtonLocked;
    }

    public final boolean isVibrate() {
        return this.isVibrate;
    }

    public final boolean isWizardMode() {
        return this.isWizardMode;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.isSystemBackButtonLocked) {
            return;
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            C10843j.m424l("pager");
            throw null;
        } else if (appIntroViewPager.isFirstSlide(this.fragments.size())) {
            super.onBackPressed();
        } else {
            AppIntroViewPager appIntroViewPager2 = this.pager;
            if (appIntroViewPager2 != null) {
                appIntroViewPager2.goToPreviousSlide();
            } else {
                C10843j.m424l("pager");
                throw null;
            }
        }
    }

    @Override // com.github.appintro.AppIntroViewPagerListener
    public boolean onCanRequestNextPage() {
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter == null) {
            C10843j.m424l("pagerAdapter");
            throw null;
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            C10843j.m424l("pager");
            throw null;
        }
        Fragment item = pagerAdapter.getItem(appIntroViewPager.getCurrentItem());
        if (!(item instanceof SlidePolicy) || ((SlidePolicy) item).isPolicyRespected()) {
            LogHelper.m6363d(TAG, "Change request will be allowed.");
            return true;
        }
        LogHelper.m6363d(TAG, "Slide policy not respected, denying change request.");
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0629l, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        requestWindowFeature(1);
        C0153z.ExecutorC0154a executorC0154a = AppCompatDelegate.f205a;
        int i = C0354h2.f1264a;
        super.onCreate(bundle);
        this.indicatorController = new DotIndicatorController(this);
        showStatusBar(false);
        setContentView(getLayoutId());
        ViewGroup viewGroup = (ViewGroup) findViewById(C6356R.C6359id.indicator_container);
        if (viewGroup != null) {
            this.indicatorContainer = viewGroup;
            View findViewById = findViewById(C6356R.C6359id.next);
            if (findViewById != null) {
                this.nextButton = findViewById;
                View findViewById2 = findViewById(C6356R.C6359id.done);
                if (findViewById2 != null) {
                    this.doneButton = findViewById2;
                    View findViewById3 = findViewById(C6356R.C6359id.skip);
                    if (findViewById3 != null) {
                        this.skipButton = findViewById3;
                        View findViewById4 = findViewById(C6356R.C6359id.back);
                        if (findViewById4 != null) {
                            this.backButton = findViewById4;
                            View view = this.nextButton;
                            if (view != null) {
                                C0324d2.m12689a(view, getString(C6356R.string.app_intro_next_button));
                                View view2 = this.skipButton;
                                if (view2 != null) {
                                    if (view2 instanceof ImageButton) {
                                        C0324d2.m12689a(view2, getString(C6356R.string.app_intro_skip_button));
                                    }
                                    View view3 = this.doneButton;
                                    if (view3 != null) {
                                        if (view3 instanceof ImageButton) {
                                            C0324d2.m12689a(view3, getString(C6356R.string.app_intro_done_button));
                                        }
                                        View view4 = this.backButton;
                                        if (view4 != null) {
                                            if (view4 instanceof ImageButton) {
                                                C0324d2.m12689a(view4, getString(C6356R.string.app_intro_back_button));
                                            }
                                            if (isRtl$appintro_release()) {
                                                View view5 = this.nextButton;
                                                if (view5 != null) {
                                                    view5.setScaleX(-1.0f);
                                                    View view6 = this.backButton;
                                                    if (view6 != null) {
                                                        view6.setScaleX(-1.0f);
                                                    } else {
                                                        C10843j.m424l("backButton");
                                                        throw null;
                                                    }
                                                } else {
                                                    C10843j.m424l("nextButton");
                                                    throw null;
                                                }
                                            }
                                            Object systemService = getSystemService("vibrator");
                                            if (systemService != null) {
                                                this.vibrator = (Vibrator) systemService;
                                                FragmentManager supportFragmentManager = getSupportFragmentManager();
                                                C10843j.m431e(supportFragmentManager, "supportFragmentManager");
                                                this.pagerAdapter = new PagerAdapter(supportFragmentManager, this.fragments);
                                                View findViewById5 = findViewById(C6356R.C6359id.view_pager);
                                                C10843j.m431e(findViewById5, "findViewById(R.id.view_pager)");
                                                this.pager = (AppIntroViewPager) findViewById5;
                                                View view7 = this.doneButton;
                                                if (view7 != null) {
                                                    view7.setOnClickListener(new NextSlideOnClickListener(true));
                                                    View view8 = this.nextButton;
                                                    if (view8 != null) {
                                                        view8.setOnClickListener(new NextSlideOnClickListener(false));
                                                        View view9 = this.backButton;
                                                        if (view9 != null) {
                                                            view9.setOnClickListener(new View.OnClickListener() { // from class: com.github.appintro.AppIntroBase$onCreate$1
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view10) {
                                                                    AppIntroBase.access$getPager$p(AppIntroBase.this).goToPreviousSlide();
                                                                }
                                                            });
                                                            View view10 = this.skipButton;
                                                            if (view10 != null) {
                                                                view10.setOnClickListener(new View.OnClickListener() { // from class: com.github.appintro.AppIntroBase$onCreate$2
                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view11) {
                                                                        AppIntroBase.this.dispatchVibration();
                                                                        AppIntroBase appIntroBase = AppIntroBase.this;
                                                                        appIntroBase.onSkipPressed(AppIntroBase.access$getPagerAdapter$p(appIntroBase).getItem(AppIntroBase.access$getPager$p(AppIntroBase.this).getCurrentItem()));
                                                                    }
                                                                });
                                                                AppIntroViewPager appIntroViewPager = this.pager;
                                                                if (appIntroViewPager != null) {
                                                                    PagerAdapter pagerAdapter = this.pagerAdapter;
                                                                    if (pagerAdapter != null) {
                                                                        appIntroViewPager.setAdapter(pagerAdapter);
                                                                        AppIntroViewPager appIntroViewPager2 = this.pager;
                                                                        if (appIntroViewPager2 != null) {
                                                                            appIntroViewPager2.addOnPageChangeListener$appintro_release(new OnPageChangeListener());
                                                                            AppIntroViewPager appIntroViewPager3 = this.pager;
                                                                            if (appIntroViewPager3 != null) {
                                                                                appIntroViewPager3.setOnNextPageRequestedListener(this);
                                                                                setScrollDurationFactor(1);
                                                                                return;
                                                                            }
                                                                            C10843j.m424l("pager");
                                                                            throw null;
                                                                        }
                                                                        C10843j.m424l("pager");
                                                                        throw null;
                                                                    }
                                                                    C10843j.m424l("pagerAdapter");
                                                                    throw null;
                                                                }
                                                                C10843j.m424l("pager");
                                                                throw null;
                                                            }
                                                            C10843j.m424l("skipButton");
                                                            throw null;
                                                        }
                                                        C10843j.m424l("backButton");
                                                        throw null;
                                                    }
                                                    C10843j.m424l("nextButton");
                                                    throw null;
                                                }
                                                C10843j.m424l("doneButton");
                                                throw null;
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
                                        }
                                        C10843j.m424l("backButton");
                                        throw null;
                                    }
                                    C10843j.m424l("doneButton");
                                    throw null;
                                }
                                C10843j.m424l("skipButton");
                                throw null;
                            }
                            C10843j.m424l("nextButton");
                            throw null;
                        }
                        throw new IllegalStateException("Missing Back button: R.id.back".toString());
                    }
                    throw new IllegalStateException("Missing Skip button: R.id.skip".toString());
                }
                throw new IllegalStateException("Missing Done button: R.id.done".toString());
            }
            throw new IllegalStateException("Missing Next button: R.id.next".toString());
        }
        throw new IllegalStateException("Missing Indicator Container: R.id.indicator_container".toString());
    }

    public void onDonePressed(@Nullable Fragment fragment) {
    }

    @Override // com.github.appintro.AppIntroViewPagerListener
    public void onIllegallyRequestedNextPage() {
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter == null) {
            C10843j.m424l("pagerAdapter");
            throw null;
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            C10843j.m424l("pager");
            throw null;
        }
        Fragment item = pagerAdapter.getItem(appIntroViewPager.getCurrentItem());
        if (item instanceof SlidePolicy) {
            SlidePolicy slidePolicy = (SlidePolicy) item;
            if (slidePolicy.isPolicyRespected()) {
                return;
            }
            slidePolicy.onUserIllegallyRequestedNextPage();
        }
    }

    public void onIntroFinished() {
    }

    @Override // androidx.appcompat.app.ActivityC0101d, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NotNull KeyEvent event) {
        C10843j.m430f(event, "event");
        if (i == 66 || i == 96 || i == 23) {
            AppIntroViewPager appIntroViewPager = this.pager;
            if (appIntroViewPager == null) {
                C10843j.m424l("pager");
                throw null;
            }
            boolean isLastSlide = appIntroViewPager.isLastSlide(this.fragments.size());
            goToNextSlide(isLastSlide);
            if (isLastSlide) {
                PagerAdapter pagerAdapter = this.pagerAdapter;
                if (pagerAdapter == null) {
                    C10843j.m424l("pagerAdapter");
                    throw null;
                }
                AppIntroViewPager appIntroViewPager2 = this.pager;
                if (appIntroViewPager2 != null) {
                    onDonePressed(pagerAdapter.getItem(appIntroViewPager2.getCurrentItem()));
                    return false;
                }
                C10843j.m424l("pager");
                throw null;
            }
            return false;
        }
        return super.onKeyDown(i, event);
    }

    public void onNextPressed(@Nullable Fragment fragment) {
    }

    public void onNextSlide() {
    }

    public void onPageSelected(int i) {
    }

    @Override // androidx.appcompat.app.ActivityC0101d, android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        AppIntroViewPager appIntroViewPager;
        int i;
        super.onPostCreate(bundle);
        this.slidesNumber = this.fragments.size();
        initializeIndicator();
        this.retainIsButtonsEnabled = this.isButtonsEnabled;
        if (isRtl$appintro_release()) {
            appIntroViewPager = this.pager;
            if (appIntroViewPager == null) {
                C10843j.m424l("pager");
                throw null;
            }
            i = this.fragments.size() - this.savedCurrentItem;
        } else {
            appIntroViewPager = this.pager;
            if (appIntroViewPager == null) {
                C10843j.m424l("pager");
                throw null;
            }
            i = this.savedCurrentItem;
        }
        appIntroViewPager.setCurrentItem(i);
        AppIntroViewPager appIntroViewPager2 = this.pager;
        if (appIntroViewPager2 != null) {
            appIntroViewPager2.post(new Runnable() { // from class: com.github.appintro.AppIntroBase$onPostCreate$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (AppIntroBase.access$getPagerAdapter$p(AppIntroBase.this).getItem(AppIntroBase.access$getPager$p(AppIntroBase.this).getCurrentItem()) == null) {
                        AppIntroBase.this.finish();
                        return;
                    }
                    AppIntroBase appIntroBase = AppIntroBase.this;
                    appIntroBase.dispatchSlideChangedCallbacks(null, AppIntroBase.access$getPagerAdapter$p(appIntroBase).getItem(AppIntroBase.access$getPager$p(AppIntroBase.this).getCurrentItem()));
                }
            });
        } else {
            C10843j.m424l("pager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NotNull String[] permissions, @NotNull int[] grantResults) {
        boolean z;
        C10843j.m430f(permissions, "permissions");
        C10843j.m430f(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        setSwipeLock(false);
        if (i != 1) {
            return;
        }
        ArrayList arrayList = new ArrayList(grantResults.length);
        int length = grantResults.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(new C10806j(permissions[i3], Integer.valueOf(grantResults[i2])));
            i2++;
            i3++;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) ((C10806j) next).f21398b).intValue() == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C10753i.m482g(arrayList2));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((String) ((C10806j) it2.next()).f21397a);
        }
        if (arrayList3.isEmpty()) {
            this.permissionsMap.remove(Integer.valueOf(getCurrentSlideNumber()));
            goToNextSlide$default(this, false, 1, null);
            return;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            handleDeniedPermission((String) it3.next());
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.reCenterCurrentSlide$appintro_release();
        } else {
            C10843j.m424l("pager");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        C10843j.m430f(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.slidesNumber = savedInstanceState.getInt(ARG_BUNDLE_SLIDES_NUMBER);
        this.retainIsButtonsEnabled = savedInstanceState.getBoolean(ARG_BUNDLE_RETAIN_IS_BUTTONS_ENABLED);
        setButtonsEnabled(savedInstanceState.getBoolean(ARG_BUNDLE_IS_BUTTONS_ENABLED));
        setSkipButtonEnabled(savedInstanceState.getBoolean(ARG_BUNDLE_IS_SKIP_BUTTON_ENABLED));
        setIndicatorEnabled(savedInstanceState.getBoolean(ARG_BUNDLE_IS_INDICATOR_ENABLED));
        this.savedCurrentItem = savedInstanceState.getInt(ARG_BUNDLE_CURRENT_ITEM);
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            C10843j.m424l("pager");
            throw null;
        }
        appIntroViewPager.setFullPagingEnabled(savedInstanceState.getBoolean(ARG_BUNDLE_IS_FULL_PAGING_ENABLED));
        HashMap<Integer, PermissionWrapper> hashMap = (HashMap) savedInstanceState.getSerializable(ARG_BUNDLE_PERMISSION_MAP);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        this.permissionsMap = hashMap;
        this.isColorTransitionsEnabled = savedInstanceState.getBoolean(ARG_BUNDLE_COLOR_TRANSITIONS_ENABLED);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0629l, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        C10843j.m430f(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(ARG_BUNDLE_SLIDES_NUMBER, this.slidesNumber);
        outState.putBoolean(ARG_BUNDLE_RETAIN_IS_BUTTONS_ENABLED, this.retainIsButtonsEnabled);
        outState.putBoolean(ARG_BUNDLE_IS_BUTTONS_ENABLED, this.isButtonsEnabled);
        outState.putBoolean(ARG_BUNDLE_IS_SKIP_BUTTON_ENABLED, this.isSkipButtonEnabled);
        outState.putBoolean(ARG_BUNDLE_IS_INDICATOR_ENABLED, this.isIndicatorEnabled);
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            C10843j.m424l("pager");
            throw null;
        }
        outState.putInt(ARG_BUNDLE_CURRENT_ITEM, appIntroViewPager.getCurrentItem());
        AppIntroViewPager appIntroViewPager2 = this.pager;
        if (appIntroViewPager2 == null) {
            C10843j.m424l("pager");
            throw null;
        }
        outState.putBoolean(ARG_BUNDLE_IS_FULL_PAGING_ENABLED, appIntroViewPager2.isFullPagingEnabled());
        outState.putSerializable(ARG_BUNDLE_PERMISSION_MAP, this.permissionsMap);
        outState.putBoolean(ARG_BUNDLE_COLOR_TRANSITIONS_ENABLED, this.isColorTransitionsEnabled);
    }

    public void onSkipPressed(@Nullable Fragment fragment) {
    }

    public void onSlideChanged(@Nullable Fragment fragment, @Nullable Fragment fragment2) {
    }

    public void onUserDeniedPermission(@NotNull String permissionName) {
        C10843j.m430f(permissionName, "permissionName");
    }

    public void onUserDisabledPermission(@NotNull String permissionName) {
        C10843j.m430f(permissionName, "permissionName");
    }

    @Override // com.github.appintro.AppIntroViewPagerListener
    public void onUserRequestedPermissionsDialog() {
        String str = TAG;
        LogHelper.m6363d(str, "Requesting Permissions on " + getCurrentSlideNumber());
        requestPermissions();
    }

    public final void setButtonsEnabled(boolean z) {
        this.isButtonsEnabled = z;
        updateButtonsVisibility();
    }

    public final void setColorTransitionsEnabled(boolean z) {
        this.isColorTransitionsEnabled = z;
    }

    public final void setCustomTransformer(@Nullable ViewPager.InterfaceC1816j interfaceC1816j) {
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.setPageTransformer(true, interfaceC1816j);
        } else {
            C10843j.m424l("pager");
            throw null;
        }
    }

    public final void setImmersiveMode() {
        Window window = getWindow();
        C10843j.m431e(window, "window");
        View decorView = window.getDecorView();
        C10843j.m431e(decorView, "window.decorView");
        decorView.setSystemUiVisibility(5894);
    }

    public final void setIndicatorColor(@ColorInt int i, @ColorInt int i2) {
        IndicatorController indicatorController = this.indicatorController;
        if (indicatorController != null) {
            indicatorController.setSelectedIndicatorColor(i);
        }
        IndicatorController indicatorController2 = this.indicatorController;
        if (indicatorController2 != null) {
            indicatorController2.setUnselectedIndicatorColor(i2);
        }
    }

    public final void setIndicatorController(@Nullable IndicatorController indicatorController) {
        this.indicatorController = indicatorController;
    }

    public final void setIndicatorEnabled(boolean z) {
        this.isIndicatorEnabled = z;
        ViewGroup viewGroup = this.indicatorContainer;
        if (viewGroup != null) {
            AppIntroBaseKt.setVisible(viewGroup, z);
        } else {
            C10843j.m424l("indicatorContainer");
            throw null;
        }
    }

    public final void setNavBarColor(@ColorInt int i) {
        Window window = getWindow();
        C10843j.m431e(window, "window");
        window.setNavigationBarColor(i);
    }

    public final void setNavBarColorRes(@ColorRes int i) {
        Window window = getWindow();
        C10843j.m431e(window, "window");
        Object obj = ContextCompat.f2323a;
        window.setNavigationBarColor(ContextCompat.C0652d.m12030a(this, i));
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "setNextPageSwipeLock has been deprecated in favor of setSwipeLock or SlidePolicy", replaceWith = @ReplaceWith(expression = "setSwipeLock", imports = {}))
    public final void setNextPageSwipeLock(boolean z) {
        LogHelper.w$default(TAG, "Calling setNextPageSwipeLock has not effect here. Please switch to setSwipeLock or SlidePolicy", null, 4, null);
    }

    public final void setProgressIndicator() {
        this.indicatorController = new ProgressIndicatorController(this, null, 0, 6, null);
    }

    public final void setScrollDurationFactor(int i) {
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.setScrollDurationFactor(i);
        } else {
            C10843j.m424l("pager");
            throw null;
        }
    }

    public final void setSkipButtonEnabled(boolean z) {
        this.isSkipButtonEnabled = z;
        updateButtonsVisibility();
    }

    public final void setStatusBarColor(@ColorInt int i) {
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        Window window = getWindow();
        C10843j.m431e(window, "window");
        window.setStatusBarColor(i);
    }

    public final void setStatusBarColorRes(@ColorRes int i) {
        Object obj = ContextCompat.f2323a;
        setStatusBarColor(ContextCompat.C0652d.m12030a(this, i));
    }

    public final void setSwipeLock(boolean z) {
        if (z) {
            this.retainIsButtonsEnabled = this.isButtonsEnabled;
            setButtonsEnabled(true);
        } else {
            setButtonsEnabled(this.retainIsButtonsEnabled);
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.setFullPagingEnabled(!z);
        } else {
            C10843j.m424l("pager");
            throw null;
        }
    }

    public final void setSystemBackButtonLocked(boolean z) {
        this.isSystemBackButtonLocked = z;
    }

    public final void setTransformer(@NotNull AppIntroPageTransformerType appIntroTransformer) {
        C10843j.m430f(appIntroTransformer, "appIntroTransformer");
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.setAppIntroPageTransformer(appIntroTransformer);
        } else {
            C10843j.m424l("pager");
            throw null;
        }
    }

    public final void setVibrate(boolean z) {
        this.isVibrate = z;
    }

    public final void setVibrateDuration(long j) {
        this.vibrateDuration = j;
    }

    public final void setWizardMode(boolean z) {
        this.isWizardMode = z;
        setSkipButtonEnabled(!z);
        updateButtonsVisibility();
    }

    public final void showStatusBar(boolean z) {
        if (z) {
            getWindow().clearFlags(1024);
        } else {
            getWindow().setFlags(1024, 1024);
        }
    }
}
